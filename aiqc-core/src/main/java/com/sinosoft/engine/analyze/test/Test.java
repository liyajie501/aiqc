/*    */ package com.sinosoft.engine.analyze.test;
/*    */ 
/*    */ public class Test extends MyParent {
/*    */   private String id;
/*    */   private String name;
/*    */   
/*    */   static  {
/*  8 */     System.out.println("---------------加载本类的static");
/*    */   }
/*    */ 
/*    */   
/* 12 */   public Test() { System.out.println("---------------创建本类"); }
/*    */ 
/*    */ 
/*    */   
/* 16 */   public static void main(String[] args) { new Test(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   public String getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setId(String id) {
/* 28 */     System.out.println("qqqqqqqqqqqqqqq设置id=" + id);
/* 29 */     this.id = id;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 34 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setName(String name) {
/* 39 */     System.out.println("qqqqqqqqqqqqqqq设置name=" + name);
/* 40 */     this.name = name;
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\test\Test.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */