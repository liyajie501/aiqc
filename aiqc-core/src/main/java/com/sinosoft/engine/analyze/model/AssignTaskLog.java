/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AssignTaskLog
/*    */ {
/*    */   private String assignLogId;
/*    */   private String taskId;
/*    */   private String baseId;
/*    */   private Date createTime;
/*    */   private String qualityUserId;
/*    */   
/* 17 */   public String getAssignLogId() { return this.assignLogId; }
/*    */ 
/*    */ 
/*    */   
/* 21 */   public void setAssignLogId(String assignLogId) { this.assignLogId = (assignLogId == null) ? null : assignLogId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public String getTaskId() { return this.taskId; }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public void setTaskId(String taskId) { this.taskId = (taskId == null) ? null : taskId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public String getBaseId() { return this.baseId; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setBaseId(String baseId) { this.baseId = (baseId == null) ? null : baseId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public Date getCreateTime() { return this.createTime; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String getQualityUserId() { return this.qualityUserId; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setQualityUserId(String qualityUserId) { this.qualityUserId = (qualityUserId == null) ? null : qualityUserId.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\AssignTaskLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */