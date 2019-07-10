package com.sinosoft.engine.analyze.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sinosoft.engine.alarm.model.MsgScore;
import com.sinosoft.engine.alarm.service.AlarmConfigService;
import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.constant.AnalyzeEngineConstant;
import com.sinosoft.engine.analyze.model.*;
import com.sinosoft.engine.analyze.service.impl.BaseDataServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TaskHandleService
        implements Runnable {
    private static Logger logger = Logger.getLogger(TaskHandleService.class);
    private Task task;
    private CacheService cache;
    private BaseDataService baseSvc;
    private AnalyzeResource res;


    public TaskHandleService(CacheService cache, Task task) {
        this.baseSvc = new BaseDataServiceImpl();
        this.res = new AnalyzeResource();
        this.cache = cache;
        this.task = task;
    }


    public void run() {
        try {
            logger.info("任务处理器，开始处理文件：" + JSONObject.toJSONString(this.task));
            this.res.setResultXmlFile(AnalyzeEngineConstant.MOUNT_ROOT_DIR + this.task.getXmlFileName());
            this.res.setEmotionFile(AnalyzeEngineConstant.MOUNT_ROOT_DIR + this.task.getEmoFileName());
            this.res.init(this.baseSvc);


            if (this.task.isSaveBaseFile()) {

                TaskHandleAnalyzeService analyzeService = new TaskHandleAnalyzeService(this.task, this.cache, this.res);
                List<String> markCategoryIds = analyzeService.markCategorys(null, this.task.getSysId());
                BaseData base = new BaseData();
                base.setCategories(markCategoryIds.toString());
                TaskHandleSaveService saveService = new TaskHandleSaveService(this.task, this.cache, this.res, this.baseSvc);
                saveService.saveBaseDataToDB(base);
                this.task.setBaseData(base);
                if (this.task.isSaveWord()) saveService.saveWordToDB();
                if (this.task.isSaveBaseSourceData()) saveService.saveXmlFileToDB();
                saveService.addCopyFile();
                analyzeService.analyzeModel();
                if (this.task.isSaveBaseDataToES()) saveService.saveBaseDataToES(base);


                List<Alarm> alarmAll = AlarmConfigService.alarmConfig;
                List<String> CategoryList = new ArrayList<String>();
                for (Alarm a : alarmAll) {
                    JSONArray jsonArray = JSONArray.parseArray(a.getCategoryIdLevel());
                    for (int i = 0; i < jsonArray.size(); i++) {
                        JSONObject job = jsonArray.getJSONObject(i);
                        CategoryList.add(job.getString("Category"));
                    }
                }

                List<String> ruleIds = new ArrayList<String>();
                if (CategoryList != null && CategoryList.size() > 0) {

                    List<Category> Category = this.cache.getCategoryMapper().CategoryBatch(CategoryList);
                    for (int i = 0; i < Category.size(); i++) {
                        ruleIds.add(((Category) Category.get(i)).getRuleId());
                    }
                    List<Rule> ruleList = this.cache.getRuleMapper().selectByPrimaryKeys(ruleIds);
                    for (int i = 0; i < ruleList.size(); i++) {
                        Analyzer an = this.cache.getAnalyzerMapper().selectByPrimaryKey("1");
                        RuleCore rule = getRuleCore((Rule) ruleList.get(i));

                        AnalyzeResult anResult = execRule(an, rule);

                        if (anResult.isResult()) {
                            for (Alarm al : alarmAll) {
                                String[] sysIds = al.getSysId().split(",");
                                for (String sysId : sysIds) {

                                    if (base.getSysId().equals(sysId)) {
                                        if (base.getStartTime().getTime() > al.getStartTime().getTime() && base.getStartTime().getTime() < al.getEndTime().getTime() &&
                                                this.task.isSendAlarm()) checkAndSendAlarm();

                                    }
                                }
                            }
                        }
                    }
                }
            }


            if (this.task.isAnalyzeFile()) {
                if (this.task.getBaseData() != null) {
                    this.res.setBaseData(this.task.getBaseData());
                    TaskHandleAnalyzeService analyzeService = new TaskHandleAnalyzeService(this.task, this.cache, this.res);
                    analyzeService.analyzeModel();
                } else {
                    logger.error("质检文件时，需要传入参数BaseData，请检查代码");
                }
            }
        } catch (Exception e) {
            logger.error("任务处理器异常", e);
        } finally {
        }
    }


    private AnalyzeResult execRule(Analyzer analyzer, RuleCore rule) {
        try {
            logger.debug("分析器:" + JSONObject.toJSONString(analyzer));
            Class cls = DynamicClassLoader.my.loadClass(analyzer.getAnalyzerClass(), analyzer.getVersion());
            Object obj = cls.newInstance();
            AnalyzeService analyObj = (AnalyzeService) obj;
            return analyObj.analyzeRule(rule, this.res);
        } catch (Throwable e) {
            logger.error("分析文件指定规则异常", e);
            AnalyzeResult re = new AnalyzeResult();
            re.setResult(false);
            re.setErrorFlag(true);
            re.setErrorContext("分析文件指定规则异常:" + e.getMessage());
            return re;
        }
    }


    private RuleCore getRuleCore(Rule rule) throws Exception {
        List<SqlResultMap001> list = this.cache.getProducerEleGroupMapper().getProducerEleValueExt(rule.getRuleId());
        if (list == null || list.size() == 0) {
            logger.warn("规则没有关联元素组、元素等信息");
            return null;
        }
        Map<String, List<ProducerEleValueExt>> eleGroupMap = new HashMap<String, List<ProducerEleValueExt>>();


        String ruleAttrValue = "";
        JSONObject attrValueJson = null;
        if (StringUtils.isNotBlank(ruleAttrValue)) {
            attrValueJson = JSONObject.parseObject(ruleAttrValue);
        }


        for (SqlResultMap001 map001 : list) {
            if (!eleGroupMap.containsKey(map001.getEleGroupId()))
                eleGroupMap.put(map001.getEleGroupId(), new ArrayList());
            ProducerEleValueExt e = new ProducerEleValueExt();
            e.setCode(map001.getCode());
            e.setEleGroupId(map001.getEleGroupId());
            e.setEleId(map001.getEleId());
            e.setEleValue(map001.getEleValue());
            e.setEleValueType(map001.getEleValueType());


            if (map001.getEleValueType().intValue() == 1) {
                if (attrValueJson == null)
                    throw new Exception("规则配置不正确，规则配置了“替换值”，但在YYZJ_C_SCORE_DETAIL.rule_attr_value中未找到！");
                e.setEleValue((String) attrValueJson.get(map001.getCode()));
            }


            ((List) eleGroupMap.get(map001.getEleGroupId())).add(e);
        }

        RuleCore ruleCore = new RuleCore(rule.getRuleId(), rule.getName(), rule.getContext(), rule.getType(), "1");
        ruleCore.setEleGroupMap(eleGroupMap);
        return ruleCore;
    }


    private void checkAndSendAlarm() {
        BaseData base = this.task.getBaseData();

        MsgScore msg = new MsgScore();
        msg.setAudioCode(base.getAudioCode());
        msg.setBaseId(base.getBaseId());
        msg.setRecordFile(base.getRecordFile());
        msg.setSysId(base.getSysId());

        msg.setAgentId(base.getAgentId());
        msg.setStartTime(base.getStartTime());

        this.cache.getCheckAlarmServiceImpl().checkAndSendAlarm(msg);
    }
}

