/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkInterruption
/*    */   extends Mark
/*    */ {
/*    */   private String r;
/*    */   
/*    */   public MarkInterruption(String startTime, String endTime, String role) {
/* 13 */     super(4, startTime, endTime);
/* 14 */     this.r = role;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 20 */   public String getR() { return this.r; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 26 */   public void setR(String r) { this.r = r; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkInterruption.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */