/*     */ package com.sinosoft.engine.analyze.model;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScoreAgentRule
/*     */ {
/*     */   private Integer scoreAgentRuleId;
/*     */   private String scoreTotalId;
/*     */   private String agentId;
/*     */   private String agentGroupId;
/*     */   private String detailScoreId;
/*     */   private Integer detailScoreGetCount;
/*     */   private Integer recordCount;
/*     */   private String totalScoreResultId;
/*     */   private String ruleId;
/*     */   private Date createTime;
/*     */   private Date recordTime;
/*     */   private String unit;
/*     */   private Date startTime;
/*     */   private Date endTime;
/*     */   
/*  28 */   public Date getRecordTime() { return this.recordTime; }
/*     */ 
/*     */ 
/*     */   
/*  32 */   public void setRecordTime(Date recordTime) { this.recordTime = recordTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   public Date getStartTime() { return this.startTime; }
/*     */ 
/*     */ 
/*     */   
/*  45 */   public void setStartTime(Date startTime) { this.startTime = startTime; }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public Date getEndTime() { return this.endTime; }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public void setEndTime(Date endTime) { this.endTime = endTime; }
/*     */ 
/*     */ 
/*     */   
/*  57 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/*  65 */   public String getUnit() { return this.unit; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setUnit(String unit) { this.unit = unit; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public Integer getScoreAgentRuleId() { return this.scoreAgentRuleId; }
/*     */ 
/*     */ 
/*     */   
/*  77 */   public void setScoreAgentRuleId(Integer scoreAgentRuleId) { this.scoreAgentRuleId = scoreAgentRuleId; }
/*     */ 
/*     */ 
/*     */   
/*  81 */   public String getScoreTotalId() { return this.scoreTotalId; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setScoreTotalId(String scoreTotalId) { this.scoreTotalId = (scoreTotalId == null) ? null : scoreTotalId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  89 */   public String getAgentId() { return this.agentId; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setAgentId(String agentId) { this.agentId = (agentId == null) ? null : agentId.trim(); }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public String getAgentGroupId() { return this.agentGroupId; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setAgentGroupId(String agentGroupId) { this.agentGroupId = (agentGroupId == null) ? null : agentGroupId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 105 */   public String getDetailScoreId() { return this.detailScoreId; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public void setDetailScoreId(String detailScoreId) { this.detailScoreId = (detailScoreId == null) ? null : detailScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 113 */   public Integer getDetailScoreGetCount() { return this.detailScoreGetCount; }
/*     */ 
/*     */ 
/*     */   
/* 117 */   public void setDetailScoreGetCount(Integer detailScoreGetCount) { this.detailScoreGetCount = detailScoreGetCount; }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public Integer getRecordCount() { return this.recordCount; }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public void setRecordCount(Integer recordCount) { this.recordCount = recordCount; }
/*     */ 
/*     */ 
/*     */   
/* 129 */   public String getTotalScoreResultId() { return this.totalScoreResultId; }
/*     */ 
/*     */ 
/*     */   
/* 133 */   public void setTotalScoreResultId(String totalScoreResultId) { this.totalScoreResultId = (totalScoreResultId == null) ? null : totalScoreResultId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 137 */   public String getRuleId() { return this.ruleId; }
/*     */ 
/*     */ 
/*     */   
/* 141 */   public void setRuleId(String ruleId) { this.ruleId = (ruleId == null) ? null : ruleId.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\ScoreAgentRule.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */