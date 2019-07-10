/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MarkEmotion
/*    */   extends Mark
/*    */ {
/*    */   private static final int EMO_TYPE_HAPPY = 1;
/*    */   private static final int EMO_TYPE_ANGRY = 2;
/*    */   private static final int EMO_TYPE_NEU = 3;
/*    */   private String e;
/*    */   
/*    */   public MarkEmotion(String startTime, String endTime, String emo) {
/* 16 */     super(3, startTime, endTime);
/* 17 */     this.e = emo;
/*    */   }
/*    */ 
/*    */   
/* 21 */   public String getE() { return this.e; }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public void setE(String e) { this.e = e; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkEmotion.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */