/*     */ package com.sinosoft.engine.analyze.service;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.cassandra.model.BaseData;
import com.huayunworld.znyyzj.engine.analyze.constant.BaseInfo;
import com.huayunworld.znyyzj.engine.analyze.model.MessageSound;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreTotal;
import com.huayunworld.znyyzj.engine.analyze.model.ScoreTotalData;
import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
import com.huayunworld.znyyzj.engine.analyze.utils.DateUtil;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.List;

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
/*     */ public class TaskScoreTotalResultHandleService
/*     */   implements Runnable
/*     */ {
/*  24 */   private static Logger logger = Logger.getLogger(TaskScoreTotalResultHandleService.class);
/*     */   
/*     */   private String scoreTotalId;
/*     */   private CacheService cacheService;
/*     */   
/*     */   public TaskScoreTotalResultHandleService(CacheService cache, String scoreTotalId) {
/*  30 */     this.cacheService = cache;
/*  31 */     this.scoreTotalId = scoreTotalId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     try {
/*  37 */       ScoreTotal scoreTotal = this.cacheService.getScoreTotalMapper().selectByPrimaryKey(this.scoreTotalId);
/*  38 */       BaseInfo baseInfo = (BaseInfo)JSONObject.toBean(JSONObject.fromObject(scoreTotal.getBaseInfo()), BaseInfo.class);
/*  39 */       String tableTime = "_" + DateUtil.formatDate(scoreTotal.getCreateTime(), "yyyyMMdd");
/*     */ 
/*     */       
/*  42 */       logger.info("任务处理器，开始处理总评分任务执行：scoreTotalId=" + this.scoreTotalId);
/*     */ 
/*     */       
/*  45 */       ScoreTotalData mysqldata = new ScoreTotalData();
/*  46 */       mysqldata.setTableNameSuffix(tableTime);
/*  47 */       this.cacheService.getScoreTotalDataMapper().createNewTable(mysqldata);
/*     */       
/*  49 */       MessageSound ms = new MessageSound();
/*  50 */       String totalScoreId = scoreTotal.getTotalScoreId();
/*  51 */       ScoreTotalData std = new ScoreTotalData();
/*  52 */       std.setTotalScoreId(totalScoreId);
/*  53 */       std.setTableNameSuffix(tableTime);
/*  54 */       if ("1".equals(baseInfo.getRecording())) {
/*  55 */         List<String> uploadIds = this.cacheService.getUploadAudioMapper().selectByTotalScoreId(scoreTotal.getTotalScoreId());
/*  56 */         for (String uploadId : uploadIds) {
/*  57 */           List<BaseData> base = this.cacheService.getBaseDataRepository().getBaseDataById(uploadId);
/*  58 */           if (base.size() > 0) {
/*  59 */             std.setBaseId(((BaseData)base.get(0)).getBaseId());
/*  60 */             ms.setBaseId(((BaseData)base.get(0)).getBaseId());
/*  61 */             ms.setScoreTotalId(totalScoreId);
/*  62 */             if (!isChecked(std));
/*  63 */             this.cacheService.getSoundTaskProducerImpl().producer(ms);
/*     */           } 
/*     */         } 
/*     */       } else {
/*     */         
/*  68 */         Date startTime = new Date((baseInfo.getStartTimeDate() == null) ? System.currentTimeMillis() : baseInfo.getStartTimeDate().longValue());
/*  69 */         Date endTime = new Date((baseInfo.getEndTimeDate() == null) ? System.currentTimeMillis() : baseInfo.getEndTimeDate().longValue());
/*     */         
/*  71 */         if (scoreTotal.getStopTime() != null) {
/*  72 */           startTime = scoreTotal.getStopTime();
/*  73 */           baseInfo.setStartTime(DateUtil.formatDate(startTime, "yyyy-MM-dd HH:mm:ss"));
/*     */         } 
/*  75 */         if (startTime.getTime() > endTime.getTime())
/*  76 */           return;  List<String> tableNameTimes = CommonTools.getTableNameTimes(startTime, endTime);
/*  77 */         for (String tableName : tableNameTimes) {
/*  78 */           std.setTableNameSuffix(tableTime);
/*  79 */           List<String> baseIds = null;
/*     */           try {
/*  81 */             baseInfo.setTableNameSuffix(tableName);
/*  82 */             baseInfo.setSysId(scoreTotal.getSysId());
/*  83 */             baseIds = this.cacheService.getBaseDataMapper().selectByBaseInfo(baseInfo);
/*  84 */           } catch (Exception e) {
/*  85 */             logger.info("跳过basedata月表：" + tableName + "，该表不存在。", e);
/*     */             continue;
/*     */           } 
/*  88 */           for (String baseId : baseIds) {
/*  89 */             std.setBaseId(baseId);
/*  90 */             ms.setBaseId(baseId);
/*  91 */             ms.setScoreTotalId(totalScoreId);
/*     */             
/*  93 */             this.cacheService.getSoundTaskProducerImpl().producer(ms);
/*     */           } 
/*     */         } 
/*     */       } 
/*  97 */     } catch (Exception e) {
/*  98 */       logger.error("任务处理器异常,scoreTotalId=" + this.scoreTotalId, e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer isNeedRun(ScoreTotal st, BaseInfo beanInfo) {
/* 108 */     int countBaseData = 0;
/* 109 */     int countScoreData = 0;
/*     */     
/* 111 */     List<String> tableNameTimes = CommonTools.getTableNameTimes(new Date(beanInfo.getStartTimeDate().longValue()), new Date(beanInfo.getEndTimeDate().longValue()));
/* 112 */     for (String tableName : tableNameTimes) {
/*     */       try {
/* 114 */         beanInfo.setTableNameSuffix(tableName);
/* 115 */         countBaseData += this.cacheService.getBaseDataMapper().countByBaseInfo(beanInfo);
/* 116 */       } catch (Exception e) {
/* 117 */         logger.info("跳过basedata月表：" + tableName + "，该表不存在。");
/*     */       } 
/*     */     } 
/*     */     
/* 121 */     ScoreTotalData std = new ScoreTotalData();
/* 122 */     std.setTableNameSuffix("_" + DateUtil.formatDate(st.getCreateTime(), "yyyyMMdd"));
/* 123 */     std.setTotalScoreId(st.getTotalScoreId());
/*     */     try {
/* 125 */       countScoreData = this.cacheService.getScoreTotalDataMapper().countByWhere(std);
/* 126 */     } catch (Exception e) {
/*     */       
/* 128 */       logger.error("表不存在！");
/*     */     } 
/* 130 */     return Integer.valueOf(countBaseData - countScoreData);
/*     */   }
/*     */   public boolean isChecked(ScoreTotalData std) {
/* 133 */     List<ScoreTotalData> sc = this.cacheService.getScoreTotalDataMapper().selectByWhere(std);
/* 134 */     if (sc.size() > 0) return true; 
/* 135 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\TaskScoreTotalResultHandleService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */