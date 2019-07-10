/*    */ package com.sinosoft.engine.analyze.service;
/*    */ 
/*    */ import java.util.concurrent.BlockingQueue;
/*    */ import java.util.concurrent.LinkedBlockingQueue;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class TaskScoreTotalResultDispatcherService
/*    */   implements Runnable
/*    */ {
/* 18 */   private static Logger logger = Logger.getLogger(TaskScoreTotalResultDispatcherService.class);
/* 19 */   private static BlockingQueue<String> queue = new LinkedBlockingQueue();
/*    */   
/*    */   @Autowired
/*    */   private ThreadPoolTaskExecutor cachedThreadPool;
/*    */   
/*    */   @Autowired
/*    */   private CacheService cacheService;
/*    */ 
/*    */   
/*    */   public static void addTask(String scoreTotalId) {
/*    */     try {
/* 30 */       queue.put(scoreTotalId);
/* 31 */     } catch (InterruptedException e) {
/* 32 */       logger.error("添加总评分任务异常:" + scoreTotalId, e);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void run() {
/* 37 */     logger.info("启动总评分任务分发器"); while (true) {
/*    */       try {
/*    */         while (true)
/* 40 */         { String scoreTotalId = (String)queue.take();
/* 41 */           TaskScoreTotalResultHandleService handle = new TaskScoreTotalResultHandleService(this.cacheService, scoreTotalId);
/* 42 */           this.cachedThreadPool.submit(handle); }  break;
/* 43 */       } catch (Exception e) {
/* 44 */         logger.error("任务分发器异常", e);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/* 50 */   public ThreadPoolTaskExecutor getCachedThreadPool() { return this.cachedThreadPool; }
/*    */ 
/*    */ 
/*    */   
/* 54 */   public void setCachedThreadPool(ThreadPoolTaskExecutor cachedThreadPool) { this.cachedThreadPool = cachedThreadPool; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\TaskScoreTotalResultDispatcherService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */