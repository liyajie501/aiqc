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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AlarmLog
/*     */   extends DateTableName
/*     */ {
/*     */   private String alarmLogId;
/*     */   private String scoreTotalDataId;
/*     */   private String scoreDetailDataId;
/*     */   private String baseId;
/*     */   private String alarmId;
/*     */   private Date sendTime;
/*     */   private String sendType;
/*     */   private String receiveUser;
/*     */   private String content;
/*     */   private String result;
/*     */   private String ruleId;
/*     */   private String status;
/*     */   private String resultText;
/*     */   private String sysId;
/*     */   private Date createTime;
/*     */   private Integer level;
/*     */   private String audioCode;
/*     */   private String recordFile;
/*     */   private String totalScoreId;
/*     */   private String detailScoreId;
/*     */   private String mark;
/*     */   private String category;
/*     */   private String ruleName;
/*     */   private String totalScoreName;
/*     */   private String sysName;
/*     */   private String receiveUserName;
/*     */   private String mail;
/*     */   private Date startTime;
/*     */   private String agentId;
/*     */   private Integer resultFlag;
/*     */   
/*  54 */   public String getCategory() { return this.category; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  61 */   public void setCategory(String category) { this.category = category; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   public String getMark() { return this.mark; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  75 */   public void setMark(String mark) { this.mark = mark; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  90 */   public Integer getResultFlag() { return this.resultFlag; }
/*     */ 
/*     */ 
/*     */   
/*  94 */   public void setResultFlag(Integer resultFlag) { this.resultFlag = resultFlag; }
/*     */ 
/*     */ 
/*     */   
/*  98 */   public Date getStartTime() { return this.startTime; }
/*     */ 
/*     */ 
/*     */   
/* 102 */   public void setStartTime(Date startTime) { this.startTime = startTime; }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public String getAgentId() { return this.agentId; }
/*     */ 
/*     */ 
/*     */   
/* 110 */   public void setAgentId(String agentId) { this.agentId = agentId; }
/*     */ 
/*     */ 
/*     */   
/* 114 */   public String getMail() { return this.mail; }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public void setMail(String mail) { this.mail = mail; }
/*     */ 
/*     */ 
/*     */   
/* 122 */   public String getReceiveUserName() { return this.receiveUserName; }
/*     */ 
/*     */ 
/*     */   
/* 126 */   public void setReceiveUserName(String receiveUserName) { this.receiveUserName = receiveUserName; }
/*     */ 
/*     */ 
/*     */   
/* 130 */   public String getRuleName() { return this.ruleName; }
/*     */ 
/*     */ 
/*     */   
/* 134 */   public void setRuleName(String ruleName) { this.ruleName = ruleName; }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public String getTotalScoreName() { return this.totalScoreName; }
/*     */ 
/*     */ 
/*     */   
/* 142 */   public void setTotalScoreName(String totalScoreName) { this.totalScoreName = totalScoreName; }
/*     */ 
/*     */ 
/*     */   
/* 146 */   public String getSysName() { return this.sysName; }
/*     */ 
/*     */ 
/*     */   
/* 150 */   public void setSysName(String sysName) { this.sysName = sysName; }
/*     */ 
/*     */ 
/*     */   
/* 154 */   public String getAlarmLogId() { return this.alarmLogId; }
/*     */ 
/*     */ 
/*     */   
/* 158 */   public void setAlarmLogId(String alarmLogId) { this.alarmLogId = (alarmLogId == null) ? null : alarmLogId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 162 */   public String getScoreTotalDataId() { return this.scoreTotalDataId; }
/*     */ 
/*     */ 
/*     */   
/* 166 */   public void setScoreTotalDataId(String scoreTotalDataId) { this.scoreTotalDataId = (scoreTotalDataId == null) ? null : scoreTotalDataId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 170 */   public String getScoreDetailDataId() { return this.scoreDetailDataId; }
/*     */ 
/*     */ 
/*     */   
/* 174 */   public void setScoreDetailDataId(String scoreDetailDataId) { this.scoreDetailDataId = (scoreDetailDataId == null) ? null : scoreDetailDataId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 178 */   public String getBaseId() { return this.baseId; }
/*     */ 
/*     */ 
/*     */   
/* 182 */   public void setBaseId(String baseId) { this.baseId = (baseId == null) ? null : baseId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 186 */   public String getAlarmId() { return this.alarmId; }
/*     */ 
/*     */ 
/*     */   
/* 190 */   public void setAlarmId(String alarmId) { this.alarmId = (alarmId == null) ? null : alarmId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 194 */   public Date getSendTime() { return this.sendTime; }
/*     */ 
/*     */ 
/*     */   
/* 198 */   public void setSendTime(Date sendTime) { this.sendTime = sendTime; }
/*     */ 
/*     */ 
/*     */   
/* 202 */   public String getSendType() { return this.sendType; }
/*     */ 
/*     */ 
/*     */   
/* 206 */   public void setSendType(String sendType) { this.sendType = (sendType == null) ? null : sendType.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 210 */   public String getReceiveUser() { return this.receiveUser; }
/*     */ 
/*     */ 
/*     */   
/* 214 */   public void setReceiveUser(String receiveUser) { this.receiveUser = (receiveUser == null) ? null : receiveUser.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 218 */   public String getContent() { return this.content; }
/*     */ 
/*     */ 
/*     */   
/* 222 */   public void setContent(String content) { this.content = (content == null) ? null : content.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 226 */   public String getResult() { return this.result; }
/*     */ 
/*     */ 
/*     */   
/* 230 */   public void setResult(String result) { this.result = (result == null) ? null : result.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 234 */   public String getRuleId() { return this.ruleId; }
/*     */ 
/*     */ 
/*     */   
/* 238 */   public void setRuleId(String ruleId) { this.ruleId = (ruleId == null) ? null : ruleId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 242 */   public String getStatus() { return this.status; }
/*     */ 
/*     */ 
/*     */   
/* 246 */   public void setStatus(String status) { this.status = (status == null) ? null : status.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 250 */   public String getResultText() { return this.resultText; }
/*     */ 
/*     */ 
/*     */   
/* 254 */   public void setResultText(String resultText) { this.resultText = (resultText == null) ? null : resultText.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 258 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/* 262 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 266 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 270 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 274 */   public Integer getLevel() { return this.level; }
/*     */ 
/*     */ 
/*     */   
/* 278 */   public void setLevel(Integer level) { this.level = level; }
/*     */ 
/*     */ 
/*     */   
/* 282 */   public String getAudioCode() { return this.audioCode; }
/*     */ 
/*     */ 
/*     */   
/* 286 */   public void setAudioCode(String audioCode) { this.audioCode = (audioCode == null) ? null : audioCode.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 290 */   public String getRecordFile() { return this.recordFile; }
/*     */ 
/*     */ 
/*     */   
/* 294 */   public void setRecordFile(String recordFile) { this.recordFile = (recordFile == null) ? null : recordFile.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 298 */   public String getTotalScoreId() { return this.totalScoreId; }
/*     */ 
/*     */ 
/*     */   
/* 302 */   public void setTotalScoreId(String totalScoreId) { this.totalScoreId = (totalScoreId == null) ? null : totalScoreId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 306 */   public String getDetailScoreId() { return this.detailScoreId; }
/*     */ 
/*     */ 
/*     */   
/* 310 */   public void setDetailScoreId(String detailScoreId) { this.detailScoreId = (detailScoreId == null) ? null : detailScoreId.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\model\AlarmLog.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */