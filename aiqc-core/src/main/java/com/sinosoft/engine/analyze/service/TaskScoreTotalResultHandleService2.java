/*    */ package com.sinosoft.engine.analyze.service;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.constant.BaseInfo;
import com.huayunworld.znyyzj.engine.analyze.model.BaseData;
import com.huayunworld.znyyzj.engine.analyze.model.MessageSound;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreResult;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreTotal;
import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.List;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TaskScoreTotalResultHandleService2
/*    */   implements Runnable
/*    */ {
/* 23 */   private static Logger logger = Logger.getLogger(TaskScoreTotalResultHandleService2.class);
/*    */   
/*    */   private String scoreTotalResultId;
/*    */   private CacheService cacheService;
/*    */   
/*    */   public TaskScoreTotalResultHandleService2(CacheService cache, String scoreTotalResultId) {
/* 29 */     this.cacheService = cache;
/* 30 */     this.scoreTotalResultId = scoreTotalResultId;
/*    */   }
/*    */   
/*    */   public void run() {
/*    */     try {
/* 35 */       logger.info("任务处理器，开始处理总评分任务执行：scoreTotalResultId=" + this.scoreTotalResultId);
/*    */       
/* 37 */       ScoreResult _sr = new ScoreResult();
/* 38 */       _sr.setTotalScoreResultId(this.scoreTotalResultId);
/* 39 */       List<ScoreResult> sr = this.cacheService.getScoreResultMapper().selectWhereScoreResult(_sr);
/* 40 */       logger.info("处理总评分任务信息：totalScoreId=" + ((ScoreResult)sr.get(0)).getTotalScoreId());
/* 41 */       ScoreTotal scoreTotal = this.cacheService.getScoreTotalMapper().selectByPrimaryKey(((ScoreResult)sr.get(0)).getTotalScoreId());
/* 42 */       BaseInfo baseInfo = (BaseInfo)JSONObject.toBean(JSONObject.fromObject(scoreTotal.getBaseInfo()), BaseInfo.class);
/* 43 */       BaseData baseData = new BaseData();
/*    */       
/* 45 */       Date startTime = new Date((baseInfo.getStartTimeDate() == null) ? System.currentTimeMillis() : baseInfo.getStartTimeDate().longValue());
/* 46 */       Date endTime = new Date((baseInfo.getEndTimeDate() == null) ? System.currentTimeMillis() : baseInfo.getEndTimeDate().longValue());
/* 47 */       List<String> tableNameTimes = CommonTools.getTableNameTimes(startTime, endTime);
/* 48 */       MessageSound ms = new MessageSound();
/* 49 */       String totalScoreId = scoreTotal.getTotalScoreId();
/* 50 */       for (String tableName : tableNameTimes) {
/* 51 */         List<String> baseIds = null;
/*    */         try {
/* 53 */           baseData.setTableNameSuffix(tableName);
/* 54 */           baseIds = this.cacheService.getBaseDataMapper().selectByBaseInfo(baseInfo);
/* 55 */         } catch (Exception e) {
/* 56 */           logger.info("跳过basedata月表：" + tableName + "，该表不存在。");
/*    */           continue;
/*    */         } 
/* 59 */         for (String baseId : baseIds) {
/* 60 */           ms.setBaseId(baseId);
/* 61 */           ms.setScoreTotalId(totalScoreId);
/* 62 */           this.cacheService.getSoundTaskProducerImpl().producer(ms);
/*    */         } 
/*    */       } 
/* 65 */     } catch (Exception e) {
/* 66 */       logger.error("任务处理器异常,scoreTotalResultId=" + this.scoreTotalResultId, e);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\TaskScoreTotalResultHandleService2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */