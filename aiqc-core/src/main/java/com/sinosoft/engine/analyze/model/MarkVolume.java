/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkVolume
/*    */   extends Mark
/*    */ {
/*    */   private String v;
/*    */   
/*    */   public MarkVolume(String startTime, String endTime, String volume) {
/* 12 */     super(2, startTime, endTime);
/* 13 */     this.v = volume;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 18 */   public String getV() { return this.v; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   public void setV(String v) { this.v = v; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkVolume.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */