package com.sinosoft.aiqc.asr.model;

/**
 * Created by Administrator on 2019/4/28.
 */
public class FileResultVo {
    private String fileName;
    private String filePath;
    private long playTime;//音频播放时长
    private long runTime;//传接口处理执行时长

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }



    public long getRunTime() {
        return runTime;
    }

    public void setRunTime(long runTime) {
        this.runTime = runTime;
    }

    public long getPlayTime() {
        return playTime;
    }

    public void setPlayTime(long playTime) {
        this.playTime = playTime;
    }

}
