/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OperLog
/*    */ {
/*    */   private String operId;
/*    */   private String userJd;
/*    */   private Date createTime;
/*    */   private String operate;
/*    */   
/* 15 */   public String getOperId() { return this.operId; }
/*    */ 
/*    */ 
/*    */   
/* 19 */   public void setOperId(String operId) { this.operId = (operId == null) ? null : operId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 23 */   public String getUserJd() { return this.userJd; }
/*    */ 
/*    */ 
/*    */   
/* 27 */   public void setUserJd(String userJd) { this.userJd = (userJd == null) ? null : userJd.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 31 */   public Date getCreateTime() { return this.createTime; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public String getOperate() { return this.operate; }
/*    */ 
/*    */ 
/*    */   
/* 43 */   public void setOperate(String operate) { this.operate = (operate == null) ? null : operate.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\OperLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */