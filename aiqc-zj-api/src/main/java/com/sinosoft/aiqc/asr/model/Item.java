package com.sinosoft.aiqc.asr.model;

/**
 * Created by Administrator on 2019/4/26.
 */
public class Item {
    private String ResultCode;
    private String Text;
    private String Weight;
    private String Time;

    public String getResultCode() {
        return ResultCode;
    }

    public void setResultCode(String resultCode) {
        ResultCode = resultCode;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
