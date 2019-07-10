/*    */ package com.sinosoft.engine.analyze.utils;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.RecordingCSV;
/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStreamWriter;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import org.apache.commons.io.FileUtils;
/*    */ import org.apache.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HttpCreateCsv
/*    */ {
/* 22 */   private static Logger logger = Logger.getLogger(HttpClient.class);
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
/*    */   public static void genHttpIndexInfo(String sysId, String dirName, List<RecordingCSV> csvList, File dir) throws IOException {
/*    */     try {
/* 35 */       logger.info("进入HTTP拉取录音时,自动生成CSV文件方法..................................");
/* 36 */       FileUtils.write(new File(dir + "/record.csv"), "", "UTF-8");
/* 37 */       logger.info("生成CSV文件路径----------------------------------------:" + dir + "/record.csv");
/* 38 */       BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dir + "/record.csv"), "UTF-8"));
/*    */       
/* 40 */       out.write("NUM_ID,UNIQUEID,CALL_TYPE,START_TIME,END_TIME,DURATION,REMOTE_URI,LOCAL_URI,AGENT_ID,RECORD_NAME,DEVICE_NUMBER,DEVICE_NAME");
/* 41 */       int num = 1;
/* 42 */       for (int i = 0; i < csvList.size(); i++) {
/*    */         
/* 44 */         if (((RecordingCSV)csvList.get(i)).getRecordingName() != null && !((RecordingCSV)csvList.get(i)).getRecordingName().isEmpty()) {
/* 45 */           String dateTime = DateUtil.formatDate(((RecordingCSV)csvList.get(i)).getCallDate());
/*    */           
/* 47 */           out.newLine();
/* 48 */           out.write(num + ",");
/* 49 */           out.write(((RecordingCSV)csvList.get(i)).getUniqueId() + ",");
/* 50 */           out.write(((RecordingCSV)csvList.get(i)).getCallType() + ",");
/* 51 */           out.write(dateTime + ",");
/* 52 */           out.write(dateTime + ",");
/* 53 */           out.write(((RecordingCSV)csvList.get(i)).getBillsec() + ",");
/* 54 */           out.write(((RecordingCSV)csvList.get(i)).getSrc() + ",");
/* 55 */           out.write(((RecordingCSV)csvList.get(i)).getDst() + ",");
/* 56 */           out.write(((RecordingCSV)csvList.get(i)).getWorkno() + ",");
/* 57 */           ((RecordingCSV)csvList.get(i)).setRecordingName(((RecordingCSV)csvList.get(i)).getRecordingName().replace("%5F", "_"));
/*    */           
/* 59 */           out.write("record/" + sysId + "/" + DateUtil.formatDate(new Date(), "yyyyMMdd") + "/" + ((RecordingCSV)csvList.get(i)).getWorkno() + "/" + dirName + "/" + ((RecordingCSV)csvList.get(i)).getRecordingName() + ",");
/* 60 */           out.write("up_sip,");
/* 61 */           out.write("up_ims");
/* 62 */           out.newLine();
/* 63 */           num++;
/*    */         } else {
/*    */           
/* 66 */           logger.info("HttpCreateCsv.genHttpIndexInfo-----------没有录音名称,此条信息不写入csv文件");
/*    */         } 
/*    */       } 
/*    */ 
/*    */       
/* 71 */       out.flush();
/* 72 */       out.close();
/*    */     }
/* 74 */     catch (Exception e) {
/* 75 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\HttpCreateCsv.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */