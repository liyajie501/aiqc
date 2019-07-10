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
/*     */ public class Category
/*     */ {
/*     */   private String categoryId;
/*     */   private String parentId;
/*     */   private String name;
/*     */   private String ruleId;
/*     */   private String descript;
/*     */   private Date createTime;
/*     */   private String createUser;
/*     */   private String deleteMark;
/*     */   private Date deleteTime;
/*     */   private String valid;
/*     */   private String sysId;
/*     */   private String markType;
/*     */   private String sysName;
/*     */   private String count;
/*     */   
/*  36 */   public String getCount() { return this.count; }
/*     */ 
/*     */ 
/*     */   
/*  40 */   public void setCount(String count) { this.count = count; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  47 */   public String getMarkType() { return this.markType; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   public void setMarkType(String markType) { this.markType = markType; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   public String getSysName() { return this.sysName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setSysName(String sysName) { this.sysName = sysName; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public String getCategoryId() { return this.categoryId; }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public void setCategoryId(String categoryId) { this.categoryId = (categoryId == null) ? null : categoryId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public String getParentId() { return this.parentId; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setParentId(String parentId) { this.parentId = (parentId == null) ? null : parentId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public String getRuleId() { return this.ruleId; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setRuleId(String ruleId) { this.ruleId = (ruleId == null) ? null : ruleId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public String getDescript() { return this.descript; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public void setDescript(String descript) { this.descript = (descript == null) ? null : descript.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 129 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 133 */   public void setDeleteMark(String deleteMark) { this.deleteMark = deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 137 */   public Date getDeleteTime() { return this.deleteTime; }
/*     */ 
/*     */ 
/*     */   
/* 141 */   public void setDeleteTime(Date deleteTime) { this.deleteTime = deleteTime; }
/*     */ 
/*     */ 
/*     */   
/* 145 */   public String getValid() { return this.valid; }
/*     */ 
/*     */ 
/*     */   
/* 149 */   public void setValid(String valid) { this.valid = (valid == null) ? null : valid.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 153 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/* 157 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   public String toString() { return "Category [categoryId=" + this.categoryId + ", name=" + this.name + "]"; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Category.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */