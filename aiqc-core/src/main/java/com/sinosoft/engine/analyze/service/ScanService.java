/*     */ package com.sinosoft.engine.analyze.service;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.JoinSys;
/*     */ import java.util.UUID;
/*     */ import org.apache.log4j.Logger;
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
/*     */ public class ScanService
/*     */   implements Runnable
/*     */ {
/*  21 */   private static Logger logger = Logger.getLogger(ScanService.class); private JoinSys sys;
/*     */   private int sysIdentity;
/*     */   
/*     */   public ScanService(JoinSys sys) {
/*  25 */     this.sysIdentity = 0;
/*     */     
/*  27 */     this.stop = false;
/*     */     
/*  29 */     this.update = false;
/*     */ 
/*     */ 
/*     */     
/*  33 */     this.scanSession = UUID.randomUUID().toString().replaceAll("-", "");
/*     */     
/*  35 */     this.tempStr = new StringBuffer();
/*     */ 
/*     */     
/*  38 */     this.sys = sys;
/*     */   }
/*     */   public static final String PATH_SPLIT = "/"; private String scanSession; private StringBuffer tempStr;
/*     */   
/*     */   public void run() {
/*  43 */     logger.info("启动扫描器:" + this.sys.toString());
/*     */     try {
/*     */       while (true) {
/*  46 */         scan();
/*  47 */         if (this.stop)
/*  48 */           break;  Thread.sleep(10000L);
/*     */       } 
/*  50 */     } catch (Exception e) {
/*  51 */       logger.error("扫描器运行异常", e);
/*     */     } finally {
/*  53 */       logger.info("关闭扫描器:" + this.sys.toString());
/*     */     } 
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void scan() {}
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stop() {
/* 105 */     logger.info("扫描器收到信息-停止");
/* 106 */     this.stop = true;
/*     */   }
/*     */   public void update(JoinSys sys) {
/* 109 */     logger.info("扫描器收到信息-更新");
/* 110 */     this.sys = sys;
/* 111 */     this.update = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\ScanService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */