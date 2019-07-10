/*    */ package com.sinosoft.engine.analyze.utils;
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
/*    */ 
/*    */ 
/*    */ public class FtpConfig
/*    */ {
/*    */   private String host;
/*    */   private int port;
/*    */   private String username;
/*    */   private String password;
/* 20 */   private int clientTimeout = 60000;
/*    */ 
/*    */ 
/*    */   
/*    */   public FtpConfig() {}
/*    */ 
/*    */   
/*    */   public FtpConfig(String host, int port, String username, String password) {
/* 28 */     this.host = host;
/* 29 */     this.port = port;
/* 30 */     this.username = username;
/* 31 */     this.password = password;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 38 */   public String getHost() { return this.host; }
/*    */ 
/*    */ 
/*    */   
/* 42 */   public void setHost(String host) { this.host = host; }
/*    */ 
/*    */   
/* 45 */   public int getClientTimeout() { return this.clientTimeout; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setClientTimeout(int clientTimeout) { this.clientTimeout = clientTimeout; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 54 */   public int getPort() { return this.port; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public void setPort(int port) { this.port = port; }
/*    */ 
/*    */ 
/*    */   
/* 62 */   public String getUsername() { return this.username; }
/*    */ 
/*    */ 
/*    */   
/* 66 */   public void setUsername(String username) { this.username = username; }
/*    */ 
/*    */ 
/*    */   
/* 70 */   public String getPassword() { return this.password; }
/*    */ 
/*    */ 
/*    */   
/* 74 */   public void setPassword(String password) { this.password = password; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\FtpConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */