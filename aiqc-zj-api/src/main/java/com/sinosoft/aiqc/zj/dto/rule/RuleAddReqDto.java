
package com.sinosoft.aiqc.zj.dto.rule;

import java.util.List;

/**
 * 添加质检规则请求类
 */
public class RuleAddReqDto {

    private String ruleId; // 规则ID

    private String analyzerId; // 分析ID

    private String name; // 规则名称

    private String info; //规则描述

    private String context; // 创建人员

    private String createUser; // 创建时间

    private String createTime; //删除标识

    private String publishUser; // 发布人员

    private String publishTime; // 发布时间

    private String publishMark; // 发布状态 '1、发布 0、未发布'

    private String deleteMark; //  删除标识 '1、删除 0、未删除'

    private String type; // 规则类型 '1、简单规则  2、复杂规则（基于简单规则的组合）'

    private String ruleLabel; // 规则分类 '关联YYZJ_D_SYS_DICT.parent_id=RULE_LABEL 的记录'

    private String contextShow; // 逻辑内容

    private String builtinMark; // 内置标识

    private String resultType; // 结果类型

    private String dictName;

    private String dictCode;

    private String dictParentId;

    private String dictId;

    private List<String> groupIds;

    private List<List<ProducerEleValue>> item;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPublishUser() {
        return publishUser;
    }

    public void setPublishUser(String publishUser) {
        this.publishUser = publishUser;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
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

    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public List<List<ProducerEleValue>> getItem() {
        return item;
    }

    public void setItem(List<List<ProducerEleValue>> item) {
        this.item = item;
    }
}
