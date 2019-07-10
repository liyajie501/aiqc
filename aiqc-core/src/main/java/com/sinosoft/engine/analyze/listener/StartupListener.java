/*    */ package com.sinosoft.engine.analyze.listener;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.service.MainService;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.context.ApplicationEvent;
/*    */ import org.springframework.context.ApplicationListener;
/*    */ import org.springframework.context.event.ContextRefreshedEvent;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ @Service
/*    */ public class StartupListener
/*    */   extends Object implements ApplicationListener<ContextRefreshedEvent> {
/* 14 */   private static Logger logger = Logger.getLogger(StartupListener.class);
/*    */   
/*    */   @Autowired
/*    */   MainService mainService;
/*    */ 
/*    */   
/*    */   public void onApplicationEvent(ContextRefreshedEvent event) {
/* 21 */     if (event.getApplicationContext().getParent() == null) {
/* 22 */       logger.info("开始启动质检引擎");
/* 23 */       this.mainService.start();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\listener\StartupListener.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */