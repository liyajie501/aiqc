/*    */ package com.sinosoft.engine.analyze.test;
/*    */ 
/*    */ public class Test11
/*    */ {
/*    */   public static void main(String[] args) {
/*    */     try {
/*  7 */       main2();
/*  8 */     } catch (Exception e) {
/*  9 */       System.out.println(e.getMessage());
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main2() {
/*    */     try {
/* 17 */       boolean bool = true / false;
/* 18 */     } catch (Exception e) {
/* 19 */       e.printStackTrace();
/* 20 */       throw new Exception("xxxxxxxxxxxx");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\test\Test11.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */