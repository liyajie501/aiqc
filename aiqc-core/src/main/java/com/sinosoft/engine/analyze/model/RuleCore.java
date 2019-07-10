/*    */ package com.sinosoft.engine.analyze.model;
/*    */ 
/*    */ import java.util.List;
import java.util.Map;

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
/*    */ 
/*    */ public class RuleCore
/*    */ {
/*    */   private String ruleId;
/*    */   private String name;
/*    */   private String context;
/*    */   private String type;
/*    */   private String userType;
/*    */   private Map<String, List<ProducerEleValueExt>> eleGroupMap;
/*    */   
/*    */   public RuleCore() {}
/*    */   
/*    */   public RuleCore(String ruleId, String name, String context, String type, String userType) {
/* 37 */     this.ruleId = ruleId;
/* 38 */     this.name = name;
/* 39 */     this.context = context;
/* 40 */     this.type = type;
/* 41 */     this.userType = userType;
/*    */   }
/*    */   
/* 44 */   public String getRuleId() { return this.ruleId; }
/*    */ 
/*    */   
/* 47 */   public void setRuleId(String ruleId) { this.ruleId = ruleId; }
/*    */ 
/*    */   
/* 50 */   public String getName() { return this.name; }
/*    */ 
/*    */   
/* 53 */   public void setName(String name) { this.name = name; }
/*    */ 
/*    */   
/* 56 */   public String getContext() { return this.context; }
/*    */ 
/*    */   
/* 59 */   public void setContext(String context) { this.context = context; }
/*    */ 
/*    */   
/* 62 */   public String getType() { return this.type; }
/*    */ 
/*    */   
/* 65 */   public void setType(String type) { this.type = type; }
/*    */ 
/*    */   
/* 68 */   public String getUserType() { return this.userType; }
/*    */ 
/*    */   
/* 71 */   public void setUserType(String userType) { this.userType = userType; }
/*    */ 
/*    */   
/* 74 */   public Map<String, List<ProducerEleValueExt>> getEleGroupMap() { return this.eleGroupMap; }
/*    */ 
/*    */   
/* 77 */   public void setEleGroupMap(Map<String, List<ProducerEleValueExt>> eleGroupMap) { this.eleGroupMap = eleGroupMap; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\RuleCore.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */