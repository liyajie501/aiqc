package com.sinosoft.aiqc.asr.util;

import org.apache.commons.lang3.text.StrBuilder;

/**
 * Created by Administrator on 2019/5/9.
 */
public class TimeUtil {
    /**
     * 毫秒转换时分秒
     */
    public static String getGapTime(long time) {
        StrBuilder strBuilder = new StrBuilder();
        long temp = time;
        long hper = 60 * 60 * 1000;
        long mper = 60 * 1000;
        long sper = 1000;
        if (temp / hper > 0) {
            strBuilder.append(temp / hper).append(":");
        }
        temp = temp % hper;

        if (temp / mper > 0) {
            if(temp / mper < 10){
                strBuilder.append("0").append(temp / mper).append(":");
            }else{
                strBuilder.append(temp / mper).append(":");
            }
        }else {
            strBuilder.append("00:");
        }
        temp = temp % mper;
        if (temp / sper > 0) {
            if(temp / sper < 10){
                strBuilder.append("0").append(temp / sper).append("");
            }else {
                strBuilder.append(temp / sper).append("");
            }
        }else {
            strBuilder.append("00");
        }
        return strBuilder.toString();
    }
}
