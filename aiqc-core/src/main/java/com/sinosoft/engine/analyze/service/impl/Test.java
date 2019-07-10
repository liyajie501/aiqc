/*    */ package com.sinosoft.engine.analyze.service.impl;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.MessageSound;
/*    */ 
/*    */ 
/*    */ public class Test
/*    */ {
/*    */   public static void main(String[] args) {
/*  9 */     MessageSound ms = new MessageSound();
/* 10 */     for (int a = 0; a < 100; a++) {
/* 11 */       ms.setBaseId(a + "");
/* 12 */       System.out.println(ms);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\impl\Test.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */