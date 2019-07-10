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
/*     */ public class ScoreResult
/*     */ {
/*     */   private String totalScoreResultId;
/*     */   private String totalScoreId;
/*     */   private Date createTime;
/*     */   private String createUser;
/*     */   private Date finishTime;
/*     */   private Integer baseCount;
/*     */   private Integer avgCount;
/*     */   private Integer totalDuration;
/*     */   private String deleteMark;
/*     */   private String finishMark;
/*     */   private String name;
/*     */   private String checkRuleCount;
/*     */   private String sysName;
/*     */   private String sysId;
/*     */   
/*  37 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   public void setSysId(String sysId) { this.sysId = sysId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   public String getSysName() { return this.sysName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   public void setSysName(String sysName) { this.sysName = sysName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   public void setName(String name) { this.name = name; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   public String getCheckRuleCount() { return this.checkRuleCount; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public void setCheckRuleCount(String checkRuleCount) { this.checkRuleCount = checkRuleCount; }
/*     */ 
/*     */ 
/*     */   
/*  90 */   public String getTotalScoreResultId() { return this.totalScoreResultId; }
/*     */ 
/*     */ 
/*     */   
/*  94 */   public void setTotalScoreResultId(String totalScoreResultId) { this.totalScoreResultId = (totalScoreResultId == null) ? null : totalScoreResultId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  98 */   public String getTotalScoreId() { return this.totalScoreId; }
/*     */ 
/*     */ 
/*     */   
/* 102 */   public void setTotalScoreId(String totalScoreId) { this.totalScoreId = (totalScoreId == null) ? null : totalScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/* 110 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 114 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 122 */   public Date getFinishTime() { return this.finishTime; }
/*     */ 
/*     */ 
/*     */   
/* 126 */   public void setFinishTime(Date finishTime) { this.finishTime = finishTime; }
/*     */ 
/*     */ 
/*     */   
/* 130 */   public Integer getBaseCount() { return this.baseCount; }
/*     */ 
/*     */ 
/*     */   
/* 134 */   public void setBaseCount(Integer baseCount) { this.baseCount = baseCount; }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public Integer getAvgCount() { return this.avgCount; }
/*     */ 
/*     */ 
/*     */   
/* 142 */   public void setAvgCount(Integer avgCount) { this.avgCount = avgCount; }
/*     */ 
/*     */ 
/*     */   
/* 146 */   public Integer getTotalDuration() { return this.totalDuration; }
/*     */ 
/*     */ 
/*     */   
/* 150 */   public void setTotalDuration(Integer totalDuration) { this.totalDuration = totalDuration; }
/*     */ 
/*     */ 
/*     */   
/* 154 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 158 */   public void setDeleteMark(String deleteMark) { this.deleteMark = deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 162 */   public String getFinishMark() { return this.finishMark; }
/*     */ 
/*     */ 
/*     */   
/* 166 */   public void setFinishMark(String finishMark) { this.finishMark = finishMark; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ScoreResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */