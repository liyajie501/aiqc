package com.sinosoft.engine.analyze.cassandra.model;


import com.sinosoft.engine.analyze.model.AnalyzeResult;
import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;


@Table("yyzj_t_score_detail_data")
public class ScoreDetailData {
    @PrimaryKey("score_detail_data_id")
    private String scoreDetailDataId;
    @Column("detail_score_id")
    private String detailScoreId;
    @Column("score_total_data_id")
    private String scoreTotalDataId;
    @Column("create_time")
    private Date createTime;
    @Column("rule_exec_result")
    private String ruleExecResult;
    @Column("detail_score")
    private Double detailScore;
    @Column("total_score_result_id")
    private String totalScoreResultId;
    @Column("base_id")
    private String baseId;
    @Column("record_file")
    private String recordFile;
    @Column("agent_id")
    private String agentId;
    @Column("consumer_num")
    private String consumerNum;
    @Column("start_time")
    private Date startTime;
    @Column("record_duration")
    private Integer recordDuration;
    @Column("agent_group_id")
    private String agentGroupId;
    @Column("rule_id")
    private String ruleId;
    @Column("is_error")
    private String isError;
    @Transient
    private AnalyzeResult analyzeResult;

    public String getTotalScoreResultId() {
        return this.totalScoreResultId;
    }


    public void setTotalScoreResultId(String totalScoreResultId) {
        this.totalScoreResultId = totalScoreResultId;
    }


    public String getBaseId() {
        return this.baseId;
    }


    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }


    public String getAgentId() {
        return this.agentId;
    }


    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }


    public String getConsumerNum() {
        return this.consumerNum;
    }


    public void setConsumerNum(String consumerNum) {
        this.consumerNum = consumerNum;
    }


    public Date getStartTime() {
        return this.startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public String getRecordFile() {
        return this.recordFile;
    }


    public void setRecordFile(String recordFile) {
        this.recordFile = recordFile;
    }


    public Integer getRecordDuration() {
        return this.recordDuration;
    }


    public void setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
    }


    public String getAgentGroupId() {
        return this.agentGroupId;
    }


    public void setAgentGroupId(String agentGroupId) {
        this.agentGroupId = agentGroupId;
    }


    public String getIsError() {
        return this.isError;
    }


    public void setIsError(String isError) {
        this.isError = isError;
    }


    public String getRuleId() {
        return this.ruleId;
    }


    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }


    public AnalyzeResult getAnalyzeResult() {
        return this.analyzeResult;
    }


    public void setAnalyzeResult(AnalyzeResult analyzeResult) {
        this.analyzeResult = analyzeResult;
    }


    public String getScoreDetailDataId() {
        return this.scoreDetailDataId;
    }


    public void setScoreDetailDataId(String scoreDetailDataId) {
        this.scoreDetailDataId = (scoreDetailDataId == null) ? null : scoreDetailDataId.trim();
    }


    public String getDetailScoreId() {
        return this.detailScoreId;
    }


    public void setDetailScoreId(String detailScoreId) {
        this.detailScoreId = (detailScoreId == null) ? null : detailScoreId.trim();
    }


    public String getScoreTotalDataId() {
        return this.scoreTotalDataId;
    }


    public void setScoreTotalDataId(String scoreTotalDataId) {
        this.scoreTotalDataId = (scoreTotalDataId == null) ? null : scoreTotalDataId.trim();
    }


    public Date getCreateTime() {
        return this.createTime;
    }


    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getRuleExecResult() {
        return this.ruleExecResult;
    }


    public void setRuleExecResult(String ruleExecResult) {
        this.ruleExecResult = (ruleExecResult == null) ? null : ruleExecResult.trim();
    }


    public Double getDetailScore() {
        return this.detailScore;
    }


    public void setDetailScore(Double detailScore) {
        this.detailScore = detailScore;
    }
}


