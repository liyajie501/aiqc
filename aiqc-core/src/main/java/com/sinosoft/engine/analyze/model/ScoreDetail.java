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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScoreDetail
/*     */ {
/*     */   private String detailScoreId;
/*     */   private String ruleId;
/*     */   private String totalScoreId;
/*     */   private Double scoreValue;
/*     */   private String createUser;
/*     */   private Date createTime;
/*     */   private String publishUser;
/*     */   private Date publishTime;
/*     */   private String publishMark;
/*     */   private String deleteMark;
/*     */   private String ruleAttrValue;
/*     */   
/*  33 */   public String getRuleAttrValue() { return this.ruleAttrValue; }
/*     */ 
/*     */ 
/*     */   
/*  37 */   public void setRuleAttrValue(String ruleAttrValue) { this.ruleAttrValue = (ruleAttrValue == null) ? null : ruleAttrValue.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  41 */   public String getDetailScoreId() { return this.detailScoreId; }
/*     */ 
/*     */ 
/*     */   
/*  45 */   public void setDetailScoreId(String detailScoreId) { this.detailScoreId = (detailScoreId == null) ? null : detailScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public String getRuleId() { return this.ruleId; }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public void setRuleId(String ruleId) { this.ruleId = (ruleId == null) ? null : ruleId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  57 */   public String getTotalScoreId() { return this.totalScoreId; }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public void setTotalScoreId(String totalScoreId) { this.totalScoreId = (totalScoreId == null) ? null : totalScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  65 */   public Double getScoreValue() { return this.scoreValue; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setScoreValue(Double scoreValue) { this.scoreValue = scoreValue; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public String getPublishUser() { return this.publishUser; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setPublishUser(String publishUser) { this.publishUser = (publishUser == null) ? null : publishUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public Date getPublishTime() { return this.publishTime; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setPublishTime(Date publishTime) { this.publishTime = publishTime; }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public String getPublishMark() { return this.publishMark; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public void setPublishMark(String publishMark) { this.publishMark = (publishMark == null) ? null : publishMark.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public void setDeleteMark(String deleteMark) { this.deleteMark = (deleteMark == null) ? null : deleteMark.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ScoreDetail.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */