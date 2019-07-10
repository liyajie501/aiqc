package com.sinosoft.engine.analyze.service;


import com.sinosoft.engine.analyze.constant.AnalyzeEngineConstant;
import com.sinosoft.engine.analyze.model.*;
import com.sinosoft.engine.analyze.utils.CommonTools;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


@Service
public class IndexFileHandleService
        implements Runnable {
    private static Logger logger = Logger.getLogger(IndexFileHandleService.class);
    private static BlockingQueue<IndexFile> queue = new LinkedBlockingQueue();

    @Autowired
    private ThreadPoolTaskExecutor cachedThreadPool;

    public static void addIndexFile(IndexFile indexFile) {
        try {
            queue.put(indexFile);
        } catch (InterruptedException e) {
            logger.error("添加索引文件异常:" + indexFile, e);
        }
    }

    public void run() {
        logger.info("启动索引文件处理中心");
        while (true) {
            try {
                IndexFile indexMsg = (IndexFile) queue.take();
                logger.info("处理索引文件消息：" + JSONObject.fromObject(indexMsg).toString());
                List<SoundIndex> list = analyzeIndexFile(indexMsg);
                logger.info("需要分析文件个数=" + list.size());
                for (SoundIndex idx : list) {
                    Task t = new Task();
                    t.setSysId(indexMsg.getSysId());
                    t.setSoundIndex(idx);
                    t.setIndexFileName(getFileName(indexMsg, idx, 1, false));
                    t.setSoundFileName(getFileName(indexMsg, idx, 2, false));
                    t.setXmlFileName(getFileName(indexMsg, idx, 3, false));
                    t.setEmoFileName(getFileName(indexMsg, idx, 4, false));

                    t.setSaveBaseFile(true);
                    t.setAnalyzeFile(true);


                    TaskDispatcherService.addTask(t);
                }
            } catch (Exception e) {
                logger.error("索引文件处理中心异常", e);
            }
        }
    }


    public static boolean addTask(BaseData base) {
        if (base == null) return false;
        logger.info("添加重新质检任务baseId=" + base.getBaseId());
        Task t = new Task();
        t.setBaseData(base);
        t.setSysId(base.getSysId());
        t.setSoundIndex(getSoundIndexByBaseData(base));
        t.setIndexFileName(null);
        t.setSoundFileName(base.getRecordFile());
        t.setXmlFileName(base.getResolveFile());
        t.setEmoFileName(getFileName(base.getResolveFile(), 4));


        t.setSaveBaseFile(false);
        t.setAnalyzeFile(true);

        TaskDispatcherService.addTask(t);
        return true;
    }


    public static boolean addTempTask(BaseData base, String totalScoreId, String ruleId, BlockingQueue<List<AnalyzeResult>> resultQueue) {
        if (base == null) return false;
        logger.info("添加临时质检任务baseId=" + base.getBaseId());
        Task t = new Task();
        t.setBaseData(base);
        t.setSysId(base.getSysId());
        t.setSoundIndex(getSoundIndexByBaseData(base));
        t.setIndexFileName(null);
        t.setSoundFileName(base.getRecordFile());
        t.setXmlFileName(base.getResolveFile());
        t.setEmoFileName(getFileName(base.getResolveFile(), 4));

        t.setSaveBaseFile(false);
        t.setAnalyzeFile(true);
        t.setSaveScoreTotalData(false);
        t.setSaveScoreDetailData(false);
        t.setSendAlarm(false);


        Map<String, Set<String>> analyzeContents = new HashMap<String, Set<String>>();
        Set<String> ruleIds = null;
        if (StringUtils.isNotBlank(ruleId)) {
            ruleIds = new HashSet<String>();
            ruleIds.add(ruleId);
        }
        analyzeContents.put(totalScoreId, ruleIds);
        t.setAnalyzeContents(analyzeContents);


        t.setAnalyzeResultQueue(resultQueue);


        TaskDispatcherService.addTask(t);
        return true;
    }


    public static boolean addManuTask(BaseData base, String totalScoreId, String ruleId, BlockingQueue<List<AnalyzeResult>> resultQueue) {
        if (base == null) return false;
        logger.info("添加手动质检任务baseId=" + base.getBaseId());
        Task t = new Task();
        t.setBaseData(base);
        t.setSysId(base.getSysId());
        t.setSoundIndex(getSoundIndexByBaseData(base));
        t.setIndexFileName(null);
        t.setSoundFileName(base.getRecordFile());
        t.setXmlFileName(base.getResolveFile());
        t.setEmoFileName(getFileName(base.getResolveFile(), 4));

        t.setSaveBaseFile(false);
        t.setAnalyzeFile(true);
        t.setSaveScoreTotalData(true);
        t.setSaveScoreDetailData(true);
        t.setSaveScoreTotalDataDB(true);

        t.setSendAlarm(false);


        Map<String, Set<String>> analyzeContents = new HashMap<String, Set<String>>();
        Set<String> ruleIds = null;
        if (StringUtils.isNotBlank(ruleId)) {
            ruleIds = new HashSet<String>();
            ruleIds.add(ruleId);
        }
        analyzeContents.put(totalScoreId, ruleIds);
        t.setAnalyzeContents(analyzeContents);


        t.setAnalyzeResultQueue(resultQueue);


        TaskDispatcherService.addTask(t);
        return true;
    }


    public static boolean addTask(BaseData base, String totalScoreId, String ruleId, BlockingQueue<List<AnalyzeResult>> resultQueue) {
        if (base == null) return false;
        logger.info("添加临时质检任务baseId=" + base.getBaseId());
        Task t = new Task();
        t.setBaseData(base);
        t.setSysId(base.getSysId());
        t.setSoundIndex(getSoundIndexByBaseData(base));
        t.setIndexFileName(null);
        t.setSoundFileName(base.getRecordFile());
        t.setXmlFileName(base.getResolveFile());
        t.setEmoFileName(getFileName(base.getResolveFile(), 4));

        t.setSaveBaseFile(false);
        t.setAnalyzeFile(true);
        t.setSaveScoreTotalData(false);
        t.setSaveScoreDetailData(false);
        t.setSendAlarm(false);

        t.setSaveScoreTotalDataDB(true);
        t.setSaveScoreDetailDataMore(true);

        Map<String, Set<String>> analyzeContents = new HashMap<String, Set<String>>();
        Set<String> ruleIds = null;
        if (StringUtils.isNotBlank(ruleId)) {
            ruleIds = new HashSet<String>();
            ruleIds.add(ruleId);
        }
        analyzeContents.put(totalScoreId, ruleIds);
        t.setAnalyzeContents(analyzeContents);


        t.setAnalyzeResultQueue(resultQueue);


        TaskDispatcherService.addTask(t);
        return true;
    }

    private static SoundIndex getSoundIndexByBaseData(BaseData base) {
        if (base == null) return null;
        SoundIndex idx = new SoundIndex();
        idx.setSessionId(base.getAudioCode());
        idx.setCallType(base.getCallType().toString());

        if (base.getStartTime() != null) idx.setStartTime(CommonTools.getFormatDate(base.getStartTime()));
        if (base.getEndTime() != null) idx.setEndTime(CommonTools.getFormatDate(base.getEndTime()));

        if (base.getRecordDuration() != null) idx.setDuration(base.getRecordDuration().toString());
        idx.setRemoteUri(base.getRemoteUri());
        idx.setLocalUri(base.getLocalUri());
        idx.setAgentId(base.getAgentId());
        idx.setRecordName(base.getRecordFile());
        idx.setDeviceNumber(base.getDeviceNumber());
        idx.setDeviceName(base.getDeviceName());

        return idx;
    }


    private String getFileName(IndexFile indexMsg, SoundIndex indexLine, int type, boolean addRootDir) {
        StringBuilder strBdr = new StringBuilder();
        if (addRootDir) strBdr.append(AnalyzeEngineConstant.MOUNT_ROOT_DIR);
        strBdr.append("/").append(indexMsg.getSysId()).append("/").append(indexMsg.getDate()).append("/");

        if (type == 1) strBdr.append(indexMsg.getFileName()).append(".csv");
        String fn = indexLine.getRecordName();
        String suffix = fn.substring(fn.lastIndexOf(".") + 1);

        fn = fn.substring(fn.lastIndexOf("/") + 1, fn.lastIndexOf("."));
        if (type == 2) strBdr.append(fn).append("." + suffix);
        if (type == 3) strBdr.append(fn).append(".xml");
        if (type == 4) strBdr.append(fn).append("_text_role_result_emo.txt");
        return strBdr.toString();
    }


    private static String getFileName(String xmlFile, int type) {
        if (StringUtils.isBlank(xmlFile)) return null;
        String result = null;
        xmlFile = xmlFile.trim();
        if (type == 4) result = xmlFile.replaceAll("\\.xml$", "_text_role_result_emo.txt");
        return result;
    }


    private List<SoundIndex> analyzeIndexFile(IndexFile indexMsg) {
        List<SoundIndex> list = new ArrayList<>();
        try {
            File file = new File(AnalyzeEngineConstant.MOUNT_ROOT_DIR + "/" + indexMsg.getSysId() + "/" + indexMsg.getDate() + "/" + indexMsg.getFileName() + ".csv");
            List<String> lines = FileUtils.readLines(file, "UTF-8");
            if (lines != null && lines.size() > 0)
                for (String line : lines) {
                    SoundIndex s = genSoundIndex(line);
                    if (s != null) list.add(s);

                }
        } catch (Exception e) {
            logger.error("解析索引消息异常indexFile=" + JSONObject.fromObject(indexMsg).toString(), e);
        }
        return list;
    }


    private SoundIndex genSoundIndex(String line) {
        if (StringUtils.isBlank(line)) return null;
        try {
            SoundIndex idx = new SoundIndex();
            String[] arr = line.split(",");

            if (arr.length != 12) {
                logger.info("【IndexFileHandleService.genSoundIndex】:解析出来的CSV索引文件格式对不对,返回null值,数据不进行入库.");
                return null;
            }
            if (arr[0].trim().replaceAll("[0-9]", "").length() != 0) return null;


            for (int i = 0; i < arr.length; i++) {

                if (i == 1) idx.setSessionId(arr[i].trim());
                if (i == 2) idx.setCallType(arr[i].trim());
                if (i == 3) idx.setStartTime(arr[i].trim());
                if (i == 4) idx.setEndTime(arr[i].trim());
                if (i == 5) idx.setDuration(arr[i].trim());
                if (i == 6) idx.setRemoteUri(arr[i].trim());
                if (i == 7) idx.setLocalUri(arr[i].trim());
                if (i == 8) idx.setAgentId(arr[i].trim());
                if (i == 9) idx.setRecordName(arr[i].trim());
                if (i == 10) idx.setDeviceNumber(arr[i].trim());
                if (i == 11) idx.setDeviceName(arr[i].trim());

            }
            return idx;
        } catch (Exception e) {
            logger.error("索引文件行转换SoundIndex异常", e);
            return null;
        }
    }


    public ThreadPoolTaskExecutor getCachedThreadPool() {
        return this.cachedThreadPool;
    }


    public void setCachedThreadPool(ThreadPoolTaskExecutor cachedThreadPool) {
        this.cachedThreadPool = cachedThreadPool;
    }
}

