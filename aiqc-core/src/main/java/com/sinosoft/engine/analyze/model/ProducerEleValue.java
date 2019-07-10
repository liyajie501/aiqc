/*    */ package com.sinosoft.engine.analyze.model;
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
/*    */ public class ProducerEleValue
/*    */ {
/*    */   private String eleValueId;
/*    */   private String eleId;
/*    */   private String eleGroupId;
/*    */   private String eleValue;
/*    */   private Integer eleValueType;
/*    */   
/*    */   public ProducerEleValue() {}
/*    */   
/*    */   public ProducerEleValue(String eleValueId, String eleId, String eleGroupId, String eleValue, Integer eleValueType) {
/* 24 */     this.eleValueId = eleValueId;
/* 25 */     this.eleId = eleId;
/* 26 */     this.eleGroupId = eleGroupId;
/* 27 */     this.eleValue = eleValue;
/*    */   }
/*    */ 
/*    */   
/* 31 */   public String getEleValueId() { return this.eleValueId; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setEleValueId(String eleValueId) { this.eleValueId = (eleValueId == null) ? null : eleValueId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public String getEleId() { return this.eleId; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   public Integer getEleValueType() { return this.eleValueType; }
/*    */ 
/*    */ 
/*    */   
/* 48 */   public void setEleValueType(Integer eleValueType) { this.eleValueType = eleValueType; }
/*    */ 
/*    */ 
/*    */   
/* 52 */   public void setEleId(String eleId) { this.eleId = (eleId == null) ? null : eleId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 56 */   public String getEleGroupId() { return this.eleGroupId; }
/*    */ 
/*    */ 
/*    */   
/* 60 */   public void setEleGroupId(String eleGroupId) { this.eleGroupId = (eleGroupId == null) ? null : eleGroupId.trim(); }
/*    */ 
/*    */ 
/*    */   
/* 64 */   public String getEleValue() { return this.eleValue; }
/*    */ 
/*    */ 
/*    */   
/* 68 */   public void setEleValue(String eleValue) { this.eleValue = (eleValue == null) ? null : eleValue.trim(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ProducerEleValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */