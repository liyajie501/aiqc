/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import java.util.Date;
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
/*     */ public class ScoreUpdate
/*     */ {
/*     */   private String updateId;
/*     */   private String scoreDetailDataId;
/*     */   private String sourceType;
/*     */   private String sourceId;
/*     */   private String workorderId;
/*     */   private String applyUser;
/*     */   private String updateUser;
/*     */   private Date updateTime;
/*     */   private Float scoreOld;
/*     */   private Float scoreNew;
/*     */   
/*  27 */   public String getUpdateId() { return this.updateId; }
/*     */ 
/*     */ 
/*     */   
/*  31 */   public void setUpdateId(String updateId) { this.updateId = (updateId == null) ? null : updateId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  35 */   public String getScoreDetailDataId() { return this.scoreDetailDataId; }
/*     */ 
/*     */ 
/*     */   
/*  39 */   public void setScoreDetailDataId(String scoreDetailDataId) { this.scoreDetailDataId = (scoreDetailDataId == null) ? null : scoreDetailDataId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  43 */   public String getSourceType() { return this.sourceType; }
/*     */ 
/*     */ 
/*     */   
/*  47 */   public void setSourceType(String sourceType) { this.sourceType = (sourceType == null) ? null : sourceType.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  51 */   public String getSourceId() { return this.sourceId; }
/*     */ 
/*     */ 
/*     */   
/*  55 */   public void setSourceId(String sourceId) { this.sourceId = (sourceId == null) ? null : sourceId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  59 */   public String getWorkorderId() { return this.workorderId; }
/*     */ 
/*     */ 
/*     */   
/*  63 */   public void setWorkorderId(String workorderId) { this.workorderId = (workorderId == null) ? null : workorderId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  67 */   public String getApplyUser() { return this.applyUser; }
/*     */ 
/*     */ 
/*     */   
/*  71 */   public void setApplyUser(String applyUser) { this.applyUser = (applyUser == null) ? null : applyUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  75 */   public String getUpdateUser() { return this.updateUser; }
/*     */ 
/*     */ 
/*     */   
/*  79 */   public void setUpdateUser(String updateUser) { this.updateUser = (updateUser == null) ? null : updateUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  83 */   public Date getUpdateTime() { return this.updateTime; }
/*     */ 
/*     */ 
/*     */   
/*  87 */   public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
/*     */ 
/*     */ 
/*     */   
/*  91 */   public Float getScoreOld() { return this.scoreOld; }
/*     */ 
/*     */ 
/*     */   
/*  95 */   public void setScoreOld(Float scoreOld) { this.scoreOld = scoreOld; }
/*     */ 
/*     */ 
/*     */   
/*  99 */   public Float getScoreNew() { return this.scoreNew; }
/*     */ 
/*     */ 
/*     */   
/* 103 */   public void setScoreNew(Float scoreNew) { this.scoreNew = scoreNew; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ScoreUpdate.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */