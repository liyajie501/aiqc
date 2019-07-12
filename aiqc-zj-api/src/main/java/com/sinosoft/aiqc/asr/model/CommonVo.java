package com.sinosoft.aiqc.asr.model;

/**
 * Created by shaoxun on 2019/4/29.
 */
public class CommonVo {

    private String respCode;
    private String respMessage;
    private long totalTime;

    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }
}
