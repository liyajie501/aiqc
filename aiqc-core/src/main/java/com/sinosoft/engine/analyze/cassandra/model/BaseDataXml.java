package com.sinosoft.engine.analyze.cassandra.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("yyzj_r_base_data_xml")
public class BaseDataXml {
    @PrimaryKey("resource_Id")
    private String resourceId;
    @Column("audio_code")
    private String audioCode;
    @Column("record_file")
    private String recordFile;
    @Column("resolve_file")
    private String resolveFile;
    @Column("node_name")
    private String nodeName;
    @Column("node_code")
    private Integer nodeCode;
    @Column("parent_node_code")
    private Integer parentNodeCode;
    @Column("property_code")
    private String propertyCode;
    @Column("property_value")
    private String propertyValue;
    @Column("property")
    private Integer property;
    @Column("sort")
    private Integer sort;

    public Integer getNodeCode() {
        return this.nodeCode;
    }


    public void setNodeCode(Integer nodeCode) {
        this.nodeCode = nodeCode;
    }


    public Integer getParentNodeCode() {
        return this.parentNodeCode;
    }


    public void setParentNodeCode(Integer parentNodeCode) {
        this.parentNodeCode = parentNodeCode;
    }


    public Integer getProperty() {
        return this.property;
    }


    public void setProperty(Integer property) {
        this.property = property;
    }


    public String getNodeName() {
        return this.nodeName;
    }


    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }


    public String getResourceId() {
        return this.resourceId;
    }


    public void setResourceId(String resourceId) {
        this.resourceId = (resourceId == null) ? null : resourceId.trim();
    }


    public String getAudioCode() {
        return this.audioCode;
    }


    public void setAudioCode(String audioCode) {
        this.audioCode = (audioCode == null) ? null : audioCode.trim();
    }


    public String getRecordFile() {
        return this.recordFile;
    }


    public void setRecordFile(String recordFile) {
        this.recordFile = (recordFile == null) ? null : recordFile.trim();
    }


    public String getResolveFile() {
        return this.resolveFile;
    }


    public void setResolveFile(String resolveFile) {
        this.resolveFile = (resolveFile == null) ? null : resolveFile.trim();
    }


    public String getPropertyCode() {
        return this.propertyCode;
    }


    public void setPropertyCode(String propertyCode) {
        this.propertyCode = (propertyCode == null) ? null : propertyCode.trim();
    }


    public String getPropertyValue() {
        return this.propertyValue;
    }


    public void setPropertyValue(String propertyValue) {
        this.propertyValue = (propertyValue == null) ? null : propertyValue.trim();
    }


    public Integer getSort() {
        return this.sort;
    }


    public void setSort(Integer sort) {
        this.sort = sort;
    }
}

