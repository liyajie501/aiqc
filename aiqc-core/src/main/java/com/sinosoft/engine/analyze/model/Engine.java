/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Engine
/*    */ {
/*    */   private String engineId;
/*    */   private String type;
/*    */   private String engineIp;
/*    */   private String enginePort;
/*    */   private String version;
/*    */   
/* 15 */   public String getEngineId() { return this.engineId; }
/*    */ 
/*    */ 
/*    */   
/* 19 */   public void setEngineId(String engineId) { this.engineId = (engineId == null) ? null : engineId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 23 */   public String getType() { return this.type; }
/*    */ 
/*    */ 
/*    */   
/* 27 */   public void setType(String type) { this.type = (type == null) ? null : type.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 31 */   public String getEngineIp() { return this.engineIp; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setEngineIp(String engineIp) { this.engineIp = (engineIp == null) ? null : engineIp.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public String getEnginePort() { return this.enginePort; }
/*    */ 
/*    */ 
/*    */   
/* 43 */   public void setEnginePort(String enginePort) { this.enginePort = (enginePort == null) ? null : enginePort.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public String getVersion() { return this.version; }
/*    */ 
/*    */ 
/*    */   
/* 51 */   public void setVersion(String version) { this.version = (version == null) ? null : version.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\Engine.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */