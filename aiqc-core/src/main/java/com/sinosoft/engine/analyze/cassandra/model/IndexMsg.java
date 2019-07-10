package com.sinosoft.engine.analyze.cassandra.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Table("yyzj_t_index_msg")
public class IndexMsg {
    @PrimaryKey("msg_id")
    private String msgId;
    @Column("sys_id")
    private String sysId;
    @Column("file_name")
    private String fileName;
    @Column("file_dir")
    private String fileDir;
    @Column("lock_flag")
    private Integer lockFlag;
    @Column("lock_time")
    private Date lockTime;

    public String getMsgId() {
        return this.msgId;
    }


    public void setMsgId(String msgId) {
        this.msgId = (msgId == null) ? null : msgId.trim();
    }


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = (sysId == null) ? null : sysId.trim();
    }


    public String getFileName() {
        return this.fileName;
    }


    public void setFileName(String fileName) {
        this.fileName = (fileName == null) ? null : fileName.trim();
    }


    public String getFileDir() {
        return this.fileDir;
    }


    public void setFileDir(String fileDir) {
        this.fileDir = (fileDir == null) ? null : fileDir.trim();
    }


    public Integer getLockFlag() {
        return this.lockFlag;
    }


    public void setLockFlag(Integer lockFlag) {
        this.lockFlag = lockFlag;
    }


    public Date getLockTime() {
        return this.lockTime;
    }


    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }
}


