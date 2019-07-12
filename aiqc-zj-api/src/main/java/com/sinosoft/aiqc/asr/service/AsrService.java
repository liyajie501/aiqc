package com.sinosoft.aiqc.asr.service;

import com.pachira.vcgclient.bean.ViewData;
import com.pachira.vcgclient.service.RetrieveResult;
import com.pachira.vcgclient.service.send.SendFile;
import com.sinosoft.aiqc.asr.model.*;
import com.sinosoft.aiqc.asr.util.JaxbUtil;
import com.sinosoft.aiqc.asr.util.PropertiesUtil;
import org.apache.ibatis.reflection.wrapper.CollectionWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@Service
@Transactional
public class AsrService {

    public List<FileResultVo> uploadFile(String filePath) throws Exception {

        // 开始时间
        long start = System.currentTimeMillis();
//        String wavUrl = PropertiesUtil.getPropertyWithPath("/config.properties", "wavUrl");
//        filePath = wavUrl;
        List<FileResultVo> fileResultVoList = new ArrayList<FileResultVo>();
        List<Callable<FileResultVo>> tasks = new ArrayList<Callable<FileResultVo>>();
        File file = new File(filePath);
        String[] filelist = file.list();
        int threadNum = filelist.length;
        ExecutorService exec = Executors.newFixedThreadPool(threadNum);
        Callable<FileResultVo> task = null;
        //文件夹路径，暂时写死，可以采用传参形式
//        filePath = wavUrl;
        //读取路径下所有文件
        for( int i=0;i<filelist.length;i++){
            if(filelist[i].endsWith(".wav")){
                File readfile = new File(filePath + filelist[i]);
                task = new MyCallable(readfile);
                // 这里提交的任务容器列表和返回的Future列表存在顺序对应的关系
                tasks.add(task);
            }
        }
        List<Future<FileResultVo>> results = exec.invokeAll(tasks);
        for (Future<FileResultVo> future : results) {
            try {
                FileResultVo fileResultVo = new FileResultVo();
                fileResultVo.setFileName(future.get().getFileName());
                fileResultVo.setPlayTime(future.get().getPlayTime());
                fileResultVo.setFilePath(future.get().getFilePath());
                fileResultVo.setRunTime(future.get().getRunTime());
                fileResultVoList.add(fileResultVo);
            }
            catch (Exception e) {
                e.printStackTrace();
                continue;
            }

        }
        // 关闭线程池
        exec.shutdown();
        System.err.println("多线程总执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
        return fileResultVoList;
    }


    public List<SpeechVo> uploadFile2(String filePath) {
        String ip = "1.202.136.28";
        int port = 8083;
        // 开始时间
        long start = System.currentTimeMillis();
//        String wavUrl = PropertiesUtil.getPropertyWithPath("/properties/config.properties", "wavUrl");
//        filePath = wavUrl;
        List<SpeechVo> speechVoList = new ArrayList<SpeechVo>();
        File file = new File(filePath);
        String[] filelist = file.list();
        //文件夹路径，暂时写死，可以采用传参形式
//        filePath = wavUrl;
        //读取路径下所有文件
        for(int i=0;i<filelist.length;i++){
            File readfile = new File(filePath + "\\" + filelist[i]);
            // 这里提交的任务容器列表和返回的Future列表存在顺序对应的关系
            String audio_data = readfile.getAbsolutePath();
            ViewData viewData = new ViewData(ip, port, audio_data, "0", "3");
            byte[] stream = new byte[1024];
            //初始化
            Map<String, String> param = new HashMap<>();
            viewData.setExtraParams(param);
            //离线语音文件用以下方法
            SendFile ss = new SendFile(viewData, new RetrieveResult() {
                public void retrieveResult(String result) {
                }
            });
            String send = null;
            try {
                send = ss.send();
                System.out.println("返回语音解析报文>>>"+send.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            int end = send.indexOf("?>");
            String xml = send.substring(end + 2, send.length());
            JaxbUtil resultBinder = new JaxbUtil(SpeechType.class, CollectionWrapper.class);
            SpeechType speechType = resultBinder.fromXml(xml);
            List<RoleType> roleList = speechType.getSubject().getRole();
            SpeechVo speechVo = new SpeechVo();
            speechVo.setFileName(file.getName());
            speechVo.setRoleList(roleList);
            speechVoList.add(speechVo);
            System.out.println("语音解析"+i+"："+speechVo.toString());
        }
        System.err.println("单线程总执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
        return speechVoList;
    }

    public  CommonVo upload(MultipartFile files[])  {

        CommonVo CommonVo =new  CommonVo();
        // 开始时间
        try {
            String uploadUrl = PropertiesUtil.getPropertyWithPath("/config.properties", "wavUrl");

            for (MultipartFile file : files){
                String fileName = file.getOriginalFilename();
                File targetFile = new File(uploadUrl, fileName);
//                if(!targetFile.exists()){
//                    targetFile.mkdirs();
//                }
                file.transferTo(targetFile);
            }
                CommonVo.setRespCode("0");

        } catch (Exception e) {
                e.printStackTrace();
                CommonVo.setRespCode("0");
                CommonVo.setRespMessage(e.getMessage());
        }
        return CommonVo;
    }
}