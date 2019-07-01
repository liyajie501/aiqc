package com.sinosoft.aiqc.db.domain;

/**
 * 根据模板查询规则返回类
 */
public class ModelToRule {


    private String ruleId;

    private String contextShow;

    private String modelId;

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getContextShow() {
        return contextShow;
    }

    public void setContextShow(String contextShow) {
        this.contextShow = contextShow;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
}