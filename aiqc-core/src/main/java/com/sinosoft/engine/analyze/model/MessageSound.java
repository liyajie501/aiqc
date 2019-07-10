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
/*    */ public class MessageSound
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   private String baseId;
/*    */   private String recordFile;
/*    */   private String scoreTotalId;
/*    */   
/* 19 */   public String getBaseId() { return this.baseId; }
/*    */ 
/*    */   
/* 22 */   public void setBaseId(String baseId) { this.baseId = baseId; }
/*    */ 
/*    */ 
/*    */   
/* 26 */   public String getRecordFile() { return this.recordFile; }
/*    */ 
/*    */   
/* 29 */   public void setRecordFile(String recordFile) { this.recordFile = recordFile; }
/*    */ 
/*    */   
/* 32 */   public String getScoreTotalId() { return this.scoreTotalId; }
/*    */ 
/*    */   
/* 35 */   public void setScoreTotalId(String scoreTotalId) { this.scoreTotalId = scoreTotalId; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public String toString() { return "MessageSound [baseId=" + this.baseId + ", recordFile=" + this.recordFile + ", scoreTotalId=" + this.scoreTotalId + "]"; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MessageSound.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */