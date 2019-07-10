/*     */ package com.sinosoft.engine.task.service.impl;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.constant.BaseInfo;
import com.huayunworld.znyyzj.engine.analyze.model.RuleAndScoreDetail;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreAgentRule;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreTotal;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreTotalData;
import com.huayunworld.znyyzj.engine.analyze.service.CacheService;
import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
import com.huayunworld.znyyzj.engine.analyze.utils.DateUtil;
import com.huayunworld.znyyzj.engine.task.service.TaskService;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class TaskServiceImpl
/*     */   implements TaskService
/*     */ {
/*  35 */   private static Logger logger = Logger.getLogger(com.huayunworld.znyyzj.engine.analyze.service.TaskScoreTotalResultDispatcherService.class);
/*     */   
/*     */   @Autowired
/*     */   private CacheService cacheService;
/*     */ 
/*     */   
/*     */   public boolean countScoreDetailByAgent() {
/*  42 */     Long start = Long.valueOf((new Date()).getTime());
/*  43 */     logger.info("【开始】定时统计质检产生的评分数据，当前时间：" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(start));
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  48 */       int countNum = 0;
/*  49 */       List<ScoreTotal> countList = runCount(countNum);
/*  50 */       logger.info("【共有质检任务数】：" + countList.size());
/*  51 */       logger.info("【统计质检任务数】：" + countNum);
/*  52 */       Long end = Long.valueOf((new Date()).getTime());
/*  53 */       logger.info("【结束】共用时：" + ((end.longValue() - start.longValue()) / 1000L) + "(s)");
/*  54 */     } catch (Exception e) {
/*  55 */       e.printStackTrace();
/*  56 */       logger.error("定时统计质检产生的评分数据异常," + e);
/*     */     } 
/*  58 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ScoreTotal> getNeedCountScoreTotal() {
/*  65 */     ScoreTotal sc = new ScoreTotal();
/*  66 */     sc.setDeleteMark("0");
/*  67 */     sc.setPublishMark("1");
/*  68 */     return this.cacheService.getScoreTotalMapper().selectByWhere(sc);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ScoreTotal> runCount(int countNum) {
/*  77 */     List<ScoreTotal> list = getNeedCountScoreTotal();
/*  78 */     Iterator<ScoreTotal> iterator = list.iterator();
/*  79 */     while (iterator.hasNext()) {
/*  80 */       ScoreTotal next = (ScoreTotal)iterator.next();
/*  81 */       Long start = Long.valueOf((new Date()).getTime());
/*  82 */       BaseInfo beanInfo = (BaseInfo)JSONObject.toBean(JSONObject.fromObject(next.getBaseInfo()), BaseInfo.class);
/*  83 */       List<RuleAndScoreDetail> rules = this.cacheService.getScoreDetailMapper().selectByTotalScoreId(next.getTotalScoreId(), null);
/*  84 */       List<String> agentIds = getAllAgentIds(next);
/*  85 */       Integer needRunCount = isNeedRunCount(Integer.valueOf(rules.size() * agentIds.size()), next, beanInfo);
/*  86 */       if (needRunCount.intValue() == 0)
/*  87 */         continue;  countNum++;
/*  88 */       logger.info("【开始】统计质检任务id:" + next.getTotalScoreId() + ":" + next.getName());
/*  89 */       logger.info("需要统计坐席*规则条数:" + needRunCount);
/*  90 */       runCountScoreTotalResult(next, beanInfo, rules, agentIds);
/*  91 */       Long end = Long.valueOf((new Date()).getTime());
/*  92 */       logger.info("【结束】，用时：" + ((end.longValue() - start.longValue()) / 1000L) + "(s)");
/*     */     } 
/*  94 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer isNeedRunCount(Integer allCount, ScoreTotal st, BaseInfo beanInfo) {
/* 102 */     Integer needCountdays = CommonTools.getDaysBetween(new Date(beanInfo.getStartTimeDate().longValue()), new Date(beanInfo.getEndTimeDate().longValue()));
/* 103 */     allCount = Integer.valueOf(allCount.intValue() * needCountdays.intValue());
/* 104 */     ScoreAgentRule sar = new ScoreAgentRule();
/* 105 */     sar.setScoreTotalId(st.getTotalScoreId()); sar.setUnit("d");
/* 106 */     int alreadyCount = this.cacheService.getScoreAgentRuleMapper().countByWhere(sar);
/*     */     
/* 108 */     if (beanInfo.getEndTimeDate().longValue() < (new Date()).getTime() - 60000L && allCount.intValue() - alreadyCount <= 0) {
/* 109 */       return Integer.valueOf(0);
/*     */     }
/* 111 */     return Integer.valueOf(allCount.intValue() - alreadyCount);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ScoreAgentRule runCountScoreAgent(String totalScoreId, String agentId, long agentCount, RuleAndScoreDetail rule, Long startTime, Long endTime, String timeUnit) {
/* 118 */     ScoreAgentRule scoreAgentRule = new ScoreAgentRule();
/* 119 */     long getcount = this.cacheService.getScoreDetailDataRepository().countBy(totalScoreId, agentId, rule.getRuleId(), Double.valueOf(0.0D), startTime, endTime);
/* 120 */     scoreAgentRule.setScoreTotalId(totalScoreId);
/* 121 */     scoreAgentRule.setAgentId(agentId);
/* 122 */     scoreAgentRule.setRuleId(rule.getRuleId());
/* 123 */     Calendar caStart = Calendar.getInstance();
/* 124 */     caStart.setTime(new Date(startTime.longValue()));
/* 125 */     caStart.set(14, 0);
/* 126 */     if ("H".equals(timeUnit)) {
/* 127 */       caStart.set(caStart.get(1), caStart.get(2), caStart.get(5), caStart.get(11), 0, 0);
/* 128 */       scoreAgentRule.setRecordTime(caStart.getTime());
/* 129 */     } else if ("d".equals(timeUnit)) {
/* 130 */       caStart.set(caStart.get(1), caStart.get(2), caStart.get(5), 0, 0, 0);
/* 131 */       scoreAgentRule.setRecordTime(caStart.getTime());
/*     */     } 
/* 133 */     ScoreAgentRule checksc = checkNeedCount(scoreAgentRule);
/* 134 */     if (checksc == null) {
/* 135 */       scoreAgentRule.setCreateTime(new Date());
/* 136 */       scoreAgentRule.setDetailScoreGetCount(Integer.valueOf((int)getcount));
/* 137 */       scoreAgentRule.setRecordCount(Integer.valueOf((int)agentCount));
/* 138 */       scoreAgentRule.setDetailScoreId(rule.getDetailScoreId());
/* 139 */       scoreAgentRule.setUnit(timeUnit);
/* 140 */       return scoreAgentRule;
/* 141 */     }  if (checksc.getDetailScoreGetCount() != checksc.getDetailScoreGetCount() && (int)agentCount != checksc
/* 142 */       .getRecordCount().intValue()) {
/* 143 */       checksc.setScoreAgentRuleId(checksc.getScoreAgentRuleId());
/* 144 */       this.cacheService.getScoreAgentRuleMapper().updateByPrimaryKey(checksc);
/*     */     } 
/* 146 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void runCountScoreTotalResult(ScoreTotal scoreTotal, BaseInfo bean, List<RuleAndScoreDetail> rules, List<String> agentIds) {
/* 153 */     Calendar caNow = Calendar.getInstance();
/* 154 */     if (bean.getStartTimeDate().longValue() > caNow.getTime().getTime()) {
/*     */       return;
/*     */     }
/* 157 */     Calendar caStart = Calendar.getInstance();
/* 158 */     Calendar caEnd = Calendar.getInstance();
/* 159 */     caStart.set(14, 0);
/* 160 */     caEnd.set(14, 0);
/* 161 */     caStart.setTime(new Date(bean.getStartTimeDate().longValue()));
/* 162 */     caEnd.setTime(new Date(bean.getEndTimeDate().longValue()));
/*     */     
/* 164 */     Integer days = CommonTools.getDaysBetween(new Date(bean.getStartTimeDate().longValue()), new Date(bean.getEndTimeDate().longValue()));
/* 165 */     for (int n = 0; n <= days.intValue(); n++) {
/* 166 */       Date _start = caStart.getTime();
/* 167 */       caStart.set(caStart.get(1), caStart.get(2), caStart.get(5) + 1, 0, 0, 0);
/* 168 */       Date _end = (n == days.intValue()) ? new Date(bean.getEndTimeDate().longValue()) : caStart.getTime();
/*     */       
/* 170 */       for (String agentId : agentIds) {
/* 171 */         List<ScoreAgentRule> inserts = new ArrayList<ScoreAgentRule>();
/* 172 */         long agentCount = this.cacheService.getScoreDetailDataRepository().countBy(scoreTotal.getTotalScoreId(), agentId, Long.valueOf(_start.getTime()), Long.valueOf(_end.getTime() - 1L));
/* 173 */         for (RuleAndScoreDetail rule : rules) {
/* 174 */           ScoreAgentRule as = runCountScoreAgent(scoreTotal.getTotalScoreId(), agentId, agentCount, rule, 
/* 175 */               Long.valueOf(_start.getTime()), Long.valueOf(_end.getTime() - 1L), "d");
/* 176 */           if (as != null) inserts.add(as);
/*     */         
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 192 */         if (inserts.size() > 0) this.cacheService.getScoreAgentRuleMapper().inserts(inserts); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public ScoreAgentRule checkNeedCount(ScoreAgentRule sc) {
/* 197 */     List<ScoreAgentRule> list = this.cacheService.getScoreAgentRuleMapper().selectByWhere(sc);
/* 198 */     if (list.size() > 0) return (ScoreAgentRule)list.get(0); 
/* 199 */     return null;
/*     */   }
/*     */   public List<String> getAllAgentIds(ScoreTotal scoreTotal) {
/* 202 */     ScoreTotalData std = new ScoreTotalData();
/* 203 */     std.setTableNameSuffix("_" + DateUtil.formatDate(scoreTotal.getCreateTime(), "yyyyMMdd"));
/* 204 */     this.cacheService.getScoreTotalDataMapper().createNewTable(std);
/* 205 */     std.setTotalScoreId(scoreTotal.getTotalScoreId());
/* 206 */     return this.cacheService.getScoreTotalDataMapper().getAllAgentIds(std);
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\task\service\impl\TaskServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */