/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UploadAudio
/*    */ {
/*    */   private String uploadId;
/*    */   private String sysId;
/*    */   private String fileNameShow;
/*    */   private String fileNameUpload;
/*    */   private Double fileSize;
/*    */   private String fileFormat;
/*    */   private String uploadUser;
/*    */   private Date uploadTime;
/*    */   private String status;
/*    */   
/* 25 */   public String getUploadId() { return this.uploadId; }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public void setUploadId(String uploadId) { this.uploadId = (uploadId == null) ? null : uploadId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public String getSysId() { return this.sysId; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public String getFileNameShow() { return this.fileNameShow; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public void setFileNameShow(String fileNameShow) { this.fileNameShow = (fileNameShow == null) ? null : fileNameShow.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String getFileNameUpload() { return this.fileNameUpload; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setFileNameUpload(String fileNameUpload) { this.fileNameUpload = (fileNameUpload == null) ? null : fileNameUpload.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public Double getFileSize() { return this.fileSize; }
/*    */ 
/*    */ 
/*    */   
/* 61 */   public void setFileSize(Double fileSize) { this.fileSize = fileSize; }
/*    */ 
/*    */ 
/*    */   
/* 65 */   public String getFileFormat() { return this.fileFormat; }
/*    */ 
/*    */ 
/*    */   
/* 69 */   public void setFileFormat(String fileFormat) { this.fileFormat = (fileFormat == null) ? null : fileFormat.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 73 */   public String getUploadUser() { return this.uploadUser; }
/*    */ 
/*    */ 
/*    */   
/* 77 */   public void setUploadUser(String uploadUser) { this.uploadUser = (uploadUser == null) ? null : uploadUser.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 81 */   public Date getUploadTime() { return this.uploadTime; }
/*    */ 
/*    */ 
/*    */   
/* 85 */   public void setUploadTime(Date uploadTime) { this.uploadTime = uploadTime; }
/*    */ 
/*    */ 
/*    */   
/* 89 */   public String getStatus() { return this.status; }
/*    */ 
/*    */ 
/*    */   
/* 93 */   public void setStatus(String status) { this.status = (status == null) ? null : status.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\UploadAudio.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */