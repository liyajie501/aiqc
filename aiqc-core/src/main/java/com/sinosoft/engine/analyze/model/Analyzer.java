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
/*     */ 
/*     */ 
/*     */ public class Analyzer
/*     */ {
/*     */   private String analyzerId;
/*     */   private String code;
/*     */   private String version;
/*     */   private String name;
/*     */   private String info;
/*     */   private String publishUser;
/*     */   private Date publishTime;
/*     */   private String publishMark;
/*     */   private String analyzerClass;
/*     */   private String producerPage;
/*     */   private String deleteMark;
/*     */   
/*  29 */   public String getAnalyzerId() { return this.analyzerId; }
/*     */ 
/*     */ 
/*     */   
/*  33 */   public void setAnalyzerId(String analyzerId) { this.analyzerId = (analyzerId == null) ? null : analyzerId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  37 */   public String getCode() { return this.code; }
/*     */ 
/*     */ 
/*     */   
/*  41 */   public void setCode(String code) { this.code = (code == null) ? null : code.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  45 */   public String getVersion() { return this.version; }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public void setVersion(String version) { this.version = (version == null) ? null : version.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/*  57 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public String getInfo() { return this.info; }
/*     */ 
/*     */ 
/*     */   
/*  65 */   public void setInfo(String info) { this.info = (info == null) ? null : info.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public String getPublishUser() { return this.publishUser; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public void setPublishUser(String publishUser) { this.publishUser = (publishUser == null) ? null : publishUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public Date getPublishTime() { return this.publishTime; }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public void setPublishTime(Date publishTime) { this.publishTime = publishTime; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public String getPublishMark() { return this.publishMark; }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public void setPublishMark(String publishMark) { this.publishMark = (publishMark == null) ? null : publishMark.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public String getAnalyzerClass() { return this.analyzerClass; }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void setAnalyzerClass(String analyzerClass) { this.analyzerClass = (analyzerClass == null) ? null : analyzerClass.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public String getProducerPage() { return this.producerPage; }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public void setProducerPage(String producerPage) { this.producerPage = (producerPage == null) ? null : producerPage.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public String getDeleteMark() { return this.deleteMark; }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public void setDeleteMark(String deleteMark) { this.deleteMark = (deleteMark == null) ? null : deleteMark.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Analyzer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */