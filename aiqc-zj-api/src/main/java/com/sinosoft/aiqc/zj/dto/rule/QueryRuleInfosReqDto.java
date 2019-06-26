package com.sinosoft.aiqc.zj.dto.rule;

import java.time.LocalDateTime;

public class QueryRuleInfosReqDto {

    private String ruleId;
    private String analyzerId;
    private String name;
    private String info;
    private String context;
    private String createUser;
    private LocalDateTime createTime;
    private String publishUser;
    private LocalDateTime publishTime;
    private String publishMark;
    private String deleteMark;
    private String type;
    private String ruleLabel;
    private String contextShow;
    private String builtinMark;
    private String resultType;

    private String dictName;
    private String dictCode;
    private String dictParentId;
    private String dictId;


    private int pageNum; // 当前条数

    private int pageSize; // 查询条数


    public String getRuleId() {
        return ruleId;
    }

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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getPublishUser() {
        return publishUser;
    }

    public void setPublishUser(String publishUser) {
        this.publishUser = publishUser;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
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

    public String getContextShow() {
        return contextShow;
    }

    public void setContextShow(String contextShow) {
        this.contextShow = contextShow;
    }

    public String getBuiltinMark() {
        return builtinMark;
    }

    public void setBuiltinMark(String builtinMark) {
        this.builtinMark = builtinMark;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictParentId() {
        return dictParentId;
    }

    public void setDictParentId(String dictParentId) {
        this.dictParentId = dictParentId;
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
