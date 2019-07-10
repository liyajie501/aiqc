/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProducerEleValueExt
/*    */   extends ProducerEleValue
/*    */ {
/*    */   private String code;
/*    */   
/*    */   public ProducerEleValueExt() {}
/*    */   
/* 12 */   public ProducerEleValueExt(String eleValueId, String eleId, String eleGroupId, String eleValue, Integer eleValueType) { super(eleValueId, eleId, eleGroupId, eleValue, eleValueType); }
/*    */ 
/*    */ 
/*    */   
/*    */   public ProducerEleValueExt(String eleValueId, String eleId, String eleGroupId, String eleValue, Integer eleValueType, String code) {
/* 17 */     super(eleValueId, eleId, eleGroupId, eleValue, eleValueType);
/* 18 */     this.code = code;
/*    */   }
/*    */ 
/*    */   
/* 22 */   public String getCode() { return this.code; }
/*    */ 
/*    */ 
/*    */   
/* 26 */   public void setCode(String code) { this.code = code; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ProducerEleValueExt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */