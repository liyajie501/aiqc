/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Mark
/*    */ {
/*    */   public static final int TYPE_TEXT = 1;
/*    */   public static final int TYPE_VOLUME = 2;
/*    */   public static final int TYPE_EMOTION = 3;
/*    */   public static final int TYPE_INTERRUPTION = 4;
/*    */   public static final int TYPE_DURATION = 5;
/*    */   public static final int TYPE_SILENCE = 6;
/*    */   public static final int TYPE_SPEED = 7;
/*    */   private int t;
/*    */   private String st;
/*    */   private String et;
/*    */   
/*    */   public Mark(int t, String st, String et) {
/* 34 */     this.t = t;
/* 35 */     this.st = st;
/* 36 */     this.et = et;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 45 */   public Mark(int t) { this.t = t; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 50 */   public int getT() { return this.t; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 55 */   public void setT(int t) { this.t = t; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 60 */   public String getSt() { return this.st; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 65 */   public void setSt(String st) { this.st = st; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 70 */   public String getEt() { return this.et; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 75 */   public void setEt(String et) { this.et = et; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Mark.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */