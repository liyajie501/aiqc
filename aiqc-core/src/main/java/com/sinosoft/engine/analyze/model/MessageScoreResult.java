/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MessageScoreResult
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private String scoreTotalResultId;
/*    */   private String scoreTotalId;
/*    */   
/* 20 */   public String getScoreTotalResultId() { return this.scoreTotalResultId; }
/*    */ 
/*    */ 
/*    */   
/* 24 */   public void setScoreTotalResultId(String scoreTotalResultId) { this.scoreTotalResultId = scoreTotalResultId; }
/*    */ 
/*    */ 
/*    */   
/* 28 */   public String getScoreTotalId() { return this.scoreTotalId; }
/*    */ 
/*    */ 
/*    */   
/* 32 */   public void setScoreTotalId(String scoreTotalId) { this.scoreTotalId = scoreTotalId; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 37 */   public String toString() { return "MessageScoreResult [scoreTotalResultId=" + this.scoreTotalResultId + ", scoreTotalId=" + this.scoreTotalId + "]"; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MessageScoreResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */