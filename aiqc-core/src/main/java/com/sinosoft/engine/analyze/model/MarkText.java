/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkText
/*    */   extends Mark
/*    */ {
/*    */   private String tt;
/*    */   
/*    */   public MarkText(String startTime, String endTime, String text) {
/* 12 */     super(1, startTime, endTime);
/* 13 */     this.tt = text;
/*    */   }
/*    */ 
/*    */   
/* 17 */   public String getTt() { return this.tt; }
/*    */ 
/*    */ 
/*    */   
/* 21 */   public void setTt(String tt) { this.tt = tt; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MarkText(String text) {
/* 29 */     super(1);
/* 30 */     this.tt = text;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public MarkText() { super(1); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkText.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */