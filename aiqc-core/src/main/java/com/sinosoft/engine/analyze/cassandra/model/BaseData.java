package com.sinosoft.engine.analyze.cassandra.model;

import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table("yyzj_t_base_data")
public class BaseData {
    @PrimaryKey("base_Id")
    private String baseId;
    @Column("audio_code")
    private String audioCode;
    @Column("upload_id")
    private String uploadId;
    @Column("sys_id")
    private String sysId;
    @Column("create_time")
    private Date createTime;
    @Column("record_file")
    private String recordFile;
    @Column("resolve_file")
    private String resolveFile;
    @Column("agent_id")
    private String agentId;
    @Column("consumer_name")
    private String consumerName;
    @Column("consumer_certificate_type")
    private String consumerCertificateType;
    @Column("consumer_certificate_number")
    private String consumerCertificateNumber;
    @Column("start_time")
    private Date startTime;
    @Column("end_time")
    private Date endTime;
    @Column("record_duration")
    private Integer recordDuration = Integer.valueOf(-1);
    @Column("mute_duration")
    private Integer muteDuration = Integer.valueOf(-1);
    @Column("mute_times")
    private Integer muteTimes = Integer.valueOf(-1);
    @Column("repeat_times")
    private Integer repeatTimes = Integer.valueOf(-1);
    @Column("statement_number")
    private Integer statementNumber = Integer.valueOf(-1);
    @Column("agent_say_number")
    private Integer agentSayNumber = Integer.valueOf(-1);
    @Column("consumer_say_number")
    private Integer consumerSayNumber = Integer.valueOf(-1);
    @Column("agent_mood_good")
    private Integer agentMoodGood = Integer.valueOf(-1);
    @Column("agent_mood_bad")
    private Integer agentMoodBad = Integer.valueOf(-1);
    @Column("consumer_mood_good")
    private Integer consumerMoodGood = Integer.valueOf(-1);
    @Column("consumer_mood_bad")
    private Integer consumerMoodBad = Integer.valueOf(-1);

    @Column("call_info")
    private String callInfo;

    @Column("agent_call_info")
    private String agentCallInfo;

    @Column("consumer_call_info")
    private String consumerCallInfo;
    @Column("muto_ratio")
    private Double mutoRatio;
    @Column("call_type")
    private Integer callType = Integer.valueOf(-1);

    @Column("remote_uri")
    private String remoteUri;

    @Column("local_uri")
    private String localUri;

    @Column("device_number")
    private String deviceNumber;

    @Column("device_name")
    private String deviceName;

    @Column("quality_user_id")
    private String qualityUserId;

    @Column("agent_record_duration")
    private Integer agentRecordDuration;

    @Column("consumer_record_duration")
    private Integer consumerRecordDuration;

    @Column("agent_mute_duration")
    private Integer agentMuteDuration;

    @Column("consumer_mute_duration")
    private Integer consumerMuteDuration;

    @Column("agent_mood_good_time")
    private Float agentMoodGoodTime;

    @Column("agent_mood_bad_time")
    private Float agentMoodBadTime;

    @Column("consumer_mood_good_time")
    private Float consumerMoodGoodTime;

    @Column("consumer_mood_bad_time")
    private Float consumerMoodBadTime;

    @Column("agent_speed")
    private Float agentSpeed;
    @Column("consumer_speed")
    private Float consumerSpeed;
    @Column("mute_info")
    private String muteInfo;
    @Column("repeat_info")
    private String repeatInfo;
    @Column("mood_file")
    private String moodFile;
    @Column("sequence_num")
    private Long sequenceNum;
    @Column("sys_id_bak")
    private String sysIdBak;
    @Column("categories")
    private String categories;
    @Transient
    private Integer durationMin;
    @Transient
    private Integer durationMax;

    public Integer getDurationMin() {
        return this.durationMin;
    }


    public void setDurationMin(Integer durationMin) {
        this.durationMin = durationMin;
    }


    public Integer getDurationMax() {
        return this.durationMax;
    }


    public void setDurationMax(Integer durationMax) {
        this.durationMax = durationMax;
    }


    public String getCategories() {
        return this.categories;
    }


    public void setCategories(String categories) {
        this.categories = categories;
    }


    public Float getAgentMoodGoodTime() {
        return this.agentMoodGoodTime;
    }


    public void setAgentMoodGoodTime(Float agentMoodGoodTime) {
        this.agentMoodGoodTime = agentMoodGoodTime;
    }


