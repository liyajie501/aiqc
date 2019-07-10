package com.sinosoft.engine.analyze.cassandra.model;


import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("yyzj_t_word_record")
public class WordRecord {
    @PrimaryKey("call_time")
    private String callTime;
    @Column("word")
    private String word;
    @Column("base_id")
    private String baseId;
    @Column("sys_id")
    private String sysId;
    @Column("count")
    private Integer count;
    @Column("role")
    private Integer role;
    @Column("sort")
    private Long sort;
    @Column("agent_id")
    private String agentId;

    public String getCallTime() {
        return this.callTime;
    }


    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }


    public Long getSort() {
        return this.sort;
    }


    public void setSort(Long sort) {
        this.sort = sort;
    }


    public String getWord() {
        return this.word;
    }


    public void setWord(String word) {
        this.word = (word == null) ? null : word.trim();
    }


    public String getBaseId() {
        return this.baseId;
    }


    public void setBaseId(String baseId) {
        this.baseId = (baseId == null) ? null : baseId.trim();
    }


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = (sysId == null) ? null : sysId.trim();
    }


    public Integer getCount() {
        return this.count;
    }


    public void setCount(Integer count) {
        this.count = count;
    }


    public Integer getRole() {
        return this.role;
    }


    public void setRole(Integer role) {
        this.role = role;
    }


    public String getAgentId() {
        return this.agentId;
    }


    public void setAgentId(String agentId) {
        this.agentId = (agentId == null) ? null : agentId.trim();
    }
}


