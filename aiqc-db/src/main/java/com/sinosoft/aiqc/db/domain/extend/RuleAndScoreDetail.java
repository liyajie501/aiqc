package com.sinosoft.aiqc.db.domain.extend;

import com.sinosoft.aiqc.db.domain.YyzjCScoreDetail;

public class RuleAndScoreDetail extends YyzjCScoreDetail {

    private String ruleId;
    private String analyzerId;
    private String name;
    private String info;
    private String context;
    private String type;
    private String ruleLabel;

    @Override
    public String getRuleId() {
        return ruleId;
    }

    @Override
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRuleLabel() {
        return ruleLabel;
    }

    public void setRuleLabel(String ruleLabel) {
        this.ruleLabel = ruleLabel;
    }
}
