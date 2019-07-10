/*     */ package com.sinosoft.engine.analyze.service;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.Engine;
import com.huayunworld.znyyzj.engine.analyze.model.JoinSys;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

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
/*     */ public class ScanManageService
/*     */   implements Runnable
/*     */ {
/*  23 */   private static Logger logger = Logger.getLogger(ScanManageService.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ConfigInfoService configInfoService;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   private ThreadPoolTaskExecutor cachedThreadPool;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<String, JoinSys> compareAddConfig(Map<String, JoinSys> mapOld, Map<String, JoinSys> mapNew) {
/*  45 */     Map<String, JoinSys> map = new HashMap<String, JoinSys>();
/*  46 */     for (String n : mapNew.keySet()) {
/*  47 */       if (!mapOld.containsKey(n)) map.put(n, mapNew.get(n)); 
/*     */     } 
/*  49 */     return map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<String, JoinSys> compareDelConfig(Map<String, JoinSys> mapOld, Map<String, JoinSys> mapNew) {
/*  59 */     Map<String, JoinSys> map = new HashMap<String, JoinSys>();
/*  60 */     for (String n : mapOld.keySet()) {
/*  61 */       if (!mapNew.containsKey(n)) map.put(n, mapOld.get(n)); 
/*     */     } 
/*  63 */     return map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Map<String, JoinSys> compareUpdConfig(Map<String, JoinSys> mapOld, Map<String, JoinSys> mapNew) {
/*  73 */     Map<String, JoinSys> map = new HashMap<String, JoinSys>();
/*  74 */     for (String o : mapOld.keySet()) {
/*  75 */       for (String n : mapNew.keySet()) {
/*  76 */         if (o.equals(n) && (
/*  77 */           (JoinSys)mapOld.get(o)).CompareToV1(mapNew.get(n)) != 0)
/*     */         {
/*  79 */           map.put(n, mapNew.get(n));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  84 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*     */     try {
/*  90 */       logger.info("启动扫描管理器");
/*  91 */       if (this.cachedThreadPool == null) throw new Exception("线程池未初始化"); 
/*  92 */       Engine engine = this.configInfoService.getMyInfo();
/*  93 */       Map<String, JoinSys> mapOld = new HashMap<String, JoinSys>();
/*  94 */       Map<String, JoinSys> mapNew = new HashMap<String, JoinSys>();
/*     */       
/*  96 */       Map<String, ScanService> scanServiceMap = new Hashtable<String, ScanService>();
/*     */       
/*     */       while (true) {
/*     */         try {
/* 100 */           List<JoinSys> list = this.configInfoService.getScanSysList(engine);
/* 101 */           mapNew.clear();
/* 102 */           if (list != null) for (JoinSys j : list) mapNew.put(j.getSysId(), j);
/*     */              
/* 104 */           Map<String, JoinSys> addMap = compareAddConfig(mapOld, mapNew);
/* 105 */           Map<String, JoinSys> delMap = compareDelConfig(mapOld, mapNew);
/* 106 */           Map<String, JoinSys> updMap = compareUpdConfig(mapOld, mapNew);
/*     */ 
/*     */           
/* 109 */           if (addMap != null && addMap.size() > 0) {
/* 110 */             for (String a : addMap.keySet()) {
/* 111 */               JoinSys sys = (JoinSys)addMap.get(a);
/* 112 */               ScanService scan = new ScanService(sys);
/* 113 */               this.cachedThreadPool.submit(scan);
/* 114 */               scanServiceMap.put(a, scan);
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/* 119 */           if (delMap != null && delMap.size() > 0) {
/* 120 */             for (String d : delMap.keySet()) {
/* 121 */               ScanService scan = (ScanService)scanServiceMap.get(d);
/* 122 */               scan.stop();
/* 123 */               scanServiceMap.remove(d);
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/* 128 */           if (updMap != null && updMap.size() > 0) {
/* 129 */             for (String u : updMap.keySet()) {
/* 130 */               ScanService scan = (ScanService)scanServiceMap.get(u);
/* 131 */               scan.update((JoinSys)updMap.get(u));
/*     */             } 
/*     */           }
/* 134 */           mapOld = mapNew;
/* 135 */         } catch (Exception e) {
/* 136 */           logger.error("扫描管理器异常", e);
/*     */         } 
/* 138 */         Thread.sleep(120000L);
/*     */       } 
/* 140 */     } catch (Exception e) {
/* 141 */       logger.error("扫描管理器异常", e);
/*     */       return;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 149 */   public ThreadPoolTaskExecutor getCachedThreadPool() { return this.cachedThreadPool; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 154 */   public void setCachedThreadPool(ThreadPoolTaskExecutor cachedThreadPool) { this.cachedThreadPool = cachedThreadPool; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\ScanManageService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */