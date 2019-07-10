/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Model
/*    */ {
/*    */   private String modelId;
/*    */   private String name;
/*    */   private String info;
/*    */   private String createUser;
/*    */   private Date createTime;
/*    */   private String publishUser;
/*    */   private Date publishTime;
/*    */   private String publishMask;
/*    */   private String deleteMask;
/*    */   
/* 25 */   public String getModelId() { return this.modelId; }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public void setModelId(String modelId) { this.modelId = (modelId == null) ? null : modelId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public String getInfo() { return this.info; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public void setInfo(String info) { this.info = (info == null) ? null : info.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String getCreateUser() { return this.createUser; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public Date getCreateTime() { return this.createTime; }
/*    */ 
/*    */ 
/*    */   
/* 61 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*    */ 
/*    */ 
/*    */   
/* 65 */   public String getPublishUser() { return this.publishUser; }
/*    */ 
/*    */ 
/*    */   
/* 69 */   public void setPublishUser(String publishUser) { this.publishUser = (publishUser == null) ? null : publishUser.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 73 */   public Date getPublishTime() { return this.publishTime; }
/*    */ 
/*    */ 
/*    */   
/* 77 */   public void setPublishTime(Date publishTime) { this.publishTime = publishTime; }
/*    */ 
/*    */ 
/*    */   
/* 81 */   public String getPublishMask() { return this.publishMask; }
/*    */ 
/*    */ 
/*    */   
/* 85 */   public void setPublishMask(String publishMask) { this.publishMask = (publishMask == null) ? null : publishMask.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 89 */   public String getDeleteMask() { return this.deleteMask; }
/*    */ 
/*    */ 
/*    */   
/* 93 */   public void setDeleteMask(String deleteMask) { this.deleteMask = (deleteMask == null) ? null : deleteMask.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Model.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */