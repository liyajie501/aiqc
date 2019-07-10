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
/*     */ public class Appeal
/*     */ {
/*     */   private String appealId;
/*     */   private String baseId;
/*     */   private String scoreDetailDataId;
/*     */   private String appealUserId;
/*     */   private Date appealDate;
/*     */   private String appealDesc;
/*     */   private String reviewUserId;
/*     */   private String reviewResult;
/*     */   private String reviewDesc;
/*     */   private String problemType;
/*     */   
/*  27 */   public String getAppealId() { return this.appealId; }
/*     */ 
/*     */ 
/*     */   
/*  31 */   public void setAppealId(String appealId) { this.appealId = (appealId == null) ? null : appealId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  35 */   public String getBaseId() { return this.baseId; }
/*     */ 
/*     */ 
/*     */   
/*  39 */   public void setBaseId(String baseId) { this.baseId = (baseId == null) ? null : baseId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  43 */   public String getScoreDetailDataId() { return this.scoreDetailDataId; }
/*     */ 
/*     */ 
/*     */   
/*  47 */   public void setScoreDetailDataId(String scoreDetailDataId) { this.scoreDetailDataId = (scoreDetailDataId == null) ? null : scoreDetailDataId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  51 */   public String getAppealUserId() { return this.appealUserId; }
/*     */ 
/*     */ 
/*     */   
/*  55 */   public void setAppealUserId(String appealUserId) { this.appealUserId = (appealUserId == null) ? null : appealUserId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  59 */   public Date getAppealDate() { return this.appealDate; }
/*     */ 
/*     */ 
/*     */   
/*  63 */   public void setAppealDate(Date appealDate) { this.appealDate = appealDate; }
/*     */ 
/*     */ 
/*     */   
/*  67 */   public String getAppealDesc() { return this.appealDesc; }
/*     */ 
/*     */ 
/*     */   
/*  71 */   public void setAppealDesc(String appealDesc) { this.appealDesc = (appealDesc == null) ? null : appealDesc.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  75 */   public String getReviewUserId() { return this.reviewUserId; }
/*     */ 
/*     */ 
/*     */   
/*  79 */   public void setReviewUserId(String reviewUserId) { this.reviewUserId = (reviewUserId == null) ? null : reviewUserId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  83 */   public String getReviewResult() { return this.reviewResult; }
/*     */ 
/*     */ 
/*     */   
/*  87 */   public void setReviewResult(String reviewResult) { this.reviewResult = (reviewResult == null) ? null : reviewResult.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  91 */   public String getReviewDesc() { return this.reviewDesc; }
/*     */ 
/*     */ 
/*     */   
/*  95 */   public void setReviewDesc(String reviewDesc) { this.reviewDesc = (reviewDesc == null) ? null : reviewDesc.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  99 */   public String getProblemType() { return this.problemType; }
/*     */ 
/*     */ 
/*     */   
/* 103 */   public void setProblemType(String problemType) { this.problemType = (problemType == null) ? null : problemType.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Appeal.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */