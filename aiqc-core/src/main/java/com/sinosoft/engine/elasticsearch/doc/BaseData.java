/*     */ package com.sinosoft.engine.elasticsearch.doc;
/*     */ 
/*     */ import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Document(indexName = "", indexStoreType = "memory", shards = 3, replicas = 0, refreshInterval = "-1")
/*     */ public class BaseData
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
/*     */   private Integer recordDuration;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer muteDuration;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer muteTimes;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer repeatTimes;
/*     */   @Field(index = true, store = true)
/*     */   private Integer statementNumber;
/*     */   @Field(index = true, store = true)
/*     */   private Integer agentSayNumber;
/*     */   @Field(index = true, store = true)
/*     */   private Integer consumerSayNumber;
/*     */   @Field(index = true, store = true)
/*     */   private Integer agentMoodGood;
/*     */   @Field(index = true, store = true)
/*     */   private Integer agentMoodBad;
/*     */   @Field(index = true, store = true)
/*     */   private Integer consumerMoodGood;
/*     */   @Field(index = true, store = true)
/*     */   private Integer consumerMoodBad;
/*     */   @Field(analyzer = "ik", searchAnalyzer = "ik", store = true)
/*     */   private String callInfo;
/*     */   @Field(analyzer = "ik", searchAnalyzer = "ik", store = true)
/*     */   private String agentCallInfo;
/*     */   @Field(analyzer = "ik", searchAnalyzer = "ik", store = true)
/*     */   private String consumerCallInfo;
/*     */   @Field(index = true, store = true)
/*     */   private Double mutoRatio;
/*     */   @Field(index = true, store = true)
/*     */   private Integer callType;
/*     */   @Field(index = true, store = true)
/*     */   private String remoteUri;
/*     */   @Field(index = true, store = true)
/*     */   private String localUri;
/*     */   @Field(index = true, store = true)
/*     */   private String deviceNumber;
/*     */   @Field(index = true, store = true)
/*     */   private String deviceName;
/*     */   @Field(index = true, store = true)
/*     */   private String qualityUserId;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer agentRecordDuration;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer consumerRecordDuration;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer agentMuteDuration;
/*     */   @Field(type = FieldType.Integer, index = true, store = true)
/*     */   private Integer consumerMuteDuration;
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float agentMoodGoodTime;
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float agentMoodBadTime;
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float consumerMoodGoodTime;
/*     */   @Field(type = FieldType.Float, index = true, store = true)
/*     */   private Float consumerMoodBadTime;
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
/* 134 */   public Object getDimension() { return this.dimension; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 139 */   public String getCategories() { return this.categories; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 145 */   public void setCategories(String categories) { this.categories = categories; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 151 */   public String getDateTag() { return this.dateTag; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 157 */   public void setDateTag(String dateTag) { this.dateTag = dateTag; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 163 */   public void setDimension(String dimension) { this.dimension = dimension; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 169 */   public Float getAgentMoodGoodTime() { return this.agentMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 174 */   public void setAgentMoodGoodTime(Float agentMoodGoodTime) { this.agentMoodGoodTime = agentMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 179 */   public Float getAgentMoodBadTime() { return this.agentMoodBadTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 184 */   public void setAgentMoodBadTime(Float agentMoodBadTime) { this.agentMoodBadTime = agentMoodBadTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 189 */   public Float getConsumerMoodGoodTime() { return this.consumerMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 194 */   public void setConsumerMoodGoodTime(Float consumerMoodGoodTime) { this.consumerMoodGoodTime = consumerMoodGoodTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 199 */   public Float getConsumerMoodBadTime() { return this.consumerMoodBadTime; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 204 */   public void setConsumerMoodBadTime(Float consumerMoodBadTime) { this.consumerMoodBadTime = consumerMoodBadTime; }
/*     */ 
/*     */ 
/*     */   
/* 208 */   public String getMoodFile() { return this.moodFile; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 213 */   public void setMoodFile(String moodFile) { this.moodFile = moodFile; }
/*     */ 
/*     */ 
/*     */   
/* 217 */   public String getRepeatInfo() { return this.repeatInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 222 */   public void setRepeatInfo(String repeatInfo) { this.repeatInfo = repeatInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 227 */   public String getMuteInfo() { return this.muteInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 232 */   public void setMuteInfo(String muteInfo) { this.muteInfo = muteInfo; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 237 */   public Integer getAgentRecordDuration() { return this.agentRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 242 */   public void setAgentRecordDuration(Integer agentRecordDuration) { this.agentRecordDuration = agentRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 247 */   public Integer getConsumerRecordDuration() { return this.consumerRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 252 */   public void setConsumerRecordDuration(Integer consumerRecordDuration) { this.consumerRecordDuration = consumerRecordDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 257 */   public Integer getAgentMuteDuration() { return this.agentMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 262 */   public void setAgentMuteDuration(Integer agentMuteDuration) { this.agentMuteDuration = agentMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 267 */   public Integer getConsumerMuteDuration() { return this.consumerMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 272 */   public void setConsumerMuteDuration(Integer consumerMuteDuration) { this.consumerMuteDuration = consumerMuteDuration; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 279 */   public Float getAgentSpeed() { return this.agentSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 284 */   public void setAgentSpeed(Float agentSpeed) { this.agentSpeed = agentSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 289 */   public Float getConsumerSpeed() { return this.consumerSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 294 */   public void setConsumerSpeed(Float consumerSpeed) { this.consumerSpeed = consumerSpeed; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 299 */   public String getSysIdBak() { return this.sysIdBak; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 304 */   public void setSysIdBak(String sysIdBak) { this.sysIdBak = sysIdBak; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 311 */   public Long getSequenceNum() { return this.sequenceNum; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 321 */   public void setSequenceNum(Long sequenceNum) { this.sequenceNum = sequenceNum; }
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
/* 339 */   public String getQualityUserId() { return this.qualityUserId; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 344 */   public void setQualityUserId(String qualityUserId) { this.qualityUserId = qualityUserId; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 349 */   public String getBaseId() { return this.baseId; }
/*     */ 
/*     */ 
/*     */   
/* 353 */   public void setBaseId(String baseId) { this.baseId = (baseId == null) ? null : baseId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 357 */   public String getAudioCode() { return this.audioCode; }
/*     */ 
/*     */ 
/*     */   
/* 361 */   public void setAudioCode(String audioCode) { this.audioCode = (audioCode == null) ? null : audioCode.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 365 */   public String getUploadId() { return this.uploadId; }
/*     */ 
/*     */ 
/*     */   
/* 369 */   public void setUploadId(String uploadId) { this.uploadId = (uploadId == null) ? null : uploadId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 373 */   public String getSysId() { return this.sysId; }
/*     */ 
/*     */ 
/*     */   
/* 377 */   public void setSysId(String sysId) { this.sysId = (sysId == null) ? null : sysId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 381 */   public Date getCreateTime() { return this.createTime; }
/*     */ 
/*     */ 
/*     */   
/* 385 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }
/*     */ 
/*     */ 
/*     */   
/* 389 */   public String getRecordFile() { return this.recordFile; }
/*     */ 
/*     */ 
/*     */   
/* 393 */   public void setRecordFile(String recordFile) { this.recordFile = (recordFile == null) ? null : recordFile.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 397 */   public String getResolveFile() { return this.resolveFile; }
/*     */ 
/*     */ 
/*     */   
/* 401 */   public void setResolveFile(String resolveFile) { this.resolveFile = (resolveFile == null) ? null : resolveFile.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 405 */   public String getAgentId() { return this.agentId; }
/*     */ 
/*     */ 
/*     */   
/* 409 */   public void setAgentId(String agentId) { this.agentId = (agentId == null) ? null : agentId.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 413 */   public String getConsumerName() { return this.consumerName; }
/*     */ 
/*     */ 
/*     */   
/* 417 */   public void setConsumerName(String consumerName) { this.consumerName = (consumerName == null) ? null : consumerName.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 421 */   public String getConsumerCertificateType() { return this.consumerCertificateType; }
/*     */ 
/*     */ 
/*     */   
/* 425 */   public void setConsumerCertificateType(String consumerCertificateType) { this.consumerCertificateType = (consumerCertificateType == null) ? null : consumerCertificateType.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 429 */   public String getConsumerCertificateNumber() { return this.consumerCertificateNumber; }
/*     */ 
/*     */ 
/*     */   
/* 433 */   public void setConsumerCertificateNumber(String consumerCertificateNumber) { this.consumerCertificateNumber = (consumerCertificateNumber == null) ? null : consumerCertificateNumber.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 437 */   public Date getStartTime() { return this.startTime; }
/*     */ 
/*     */ 
/*     */   
/* 441 */   public void setStartTime(Date startTime) { this.startTime = startTime; }
/*     */ 
/*     */ 
/*     */   
/* 445 */   public Date getEndTime() { return this.endTime; }
/*     */ 
/*     */ 
/*     */   
/* 449 */   public void setEndTime(Date endTime) { this.endTime = endTime; }
/*     */ 
/*     */ 
/*     */   
/* 453 */   public Integer getRecordDuration() { return this.recordDuration; }
/*     */ 
/*     */ 
/*     */   
/* 457 */   public void setRecordDuration(Integer recordDuration) { this.recordDuration = recordDuration; }
/*     */ 
/*     */ 
/*     */   
/* 461 */   public Integer getMuteDuration() { return this.muteDuration; }
/*     */ 
/*     */ 
/*     */   
/* 465 */   public void setMuteDuration(Integer muteDuration) { this.muteDuration = muteDuration; }
/*     */ 
/*     */ 
/*     */   
/* 469 */   public Integer getMuteTimes() { return this.muteTimes; }
/*     */ 
/*     */ 
/*     */   
/* 473 */   public void setMuteTimes(Integer muteTimes) { this.muteTimes = muteTimes; }
/*     */ 
/*     */ 
/*     */   
/* 477 */   public Integer getRepeatTimes() { return this.repeatTimes; }
/*     */ 
/*     */ 
/*     */   
/* 481 */   public void setRepeatTimes(Integer repeatTimes) { this.repeatTimes = repeatTimes; }
/*     */ 
/*     */ 
/*     */   
/* 485 */   public Integer getStatementNumber() { return this.statementNumber; }
/*     */ 
/*     */ 
/*     */   
/* 489 */   public void setStatementNumber(Integer statementNumber) { this.statementNumber = statementNumber; }
/*     */ 
/*     */ 
/*     */   
/* 493 */   public Integer getAgentSayNumber() { return this.agentSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 497 */   public void setAgentSayNumber(Integer agentSayNumber) { this.agentSayNumber = agentSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 501 */   public Integer getConsumerSayNumber() { return this.consumerSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 505 */   public void setConsumerSayNumber(Integer consumerSayNumber) { this.consumerSayNumber = consumerSayNumber; }
/*     */ 
/*     */ 
/*     */   
/* 509 */   public Integer getAgentMoodGood() { return this.agentMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 513 */   public void setAgentMoodGood(Integer agentMoodGood) { this.agentMoodGood = agentMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 517 */   public Integer getAgentMoodBad() { return this.agentMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 521 */   public void setAgentMoodBad(Integer agentMoodBad) { this.agentMoodBad = agentMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 525 */   public Integer getConsumerMoodGood() { return this.consumerMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 529 */   public void setConsumerMoodGood(Integer consumerMoodGood) { this.consumerMoodGood = consumerMoodGood; }
/*     */ 
/*     */ 
/*     */   
/* 533 */   public Integer getConsumerMoodBad() { return this.consumerMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 537 */   public void setConsumerMoodBad(Integer consumerMoodBad) { this.consumerMoodBad = consumerMoodBad; }
/*     */ 
/*     */ 
/*     */   
/* 541 */   public String getCallInfo() { return this.callInfo; }
/*     */ 
/*     */ 
/*     */   
/* 545 */   public void setCallInfo(String callInfo) { this.callInfo = (callInfo == null) ? null : callInfo.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 549 */   public String getAgentCallInfo() { return this.agentCallInfo; }
/*     */ 
/*     */ 
/*     */   
/* 553 */   public void setAgentCallInfo(String agentCallInfo) { this.agentCallInfo = (agentCallInfo == null) ? null : agentCallInfo.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 557 */   public String getConsumerCallInfo() { return this.consumerCallInfo; }
/*     */ 
/*     */ 
/*     */   
/* 561 */   public void setConsumerCallInfo(String consumerCallInfo) { this.consumerCallInfo = (consumerCallInfo == null) ? null : consumerCallInfo.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 565 */   public Double getMutoRatio() { return this.mutoRatio; }
/*     */ 
/*     */ 
/*     */   
/* 569 */   public void setMutoRatio(Double mutoRatio) { this.mutoRatio = mutoRatio; }
/*     */ 
/*     */ 
/*     */   
/* 573 */   public Integer getCallType() { return this.callType; }
/*     */ 
/*     */ 
/*     */   
/* 577 */   public void setCallType(Integer callType) { this.callType = callType; }
/*     */ 
/*     */ 
/*     */   
/* 581 */   public String getRemoteUri() { return this.remoteUri; }
/*     */ 
/*     */ 
/*     */   
/* 585 */   public void setRemoteUri(String remoteUri) { this.remoteUri = (remoteUri == null) ? null : remoteUri.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 589 */   public String getLocalUri() { return this.localUri; }
/*     */ 
/*     */ 
/*     */   
/* 593 */   public void setLocalUri(String localUri) { this.localUri = (localUri == null) ? null : localUri.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 597 */   public String getDeviceNumber() { return this.deviceNumber; }
/*     */ 
/*     */ 
/*     */   
/* 601 */   public void setDeviceNumber(String deviceNumber) { this.deviceNumber = (deviceNumber == null) ? null : deviceNumber.trim(); }
/*     */ 
/*     */ 
/*     */   
/* 605 */   public String getDeviceName() { return this.deviceName; }
/*     */ 
/*     */ 
/*     */   
/* 609 */   public void setDeviceName(String deviceName) { this.deviceName = (deviceName == null) ? null : deviceName.trim(); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\doc\BaseData.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */