/*    */ package com.sinosoft.engine.analyze.test;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class ChildClass
/*    */ {
/*    */   String name;
/*    */   
/*    */   ChildClass(String name) {
/* 31 */     this.name = name;
/* 32 */     System.out.println("---------------创建内部类对象：" + name);
/*    */   }
/*    */   static  {
/* 35 */     System.out.println("---------------加载内部类的static块");
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\test\ChildClass.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */