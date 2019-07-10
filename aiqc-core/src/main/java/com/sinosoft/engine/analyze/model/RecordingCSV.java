/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RecordingCSV
/*     */ {
/*     */   private String RecordingName;
/*     */   private String RecordingNo;
/*     */   private String uniqueId;
/*     */   private String callType;
/*     */   private Date endDate;
/*     */   private Date callDate;
/*     */   private String billsec;
/*     */   private String src;
/*     */   private String dst;
/*     */   private String workno;
/*     */   
/*  26 */   public String getRecordingName() { return this.RecordingName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  32 */   public void setRecordingName(String recordingName) { this.RecordingName = recordingName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  38 */   public String getRecordingNo() { return this.RecordingNo; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   public void setRecordingNo(String recordingNo) { this.RecordingNo = recordingNo; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  50 */   public String getUniqueId() { return this.uniqueId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  56 */   public void setUniqueId(String uniqueId) { this.uniqueId = uniqueId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  62 */   public String getCallType() { return this.callType; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   public void setCallType(String callType) { this.callType = callType; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   public Date getEndDate() { return this.endDate; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  80 */   public void setEndDate(Date endDate) { this.endDate = endDate; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  86 */   public Date getCallDate() { return this.callDate; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  92 */   public void setCallDate(Date callDate) { this.callDate = callDate; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  98 */   public String getBillsec() { return this.billsec; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   public void setBillsec(String billsec) { this.billsec = billsec; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 110 */   public String getSrc() { return this.src; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public void setSrc(String src) { this.src = src; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 122 */   public String getDst() { return this.dst; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 128 */   public void setDst(String dst) { this.dst = dst; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 134 */   public String getWorkno() { return this.workno; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 140 */   public void setWorkno(String workno) { this.workno = workno; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 147 */   public String toString() { return "RecordingCSV [RecordingName=" + this.RecordingName + ", RecordingNo=" + this.RecordingNo + ", uniqueId=" + this.uniqueId + ", callType=" + this.callType + ", endDate=" + this.endDate + ", callDate=" + this.callDate + ", billsec=" + this.billsec + ", src=" + this.src + ", dst=" + this.dst + ", workno=" + this.workno + "]"; }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\RecordingCSV.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */