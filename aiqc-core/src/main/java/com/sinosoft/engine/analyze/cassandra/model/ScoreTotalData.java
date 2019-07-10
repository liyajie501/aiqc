package com.sinosoft.engine.analyze.cassandra.model;


import com.sinosoft.engine.analyze.cassandra.java.PageInfoBean;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;


@Table("yyzj_t_score_total_data")
public class ScoreTotalData implements PageInfoBean {
    @PrimaryKey("score_total_data_id")
    private String scoreTotalDataId;
    @Column("time_flag")
    private String timeFlag;
    @Column("base_Id")
    private String baseId;
    @Column("total_score_id")
    private String totalScoreId;
    @Column("create_time")
    private Date createTime;
    @Column("total_score")
    private Double totalScore;
    @Column("sys_id")
    private String sysId;
    @Column("agent_id")
    private String agentId;
    @Column("start_time")
    private Date startTime;
    @Column("end_time")
    private Date endTime;
    @Column("record_duration")
    private Integer recordDuration;
    @Column("statement_number")
    private Integer statementNumber;
    @Column("call_type")
    private Integer callType;
    @Column("remote_uri")
    private String remoteUri;
    @Column("local_uri")
    private String localUri;
    @Column("audio_code")
    private String audioCode;
    @Column("total_score_result_id")
    private String totalScoreResultId;
    @Column("record_file")
    private String recordFile;
    @Column("sequence_num")
    private Long sequenceNum;
    @Column("sys_id_bak")
    private String sysIdBak;

    public String getTotalScoreResultId() {
        this.totalScoreResultId = this.totalScoreId;
        return this.totalScoreResultId;
    }


    public void setTotalScoreResultId(String totalScoreResultId) {
        this.totalScoreResultId = totalScoreResultId;
    }


    public String getTimeFlag() {
        return this.timeFlag;
    }


    public void setTimeFlag(String timeFlag) {
        this.timeFlag = timeFlag;
    }


    public String getRecordFile() {
        return this.recordFile;
    }


    public void setRecordFile(String recordFile) {
        this.recordFile = recordFile;
    }


    public String getAudioCode() {
        return this.audioCode;
    }


    public void setAudioCode(String audioCode) {
        this.audioCode = audioCode;
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


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = sysId;
    }


    public String getAgentId() {
        return this.agentId;
    }


    public void setAgentId(String agentId) {
        this.agentId = agentId;
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


    public Integer getStatementNumber() {
        return this.statementNumber;
    }


    public void setStatementNumber(Integer statementNumber) {
        this.statementNumber = statementNumber;
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
        this.remoteUri = remoteUri;
    }


    public String getLocalUri() {
        return this.localUri;
    }


    public void setLocalUri(String localUri) {
        this.localUri = localUri;
    }


    public String getScoreTotalDataId() {
        return this.scoreTotalDataId;
    }


    public void setScoreTotalDataId(String scoreTotalDataId) {
        this.scoreTotalDataId = (scoreTotalDataId == null) ? null : scoreTotalDataId.trim();
    }


    public String getBaseId() {
        return this.baseId;
    }


    public void setBaseId(String baseId) {
        this.baseId = (baseId == null) ? null : baseId.trim();
    }


    public String getTotalScoreId() {
        return this.totalScoreId;
    }


    public void setTotalScoreId(String totalScoreId) {
        this.totalScoreId = (totalScoreId == null) ? null : totalScoreId.trim();
    }


    public Date getCreateTime() {
        return this.createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Double getTotalScore() {
        return this.totalScore;
    }


    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }
}


