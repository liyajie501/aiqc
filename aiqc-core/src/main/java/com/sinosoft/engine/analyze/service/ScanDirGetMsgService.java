/*    */ package com.sinosoft.engine.analyze.service;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.IndexFile;
/*    */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
/*    */ import java.io.File;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Arrays;
/*    */ import java.util.Date;
/*    */ import java.util.HashMap;
/*    */ import java.util.HashSet;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import org.apache.commons.io.FileUtils;
/*    */ import org.apache.commons.lang.StringUtils;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class ScanDirGetMsgService
/*    */   implements Runnable
/*    */ {
/* 28 */   private static Logger logger = Logger.getLogger(ScanDirGetMsgService.class);
/* 29 */   private static final String MOUNT_DIR = CommonTools.getApplicationConf("yyzj.mount.root.dir");
/* 30 */   private static final Set<String> SYS_IDS = new HashSet();
/*    */   static  {
/* 32 */     logger.info("读取配置文件里面的yyzj.mount.root.dir---------------------------------------：" + MOUNT_DIR);
/* 33 */     sysIds = CommonTools.getApplicationConf("yyzj.sysIds");
/* 34 */     logger.info("扫描到的接入系统---------------------------------------：" + sysIds);
/* 35 */     SYS_IDS.addAll(Arrays.asList(sysIds.split(";")));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void run() {
/* 41 */     logger.info("启动扫描目录获取通知消息功能");
/*    */     while (true) {
/* 43 */       for (String sysId : SYS_IDS) {
/* 44 */         File file = new File(MOUNT_DIR + "/" + sysId + "/message/msg.txt");
/*    */         
/* 46 */         File fileto = new File(MOUNT_DIR + "/" + sysId + "/message/msg.txt.");
/* 47 */         if (file.exists()) {
/*    */           try {
/* 49 */             List<String> list = FileUtils.readLines(file);
/* 50 */             for (String s : list) {
/* 51 */               if (StringUtils.isBlank(s))
/* 52 */                 continue;  String[] dirArr = s.split("/");
/* 53 */               if (dirArr.length != 3)
/* 54 */                 continue;  logger.info("收到的消息：" + s);
/* 55 */               Map<String, String> result = new HashMap<String, String>();
/* 56 */               IndexFile indexFile = new IndexFile();
/* 57 */               indexFile.setSysId(dirArr[0]);
/* 58 */               indexFile.setDate(dirArr[1]);
/* 59 */               indexFile.setFileName(dirArr[2].replaceAll(".csv", ""));
/* 60 */               IndexFileHandleService.addIndexFile(indexFile);
/*    */             } 
/*    */             
/* 63 */             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
/* 64 */             file.renameTo(new File(fileto + dateFormat.format(new Date(System.currentTimeMillis())).toString() + ""));
/* 65 */           } catch (Exception e) {
/* 66 */             logger.error("扫描目录获取通知消息异常", e);
/*    */           } 
/*    */         }
/*    */       } 
/*    */ 
/*    */       
/*    */       try {
/* 73 */         Thread.sleep(1000L);
/* 74 */       } catch (InterruptedException e) {
/* 75 */         e.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\ScanDirGetMsgService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */