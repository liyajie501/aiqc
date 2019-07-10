/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import net.sf.json.JSONObject;
/*     */ import org.apache.commons.lang.builder.CompareToBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class JoinSys
/*     */ {
/*     */   private String sysId;
/*     */   private String name;
/*     */   private String info;
/*     */   private String ftpIp;
/*     */   private String ftpPort;
/*     */   private String ftpPath;
/*     */   private String username;
/*     */   private String password;
/*     */   private String valid;
/*     */   
/*  30 */   public String toString() { return JSONObject.fromObject(this).toString(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  38 */   public int getSysHashCode() { return (new HashCodeBuilder(17, 37))
/*  39 */       .append(this.ftpIp)
/*  40 */       .append(this.ftpPath).toHashCode(); }
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
/*     */   public int CompareToV1(Object o) {
/*  72 */     int compare = -1;
/*  73 */     if (o != null && JoinSys.class.isAssignableFrom(o.getClass())) {
/*  74 */       JoinSys obj = (JoinSys)o;
/*     */ 
/*     */ 
/*     */       
/*  78 */       compare = (new CompareToBuilder()).append(this.sysId, obj.sysId).append(this.ftpPath, obj.ftpPath).append(this.valid, obj.valid).toComparison();
/*     */     } 
/*  80 */     return compare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public String getName() { return this.name; }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public String getInfo() { return this.info; }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public void setInfo(String info) { this.info = (info == null) ? null : info.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public String getFtpIp() { return this.ftpIp; }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public void setFtpIp(String ftpIp) { this.ftpIp = (ftpIp == null) ? null : ftpIp.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public String getFtpPort() { return this.ftpPort; }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public void setFtpPort(String ftpPort) { this.ftpPort = (ftpPort == null) ? null : ftpPort.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public String getFtpPath() { return this.ftpPath; }
/*     */ 
/*     */ 
/*     */   
/* 129 */   public void setFtpPath(String ftpPath) { this.ftpPath = (ftpPath == null) ? null : ftpPath.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 133 */   public String getUsername() { return this.username; }
/*     */ 
/*     */ 
/*     */   
/* 137 */   public void setUsername(String username) { this.username = (username == null) ? null : username.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 141 */   public String getPassword() { return this.password; }
/*     */ 
/*     */ 
/*     */   
/* 145 */   public void setPassword(String password) { this.password = (password == null) ? null : password.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 149 */   public String getValid() { return this.valid; }
/*     */ 
/*     */ 
/*     */   
/* 153 */   public void setValid(String valid) { this.valid = (valid == null) ? null : valid.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\JoinSys.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */