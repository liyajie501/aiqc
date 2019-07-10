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
/*     */ public class AssignTask
/*     */ {
/*     */   private String taskId;
/*     */   private String sysId;
/*     */   private Date condStartTime;
/*     */   private Date condEndTime;
/*     */   private String condCustomer;
/*     */   private Integer condDurtime;
/*     */   private Integer condSelectCount;
/*     */   private String qualityUserIds;
/*     */   private String createUser;
/*     */   private Date createTime;
/*     */   private String valid;
/*     */   private String execTime;
/*     */   private String deleteMark;
/*     */   
/*  33 */   public String getTaskId() { return this.taskId; }
/*     */ 
/*     */ 
/*     */   
/*  37 */   public void setTaskId(String taskId) { this.taskId = (taskId == null) ? null : taskId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  41 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/*  45 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public Date getCondStartTime() { return this.condStartTime; }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public void setCondStartTime(Date condStartTime) { this.condStartTime = condStartTime; }
/*     */ 
/*     */ 
/*     */   
/*  57 */   public Date getCondEndTime() { return this.condEndTime; }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public void setCondEndTime(Date condEndTime) { this.condEndTime = condEndTime; }
/*     */ 
/*     */ 
/*     */   
/*  65 */   public String getCondCustomer() { return this.condCustomer; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setCondCustomer(String condCustomer) { this.condCustomer = (condCustomer == null) ? null : condCustomer.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public Integer getCondDurtime() { return this.condDurtime; }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public void setCondDurtime(Integer condDurtime) { this.condDurtime = condDurtime; }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public Integer getCondSelectCount() { return this.condSelectCount; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setCondSelectCount(Integer condSelectCount) { this.condSelectCount = condSelectCount; }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public String getQualityUserIds() { return this.qualityUserIds; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setQualityUserIds(String qualityUserIds) { this.qualityUserIds = (qualityUserIds == null) ? null : qualityUserIds.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public String getValid() { return this.valid; }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public void setValid(String valid) { this.valid = (valid == null) ? null : valid.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public String getExecTime() { return this.execTime; }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public void setExecTime(String execTime) { this.execTime = (execTime == null) ? null : execTime.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 129 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 133 */   public void setDeleteMark(String deleteMark) { this.deleteMark = (deleteMark == null) ? null : deleteMark.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\AssignTask.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */