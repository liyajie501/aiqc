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
/*     */ public class Rule
/*     */ {
/*     */   private String ruleId;
/*     */   private String analyzerId;
/*     */   private String name;
/*     */   private String info;
/*     */   private String context;
/*     */   private String createUser;
/*     */   private Date createTime;
/*     */   private String publishUser;
/*     */   private Date publishTime;
/*     */   private String publishMark;
/*     */   private String deleteMark;
/*     */   private String type;
/*     */   private String ruleLabel;
/*     */   
/*  33 */   public String getRuleId() { return this.ruleId; }
/*     */ 
/*     */ 
/*     */   
/*  37 */   public void setRuleId(String ruleId) { this.ruleId = (ruleId == null) ? null : ruleId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  41 */   public String getAnalyzerId() { return this.analyzerId; }
/*     */ 
/*     */ 
/*     */   
/*  45 */   public void setAnalyzerId(String analyzerId) { this.analyzerId = (analyzerId == null) ? null : analyzerId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  57 */   public String getInfo() { return this.info; }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public void setInfo(String info) { this.info = (info == null) ? null : info.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  65 */   public String getContext() { return this.context; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setContext(String context) { this.context = (context == null) ? null : context.trim(); }
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
/*     */ 
/*     */ 
/*     */   
/* 121 */   public String getType() { return this.type; }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public void setType(String type) { this.type = (type == null) ? null : type.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 129 */   public String getRuleLabel() { return this.ruleLabel; }
/*     */ 
/*     */ 
/*     */   
/* 133 */   public void setRuleLabel(String ruleLabel) { this.ruleLabel = (ruleLabel == null) ? null : ruleLabel.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Rule.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */