package com.sinosoft.aiqc.zj.dto.model;

import java.util.Date;
import java.util.List;

public class ModelReqDto {

    private String modelId;
    private String name;
    private String info;
    private String createUser;
    private Date createTime;
    private String publishUser;
    private Date publishTime;
    private String publishMask;
    private String deleteMask;
    private Double totalScore;
    private String time;
    private List<ModelToRule> modelToRule;

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPublishUser() {
        return publishUser;
    }

    public void setPublishUser(String publishUser) {
        this.publishUser = publishUser;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getPublishMask() {
        return publishMask;
    }

    public void setPublishMask(String publishMask) {
        this.publishMask = publishMask;
    }

    public String getDeleteMask() {
        return deleteMask;
    }

    public void setDeleteMask(String deleteMask) {
        this.deleteMask = deleteMask;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<ModelToRule> getModelToRule() {
        return modelToRule;
    }

    public void setModelToRule(List<ModelToRule> modelToRule) {
        this.modelToRule = modelToRule;
    }
}
