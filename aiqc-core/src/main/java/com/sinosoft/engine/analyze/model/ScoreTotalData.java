/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import org.apache.commons.beanutils.PropertyUtils;

/*    */
/*    */ 
/*    */ public class ScoreTotalData extends ScoreTotalData {
/*    */   private String tableNameSuffix;
/*    */   
/*    */   public ScoreTotalData() {}
/*    */   
/*    */   public ScoreTotalData(ScoreTotalData scoreTotalData) {
/*    */     try {
/* 13 */       PropertyUtils.copyProperties(this, scoreTotalData);
/* 14 */     } catch (Exception e) {
/* 15 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   public String getTableNameSuffix() { return this.tableNameSuffix; }
/*    */ 
/*    */   
/* 26 */   public void setTableNameSuffix(String tableNameSuffix) { this.tableNameSuffix = tableNameSuffix; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ScoreTotalData.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */