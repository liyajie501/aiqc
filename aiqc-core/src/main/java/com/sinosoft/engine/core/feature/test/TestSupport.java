/*    */ package com.sinosoft.engine.core.feature.test;
/*    */ 
/*    */ import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

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
/*    */ @ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
/*    */ public class TestSupport
/*    */   extends AbstractJUnit4SpringContextTests
/*    */ {
/*    */   protected long startTime;
/*    */   protected long endTime;
/*    */   
/*    */   protected long start() {
/* 23 */     this.startTime = System.currentTimeMillis();
/* 24 */     return this.startTime;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected long end() {
/* 33 */     this.endTime = System.currentTimeMillis();
/* 34 */     log();
/* 35 */     return this.endTime;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void log() {
/* 42 */     String text = "\n开始时间 : " + this.startTime + "\n结束时间 : " + this.endTime + "\n执行时间 : " + (this.endTime - this.startTime);
/* 43 */     this.logger.info(text);
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\core\feature\test\TestSupport.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */