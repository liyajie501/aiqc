/*     */ package com.sinosoft.engine.task.service.impl;
/*     */ 
/*     */ import com.alibaba.fastjson.JSONArray;
/*     */ import com.alibaba.fastjson.JSONObject;
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.RecordingCSV;
/*     */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
/*     */ import com.huayunworld.znyyzj.engine.analyze.utils.DateUtil;
/*     */ import com.huayunworld.znyyzj.engine.analyze.utils.HttpClient;
/*     */ import com.huayunworld.znyyzj.engine.analyze.utils.HttpCreateCsv;
/*     */ import com.huayunworld.znyyzj.engine.analyze.utils.JDBCUtil;
/*     */ import java.io.File;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.stereotype.Service;
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
/*     */ public class TaskServiceRequestHttp
/*     */ {
/*  35 */   private static Logger logger = Logger.getLogger(com.huayunworld.znyyzj.engine.analyze.service.TaskScoreTotalResultDispatcherService.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String SUCCESS = "Success";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String ERROR = "Error";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  63 */   String statraDate = "";
/*     */   
/*     */   public void GetRecording() {
/*  66 */     boolean isFage = true;
/*  67 */     String sdfEndDate = "";
/*  68 */     int page = 1;
/*  69 */     int rowsSize = 300;
/*  70 */     final List<RecordingCSV> listCSV = new ArrayList<RecordingCSV>();
/*  71 */     while (isFage) {
/*  72 */       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*  73 */       if (this.statraDate.isEmpty()) {
/*  74 */         this.statraDate = sdf.format(Long.valueOf((new Date()).getTime() - 600000L));
/*     */       }
/*  76 */       sdfEndDate = sdf.format(new Date(sdf.parse(this.statraDate).getTime() + 300000L));
/*  77 */       logger.info("开始时间:" + this.statraDate);
/*  78 */       logger.info("结束时间:" + sdfEndDate);
/*     */       
/*  80 */       String urlCsv = CommonTools.getApplicationConf("engine.analyze.RecordingAidInfo.Path") + "index.php?m=SystemReport&a=cdrDataList&calldate_start=" + this.statraDate + "&calldate_end=" + sdfEndDate + "&disposition=ANSWERED&page=" + page + "&rows=" + rowsSize;
/*  81 */       urlCsv = urlCsv.replace(" ", "%20");
/*  82 */       String data = HttpClient.post(urlCsv);
/*  83 */       JSONObject json = JSONObject.parseObject(data);
/*  84 */       if (!json.toString().isEmpty() && 
/*  85 */         json.containsKey("rows")) {
/*  86 */         String rows = json.getString("rows");
/*  87 */         if (rows.equals("false")) {
/*     */           
/*  89 */           this.statraDate = sdfEndDate;
/*  90 */           isFage = false;
/*     */           continue;
/*     */         } 
/*  93 */         JSONArray jaonArray = JSONArray.parseArray(rows);
/*  94 */         logger.info("返回录音辅助信息条数：" + jaonArray.size());
/*  95 */         if (jaonArray.size() < rowsSize) {
/*     */           
/*  97 */           this.statraDate = sdfEndDate;
/*  98 */           isFage = false;
/*     */         } else {
/* 100 */           page++;
/* 101 */         }  for (Object obj : jaonArray) {
/* 102 */           RecordingCSV csv = new RecordingCSV();
/* 103 */           JSONObject jsonRows = JSONObject.parseObject(obj.toString());
/* 104 */           if (jsonRows.containsKey("uniqueid"))
/* 105 */             csv.setUniqueId(jsonRows.getString("uniqueid")); 
/* 106 */           if (jsonRows.containsKey("billsec"))
/* 107 */             csv.setBillsec(jsonRows.getString("billsec")); 
/* 108 */           if (jsonRows.containsKey("calltype"))
/* 109 */             csv.setCallType(jsonRows.getString("calltype")); 
/* 110 */           if (jsonRows.containsKey("calldate"))
/* 111 */             csv.setCallDate(DateUtil.formatString(jsonRows.getString("calldate"))); 
/* 112 */           if (jsonRows.containsKey("workno"))
/* 113 */             csv.setWorkno(jsonRows.getString("workno")); 
/* 114 */           if (jsonRows.containsKey("src"))
/* 115 */             csv.setSrc(jsonRows.getString("src")); 
/* 116 */           if (jsonRows.containsKey("dst"))
/* 117 */             csv.setDst(jsonRows.getString("dst")); 
/* 118 */           listCSV.add(csv);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     if (listCSV.size() > 0) {
/* 124 */       Runnable syncMoveFile = new Runnable()
/*     */         {
/*     */           public void run() {
/* 127 */             long startTime = System.currentTimeMillis();
/*     */             try {
/* 129 */               logger.info("执行线程,HTTP开始拉取服务录音文件....................................");
/* 130 */               JDBCUtil jdbc = new JDBCUtil();
/* 131 */               jdbc.openConnection();
/* 132 */               String sysId = "VIPS";
/* 133 */               Date date = new Date();
/*     */               
/* 135 */               String dirName = DateUtil.formatDate(date, "yyyyMMddHHmmdd");
/* 136 */               String dirPath = "";
/* 137 */               boolean isF = false;
/* 138 */               for (int i = 0; i < listCSV.size(); i++) {
/* 139 */                 List<String> voiceCaseIdList = jdbc.findData(((RecordingCSV)listCSV.get(i)).getUniqueId());
/* 140 */                 for (int j = 0; j < voiceCaseIdList.size(); j++) {
/* 141 */                   String url = CommonTools.getApplicationConf("engine.analyze.RecordingURL.Path") + "awfos/decodeVoiceCaseId?voiceCaseId=" + (String)voiceCaseIdList.get(j) + "&audioOutputFormat=wav&userLoginId=supervisor&tenantName=default";
/* 142 */                   String data = HttpClient.get(url);
/* 143 */                   if (data.equals("Error"))
/*     */                     break; 
/* 145 */                   int begin = data.indexOf("http");
/* 146 */                   int last = data.length() - 13;
/* 147 */                   String recorDingRUL = data.substring(begin, last);
/*     */                   
/* 149 */                   if (((RecordingCSV)listCSV.get(i)).getRecordingName() == null || ((RecordingCSV)listCSV.get(i)).getRecordingName().isEmpty()) {
/* 150 */                     ((RecordingCSV)listCSV.get(i)).setRecordingName((new File(recorDingRUL)).getName());
/*     */                   }
/* 152 */                   File sysIdDir = new File(CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId);
/* 153 */                   if (!sysIdDir.exists()) {
/* 154 */                     sysIdDir.mkdirs();
/*     */                   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 162 */                   File MP3Dir = new File(CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId + "//" + dirName);
/* 163 */                   if (!MP3Dir.exists()) {
/* 164 */                     MP3Dir.mkdir();
/* 165 */                     isF = true;
/*     */                   } 
/* 167 */                   boolean isFalge = HttpClient.downLoadFromUrl(recorDingRUL, MP3Dir + "/" + (new File(recorDingRUL)).getName());
/* 168 */                   dirPath = CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId + "//" + dirName;
/* 169 */                   if (isFalge)
/*     */                     break; 
/*     */                 } 
/*     */               } 
/* 173 */               if (isF) {
/* 174 */                 File dir = new File(dirPath);
/* 175 */                 HttpCreateCsv.genHttpIndexInfo(sysId, dirName, listCSV, dir);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 181 */                 File HttploadFile = new File(CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId + "/HttploadFile/HttploadFile.done");
/* 182 */                 FileUtils.write(HttploadFile, sysId + "/" + dirName + "\n", "UTF-8", true);
/*     */                 
/* 184 */                 listCSV.clear();
/* 185 */                 jdbc.closeConnection();
/*     */               }
/*     */             
/* 188 */             } catch (Exception e) {
/* 189 */               logger.error("HTTP拉取服务录音文件异常", e);
/*     */             } 
/* 191 */             long endTime = System.currentTimeMillis();
/* 192 */             logger.info(DateUtil.formatDate(new Date()) + "程序运行所花时间------------：" + (endTime - startTime) + "ms");
/*     */           }
/*     */         };
/* 195 */       (new Thread(syncMoveFile)).start();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\task\service\impl\TaskServiceRequestHttp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */