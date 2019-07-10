/*    */ package com.sinosoft.engine.analyze.test;
/*    */ public class MyParent {
/*    */   private ChildClass childClass0;
/*    */   private static ChildClass childClass2;
/*  5 */   private static ChildClass childClass1 = new ChildClass("父类的static变量1");
/*    */   static  {
/*  7 */     System.out.println("---------------加载父类的static块1");
/*    */     
/*  9 */     childClass2 = new ChildClass("父类的static变量2");
/*    */     
/* 11 */     System.out.println("---------------加载父类的static块2");
/*    */   } public MyParent() {
/*    */     this.childClass0 = new ChildClass("父类的非static变量");
/* 14 */     System.out.println("---------------加载父类的非static块1");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     System.out.println("---------------加载父类的非static块2");
/*    */     System.out.println("---------------创建父类对象");
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\test\MyParent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */