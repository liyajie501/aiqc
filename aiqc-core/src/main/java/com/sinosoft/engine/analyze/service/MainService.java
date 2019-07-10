/*     */ package com.sinosoft.engine.analyze.service;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.cassandra.repository.ScoreTotalDataRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class MainService
/*     */ {
/*  22 */   private static Logger logger = Logger.getLogger(MainService.class);
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ConfigInfoService configInfoService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ScanManageService scanManageService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private TaskDispatcherService taskDispatcherService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private CacheService cacheService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private IndexFileHandleService indexFileHandleService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ScoreTotalDataRepository scoreTotalDataRepository;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ThreadPoolTaskExecutor cachedThreadPool;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ScanDirGetMsgService scanDirGetMsgService;
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private TaskScoreTotalResultDispatcherService taskScoreTotalResultDispatcherService;
/*     */ 
/*     */ 
/*     */   
/*     */   public void start() {
/*     */     try {
/*  71 */       logger.info("开始启动质检引擎……");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  79 */       this.cachedThreadPool.submit(this.taskDispatcherService);
/*  80 */       this.cachedThreadPool.submit(this.indexFileHandleService);
/*  81 */       this.cachedThreadPool.submit(this.taskScoreTotalResultDispatcherService);
/*     */ 
/*     */       
/*  84 */       this.cachedThreadPool.submit(this.scanDirGetMsgService);
/*     */ 
/*     */       
/*  87 */       TaskHandleSaveService.startCopyFile();
/*     */       
/*  89 */       logger.info("启动质检引擎成功");
/*  90 */     } catch (Exception e) {
/*  91 */       logger.error("启动质检引擎异常", e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 102 */     String[] conf = { "classpath:applicationContext.xml" };
/*     */ 
/*     */     
/* 105 */     ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(conf);
/* 106 */     MainService mainService = (MainService)classPathXmlApplicationContext.getBean("mainService");
/* 107 */     mainService.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   public ThreadPoolTaskExecutor getCachedThreadPool() { return this.cachedThreadPool; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 120 */   public void setCachedThreadPool(ThreadPoolTaskExecutor cachedThreadPool) { this.cachedThreadPool = cachedThreadPool; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\MainService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */