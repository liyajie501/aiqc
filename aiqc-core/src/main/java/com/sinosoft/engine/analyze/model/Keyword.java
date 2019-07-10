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
/*    */ public class Keyword
/*    */ {
/*    */   private String keywordId;
/*    */   private String name;
/*    */   private String createrUser;
/*    */   private Date createTime;
/*    */   private String updateUser;
/*    */   private Date updateTime;
/*    */   private String valid;
/*    */   
/* 21 */   public String getKeywordId() { return this.keywordId; }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public void setKeywordId(String keywordId) { this.keywordId = (keywordId == null) ? null : keywordId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public String getCreaterUser() { return this.createrUser; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void setCreaterUser(String createrUser) { this.createrUser = (createrUser == null) ? null : createrUser.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public Date getCreateTime() { return this.createTime; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public String getUpdateUser() { return this.updateUser; }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public void setUpdateUser(String updateUser) { this.updateUser = (updateUser == null) ? null : updateUser.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 61 */   public Date getUpdateTime() { return this.updateTime; }
/*    */ 
/*    */ 
/*    */   
/* 65 */   public void setUpdateTime(Date updateTime) { this.updateTime = updateTime; }
/*    */ 
/*    */ 
/*    */   
/* 69 */   public String getValid() { return this.valid; }
/*    */ 
/*    */ 
/*    */   
/* 73 */   public void setValid(String valid) { this.valid = (valid == null) ? null : valid.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Keyword.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */