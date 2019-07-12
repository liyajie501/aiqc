// Copyright (C) 2019 Baidu Inc. All rights reserved.

package com.sinosoft.aiqc.asr.service;

import com.baidu.acu.pie.client.AsrClient;
import com.baidu.acu.pie.client.AsrClientFactory;
import com.baidu.acu.pie.client.Consumer;
import com.baidu.acu.pie.model.AsrConfig;
import com.baidu.acu.pie.model.RecognitionResult;
import com.baidu.acu.pie.model.StreamContext;
import com.google.gson.Gson;
import com.sinosoft.aiqc.asr.controller.CustomWebSocket;
import com.sinosoft.aiqc.asr.model.TextResultVo;
import com.sinosoft.aiqc.asr.util.TimeUtil;
import org.joda.time.DateTime;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * JavaDemo
 *
 * @author Cynric Shu (cynricshu@gmail.com)
 */
public class JavaDemo {

    public static String str;

    public void run(String audioPath, String ip, String port, String pid, String isAsync) {
        if (isAsync.equals("false")) {
            // 同步执行
            recognizeFile(audioPath, ip, port, pid);
        } else if(isAsync.equals("true")) {
            // 异步执行
            asyncRecognition(audioPath, ip, port, pid);
        } else {
            System.exit(0);
        }
    }

    private AsrClient createAsrClient(String ip ,Integer port, String pid) {
        // asrConfig构造后就不可修改
        AsrConfig asrConfig = new AsrConfig()
                .serverIp(ip)
                .serverPort(port)
                .appName("huijie")
                .productId(pid)
                .userName("huijie01") // 账号
                .password("Baidu@1234"); // 密码

        return AsrClientFactory.buildClient(asrConfig);
    }

    /**
     * 音频整个识别完成一次性返回识别结果
     * @param audioPath
     * @param ip
     * @param port
     * @param pid
     */
    public void recognizeFile(String audioPath, String ip, String port, String pid) {
        AsrClient asrClient = createAsrClient(ip,Integer.valueOf(port),pid);
        List<RecognitionResult> results = asrClient.syncRecognize(new File(audioPath));

        // don't forget to shutdown !!!
        asrClient.shutdown();

        for (RecognitionResult result : results) {
//            System.out.println(String.format(AsrConfig.TITLE_FORMAT,
//                    "file_name",
//                    "serial_num",
//                    "start_time",
//                    "end_time",
//                    "result"));
//            System.out.println(String.format(AsrConfig.TITLE_FORMAT,
//                    audioPath,
//                    result.getSerialNum(),
//                    result.getStartTime(),
//                    result.getEndTime(),
//                    result.getResult()
//            ));

            System.out.println(result.getSerialNum()+result.getResult());
            CustomWebSocket customWebSocket = new CustomWebSocket();
            try {

                customWebSocket.sendInfo(result.getResult());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 边识别边输出
     * @param longAudioFilePath
     * @param ip
     * @param port
     * @param pid
     */
    public void asyncRecognition(String longAudioFilePath, String ip, String port, String pid) {
        AsrClient asrClient = createAsrClient(ip,Integer.valueOf(port),pid);
        StreamContext streamContext = asrClient.asyncRecognize(new Consumer<RecognitionResult>() {
            CustomWebSocket customWebSocket = new CustomWebSocket();
            Gson gson = new Gson();
            @Override
            public void accept(RecognitionResult it) {
                try {
                    TextResultVo textResultVo = this.parseToVo(it);
                    customWebSocket.sendInfo(gson.toJson(textResultVo));
                    System.out.println("===="+textResultVo.getStartTime()+textResultVo.getResult());
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                System.out.println(
//                        DateTime.now().toString() + Thread.currentThread().getId() + "receive fragment:" + it);
            }

            private TextResultVo parseToVo(RecognitionResult it) {
                TextResultVo textResultVo = new TextResultVo();
                textResultVo.setResult(it.getResult());
                textResultVo.setSerialNum(it.getSerialNum());
                textResultVo.setEndTime(TimeUtil.getGapTime(it.getEndTime().getMillisOfDay()));
                textResultVo.setStartTime(TimeUtil.getGapTime(it.getStartTime().getMillisOfDay()));
                return textResultVo;
            }
        });
        // 这里从文件中得到一个InputStream，实际场景下，也可以从麦克风或者其他音频源来得到InputStream
        try (InputStream audioStream = Files.newInputStream(Paths.get(longAudioFilePath))) {
            byte[] data = new byte[asrClient.getFragmentSize()];
            int readSize;
            System.out.println(new DateTime().toString() + "\t" + Thread.currentThread().getId() + " start to send");
            // 使用 sender.onNext 方法，将 InputStream 中的数据不断地发送到 asr 后端，发送的最小单位是 AudioFragment
            while ((readSize = audioStream.read(data)) != -1 && !streamContext.getFinishLatch().finished()) {
                streamContext.send(data);
                // 主动休眠一段时间，来模拟人说话场景下的音频产生速率
                // 在对接麦克风等设备的时候，可以去掉这个 sleep
                Thread.sleep(20);
            }
            System.out.println(new DateTime().toString() + "\t" + Thread.currentThread().getId() + " send finish");
            streamContext.complete();
            // wait to ensure to receive the last response
            streamContext.getFinishLatch().await();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            asrClient.shutdown();
        }

        System.out.println("all task finished");
    }
}
