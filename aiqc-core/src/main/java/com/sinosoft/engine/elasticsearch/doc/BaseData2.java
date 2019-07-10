/*     */ package com.sinosoft.engine.elasticsearch.doc;
/*     */ 
/*     */ import java.util.Date;
/*     */ import org.springframework.data.annotation.Id;
/*     */ import org.springframework.data.elasticsearch.annotations.Document;
/*     */ import org.springframework.data.elasticsearch.annotations.Field;
/*     */ import org.springframework.data.elasticsearch.annotations.FieldType;
/*     */ 
/*     */ 
/*     */ @Document(indexName = "", indexStoreType = "memory", shards = 3, replicas = 0, refreshInterval = "-1")
/*     */ public class BaseData2
/*     */ {
/*     */   @Id
/*     */   @Field(index = true, store = true)
/*     */   private String baseId;
/*     */   @Field(index = true, store = true)
/*     */   private String audioCode;
/*     */   @Field(index = true, store = true)
/*     */   private String uploadId;
/*     */   @Field(index = true, store = true)
/*     */   private String sysId;
/*     */   @Field(index = true, store = true)
/*     */   private Date createTime;
/*     */   @Field(index = true, store = true)
/*     */   private String recordFile;
/*     */   @Field(index = true, store = true)
/*     */   private String resolveFile;
/*     */   @Field(index = true, store = true)
/*     */   private String agentId;
/*     */   @Field(index = true, store = true)
/*     */   private String consumerName;
/*     */   @Field(index = true, store = true)
/*     */   private String consumerCertificateType;
/*     */   @Field(index = true, store = true)
/*     */   private String consumerCertificateNumber;
/*     */   @Field(type = FieldType.Date, index = true, store = true)
/*     */   private Date startTime;
/*     */   @Field(type = FieldType.Date, index = true, store = true)
/*     */   private Date endTime;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*  41 */   private Integer recordDuration = Integer.valueOf(-1);
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*  43 */   private Integer muteDuration = Integer.valueOf(-1);
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*  45 */   private Integer muteTimes = Integer.valueOf(-1);
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*  47 */   private Integer repeatTimes = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  49 */   private Integer statementNumber = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  51 */   private Integer agentSayNumber = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  53 */   private Integer consumerSayNumber = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  55 */   private Integer agentMoodGood = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  57 */   private Integer agentMoodBad = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  59 */   private Integer consumerMoodGood = Integer.valueOf(-1);
/*     */   @Field(index = true, store = true)
/*  61 */   private Integer consumerMoodBad = Integer.valueOf(-1);
/*     */   
/*     */   @Field(analyzer = "ik", searchAnalyzer = "ik", store = true)
/*     */   private String callInfo;
/*     */   
/*     */   @Field(analyzer = "ik", searchAnalyzer = "ik", store = true)
/*     */   private String agentCallInfo;
/*     */   
/*     */   @Field(analyzer = "ik", searchAnalyzer = "ik", store = true)
/*     */   private String consumerCallInfo;
/*     */   @Field(index = true, store = true)
/*     */   private Double mutoRatio;
/*     */   @Field(index = true, store = true)
/*  74 */   private Integer callType = Integer.valueOf(-1);
/*     */   
/*     */   @Field(index = true, store = true)
/*     */   private String remoteUri;
/*     */   
/*     */   @Field(index = true, store = true)
/*     */   private String localUri;
/*     */   
/*     */   @Field(index = true, store = true)
/*     */   private String deviceNumber;
/*     */   
/*     */   @Field(index = true, store = true)
/*     */   private String deviceName;
/*     */   
/*     */   @Field(index = true, store = true)
/*     */   private String qualityUserId;
/*     */   
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer agentRecordDuration;
/*     */   
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer consumerRecordDuration;
/*     */   
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer agentMuteDuration;
/*     */   
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer consumerMuteDuration;
/*     */   
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float agentMoodGoodTime;
/*     */   
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float agentMoodBadTime;
/*     */   
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float consumerMoodGoodTime;
/*     */   
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float consumerMoodBadTime;
/*     */   
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float agentSpeed;
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float consumerSpeed;
/*     */   @Field(index = true, store = true)
/*     */   private String muteInfo;
/*     */   @Field(index = true, store = true)
/*     */   private String repeatInfo;
/*     */   @Field(index = true, store = true)
/*     */   private String moodFile;
/*     */   @Field(type = FieldType.Long, index = true, store = true)
/*     */   private Long sequenceNum;
/*     */   @Field(index = true, store = true)
/*     */   private String sysIdBak;
/*     */   @Field(index = true, store = true, fielddata = true)
/*     */   private String categories;
/*     */   @Field(index = true, store = true, fielddata = true)
/*     */   private String dimension;
/*     */   @Field(index = true, store = true, fielddata = true)
/*     */   private String dateTag;
/*     */   
/* 136 */   public String getDimension() { return this.dimension; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   public void setDimension(String dimension) { this.dimension = dimension; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 146 */   public String getDateTag() { return this.dateTag; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 151 */   public void setDateTag(String dateTag) { this.dateTag = dateTag; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 156 */   public String getCategories() { return this.categories; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 161 */   public void setCategories(String categories) { this.categories = categories; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 166 */   public Float getAgentMoodGoodTime() { return this.agentMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 171 */   public void setAgentMoodGoodTime(Float agentMoodGoodTime) { this.agentMoodGoodTime = agentMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 176 */   public Float getAgentMoodBadTime() { return this.agentMoodBadTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 181 */   public void setAgentMoodBadTime(Float agentMoodBadTime) { this.agentMoodBadTime = agentMoodBadTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 186 */   public Float getConsumerMoodGoodTime() { return this.consumerMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 191 */   public void setConsumerMoodGoodTime(Float consumerMoodGoodTime) { this.consumerMoodGoodTime = consumerMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 196 */   public Float getConsumerMoodBadTime() { return this.consumerMoodBadTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 201 */   public void setConsumerMoodBadTime(Float consumerMoodBadTime) { this.consumerMoodBadTime = consumerMoodBadTime; }
/*     */ 
/*     */ 
/*     */   
/* 205 */   public String getMoodFile() { return this.moodFile; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 210 */   public void setMoodFile(String moodFile) { this.moodFile = moodFile; }
/*     */ 
/*     */ 
/*     */   
/* 214 */   public String getRepeatInfo() { return this.repeatInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 219 */   public void setRepeatInfo(String repeatInfo) { this.repeatInfo = repeatInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 224 */   public String getMuteInfo() { return this.muteInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 229 */   public void setMuteInfo(String muteInfo) { this.muteInfo = muteInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 234 */   public Integer getAgentRecordDuration() { return this.agentRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 239 */   public void setAgentRecordDuration(Integer agentRecordDuration) { this.agentRecordDuration = agentRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 244 */   public Integer getConsumerRecordDuration() { return this.consumerRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 249 */   public void setConsumerRecordDuration(Integer consumerRecordDuration) { this.consumerRecordDuration = consumerRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 254 */   public Integer getAgentMuteDuration() { return this.agentMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 259 */   public void setAgentMuteDuration(Integer agentMuteDuration) { this.agentMuteDuration = agentMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 264 */   public Integer getConsumerMuteDuration() { return this.consumerMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 269 */   public void setConsumerMuteDuration(Integer consumerMuteDuration) { this.consumerMuteDuration = consumerMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 276 */   public Float getAgentSpeed() { return this.agentSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 281 */   public void setAgentSpeed(Float agentSpeed) { this.agentSpeed = agentSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 286 */   public Float getConsumerSpeed() { return this.consumerSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 291 */   public void setConsumerSpeed(Float consumerSpeed) { this.consumerSpeed = consumerSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 296 */   public String getSysIdBak() { return this.sysIdBak; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 301 */   public void setSysIdBak(String sysIdBak) { this.sysIdBak = sysIdBak; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 308 */   public Long getSequenceNum() { return this.sequenceNum; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 318 */   public void setSequenceNum(Long sequenceNum) { this.sequenceNum = sequenceNum; }
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
/*     */   
/* 336 */   public String getQualityUserId() { return this.qualityUserId; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 341 */   public void setQualityUserId(String qualityUserId) { this.qualityUserId = qualityUserId; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 346 */   public String getBaseId() { return this.baseId; }
/*     */ 
/*     */ 
/*     */   
/* 350 */   public void setBaseId(String baseId) { this.baseId = (baseId == null) ? null : baseId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 354 */   public String getAudioCode() { return this.audioCode; }
/*     */ 
/*     */ 
/*     */   
/* 358 */   public void setAudioCode(String audioCode) { this.audioCode = (audioCode == null) ? null : audioCode.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 362 */   public String getUploadId() { return this.uploadId; }
/*     */ 
/*     */ 
/*     */   
/* 366 */   public void setUploadId(String uploadId) { this.uploadId = (uploadId == null) ? null : uploadId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 370 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/* 374 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 378 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 382 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 386 */   public String getRecordFile() { return this.recordFile; }
/*     */ 
/*     */ 
/*     */   
/* 390 */   public void setRecordFile(String recordFile) { this.recordFile = (recordFile == null) ? null : recordFile.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 394 */   public String getResolveFile() { return this.resolveFile; }
/*     */ 
/*     */ 
/*     */   
/* 398 */   public void setResolveFile(String resolveFile) { this.resolveFile = (resolveFile == null) ? null : resolveFile.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 402 */   public String getAgentId() { return this.agentId; }
/*     */ 
/*     */ 
/*     */   
/* 406 */   public void setAgentId(String agentId) { this.agentId = (agentId == null) ? null : agentId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 410 */   public String getConsumerName() { return this.consumerName; }
/*     */ 
/*     */ 
/*     */   
/* 414 */   public void setConsumerName(String consumerName) { this.consumerName = (consumerName == null) ? null : consumerName.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 418 */   public String getConsumerCertificateType() { return this.consumerCertificateType; }
/*     */ 
/*     */ 
/*     */   
/* 422 */   public void setConsumerCertificateType(String consumerCertificateType) { this.consumerCertificateType = (consumerCertificateType == null) ? null : consumerCertificateType.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 426 */   public String getConsumerCertificateNumber() { return this.consumerCertificateNumber; }
/*     */ 
/*     */ 
/*     */   
/* 430 */   public void setConsumerCertificateNumber(String consumerCertificateNumber) { this.consumerCertificateNumber = (consumerCertificateNumber == null) ? null : consumerCertificateNumber.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 434 */   public Date getStartTime() { return this.startTime; }
/*     */ 
/*     */ 
/*     */   
/* 438 */   public void setStartTime(Date startTime) { this.startTime = startTime; }
/*     */ 
/*     */ 
/*     */   
/* 442 */   public Date getEndTime() { return this.endTime; }
/*     */ 
/*     */ 
/*     */   
/* 446 */   public void setEndTime(Date endTime) { this.endTime = endTime; }
/*     */ 
/*     */ 
/*     */   
/* 450 */   public Integer getRecordDuration() { return this.recordDuration; }
/*     */ 
/*     */ 
/*     */   
/* 454 */   public void setRecordDuration(Integer recordDuration) { this.recordDuration = recordDuration; }
/*     */ 
/*     */ 
/*     */   
/* 458 */   public Integer getMuteDuration() { return this.muteDuration; }
/*     */ 
/*     */ 
/*     */   
/* 462 */   public void setMuteDuration(Integer muteDuration) { this.muteDuration = muteDuration; }
/*     */ 
/*     */ 
/*     */   
/* 466 */   public Integer getMuteTimes() { return this.muteTimes; }
/*     */ 
/*     */ 
/*     */   
/* 470 */   public void setMuteTimes(Integer muteTimes) { this.muteTimes = muteTimes; }
/*     */ 
/*     */ 
/*     */   
/* 474 */   public Integer getRepeatTimes() { return this.repeatTimes; }
/*     */ 
/*     */ 
/*     */   
/* 478 */   public void setRepeatTimes(Integer repeatTimes) { this.repeatTimes = repeatTimes; }
/*     */ 
/*     */ 
/*     */   
/* 482 */   public Integer getStatementNumber() { return this.statementNumber; }
/*     */ 
/*     */ 
/*     */   
/* 486 */   public void setStatementNumber(Integer statementNumber) { this.statementNumber = statementNumber; }
/*     */ 
/*     */ 
/*     */   
/* 490 */   public Integer getAgentSayNumber() { return this.agentSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 494 */   public void setAgentSayNumber(Integer agentSayNumber) { this.agentSayNumber = agentSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 498 */   public Integer getConsumerSayNumber() { return this.consumerSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 502 */   public void setConsumerSayNumber(Integer consumerSayNumber) { this.consumerSayNumber = consumerSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 506 */   public Integer getAgentMoodGood() { return this.agentMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 510 */   public void setAgentMoodGood(Integer agentMoodGood) { this.agentMoodGood = agentMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 514 */   public Integer getAgentMoodBad() { return this.agentMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 518 */   public void setAgentMoodBad(Integer agentMoodBad) { this.agentMoodBad = agentMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 522 */   public Integer getConsumerMoodGood() { return this.consumerMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 526 */   public void setConsumerMoodGood(Integer consumerMoodGood) { this.consumerMoodGood = consumerMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 530 */   public Integer getConsumerMoodBad() { return this.consumerMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 534 */   public void setConsumerMoodBad(Integer consumerMoodBad) { this.consumerMoodBad = consumerMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 538 */   public String getCallInfo() { return this.callInfo; }
/*     */ 
/*     */ 
/*     */   
/* 542 */   public void setCallInfo(String callInfo) { this.callInfo = (callInfo == null) ? null : callInfo.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 546 */   public String getAgentCallInfo() { return this.agentCallInfo; }
/*     */ 
/*     */ 
/*     */   
/* 550 */   public void setAgentCallInfo(String agentCallInfo) { this.agentCallInfo = (agentCallInfo == null) ? null : agentCallInfo.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 554 */   public String getConsumerCallInfo() { return this.consumerCallInfo; }
/*     */ 
/*     */ 
/*     */   
/* 558 */   public void setConsumerCallInfo(String consumerCallInfo) { this.consumerCallInfo = (consumerCallInfo == null) ? null : consumerCallInfo.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 562 */   public Double getMutoRatio() { return this.mutoRatio; }
/*     */ 
/*     */ 
/*     */   
/* 566 */   public void setMutoRatio(Double mutoRatio) { this.mutoRatio = mutoRatio; }
/*     */ 
/*     */ 
/*     */   
/* 570 */   public Integer getCallType() { return this.callType; }
/*     */ 
/*     */ 
/*     */   
/* 574 */   public void setCallType(Integer callType) { this.callType = callType; }
/*     */ 
/*     */ 
/*     */   
/* 578 */   public String getRemoteUri() { return this.remoteUri; }
/*     */ 
/*     */ 
/*     */   
/* 582 */   public void setRemoteUri(String remoteUri) { this.remoteUri = (remoteUri == null) ? null : remoteUri.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 586 */   public String getLocalUri() { return this.localUri; }
/*     */ 
/*     */ 
/*     */   
/* 590 */   public void setLocalUri(String localUri) { this.localUri = (localUri == null) ? null : localUri.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 594 */   public String getDeviceNumber() { return this.deviceNumber; }
/*     */ 
/*     */ 
/*     */   
/* 598 */   public void setDeviceNumber(String deviceNumber) { this.deviceNumber = (deviceNumber == null) ? null : deviceNumber.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 602 */   public String getDeviceName() { return this.deviceName; }
/*     */ 
/*     */ 
/*     */   
/* 606 */   public void setDeviceName(String deviceName) { this.deviceName = (deviceName == null) ? null : deviceName.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\doc\BaseData2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */