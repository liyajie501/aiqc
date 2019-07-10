package com.sinosoft.engine.analyze.service;

import com.github.pagehelper.util.StringUtil;
import com.sinosoft.engine.alarm.model.MsgScore;
import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.cassandra.model.ScoreDetailData;
import com.sinosoft.engine.analyze.cassandra.model.ScoreTotalData;
import com.sinosoft.engine.analyze.constant.BaseInfo;
import com.sinosoft.engine.analyze.model.AnalyzeResource;
import com.sinosoft.engine.analyze.model.AnalyzeResult;
import com.sinosoft.engine.analyze.model.Analyzer;
import com.sinosoft.engine.analyze.model.Category;
import com.sinosoft.engine.analyze.model.ProducerEleValueExt;
import com.sinosoft.engine.analyze.model.Rule;
import com.sinosoft.engine.analyze.model.RuleAndScoreDetail;
import com.sinosoft.engine.analyze.model.RuleCore;
import com.sinosoft.engine.analyze.model.ScoreTotal;
import com.sinosoft.engine.analyze.model.SqlResultMap001;
import com.sinosoft.engine.analyze.model.Task;
import com.sinosoft.engine.analyze.utils.CommonTools;
import com.sinosoft.engine.analyze.utils.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;

import net.sf.json.JSONObject;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


public class TaskHandleAnalyzeService {
    private static Logger logger = Logger.getLogger(TaskHandleAnalyzeService.class);

    private Task task;

    private XmlResolverDom4j xmlDom4j;

    private XmlResolverJsoup xmlJsoup;

    private CacheService cache;

    private AnalyzeResource res;

    public TaskHandleAnalyzeService(Task task, CacheService cache, AnalyzeResource res) {
        this.task = task;
        this.xmlDom4j = res.getXmlDom4j();
        this.xmlJsoup = res.getXmlJsoup();
        this.cache = cache;
        this.res = res;
    }


    private List<ScoreTotal> getAnalyzeScoreTotalIds() {
        List<ScoreTotal> list = null;
        if (this.task.getAnalyzeContents() != null && this.task.getAnalyzeContents().size() > 0) {
            list = this.cache.getScoreTotalMapper().selectByPrimaryKeys(new ArrayList(this.task.getAnalyzeContents().keySet()));
        } else {
            list = this.cache.getScoreTotalMapper().selectBySysId(this.task.getSysId());
        }
        return list;
    }


    private List<ScoreTotal> getAnalyzeScoreTotal(BaseData base) {
        List<ScoreTotal> list = null;
        if (this.task.getAnalyzeContents() != null && this.task.getAnalyzeContents().size() > 0) {
            list = this.cache.getScoreTotalMapper().selectByPrimaryKeys(new ArrayList(this.task.getAnalyzeContents().keySet()));
        } else {
            list = this.cache.getScoreTotalMapper().selectBySysId(this.task.getSysId());
        }

        if (base != null && list.size() > 0) {
            Iterator<ScoreTotal> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!checkIsAvailable((ScoreTotal) iterator.next(), base)) iterator.remove();
            }
        }
        return list;
    }


    private boolean checkIsAvailable(ScoreTotal next, BaseData base) {
        try {
            BaseInfo bean = (BaseInfo) JSONObject.toBean(JSONObject.fromObject(next.getBaseInfo()), BaseInfo.class);
            if (base != null) {

                if (bean.getAgentIds() != null && !bean.getAgentIds().contains(base.getAgentId())) {
                    return false;
                }
                if (bean.getStartTime() != null && bean.getStartTimeDate().longValue() > base.getStartTime().getTime())
                    return false;
                if (bean.getEndTime() != null && bean.getEndTimeDate().longValue() < base.getStartTime().getTime()) {
                    return false;
                }
                if (bean.getMinValue() != null && base.getRecordDuration().intValue() < bean.getMinValue().intValue())
                    return false;
                if (bean.getMaxValue() != null && base.getRecordDuration().intValue() > bean.getMaxValue().intValue())
                    return false;
            }
        } catch (Exception e) {
            logger.error("检查录音是否满足质检条件【失败】", e);
        }
        return true;
    }


    private List<RuleAndScoreDetail> getAnalyzeScoreDetailIds(String totalScoreId) {
        List<String> ruleIds = null;
        if (this.task.getAnalyzeContents() != null && this.task.getAnalyzeContents().size() > 0) {
            Set<String> ruleIdset = (Set) this.task.getAnalyzeContents().get(totalScoreId);
            if (ruleIdset != null && ruleIdset.size() > 0) {
                ruleIds = new ArrayList<String>(ruleIdset);
            }
        }
        return this.cache.getScoreDetailMapper().selectByTotalScoreId(totalScoreId, ruleIds);
    }


    private Map<String, Rule> getRules(List<String> ruleIds) {
        Map<String, Rule> map = new HashMap<String, Rule>();
        if (ruleIds == null || ruleIds.size() == 0) return map;
        List<Rule> rules = this.cache.getRuleMapper().selectByPrimaryKeys(ruleIds);
        for (Rule r : rules) map.put(r.getRuleId(), r);
        return map;
    }


    public void analyzeModel() {
        BaseData base = this.task.getBaseData();

        logger.info("----------------------开始质检----------------------baseId：" + base.getBaseId());

        List<ScoreTotal> list = getAnalyzeScoreTotal(base);

        logger.info("质检模型数：" + ((list == null) ? 0 : list.size()));
        if (list != null && list.size() > 0) {
            BlockingQueue<List<AnalyzeResult>> analyzeResultQueue = this.task.getAnalyzeResultQueue();

            for (ScoreTotal st : list) {
                logger.info("分析模型: modelId=" + st.getModelId() + ", totalScoreId=" + st.getTotalScoreId());
                ScoreTotalData tData = new ScoreTotalData();
                tData.setScoreTotalDataId(CommonTools.getUUID());
                tData.setTotalScore(Double.valueOf(0.0D));

                List<ScoreDetailData> dList = analyzeRule(st);


                for (ScoreDetailData dData : dList) {
                    tData.setTotalScore(Double.valueOf(tData.getTotalScore().doubleValue() + dData.getDetailScore().doubleValue()));
                }
                try {
                    PropertyUtils.copyProperties(tData, base);
                } catch (Exception e1) {
                    logger.error("PropertyUtils.copyProperties复制基础信息到评分结果【失败】");
                }

                tData.setCreateTime(new Date());
                tData.setSysIdBak(base.getSysId());
                tData.setSequenceNum(Long.valueOf(CacheService.getSequenceVal()));
                tData.setTotalScoreId(st.getTotalScoreId());
                tData.setTotalScoreResultId(st.getTotalScoreId());


                String startTime = DateUtil.formatDate(base.getStartTime());
                startTime = startTime.replace("-", "").substring(0, 11).replace(" ", "");
                tData.setTimeFlag(startTime);

                if (this.task.isSaveScoreTotalData()) this.cache.getScoreTotalDataRepository().save(tData);
                logger.info("模型得分:" + tData.getTotalScore() + "\t modelId=" + st.getModelId());


                if (this.task.isSaveScoreTotalDataDB()) this.cache.saveScoreTotalDataToDB(st, tData);
                logger.debug("总得分保存到mysql表中，得分:" + tData.getTotalScore() + "\t modelId=" + st.getModelId());

                List<AnalyzeResult> analyzeResultList = new ArrayList<AnalyzeResult>();
                for (ScoreDetailData dData : dList) {
                    dData.setScoreDetailDataId(CommonTools.getUUID());
                    dData.setScoreTotalDataId(tData.getScoreTotalDataId());
                    dData.setTotalScoreResultId(tData.getTotalScoreId());
                    if (!this.task.isSaveResultEle()) dData.setRuleExecResult(null);
                    analyzeResultList.add(dData.getAnalyzeResult());

                    try {
                        PropertyUtils.copyProperties(dData, base);
                    } catch (Exception e) {
                        logger.info("复制base属性到scoreDetail【失败】");
                        e.printStackTrace();
                    }


                    if (this.task.isSaveScoreDetailData()) this.cache.getScoreDetailDataRepository().save(dData);

                }


                if (analyzeResultQueue != null) {
                    try {
                        analyzeResultQueue.put(analyzeResultList);
                        logger.info("返回标注信息，size=" + analyzeResultList.size());
                    } catch (InterruptedException e) {
                        logger.error("输出质检标注信息到队列异常", e);
                    }
                }
            }
        }
        logger.info("----------------------结束质检----------------------baseId：" + base.getBaseId());
    }


    private List<ScoreDetailData> analyzeRule(ScoreTotal st) {
        List<ScoreDetailData> result = new ArrayList<ScoreDetailData>();
        try {
            List<RuleAndScoreDetail> detailList = getAnalyzeScoreDetailIds(st.getTotalScoreId());
            logger.info("质检规则数：" + ((detailList == null) ? 0 : detailList.size()));
            if (detailList != null && detailList.size() > 0) {
                for (RuleAndScoreDetail rd : detailList) {

                    try {
                        logger.info("分析规则：ruleId=" + rd.getRuleId() + ",detailScoreId=" + rd.getDetailScoreId() + ",analyzerId=" + rd.getAnalyzerId() + ",context=" + rd.getContext());


                        Analyzer an = this.cache.getAnalyzerMapper().selectByPrimaryKey(rd.getAnalyzerId());
                        RuleCore rule = getRuleCore(st, rd);
                        logger.info("ruleCore=" + JSONObject.fromObject(rule));


                        AnalyzeResult anResult = execRule(an, rule);


                        ScoreDetailData data = new ScoreDetailData();
                        data.setCreateTime(new Date());
                        data.setDetailScore(Double.valueOf(anResult.isResult() ? rd.getScoreValue().doubleValue() : 0.0D));
                        data.setDetailScoreId(rd.getDetailScoreId());

                        data.setAnalyzeResult(anResult);
                        anResult.setDetailScoreId(rd.getDetailScoreId());
                        data.setRuleId(rd.getRuleId());

                        logger.info("规则得分：" + data.getDetailScore() + "\t ruleId=" + rd.getRuleId());
                        result.add(data);
                    } catch (Exception e) {
                        logger.error("分析规则异常:" + JSONObject.fromObject(rd).toString(), e);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("分析质检规则（打分）异常:" + JSONObject.fromObject(st).toString(), e);
        }
        return result;
    }


    public List<String> markCategorys(List<Category> categories, String sysId) {
        if (categories == null || categories.size() == 0) {
            Category _ca = new Category();
            _ca.setDeleteMark("0");
            if (StringUtils.isNotBlank(sysId)) _ca.setSysId(sysId);
            logger.info("查询业务标记...");
            categories = this.cache.getCategoryMapper().CategoryList(_ca);
        }
        if (categories == null || categories.size() == 0) return new ArrayList();
        logger.info("业务标记数：" + ((categories == null) ? 0 : categories.size()));
        List<String> ruleIds = new ArrayList<String>();
        List<String> existCaId = new ArrayList<String>();
        for (Category ca : categories) {
            if (StringUtil.isNotEmpty(ca.getRuleId())) ruleIds.add(ca.getRuleId());

        }
        Map<String, Rule> rulesMap = getRules(ruleIds);
        logger.info("标记业务规则数：" + ((rulesMap == null) ? 0 : rulesMap.size()));
        for (Category ca : categories) {
            try {
                Rule ru = (Rule) rulesMap.get(ca.getRuleId());


                Analyzer an = this.cache.getAnalyzerMapper().selectByPrimaryKey(ru.getAnalyzerId());
                RuleCore rule = getRuleCore(ru);
                logger.info("ruleCore=" + JSONObject.fromObject(rule));


                AnalyzeResult anResult = execRule(an, rule);
                if (anResult.isResult()) {
                    existCaId.add(ca.getCategoryId());
                    logger.info("标记【成功】：" + ca);
                }

            } catch (Exception e) {
                logger.error("标记【失败】：" + ca, e);
            }
        }
        if (existCaId.size() == 0) existCaId.add("0");
        return existCaId;
    }


    private RuleCore getRuleCore(ScoreTotal st, RuleAndScoreDetail rd) throws Exception {
        List<SqlResultMap001> list = this.cache.getProducerEleGroupMapper().getProducerEleValueExt(rd.getRuleId());
        if (list == null || list.size() == 0) {
            logger.warn("规则没有关联元素组、元素等信息");
            return null;
        }
        Map<String, List<ProducerEleValueExt>> eleGroupMap = new HashMap<String, List<ProducerEleValueExt>>();

        String ruleAttrValue = rd.getRuleAttrValue();
        JSONObject attrValueJson = null;
        if (StringUtils.isNotBlank(ruleAttrValue)) {
            attrValueJson = JSONObject.fromObject(ruleAttrValue);
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
        RuleCore rule = new RuleCore(rd.getRuleId(), rd.getName(), rd.getContext(), rd.getType(), st.getUserType());
        rule.setEleGroupMap(eleGroupMap);
        return rule;
    }


    private RuleCore getRuleCore(Rule ru) throws Exception {
        List<SqlResultMap001> list = this.cache.getProducerEleGroupMapper().getProducerEleValueExt(ru.getRuleId());
        if (list == null || list.size() == 0) {
            logger.warn("规则没有关联元素组、元素等信息");
            return null;
        }
        Map<String, List<ProducerEleValueExt>> eleGroupMap = new HashMap<String, List<ProducerEleValueExt>>();
        JSONObject attrValueJson = null;
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
        RuleCore rule = new RuleCore(ru.getRuleId(), ru.getName(), ru.getContext(), ru.getType(), "0");
        rule.setEleGroupMap(eleGroupMap);
        return rule;
    }


    private AnalyzeResult execRule(Analyzer analyzer, RuleCore rule) {
        try {
            logger.debug("分析器:" + JSONObject.fromObject(analyzer).toString());
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


    private void checkAndSendAlarm(ScoreTotalData tData, ScoreDetailData dData) {
        BaseData base = this.task.getBaseData();

        MsgScore msg = new MsgScore();
        msg.setAudioCode(base.getAudioCode());
        msg.setBaseId(base.getBaseId());

        msg.setRecordFile(base.getRecordFile());
        msg.setRuleId(dData.getRuleId());


        msg.setSysId(base.getSysId());


        msg.setAgentId(base.getAgentId());
        msg.setStartTime(base.getStartTime());

        this.cache.getCheckAlarmServiceImpl().checkAndSendAlarm(msg);
    }
}


