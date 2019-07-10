/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EngineLog
/*    */ {
/*    */   private String logId;
/*    */   private String engineId;
/*    */   private String session;
/*    */   private Date freqTime;
/*    */   private String errorLog;
/*    */   private String normalLog;
/*    */   
/* 19 */   public String getLogId() { return this.logId; }
/*    */ 
/*    */ 
/*    */   
/* 23 */   public void setLogId(String logId) { this.logId = (logId == null) ? null : logId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 27 */   public String getEngineId() { return this.engineId; }
/*    */ 
/*    */ 
/*    */   
/* 31 */   public void setEngineId(String engineId) { this.engineId = (engineId == null) ? null : engineId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public String getSession() { return this.session; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setSession(String session) { this.session = (session == null) ? null : session.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 43 */   public Date getFreqTime() { return this.freqTime; }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public void setFreqTime(Date freqTime) { this.freqTime = freqTime; }
/*    */ 
/*    */ 
/*    */   
/* 51 */   public String getErrorLog() { return this.errorLog; }
/*    */ 
/*    */ 
/*    */   
/* 55 */   public void setErrorLog(String errorLog) { this.errorLog = (errorLog == null) ? null : errorLog.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 59 */   public String getNormalLog() { return this.normalLog; }
/*    */ 
/*    */ 
/*    */   
/* 63 */   public void setNormalLog(String normalLog) { this.normalLog = (normalLog == null) ? null : normalLog.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\EngineLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */