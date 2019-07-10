/*     */ package com.sinosoft.engine.task.service.impl;
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
/*     */ class null
/*     */   implements Runnable
/*     */ {
/*     */   public void run() {
/* 127 */     long startTime = System.currentTimeMillis();
/*     */     try {
/* 129 */       TaskServiceRequestHttp.access$000().info("执行线程,HTTP开始拉取服务录音文件....................................");
/* 130 */       JDBCUtil jdbc = new JDBCUtil();
/* 131 */       jdbc.openConnection();
/* 132 */       String sysId = "VIPS";
/* 133 */       Date date = new Date();
/*     */       
/* 135 */       String dirName = DateUtil.formatDate(date, "yyyyMMddHHmmdd");
/* 136 */       String dirPath = "";
/* 137 */       boolean isF = false;
/* 138 */       for (int i = 0; i < listCSV.size(); i++) {
/* 139 */         List<String> voiceCaseIdList = jdbc.findData(((RecordingCSV)listCSV.get(i)).getUniqueId());
/* 140 */         for (int j = 0; j < voiceCaseIdList.size(); j++) {
/* 141 */           String url = CommonTools.getApplicationConf("engine.analyze.RecordingURL.Path") + "awfos/decodeVoiceCaseId?voiceCaseId=" + (String)voiceCaseIdList.get(j) + "&audioOutputFormat=wav&userLoginId=supervisor&tenantName=default";
/* 142 */           String data = HttpClient.get(url);
/* 143 */           if (data.equals("Error"))
/*     */             break; 
/* 145 */           int begin = data.indexOf("http");
/* 146 */           int last = data.length() - 13;
/* 147 */           String recorDingRUL = data.substring(begin, last);
/*     */           
/* 149 */           if (((RecordingCSV)listCSV.get(i)).getRecordingName() == null || ((RecordingCSV)listCSV.get(i)).getRecordingName().isEmpty()) {
/* 150 */             ((RecordingCSV)listCSV.get(i)).setRecordingName((new File(recorDingRUL)).getName());
/*     */           }
/* 152 */           File sysIdDir = new File(CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId);
/* 153 */           if (!sysIdDir.exists()) {
/* 154 */             sysIdDir.mkdirs();
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 162 */           File MP3Dir = new File(CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId + "//" + dirName);
/* 163 */           if (!MP3Dir.exists()) {
/* 164 */             MP3Dir.mkdir();
/* 165 */             isF = true;
/*     */           } 
/* 167 */           boolean isFalge = HttpClient.downLoadFromUrl(recorDingRUL, MP3Dir + "/" + (new File(recorDingRUL)).getName());
/* 168 */           dirPath = CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId + "//" + dirName;
/* 169 */           if (isFalge)
/*     */             break; 
/*     */         } 
/*     */       } 
/* 173 */       if (isF) {
/* 174 */         File dir = new File(dirPath);
/* 175 */         HttpCreateCsv.genHttpIndexInfo(sysId, dirName, listCSV, dir);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 181 */         File HttploadFile = new File(CommonTools.getApplicationConf("engine.analyze.HttpDownloadRecording.Path") + sysId + "/HttploadFile/HttploadFile.done");
/* 182 */         FileUtils.write(HttploadFile, sysId + "/" + dirName + "\n", "UTF-8", true);
/*     */         
/* 184 */         listCSV.clear();
/* 185 */         jdbc.closeConnection();
/*     */       }
/*     */     
/* 188 */     } catch (Exception e) {
/* 189 */       TaskServiceRequestHttp.access$000().error("HTTP拉取服务录音文件异常", e);
/*     */     } 
/* 191 */     long endTime = System.currentTimeMillis();
/* 192 */     TaskServiceRequestHttp.access$000().info(DateUtil.formatDate(new Date()) + "程序运行所花时间------------：" + (endTime - startTime) + "ms");
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\task\service\impl\TaskServiceRequestHttp$1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */