package com.sinosoft.aiqc.asr.model;

import java.util.List;

/**
 * Created by Administrator on 2019/4/26.
 */
public class SpeechVo {
    private String fileName;
    List<RoleType> roleList;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<RoleType> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleType> roleList) {
        this.roleList = roleList;
    }
}
