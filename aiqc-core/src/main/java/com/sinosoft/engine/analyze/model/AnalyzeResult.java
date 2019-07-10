/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AnalyzeResult
/*    */ {
/*    */   private boolean result;
/*    */   private boolean errorFlag;
/*    */   private String errorContext;
/*    */   private List<EleGroupResult> markList;
/*    */   private String detailScoreId;
/*    */   
/* 32 */   public List<EleGroupResult> getMarkList() { return this.markList; }
/*    */ 
/*    */   
/* 35 */   public void setMarkList(List<EleGroupResult> markList) { this.markList = markList; }
/*    */ 
/*    */   
/* 38 */   public String getDetailScoreId() { return this.detailScoreId; }
/*    */ 
/*    */   
/* 41 */   public void setDetailScoreId(String detailScoreId) { this.detailScoreId = detailScoreId; }
/*    */ 
/*    */   
/* 44 */   public boolean isResult() { return this.result; }
/*    */ 
/*    */   
/* 47 */   public void setResult(boolean result) { this.result = result; }
/*    */ 
/*    */   
/* 50 */   public boolean isErrorFlag() { return this.errorFlag; }
/*    */ 
/*    */   
/* 53 */   public void setErrorFlag(boolean errorFlag) { this.errorFlag = errorFlag; }
/*    */ 
/*    */   
/* 56 */   public String getErrorContext() { return this.errorContext; }
/*    */ 
/*    */   
/* 59 */   public void setErrorContext(String errorContext) { this.errorContext = errorContext; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\AnalyzeResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */