package com.sinosoft.aiqc.asr.model;

import java.util.List;

/**
 * Created by Administrator on 2019/4/26.
 */
public class RspSpeech {
    private List<SpeechVo> speechVoList;

    public List<SpeechVo> getSpeechVoList() {
        return speechVoList;
    }

    public void setSpeechVoList(List<SpeechVo> speechVoList) {
        this.speechVoList = speechVoList;
    }
}
