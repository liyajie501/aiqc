package com.sinosoft.engine.analyze.model;

public class RuleAndScoreDetail extends ScoreDetail {
    private String ruleId;
    private String analyzerId;
    private String name;
    private String info;
    private String context;
    private String type;
    private String ruleLabel;

    public String getRuleId() {
        return this.ruleId;
    }


    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }


    public String getAnalyzerId() {
        return this.analyzerId;
    }


    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getInfo() {
        return this.info;
    }


    public void setInfo(String info) {
        this.info = info;
    }


    public String getContext() {
        return this.context;
    }


    public void setContext(String context) {
        this.context = context;
    }


    public String getType() {
        return this.type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getRuleLabel() {
        return this.ruleLabel;
    }


    public void setRuleLabel(String ruleLabel) {
        this.ruleLabel = ruleLabel;
    }
}
