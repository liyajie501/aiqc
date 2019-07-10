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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScoreTotal
/*     */ {
/*     */   private String totalScoreId;
/*     */   private String modelId;
/*     */   private String sysId;
/*     */   private String userType;
/*     */   private String name;
/*     */   private String info;
/*     */   private Double scoreValue;
/*     */   private String createUser;
/*     */   private Date createTime;
/*     */   private String publishUser;
/*     */   private Date publishTime;
/*     */   private Date stopTime;
/*     */   private String publishMark;
/*     */   private String deleteMark;
/*     */   private String baseInfo;
/*     */   private Integer checkRuleCount;
/*     */   private Date startTime;
/*     */   private Date endTime;
/*     */   
/*  44 */   public Date getStartTime() { return this.startTime; }
/*     */ 
/*     */ 
/*     */   
/*  48 */   public void setStartTime(Date startTime) { this.startTime = startTime; }
/*     */ 
/*     */ 
/*     */   
/*  52 */   public Date getEndTime() { return this.endTime; }
/*     */ 
/*     */ 
/*     */   
/*  56 */   public void setEndTime(Date endTime) { this.endTime = endTime; }
/*     */ 
/*     */ 
/*     */   
/*  60 */   public Date getStopTime() { return this.stopTime; }
/*     */ 
/*     */ 
/*     */   
/*  64 */   public void setStopTime(Date stopTime) { this.stopTime = stopTime; }
/*     */ 
/*     */   
/*  67 */   public String getBaseInfo() { return this.baseInfo; }
/*     */ 
/*     */ 
/*     */   
/*  71 */   public void setBaseInfo(String baseInfo) { this.baseInfo = baseInfo; }
/*     */ 
/*     */ 
/*     */   
/*  75 */   public Integer getCheckRuleCount() { return this.checkRuleCount; }
/*     */ 
/*     */ 
/*     */   
/*  79 */   public void setCheckRuleCount(Integer checkRuleCount) { this.checkRuleCount = checkRuleCount; }
/*     */ 
/*     */ 
/*     */   
/*  83 */   public String getTotalScoreId() { return this.totalScoreId; }
/*     */ 
/*     */ 
/*     */   
/*  87 */   public void setTotalScoreId(String totalScoreId) { this.totalScoreId = (totalScoreId == null) ? null : totalScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  91 */   public String getModelId() { return this.modelId; }
/*     */ 
/*     */ 
/*     */   
/*  95 */   public void setModelId(String modelId) { this.modelId = (modelId == null) ? null : modelId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  99 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/* 103 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 107 */   public String getUserType() { return this.userType; }
/*     */ 
/*     */ 
/*     */   
/* 111 */   public void setUserType(String userType) { this.userType = (userType == null) ? null : userType.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 115 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/* 119 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 123 */   public String getInfo() { return this.info; }
/*     */ 
/*     */ 
/*     */   
/* 127 */   public void setInfo(String info) { this.info = (info == null) ? null : info.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 131 */   public Double getScoreValue() { return this.scoreValue; }
/*     */ 
/*     */ 
/*     */   
/* 135 */   public void setScoreValue(Double scoreValue) { this.scoreValue = scoreValue; }
/*     */ 
/*     */ 
/*     */   
/* 139 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/* 143 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 147 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 151 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 155 */   public String getPublishUser() { return this.publishUser; }
/*     */ 
/*     */ 
/*     */   
/* 159 */   public void setPublishUser(String publishUser) { this.publishUser = (publishUser == null) ? null : publishUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 163 */   public Date getPublishTime() { return this.publishTime; }
/*     */ 
/*     */ 
/*     */   
/* 167 */   public void setPublishTime(Date publishTime) { this.publishTime = publishTime; }
/*     */ 
/*     */ 
/*     */   
/* 171 */   public String getPublishMark() { return this.publishMark; }
/*     */ 
/*     */ 
/*     */   
/* 175 */   public void setPublishMark(String publishMark) { this.publishMark = (publishMark == null) ? null : publishMark.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 179 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 183 */   public void setDeleteMark(String deleteMark) { this.deleteMark = (deleteMark == null) ? null : deleteMark.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ScoreTotal.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */