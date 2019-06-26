package com.sinosoft.aiqc.zj.dto.common;

/**
 * 数据字典请求
 */
public class DataDictionaryReqDto {


    // 主键ID
    private String dictId;

    // 代码
    private String code;

    // 名称
    private String name;

    // 值
    private String value;

    // 展示模块
    private String parentId;

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

}
