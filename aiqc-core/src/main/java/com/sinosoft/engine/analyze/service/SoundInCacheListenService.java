/*     */ package com.sinosoft.engine.analyze.service;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.cassandra.model.BaseData;
import com.huayunworld.znyyzj.engine.analyze.constant.AnalyzeEngineConstant;
import com.huayunworld.znyyzj.engine.analyze.model.AnalyzeResult;
import com.huayunworld.znyyzj.engine.analyze.model.IndexFile;
import com.huayunworld.znyyzj.engine.analyze.model.SoundIndex;
import com.huayunworld.znyyzj.engine.analyze.model.Task;
import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
/*     */ public class SoundInCacheListenService
/*     */   implements Runnable
/*     */ {
/*  43 */   private static Logger logger = Logger.getLogger(SoundInCacheListenService.class);
/*  44 */   private static BlockingQueue<IndexFile> queue = new LinkedBlockingQueue();
/*     */   
/*     */   @Autowired
/*     */   private ThreadPoolTaskExecutor cachedThreadPool;
/*     */   
/*     */   public static void addIndexFile(IndexFile indexFile) {
/*     */     try {
/*  51 */       queue.put(indexFile);
/*  52 */     } catch (InterruptedException e) {
/*  53 */       logger.error("添加索引文件异常:" + indexFile, e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void run() {
/*  58 */     logger.info("启动索引文件处理中心");
/*     */     while (true) {
/*     */       try {
/*  61 */         IndexFile indexMsg = (IndexFile)queue.take();
/*  62 */         logger.info("处理索引文件消息：" + JSONObject.fromObject(indexMsg).toString());
/*  63 */         List<SoundIndex> list = analyzeIndexFile(indexMsg);
/*  64 */         logger.info("需要分析文件个数=" + list.size());
/*  65 */         for (SoundIndex idx : list) {
/*  66 */           Task t = new Task();
/*  67 */           t.setSysId(indexMsg.getSysId());
/*  68 */           t.setSoundIndex(idx);
/*  69 */           t.setIndexFileName(getFileName(indexMsg, idx, 1, false));
/*  70 */           t.setSoundFileName(getFileName(indexMsg, idx, 2, false));
/*  71 */           t.setXmlFileName(getFileName(indexMsg, idx, 3, false));
/*  72 */           t.setEmoFileName(getFileName(indexMsg, idx, 4, false));
/*     */           
/*  74 */           t.setSaveBaseFile(true);
/*  75 */           t.setAnalyzeFile(true);
/*     */           
/*  77 */           TaskDispatcherService.addTask(t);
/*     */         } 
/*  79 */       } catch (Exception e) {
/*  80 */         logger.error("索引文件处理中心异常", e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean addTask(BaseData base) {
/*  92 */     if (base == null) return false; 
/*  93 */     logger.info("添加重新质检任务baseId=" + base.getBaseId());
/*  94 */     Task t = new Task();
/*  95 */     t.setBaseData(base);
/*  96 */     t.setSysId(base.getSysId());
/*  97 */     t.setSoundIndex(getSoundIndexByBaseData(base));
/*  98 */     t.setIndexFileName(null);
/*  99 */     t.setSoundFileName(base.getRecordFile());
/* 100 */     t.setXmlFileName(base.getResolveFile());
/* 101 */     t.setEmoFileName(getFileName(base.getResolveFile(), 4));
/*     */ 
/*     */ 
/*     */     
/* 105 */     t.setSaveBaseFile(false);
/* 106 */     t.setAnalyzeFile(true);
/*     */     
/* 108 */     TaskDispatcherService.addTask(t);
/* 109 */     return true;
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
/*     */   public static boolean addTempTask(BaseData base, String totalScoreId, String ruleId, BlockingQueue<List<AnalyzeResult>> resultQueue) {
/* 123 */     if (base == null) return false; 
/* 124 */     logger.info("添加临时质检任务baseId=" + base.getBaseId());
/* 125 */     Task t = new Task();
/* 126 */     t.setBaseData(base);
/* 127 */     t.setSysId(base.getSysId());
/* 128 */     t.setSoundIndex(getSoundIndexByBaseData(base));
/* 129 */     t.setIndexFileName(null);
/* 130 */     t.setSoundFileName(base.getRecordFile());
/* 131 */     t.setXmlFileName(base.getResolveFile());
/* 132 */     t.setEmoFileName(getFileName(base.getResolveFile(), 4));
/*     */     
/* 134 */     t.setSaveBaseFile(false);
/* 135 */     t.setAnalyzeFile(true);
/* 136 */     t.setSaveScoreTotalData(false);
/* 137 */     t.setSaveScoreDetailData(false);
/* 138 */     t.setSendAlarm(false);
/*     */ 
/*     */     
/* 141 */     Map<String, Set<String>> analyzeContents = new HashMap<String, Set<String>>();
/* 142 */     Set<String> ruleIds = null;
/* 143 */     if (StringUtils.isNotBlank(ruleId)) {
/* 144 */       ruleIds = new HashSet<String>();
/* 145 */       ruleIds.add(ruleId);
/*     */     } 
/* 147 */     analyzeContents.put(totalScoreId, ruleIds);
/* 148 */     t.setAnalyzeContents(analyzeContents);
/*     */ 
/*     */     
/* 151 */     t.setAnalyzeResultQueue(resultQueue);
/*     */ 
/*     */ 
/*     */     
/* 155 */     TaskDispatcherService.addTask(t);
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private static SoundIndex getSoundIndexByBaseData(BaseData base) {
/* 161 */     if (base == null) return null; 
/* 162 */     SoundIndex idx = new SoundIndex();
/* 163 */     idx.setSessionId(base.getAudioCode());
/* 164 */     idx.setCallType(base.getCallType().toString());
/*     */     
/* 166 */     if (base.getStartTime() != null) idx.setStartTime(CommonTools.getFormatDate(base.getStartTime())); 
/* 167 */     if (base.getEndTime() != null) idx.setEndTime(CommonTools.getFormatDate(base.getEndTime()));
/*     */     
/* 169 */     if (base.getRecordDuration() != null) idx.setDuration(base.getRecordDuration().toString()); 
/* 170 */     idx.setRemoteUri(base.getRemoteUri());
/* 171 */     idx.setLocalUri(base.getLocalUri());
/* 172 */     idx.setAgentId(base.getAgentId());
/* 173 */     idx.setRecordName(base.getRecordFile());
/* 174 */     idx.setDeviceNumber(base.getDeviceNumber());
/* 175 */     idx.setDeviceName(base.getDeviceName());
/*     */     
/* 177 */     return idx;
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
/*     */   private String getFileName(IndexFile indexMsg, SoundIndex indexLine, int type, boolean addRootDir) {
/* 191 */     StringBuilder strBdr = new StringBuilder();
/* 192 */     if (addRootDir) strBdr.append(AnalyzeEngineConstant.MOUNT_ROOT_DIR); 
/* 193 */     strBdr.append("/").append(indexMsg.getSysId()).append("/").append(indexMsg.getDate()).append("/");
/*     */     
/* 195 */     if (type == 1) strBdr.append(indexMsg.getFileName()).append(".csv"); 
/* 196 */     String fn = indexLine.getRecordName();
/* 197 */     String suffix = fn.substring(fn.lastIndexOf(".") + 1);
/* 198 */     fn = fn.substring(fn.lastIndexOf("/") + 1, fn.lastIndexOf("."));
/* 199 */     if (type == 2) strBdr.append(fn).append("." + suffix); 
/* 200 */     if (type == 3) strBdr.append(fn).append(".xml"); 
/* 201 */     if (type == 4) strBdr.append(fn).append("_text_role_result_emo.txt"); 
/* 202 */     return strBdr.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String getFileName(String xmlFile, int type) {
/* 212 */     if (StringUtils.isBlank(xmlFile)) return null; 
/* 213 */     String result = null;
/* 214 */     xmlFile = xmlFile.trim();
/* 215 */     if (type == 4) result = xmlFile.replaceAll("\\.xml$", "_text_role_result_emo.txt"); 
/* 216 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private List<SoundIndex> analyzeIndexFile(IndexFile indexMsg) {
/* 226 */     List<SoundIndex> list = new ArrayList<SoundIndex>();
/*     */     try {
/* 228 */       File file = new File(AnalyzeEngineConstant.MOUNT_ROOT_DIR + "/" + indexMsg.getSysId() + "/" + indexMsg.getDate() + "/" + indexMsg.getFileName() + ".csv");
/* 229 */       List<String> lines = FileUtils.readLines(file, "UTF-8");
/* 230 */       if (lines != null && lines.size() > 0)
/* 231 */         for (String line : lines) {
/* 232 */           SoundIndex s = genSoundIndex(line);
/* 233 */           if (s != null) list.add(s);
/*     */         
/*     */         }  
/* 236 */     } catch (Exception e) {
/* 237 */       logger.error("解析索引消息异常indexFile=" + JSONObject.fromObject(indexMsg).toString(), e);
/*     */     } 
/* 239 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SoundIndex genSoundIndex(String line) {
/* 248 */     if (StringUtils.isBlank(line)) return null; 
/*     */     try {
/* 250 */       SoundIndex idx = new SoundIndex();
/* 251 */       String[] arr = line.split(",");
/*     */       
/* 253 */       if (arr.length != 12) return null; 
/* 254 */       if (arr[0].trim().replaceAll("[0-9]", "").length() != 0) return null;
/*     */ 
/*     */       
/* 257 */       for (int i = 0; i < arr.length; i++) {
/*     */         
/* 259 */         if (i == 1) idx.setSessionId(arr[i].trim()); 
/* 260 */         if (i == 2) idx.setCallType(arr[i].trim()); 
/* 261 */         if (i == 3) idx.setStartTime(arr[i].trim()); 
/* 262 */         if (i == 4) idx.setEndTime(arr[i].trim()); 
/* 263 */         if (i == 5) idx.setDuration(arr[i].trim()); 
/* 264 */         if (i == 6) idx.setRemoteUri(arr[i].trim()); 
/* 265 */         if (i == 7) idx.setLocalUri(arr[i].trim()); 
/* 266 */         if (i == 8) idx.setAgentId(arr[i].trim()); 
/* 267 */         if (i == 9) idx.setRecordName(arr[i].trim()); 
/* 268 */         if (i == 10) idx.setDeviceNumber(arr[i].trim()); 
/* 269 */         if (i == 11) idx.setDeviceName(arr[i].trim());
/*     */       
/*     */       } 
/* 272 */       return idx;
/* 273 */     } catch (Exception e) {
/* 274 */       logger.error("索引文件行转换SoundIndex异常", e);
/* 275 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 284 */   public ThreadPoolTaskExecutor getCachedThreadPool() { return this.cachedThreadPool; }
/*     */ 
/*     */ 
/*     */   
/* 288 */   public void setCachedThreadPool(ThreadPoolTaskExecutor cachedThreadPool) { this.cachedThreadPool = cachedThreadPool; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\SoundInCacheListenService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */