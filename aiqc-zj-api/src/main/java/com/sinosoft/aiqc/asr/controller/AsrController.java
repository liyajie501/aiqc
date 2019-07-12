package com.sinosoft.aiqc.asr.controller;

import com.sinosoft.aiqc.asr.model.FileResultVo;
import com.sinosoft.aiqc.asr.model.RepsVo;
import com.sinosoft.aiqc.asr.model.RspSpeech;
import com.sinosoft.aiqc.asr.service.AsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by shaoxun on 2019/4/27.
 */

@Controller
@RequestMapping("/asr")
public class AsrController {

    private static Semaphore semaphore = new Semaphore(5);// 设置并发信号量为5
    private static AtomicInteger atomicInteger = new AtomicInteger(0);// 声明原子操作整数，初始化为9
    // 这句代码详细注释见主函数，另外我这里为了方便直接设置参数为100，实际开发可以根据需求实例化
    private static CountDownLatch cdl = new CountDownLatch(40);

    @Autowired
    private AsrService asrService;

//    @RequestMapping("/asr")
//    public
//    @ResponseBody
//    String asr() throws Exception {
//
//        // 因为我们需要处理主线程等待所有子线程运行结束之后再运行，
//        // 因此为了方便，科学，我们再次介绍一个线程并发工具包CountDownLatch，
//        // 同样，我们需要它的一个有参构造，CountDownLatch cdl = new CountDownLatch(count);
//        // 注意，这里参数，必须和线程池的最大数一致，也就是说，这里的参数必须是你线程运行的最大数
//        // 比如我这里要运行100个线程，并发5个，那么，这里的count==100
//        // 因为我们需要在内部类中使用，所以声明为成员变量
//
//        for (int i = 0; i < 40; i++) {
//            new Thread(new Runnable() {
//
//                @Override
//                public void run() {
//                    // 注意：在刚进入方法就需要获得一把锁，再次强调，是刚进入方法就获得一把锁
//
//                    try {
//                        semaphore.acquire();// 获取一把锁，因为是在匿名内部类中使用，所以需要将其声明为成员变量
//
//                        int current = atomicInteger.getAndIncrement();
//                        System.out.println("第" + current + "进来了");// 打印日志
//
//                        Thread.sleep(1000);// 让当前线程睡1秒，模仿耗时操作
//
//
//                        //录音文件绝对路径ֵ
//                        String audio_data = "/Users/shaoxun/Desktop/06.ASR/02.wav/19.V3.wav";
//                        //VCG地址ַ
//                        String ip = "1.202.136.28";
//                        //VCG端口
//                        int port = 8083;
//                        //chunk包大小
//                        byte[] stream = new byte[320];
//                        //初始化
//                        ViewData viewData = new ViewData(ip, port, audio_data, "0", "3");
//                        Map<String, String> param = new HashMap<>();
//                        //param.put("isButterFly","off");
//                        viewData.setExtraParams(param);
//
//                        System.out.println("开始时间>>>>>>>>>" + new Date());
//
//                        //离线语音文件用以下方法
//                        SendFile ss = new SendFile(viewData, new RetrieveResult() {
//                            public void retrieveResult(String result) {
//                                System.out.println(result);//返回识别结果
//                            }
//                        });
//                        ss.send();
//                        System.out.println("结束时间>>>>>>>>>" + new Date());
//
//
//                        System.out.println("第" + current + "出去了");
//
//                        cdl.countDown();// 此方法的意思是线程数量-1，要在当前线程执行完毕之后书写，或者说子线程核心代码执行完毕之后
//                        semaphore.release();// 释放一把锁，必须释放，必须是方法最后一步
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }
//
//        cdl.await();// 主线程等待，当线程数量为0时主线程执行
//
//        System.out.println("主线程执行");
//        // 如此就解决了线程并发问题和主线程等待所有子线程运行完毕之后运行
//
//
//        return "success";
//    }

    @RequestMapping("/uploadFile.do")
    public
    @ResponseBody
    RepsVo uploadFile(String filePath) {
        RspSpeech rspSpeech = new RspSpeech();
        RepsVo repsVo = new RepsVo();
        List<FileResultVo> fileResultVoList = new ArrayList<FileResultVo>();
        // 开始时间
        long start = System.currentTimeMillis();
        try {
            fileResultVoList = asrService.uploadFile(filePath);
            long end = System.currentTimeMillis() - start;
            repsVo.setFileResultVoList(fileResultVoList);
            repsVo.setRespCode("0");
            repsVo.setTotalTime((end - start)/1000);
        } catch (Exception e) {
            repsVo.setRespCode("1");
            repsVo.setRespMessage(e.getMessage());
            e.printStackTrace();
        }

        return repsVo;
    }



    @RequestMapping("/readTXT.do")
    public
    @ResponseBody
    ArrayList<String>  readTXT(String filePath) {

        StringBuilder result = new StringBuilder();
        ArrayList StringList = new ArrayList<String>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行

                StringList.add(s);

            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return StringList;
    }

    @RequestMapping("/upload.do")
    public @ResponseBody RspSpeech uploadFile2(@RequestParam("file") MultipartFile files[]) {
        RspSpeech rspSpeech = new RspSpeech();
        try {
            asrService.upload(files);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rspSpeech;
    }




}
