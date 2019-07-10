package com.sinosoft.engine.analyze.constant;

import com.sinosoft.engine.analyze.utils.DateUtil;

import java.util.List;


public class BaseInfo {
    private String startTime;
    private String endTime;
    private String sysId;
    private List<String> categoies;
    private List<String> agentIds;
    private Integer maxValue;
    private Integer minValue;
    private Integer recording;
    private String tableNameSuffix;

    public String getTableNameSuffix() {
        return this.tableNameSuffix;
    }


    public void setTableNameSuffix(String tableNameSuffix) {
        this.tableNameSuffix = tableNameSuffix;
    }


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = sysId;
    }


    public Integer getMaxValue() {
        return this.maxValue;
    }


    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }


    public Integer getMinValue() {
        return this.minValue;
    }


    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }


    public Integer getRecording() {
        return this.recording;
    }


    public void setRecording(Integer recording) {
        this.recording = recording;
    }


    public List<String> getCategoies() {
        return this.categoies;
    }


    public Long getStartTimeDate() {
        return Long.valueOf(DateUtil.formatString(this.startTime).getTime());
    }


    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    public String getStartTime() {
        return this.startTime;
    }


    public String getEndTime() {
        return this.endTime;
    }


    public Long getEndTimeDate() {
        return Long.valueOf(DateUtil.formatString(this.endTime).getTime());
    }


    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public void setCategoies(List<String> categoies) {
        this.categoies = categoies;
    }


    public List<String> getAgentIds() {
        return this.agentIds;
    }


    public void setAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
    }


    public String toString() {
        return "BaseInfo [startTime=" + this.startTime + ", endTime=" + this.endTime + ", sysId=" + this.sysId + ", categoies=" + this.categoies + ", agentIds=" + this.agentIds + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + ", recording=" + this.recording + "]";
    }
}


