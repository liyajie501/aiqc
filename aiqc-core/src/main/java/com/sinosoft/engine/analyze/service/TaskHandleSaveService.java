package com.sinosoft.engine.analyze.service;

import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.cassandra.model.BaseDataXml;
import com.sinosoft.engine.analyze.cassandra.model.WordRecord;
import com.sinosoft.engine.analyze.constant.AnalyzeEngineConstant;
import com.sinosoft.engine.analyze.model.AnalyzeResource;
import com.sinosoft.engine.analyze.model.Task;
import com.sinosoft.engine.analyze.utils.CommonTools;
import com.sinosoft.engine.analyze.utils.ListIterable;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class TaskHandleSaveService {
    private static Logger logger = Logger.getLogger(TaskHandleSaveService.class);

    private Task task;
    private CacheService cache;
    private AnalyzeResource res;
    private BaseDataService baseDataService;
    private static SimpleDateFormat YYYYMM = new SimpleDateFormat("yyyyMM");


    public TaskHandleSaveService(Task task, CacheService cache, AnalyzeResource res, BaseDataService baseDataService) {
        this.task = task;
        this.cache = cache;
        this.res = res;
        this.baseDataService = baseDataService;
    }


    public BaseData saveBaseDataToDB() throws IOException {
        BaseData d = this.baseDataService.generateBaseDataByTask(this.task, this.res);
        d = (BaseData) this.cache.getBaseDataRepository().save(d);
        logger.info("保存BaseData到NoSql中【成功】");


        BaseData mysqldata = new BaseData(d);
        Date dateTime = mysqldata.getStartTime();
        String tableNameSuffix = "_" + YYYYMM.format(dateTime);
        mysqldata.setTableNameSuffix(tableNameSuffix);
        mysqldata.setAgentCallInfo(null);
        mysqldata.setCallInfo(null);
        mysqldata.setConsumerCallInfo(null);
        mysqldata.setSequenceNum(null);
        mysqldata.setRepeatInfo(null);
        mysqldata.setMuteInfo(null);
        mysqldata.setMoodFile(null);
        BaseData queryData = new BaseData();
        queryData.setTableNameSuffix(tableNameSuffix);
        this.cache.getBaseDataMapper().createNewTable(queryData);
        this.cache.getBaseDataMapper().insert(mysqldata);
        logger.info("保存BaseData到MySql中【成功】");


        return d;
    }


    public BaseData saveBaseDataToES(BaseData d) throws IOException {
        try {
            BaseData b = new BaseData();
            PropertyUtils.copyProperties(b, d);
            this.cache.geteSBaseDataServiceImpl().save(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("保存BaseData到ES中【成功】");
        return d;
    }


    public BaseData saveBaseDataToDB(BaseData d) throws IOException {
        try {
            this.baseDataService.generateBaseDataByTask(this.task, this.res, d);
            d = (BaseData) this.cache.getBaseDataRepository().save(d);
            logger.info("保存BaseData到NoSql中【成功】");

            BaseData mysqldata = new BaseData(d);
            Date dateTime = mysqldata.getStartTime();
            String tableNameSuffix = "_" + YYYYMM.format(dateTime);
            mysqldata.setTableNameSuffix(tableNameSuffix);
            mysqldata.setAgentCallInfo(null);
            mysqldata.setCallInfo(null);
            mysqldata.setConsumerCallInfo(null);
            mysqldata.setSequenceNum(null);
            mysqldata.setRepeatInfo(null);
            mysqldata.setMuteInfo(null);
            if (mysqldata.getAgentSpeed().isNaN()) mysqldata.setAgentSpeed(null);


            BaseData queryData = new BaseData();
            queryData.setTableNameSuffix(tableNameSuffix);
            this.cache.getBaseDataMapper().createNewTable(queryData);
            this.cache.getBaseDataMapper().insert(mysqldata);
            logger.info("保存BaseData到MySql中【成功】");
            return d;
        } catch (Exception e) {
            logger.error("TaskHandleSaveService.saveBaseDataToDB()保存到数据库异常:", e);
            return null;
        }
    }


    public void saveXmlFileToDB() {
        logger.info("保存解析xml源结果到BaseDataXml中");
        try {
            List<BaseDataXml> list = this.res.getXmlDom4j().getXmlAllData();
            List<BaseDataXml> tlist = new ArrayList<BaseDataXml>();
            for (BaseDataXml xml : list) {
                xml.setResourceId(CommonTools.getUUID());
                xml.setAudioCode(this.task.getSoundIndex().getSessionId());
                xml.setRecordFile(this.task.getSoundFileName());
                xml.setResolveFile(this.task.getXmlFileName());

                tlist.add(xml);
                if (tlist.size() >= 100) {
                    this.cache.getBaseDataXmlRepository().save(new ListIterable(tlist));
                    tlist.clear();
                }
            }
            if (tlist.size() > 0) {
                this.cache.getBaseDataXmlRepository().save(new ListIterable(tlist));
                tlist.clear();
            }

        } catch (Exception e) {
            logger.info("保存解析xml源结果到BaseDataXml中，异常", e);
        }
    }


    public void saveWordToDB() {
        logger.info("保存解析xml的分词到YYZJ_T_WORD_RECORD中");
        try {
            BaseData base = this.task.getBaseData();
            if (base.getStartTime() == null)
                return;
            List<WordRecord> list = this.res.getXmlJsoup().getWordList();
            DateFormat fmt = new SimpleDateFormat("yyyyMMdd");
            String callTime = fmt.format(base.getStartTime());
            long t = (new Date()).getTime();
            List<WordRecord> tlist = new ArrayList<WordRecord>();
            for (WordRecord w : list) {
                w.setAgentId(base.getAgentId());
                w.setBaseId(base.getBaseId());
                w.setCallTime(callTime);
                w.setSort(Long.valueOf(t++));
                w.setSysId(base.getSysId());

                tlist.add(w);
                if (tlist.size() > 100) {
                    this.cache.getWordRecordRepository().save(new ListIterable(tlist));
                    tlist.clear();
                }
            }

            if (tlist.size() > 0) {
                this.cache.getWordRecordRepository().save(new ListIterable(tlist));
                tlist.clear();
            }

        } catch (Exception e) {
            logger.info("保存解析xml的分词到YYZJ_T_WORD_RECORD中，异常", e);
        }
    }


    public void addCopyFile() {
        addCopyFile(AnalyzeEngineConstant.MOUNT_ROOT_DIR + this.task.getSoundFileName());
    }


    private static BlockingQueue<String> copyFileQueue = null;

    public static void startCopyFile() {
        if ("true".equals(CommonTools.getApplicationConf("engine.analyze.copy.video.open"))) {
            logger.info("启动复制文件队列功能 ");
            copyFileQueue = new LinkedBlockingQueue();
            (new Thread(new Runnable() {
                public void run() {
                    String dir1 = CommonTools.getApplicationConf("yyzj.mount.root.dir");
                    String dir2 = CommonTools.getApplicationConf("engine.analyze.copy.video.path");
                    while (true) {
                        try {
                            String videoFile = (String) copyFileQueue.take();
                            logger.info("收到复制消息:" + videoFile);
                            File f1 = new File(videoFile);
                            if (!f1.exists())
                                continue;
                            File f2 = new File(videoFile.replaceAll(dir1, dir2));
                            FileUtils.copyFile(f1, f2);
                            logger.info("复制文件成功:" + videoFile);
                        } catch (Exception e) {
                            logger.error("复制文件异常", e);
                        }
                    }
                }
            })).start();
        }
    }


    public static void addCopyFile(String videoFile) {
        if (copyFileQueue == null)
            return;
        try {
            copyFileQueue.put(videoFile);
        } catch (InterruptedException e) {
            logger.error("添加复制文件异常:" + videoFile, e);
        }
    }
}
