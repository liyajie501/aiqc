/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkSilence
/*    */   extends Mark
/*    */ {
/*    */   private String d;
/*    */   
/*    */   public MarkSilence(String startTime, String endTime, String duration) {
/* 13 */     super(6, startTime, endTime);
/* 14 */     this.d = duration;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   public String getD() { return this.d; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 26 */   public void setD(String d) { this.d = d; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkSilence.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */