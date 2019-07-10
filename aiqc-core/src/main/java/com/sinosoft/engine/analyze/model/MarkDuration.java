/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkDuration
/*    */   extends Mark
/*    */ {
/*    */   private String d;
/*    */   
/*    */   public MarkDuration(String startTime, String endTime, String duration) {
/* 14 */     super(5, startTime, endTime);
/* 15 */     this.d = duration;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 20 */   public String getD() { return this.d; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   public void setD(String d) { this.d = d; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkDuration.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */