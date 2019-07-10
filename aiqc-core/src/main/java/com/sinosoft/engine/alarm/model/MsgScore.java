
package com.sinosoft.engine.alarm.model;


import java.util.Date;

public class MsgScore {
    private String sysId;
    private String baseId;
    private String audioCode;
    private String recordFile;
    private String scoreTotalDataId;
    private String scoreDetailDataId;
    private String ruleId;
    private String totalScoreId;
    private String detailScoreId;
    private float value;
    private Date startTime;
    private String agentId;
    private String categoryId;
    private String address;
    private String level;


    public String getLevel() {
        return this.level;
    }


    public void setLevel(String level) {
        this.level = level;
    }


    public String getCategoryId() {
        return this.categoryId;
    }


    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    public String getAddress() {
        return this.address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public Date getStartTime() {
        return this.startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public String getAgentId() {
        return this.agentId;
    }


    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }


    public String getAudioCode() {
        return this.audioCode;
    }


    public void setAudioCode(String audioCode) {
        this.audioCode = audioCode;
    }


    public String getRecordFile() {
        return this.recordFile;
    }


    public void setRecordFile(String recordFile) {
        this.recordFile = recordFile;
    }


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = sysId;
    }


    public String getBaseId() {
        return this.baseId;
    }


    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }


    public String getScoreTotalDataId() {
        return this.scoreTotalDataId;
    }


    public void setScoreTotalDataId(String scoreTotalDataId) {
        this.scoreTotalDataId = scoreTotalDataId;
    }


    public String getScoreDetailDataId() {
        return this.scoreDetailDataId;
    }

    public void setScoreDetailDataId(String scoreDetailDataId) {
        this.scoreDetailDataId = scoreDetailDataId;
    }


    public String getRuleId() {
        return this.ruleId;
    }


    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }


    public String getTotalScoreId() {
        return this.totalScoreId;
    }


    public void setTotalScoreId(String totalScoreId) {
        this.totalScoreId = totalScoreId;
    }


    public String getDetailScoreId() {
        return this.detailScoreId;
    }


    public void setDetailScoreId(String detailScoreId) {
        this.detailScoreId = detailScoreId;
    }


    public float getValue() {
        return this.value;
    }


    public void setValue(float value) {
        this.value = value;
    }

}