    public Float getAgentMoodBadTime() {
        return this.agentMoodBadTime;
    }


    public void setAgentMoodBadTime(Float agentMoodBadTime) {
        this.agentMoodBadTime = agentMoodBadTime;
    }


    public Float getConsumerMoodGoodTime() {
        return this.consumerMoodGoodTime;
    }


    public void setConsumerMoodGoodTime(Float consumerMoodGoodTime) {
        this.consumerMoodGoodTime = consumerMoodGoodTime;
    }


    public Float getConsumerMoodBadTime() {
        return this.consumerMoodBadTime;
    }


    public void setConsumerMoodBadTime(Float consumerMoodBadTime) {
        this.consumerMoodBadTime = consumerMoodBadTime;
    }


    public String getMoodFile() {
        return this.moodFile;
    }


    public void setMoodFile(String moodFile) {
        this.moodFile = moodFile;
    }


    public String getRepeatInfo() {
        return this.repeatInfo;
    }


    public void setRepeatInfo(String repeatInfo) {
        this.repeatInfo = repeatInfo;
    }


    public String getMuteInfo() {
        return this.muteInfo;
    }


    public void setMuteInfo(String muteInfo) {
        this.muteInfo = muteInfo;
    }


    public Integer getAgentRecordDuration() {
        return this.agentRecordDuration;
    }


    public void setAgentRecordDuration(Integer agentRecordDuration) {
        this.agentRecordDuration = agentRecordDuration;
    }


    public Integer getConsumerRecordDuration() {
        return this.consumerRecordDuration;
    }


    public void setConsumerRecordDuration(Integer consumerRecordDuration) {
        this.consumerRecordDuration = consumerRecordDuration;
    }


    public Integer getAgentMuteDuration() {
        return this.agentMuteDuration;
    }


    public void setAgentMuteDuration(Integer agentMuteDuration) {
        this.agentMuteDuration = agentMuteDuration;
    }


    public Integer getConsumerMuteDuration() {
        return this.consumerMuteDuration;
    }


    public void setConsumerMuteDuration(Integer consumerMuteDuration) {
        this.consumerMuteDuration = consumerMuteDuration;
    }


    public Float getAgentSpeed() {
        return this.agentSpeed;
    }


    public void setAgentSpeed(Float agentSpeed) {
        this.agentSpeed = agentSpeed;
    }


    public Float getConsumerSpeed() {
        return this.consumerSpeed;
    }


    public void setConsumerSpeed(Float consumerSpeed) {
        this.consumerSpeed = consumerSpeed;
    }


    public String getSysIdBak() {
        return this.sysIdBak;
    }


    public void setSysIdBak(String sysIdBak) {
        this.sysIdBak = sysIdBak;
    }


    public Long getSequenceNum() {
        return this.sequenceNum;
    }


    public void setSequenceNum(Long sequenceNum) {
        this.sequenceNum = sequenceNum;
    }


    public String getQualityUserId() {
        return this.qualityUserId;
    }


    public void setQualityUserId(String qualityUserId) {
        this.qualityUserId = qualityUserId;
    }


    public String getBaseId() {
        return this.baseId;
    }


    public void setBaseId(String baseId) {
        this.baseId = (baseId == null) ? null : baseId.trim();
    }


    public String getAudioCode() {
        return this.audioCode;
    }


    public void setAudioCode(String audioCode) {
        this.audioCode = (audioCode == null) ? null : audioCode.trim();
    }


    public String getUploadId() {
        return this.uploadId;
    }


    public void setUploadId(String uploadId) {
        this.uploadId = (uploadId == null) ? null : uploadId.trim();
    }


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = (sysId == null) ? null : sysId.trim();
    }


    public Date getCreateTime() {
        return this.createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getRecordFile() {
        return this.recordFile;
    }


    public void setRecordFile(String recordFile) {
        this.recordFile = (recordFile == null) ? null : recordFile.trim();
    }


    public String getResolveFile() {
        return this.resolveFile;
    }


    public void setResolveFile(String resolveFile) {
        this.resolveFile = (resolveFile == null) ? null : resolveFile.trim();
    }


    public String getAgentId() {
        return this.agentId;
    }


    public void setAgentId(String agentId) {
        this.agentId = (agentId == null) ? null : agentId.trim();
    }


    public String getConsumerName() {
        return this.consumerName;
    }


    public void setConsumerName(String consumerName) {
        this.consumerName = (consumerName == null) ? null : consumerName.trim();
    }


    public String getConsumerCertificateType() {
        return this.consumerCertificateType;
    }


    public void setConsumerCertificateType(String consumerCertificateType) {
        this.consumerCertificateType = (consumerCertificateType == null) ? null : consumerCertificateType.trim();
    }


    public String getConsumerCertificateNumber() {
        return this.consumerCertificateNumber;
    }


    public void setConsumerCertificateNumber(String consumerCertificateNumber) {
        this.consumerCertificateNumber = (consumerCertificateNumber == null) ? null : consumerCertificateNumber.trim();
    }


    public Date getStartTime() {
        return this.startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public Date getEndTime() {
        return this.endTime;
    }


    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }


    public Integer getRecordDuration() {
        return this.recordDuration;
    }


    public void setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
    }


    public Integer getMuteDuration() {
        return this.muteDuration;
    }


    public void setMuteDuration(Integer muteDuration) {
        this.muteDuration = muteDuration;
    }


    public Integer getMuteTimes() {
        return this.muteTimes;
    }


    public void setMuteTimes(Integer muteTimes) {
        this.muteTimes = muteTimes;
    }


    public Integer getRepeatTimes() {
        return this.repeatTimes;
    }


    public void setRepeatTimes(Integer repeatTimes) {
        this.repeatTimes = repeatTimes;
    }


    public Integer getStatementNumber() {
        return this.statementNumber;
    }


    public void setStatementNumber(Integer statementNumber) {
        this.statementNumber = statementNumber;
    }


    public Integer getAgentSayNumber() {
        return this.agentSayNumber;
    }


    public void setAgentSayNumber(Integer agentSayNumber) {
        this.agentSayNumber = agentSayNumber;
    }


    public Integer getConsumerSayNumber() {
        return this.consumerSayNumber;
    }


    public void setConsumerSayNumber(Integer consumerSayNumber) {
        this.consumerSayNumber = consumerSayNumber;
    }


    public Integer getAgentMoodGood() {
        return this.agentMoodGood;
    }


    public void setAgentMoodGood(Integer agentMoodGood) {
        this.agentMoodGood = agentMoodGood;
    }


    public Integer getAgentMoodBad() {
        return this.agentMoodBad;
    }


    public void setAgentMoodBad(Integer agentMoodBad) {
        this.agentMoodBad = agentMoodBad;
    }


    public Integer getConsumerMoodGood() {
        return this.consumerMoodGood;
    }


    public void setConsumerMoodGood(Integer consumerMoodGood) {
        this.consumerMoodGood = consumerMoodGood;
    }


    public Integer getConsumerMoodBad() {
        return this.consumerMoodBad;
    }


    public void setConsumerMoodBad(Integer consumerMoodBad) {
        this.consumerMoodBad = consumerMoodBad;
    }


    public String getCallInfo() {
        return this.callInfo;
    }


    public void setCallInfo(String callInfo) {
        this.callInfo = (callInfo == null) ? null : callInfo.trim();
    }


    public String getAgentCallInfo() {
        return this.agentCallInfo;
    }


    public void setAgentCallInfo(String agentCallInfo) {
        this.agentCallInfo = (agentCallInfo == null) ? null : agentCallInfo.trim();
    }


    public String getConsumerCallInfo() {
        return this.consumerCallInfo;
    }


    public void setConsumerCallInfo(String consumerCallInfo) {
        this.consumerCallInfo = (consumerCallInfo == null) ? null : consumerCallInfo.trim();
    }


    public Double getMutoRatio() {
        return this.mutoRatio;
    }


    public void setMutoRatio(Double mutoRatio) {
        this.mutoRatio = mutoRatio;
    }


    public Integer getCallType() {
        return this.callType;
    }


    public void setCallType(Integer callType) {
        this.callType = callType;
    }


    public String getRemoteUri() {
        return this.remoteUri;
    }


    public void setRemoteUri(String remoteUri) {
        this.remoteUri = (remoteUri == null) ? null : remoteUri.trim();
    }


    public String getLocalUri() {
        return this.localUri;
    }


    public void setLocalUri(String localUri) {
        this.localUri = (localUri == null) ? null : localUri.trim();
    }


    public String getDeviceNumber() {
        return this.deviceNumber;
    }


    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = (deviceNumber == null) ? null : deviceNumber.trim();
    }


    public String getDeviceName() {
        return this.deviceName;
    }


    public void setDeviceName(String deviceName) {
        this.deviceName = (deviceName == null) ? null : deviceName.trim();
    }
}


