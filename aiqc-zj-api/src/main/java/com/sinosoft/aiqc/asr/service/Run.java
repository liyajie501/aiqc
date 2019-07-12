package com.sinosoft.aiqc.asr.service;

/**
 * Test2
 *
 * @author xutengchao
 * @create 2019-04-18 10:37
 */
public class Run {

    public static void main(String[] args) {

        // 音频路径
        String audioPath = "D:/work/技术/智能/ASR/大地录音/6.V3.wav";
        JavaDemo javaDemo = new JavaDemo();

        //180.76.107.131:8050

        javaDemo.run(audioPath,"180.76.107.131", "8050", "1906","false");
    }

}
