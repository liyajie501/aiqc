/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SysConfig
/*    */ {
/*    */   private String configId;
/*    */   private String name;
/*    */   private String code;
/*    */   private String value;
/*    */   
/* 13 */   public String getConfigId() { return this.configId; }
/*    */ 
/*    */ 
/*    */   
/* 17 */   public void setConfigId(String configId) { this.configId = (configId == null) ? null : configId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 21 */   public String getName() { return this.name; }
/*    */ 
/*    */ 
/*    */   
/* 25 */   public void setName(String name) { this.name = (name == null) ? null : name.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 29 */   public String getCode() { return this.code; }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public void setCode(String code) { this.code = (code == null) ? null : code.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public String getValue() { return this.value; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void setValue(String value) { this.value = (value == null) ? null : value.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\SysConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */