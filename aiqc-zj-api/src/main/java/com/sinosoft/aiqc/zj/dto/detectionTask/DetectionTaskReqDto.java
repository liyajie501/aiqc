package com.sinosoft.aiqc.zj.dto.detectionTask;

import java.util.Date;
import java.util.List;

public class DetectionTaskReqDto {

    private String totalScoreId; // 任务ID
    private String modelId; // 模板ID
    private String sysId; // 平台ID
    private String userType; // 用户类型
    private Double scoreValue; // 总分
    private String createUser; // 创建人
    private Date createTime; // 创建时间
    private String publishUser;  // 发布人员
    private Date publishTime; // 发布时间
    private String publishMark; // 发布标识
    private String deleteMark; // 删除标识
    private String name; // 任务名称
    private String info; // 任务描述
    private String baseInfo; // 任务范围

    private String joinSysId;
    private String joinSysName;
    private String joinSysInfo;
    private String joinSysFtpPath;
    private String joinSysUsername;
    private String joinSysValid;
    private String time;
    private List<DetectionDetail> scoreDetails;
    private String scoreTotalDataId;
    private String modelName;
    private String modelInfo;
    private String modelPublishMask;
    private String modelDeleteMask;

    private Integer checkRuleCount;
    private Date stopTime;

    public String getTotalScoreId() {
        return totalScoreId;
    }

    public void setTotalScoreId(String totalScoreId) {
        this.totalScoreId = totalScoreId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Double getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(Double scoreValue) {
        this.scoreValue = scoreValue;
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

    public String getPublishMark() {
        return publishMark;
    }

    public void setPublishMark(String publishMark) {
        this.publishMark = publishMark;
    }

    public String getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark;
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

    public String getJoinSysId() {
        return joinSysId;
    }

    public void setJoinSysId(String joinSysId) {
        this.joinSysId = joinSysId;
    }

    public String getJoinSysName() {
        return joinSysName;
    }

    public void setJoinSysName(String joinSysName) {
        this.joinSysName = joinSysName;
    }

    public String getJoinSysInfo() {
        return joinSysInfo;
    }

    public void setJoinSysInfo(String joinSysInfo) {
        this.joinSysInfo = joinSysInfo;
    }

    public String getJoinSysFtpPath() {
        return joinSysFtpPath;
    }

    public void setJoinSysFtpPath(String joinSysFtpPath) {
        this.joinSysFtpPath = joinSysFtpPath;
    }

    public String getJoinSysUsername() {
        return joinSysUsername;
    }

    public void setJoinSysUsername(String joinSysUsername) {
        this.joinSysUsername = joinSysUsername;
    }

    public String getJoinSysValid() {
        return joinSysValid;
    }

    public void setJoinSysValid(String joinSysValid) {
        this.joinSysValid = joinSysValid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<DetectionDetail> getScoreDetails() {
        return scoreDetails;
    }

    public void setScoreDetails(List<DetectionDetail> scoreDetails) {
        this.scoreDetails = scoreDetails;
    }

    public String getScoreTotalDataId() {
        return scoreTotalDataId;
    }

    public void setScoreTotalDataId(String scoreTotalDataId) {
        this.scoreTotalDataId = scoreTotalDataId;
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

    public String getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(String baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Integer getCheckRuleCount() {
        return checkRuleCount;
    }

    public void setCheckRuleCount(Integer checkRuleCount) {
        this.checkRuleCount = checkRuleCount;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }
}
