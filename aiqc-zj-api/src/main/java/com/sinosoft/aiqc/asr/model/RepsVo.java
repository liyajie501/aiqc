package com.sinosoft.aiqc.asr.model;

import java.util.List;

/**
 * Created by shaoxun on 2019/4/28.
 */
public class RepsVo extends CommonVo {


    public List<FileResultVo> fileResultVoList;

    public List<FileResultVo> getFileResultVoList() {
        return fileResultVoList;
    }

    public void setFileResultVoList(List<FileResultVo> fileResultVoList) {
        this.fileResultVoList = fileResultVoList;
    }
}
