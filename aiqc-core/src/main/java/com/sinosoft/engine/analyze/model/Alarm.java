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
/*     */ 
/*     */ 
/*     */ public class Alarm
/*     */ {
/*     */   private String alarmId;
/*     */   private String sysId;
/*     */   private String name;
/*     */   private Date startTime;
/*     */   private Date endTime;
/*     */   private String riskInterval;
/*     */   private String receiveUser;
/*     */   private String sendType;
/*     */   private String alarmObj;
/*     */   private String createUser;
/*     */   private Date createTime;
/*     */   private String valid;
/*     */   private String deleteMark;
/*     */   private Integer level;
/*     */   private String totalScoreId;
/*     */   private String ruleId;
/*     */   private String sendTime;
/*     */   private String categoryIdLevel;
/*     */   
/*  46 */   public String getCategoryIdLevel() { return this.categoryIdLevel; }
/*     */ 
/*     */ 
/*     */   
/*  50 */   public String getSendTime() { return this.sendTime; }
/*     */ 
/*     */ 
/*     */   
/*  54 */   public void setSendTime(String sendTime) { this.sendTime = sendTime; }
/*     */ 
/*     */ 
/*     */   
/*  58 */   public String getAlarmId() { return this.alarmId; }
/*     */ 
/*     */ 
/*     */   
/*  62 */   public void setAlarmId(String alarmId) { this.alarmId = (alarmId == null) ? null : alarmId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  66 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/*  70 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  74 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/*  78 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  82 */   public Date getStartTime() { return this.startTime; }
/*     */ 
/*     */ 
/*     */   
/*  86 */   public void setStartTime(Date startTime) { this.startTime = startTime; }
/*     */ 
/*     */ 
/*     */   
/*  90 */   public Date getEndTime() { return this.endTime; }
/*     */ 
/*     */ 
/*     */   
/*  94 */   public void setEndTime(Date endTime) { this.endTime = endTime; }
/*     */ 
/*     */ 
/*     */   
/*  98 */   public String getRiskInterval() { return this.riskInterval; }
/*     */ 
/*     */ 
/*     */   
/* 102 */   public void setRiskInterval(String riskInterval) { this.riskInterval = (riskInterval == null) ? null : riskInterval.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public String getReceiveUser() { return this.receiveUser; }
/*     */ 
/*     */ 
/*     */   
/* 110 */   public void setReceiveUser(String receiveUser) { this.receiveUser = (receiveUser == null) ? null : receiveUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 114 */   public String getSendType() { return this.sendType; }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public void setSendType(String sendType) { this.sendType = (sendType == null) ? null : sendType.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 122 */   public String getAlarmObj() { return this.alarmObj; }
/*     */ 
/*     */ 
/*     */   
/* 126 */   public void setAlarmObj(String alarmObj) { this.alarmObj = (alarmObj == null) ? null : alarmObj.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 130 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/* 134 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 142 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 146 */   public String getValid() { return this.valid; }
/*     */ 
/*     */ 
/*     */   
/* 150 */   public void setValid(String valid) { this.valid = (valid == null) ? null : valid.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 154 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 158 */   public void setDeleteMark(String deleteMark) { this.deleteMark = (deleteMark == null) ? null : deleteMark.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 162 */   public Integer getLevel() { return this.level; }
/*     */ 
/*     */ 
/*     */   
/* 166 */   public void setLevel(Integer level) { this.level = level; }
/*     */ 
/*     */ 
/*     */   
/* 170 */   public String getTotalScoreId() { return this.totalScoreId; }
/*     */ 
/*     */ 
/*     */   
/* 174 */   public void setTotalScoreId(String totalScoreId) { this.totalScoreId = (totalScoreId == null) ? null : totalScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 178 */   public String getRuleId() { return this.ruleId; }
/*     */ 
/*     */ 
/*     */   
/* 182 */   public void setRuleId(String ruleId) { this.ruleId = (ruleId == null) ? null : ruleId.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Alarm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */