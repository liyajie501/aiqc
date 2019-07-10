/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.ArrayList;
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
/*    */ public class EleGroupResult
/*    */ {
/*    */   private String eleGroupId;
/*    */   private List<Mark> markList;
/*    */   private List<Mark> notMarkList;
/*    */   
/* 23 */   public void addMark(Mark mark) { this.markList.add(mark); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   public int size() { return this.markList.size(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EleGroupResult(String eleGroupId) {
/*    */     this.markList = new ArrayList();
/* 43 */     this.notMarkList = new ArrayList();
/*    */     this.eleGroupId = eleGroupId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 50 */   public List<Mark> getNotMarkList() { return this.notMarkList; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 57 */   public void setNotMarkList(List<Mark> notMarkList) { this.notMarkList = notMarkList; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 65 */   public void addNotMark(Mark markNot) { this.notMarkList.add(markNot); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 73 */   public int sizeNot() { return this.markList.size(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 81 */   public String getEleGroupId() { return this.eleGroupId; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 86 */   public void setEleGroupId(String eleGroupId) { this.eleGroupId = eleGroupId; }
/*    */ 
/*    */   
/* 89 */   public List<Mark> getMarkList() { return this.markList; }
/*    */ 
/*    */ 
/*    */   
/* 93 */   public void setMarkList(List<Mark> markList) { this.markList = markList; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\EleGroupResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */