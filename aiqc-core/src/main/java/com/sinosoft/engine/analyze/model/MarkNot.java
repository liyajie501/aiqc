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
/*    */ 
/*    */ public class MarkNot
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
/* 34 */   public MarkNot(int t) { this.t = t; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 39 */   public int getT() { return this.t; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setT(int t) { this.t = t; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String getSt() { return this.st; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 54 */   public void setSt(String st) { this.st = st; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 59 */   public String getEt() { return this.et; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 64 */   public void setEt(String et) { this.et = et; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\MarkNot.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */