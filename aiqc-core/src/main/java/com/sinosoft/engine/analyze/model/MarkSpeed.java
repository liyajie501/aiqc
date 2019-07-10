/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkSpeed
/*    */   extends Mark
/*    */ {
/*    */   private String s;
/*    */   
/*    */   public MarkSpeed(String startTime, String endTime, String speed) {
/* 13 */     super(7, startTime, endTime);
/* 14 */     this.s = speed;
/*    */   }
/*    */ 
/*    */   
/* 18 */   public String getS() { return this.s; }
/*    */ 
/*    */ 
/*    */   
/* 22 */   public void setS(String s) { this.s = s; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkSpeed.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */