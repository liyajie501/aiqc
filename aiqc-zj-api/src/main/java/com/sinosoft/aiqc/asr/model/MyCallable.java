package com.sinosoft.aiqc.asr.model;

import com.pachira.vcgclient.bean.ViewData;
import com.pachira.vcgclient.service.RetrieveResult;
import com.pachira.vcgclient.service.send.SendFile;
import com.sinosoft.aiqc.asr.util.JaxbUtil;
import org.apache.ibatis.reflection.wrapper.CollectionWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2019/4/28.
 */
public class MyCallable implements Callable {
    private File file;

    @Value("${zj.mount.root.path}")
    private String uploadAudioResPath;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public MyCallable(File file) {
        this.file = file;
    }

    public Object call() throws Exception {
        String ip = "1.202.136.28";
        int port = 8083;
        long start = System.currentTimeMillis();
        String audio_data = file.getAbsolutePath();
        String txtUrl = uploadAudioResPath;
        System.out.println(Thread.currentThread().getName() + "----" + file.getName());
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

        send = ss.send();

        System.out.println("返回报文>>>"+send.toString());

//        //时长获取
//        Encoder encoder = new Encoder();
//        long ls = 0;
//
//        MultimediaInfo m = encoder.getInfo(new File(file.getPath()));
//        ls = m.getDuration();
//        System.out.println(ls + " " + ls / 1000);

        int end = send.indexOf("?>");
        String xml = send.substring(end + 2, send.length());
        JaxbUtil resultBinder = new JaxbUtil(SpeechType.class, CollectionWrapper.class);
        SpeechType speechType = resultBinder.fromXml(xml);
        List<RoleType> roleList = speechType.getSubject().getRole();
        SpeechVo speechVo = new SpeechVo();
        speechVo.setFileName(file.getName());
        speechVo.setRoleList(roleList);
        //排序处理
        List<ItemResultVo> itemResultVoList = this.sort(speechVo);
        //写入文件
        this.writeFile(file.getName(), itemResultVoList);
        //返回对象
        long runtime = System.currentTimeMillis() - start;
        FileResultVo fileResultVo = new FileResultVo();
        fileResultVo.setPlayTime(1000);
        fileResultVo.setFileName(file.getName());
        fileResultVo.setFilePath(txtUrl+file.getName().replace(".wav", ".txt"));
        fileResultVo.setRunTime(runtime/1000);
        return fileResultVo;
    }

    private void writeFile(String name, List<ItemResultVo> itemResultVoList) {
        BufferedWriter bw = null;
//        String txtUrl = PropertiesUtil.getPropertyWithPath("/config.properties", "txtUrl");
        String txtUrl =uploadAudioResPath;
        try {
            name = name.replace(".wav", ".txt");
            File file = new File(txtUrl + "/" + name);//创建文本文件
            bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < itemResultVoList.size(); i++) {
                bw.write(itemResultVoList.get(i).getRoleName() + ":" + itemResultVoList.get(i).getText());
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    private List<ItemResultVo> sort(SpeechVo speechVo) {
        List<ItemResultVo> itemResultVoList = new ArrayList<ItemResultVo>();
        List<RoleType> roleList = speechVo.getRoleList();
        List<ItemType> items = new ArrayList<ItemType>();
        for (RoleType roleType : roleList) {
            for (ItemType itemType : roleType.getEndPoint().getItem()) {
                ItemResultVo itemResultVo = new ItemResultVo();
                itemResultVo.setRoleName(roleType.getName());
                BeanUtils.copyProperties(itemType, itemResultVo);
                itemResultVoList.add(itemResultVo);
            }
        }
        itemResultVoList.sort((x, y) -> Double.compare(Integer.parseInt(x.getBegin()), Integer.parseInt(y.getBegin())));//这方法需要jdk1.8以上
        return itemResultVoList;
    }
}
