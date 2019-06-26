package com.sinosoft.aiqc.zj.dto.model;

import com.sinosoft.aiqc.db.domain.RuleTemp;
import org.json.JSONObject;

public class ModelToRule extends RuleTemp {

    private String ruleId;
    private String modelId;
    private Integer sort;
    private String modelName;
    private String modelInfo;
    private String modelPublishMask;
    private String modelDeleteMask;
    private Double totalScore;
    private String[] ruleIds;
    private String groupName;
    private Integer groupNo;
    private String ruleAttrValue;
    private JSONObject ruleAttrValueJson;
    private Double scoreValue;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelInfo() {
        return modelInfo;
    }

    public void setModelInfo(String modelInfo) {
        this.modelInfo = modelInfo;
    }

    public String getModelPublishMask() {
        return modelPublishMask;
    }

    public void setModelPublishMask(String modelPublishMask) {
        this.modelPublishMask = modelPublishMask;
    }

    public String getModelDeleteMask() {
        return modelDeleteMask;
    }

    public void setModelDeleteMask(String modelDeleteMask) {
        this.modelDeleteMask = modelDeleteMask;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public String[] getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(String[] ruleIds) {
        this.ruleIds = ruleIds;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }

    public String getRuleAttrValue() {
        return ruleAttrValue;
    }

    public void setRuleAttrValue(String ruleAttrValue) {
        this.ruleAttrValue = ruleAttrValue;
    }

    public JSONObject getRuleAttrValueJson() {
        return ruleAttrValueJson;
    }

    public void setRuleAttrValueJson(JSONObject ruleAttrValueJson) {
        this.ruleAttrValueJson = ruleAttrValueJson;
    }

    public Double getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(Double scoreValue) {
        this.scoreValue = scoreValue;
    }
}
