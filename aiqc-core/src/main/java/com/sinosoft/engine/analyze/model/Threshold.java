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
/*     */ public class Threshold
/*     */ {
/*     */   private String thresholdId;
/*     */   private String sysId;
/*     */   private String type;
/*     */   private String code;
/*     */   private String name;
/*     */   private String value;
/*     */   private String createUser;
/*     */   private Date createTime;
/*     */   private String updateUser;
/*     */   private Date updateTime;
/*     */   private String valid;
/*     */   
/*  29 */   public String getThresholdId() { return this.thresholdId; }
/*     */ 
/*     */ 
/*     */   
/*  33 */   public void setThresholdId(String thresholdId) { this.thresholdId = (thresholdId == null) ? null : thresholdId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  37 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/*  41 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  45 */   public String getType() { return this.type; }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public void setType(String type) { this.type = (type == null) ? null : type.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public String getCode() { return this.code; }
/*     */ 
/*     */ 
/*     */   
/*  57 */   public void setCode(String code) { this.code = (code == null) ? null : code.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/*  65 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public String getValue() { return this.value; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public void setValue(String value) { this.value = (value == null) ? null : value.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public String getCreateUser() { return this.createUser; }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public String getUpdateUser() { return this.updateUser; }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void setUpdateUser(String updateUser) { this.updateUser = (updateUser == null) ? null : updateUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public Date getUpdateTime() { return this.updateTime; }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public String getValid() { return this.valid; }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public void setValid(String valid) { this.valid = (valid == null) ? null : valid.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Threshold.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */