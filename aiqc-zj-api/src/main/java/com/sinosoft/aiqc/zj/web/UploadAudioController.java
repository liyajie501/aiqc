package com.sinosoft.aiqc.zj.web;

import com.sinosoft.aiqc.asr.model.RepsVo;
import com.sinosoft.aiqc.asr.model.RspSpeech;
import com.sinosoft.aiqc.asr.model.SpeechVo;
import com.sinosoft.aiqc.core.util.ResponseUtil;
import com.sinosoft.aiqc.asr.service.AsrService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 语音管理服务
 */
@RestController
@RequestMapping("/zj/audio")
@Validated
public class UploadAudioController {
    private final Log logger = LogFactory.getLog(UploadAudioController.class);

    @Autowired
    private AsrService asrService;

    private final static ArrayBlockingQueue<Runnable> WORK_QUEUE = new ArrayBlockingQueue<>(9);

    private final static RejectedExecutionHandler HANDLER = new ThreadPoolExecutor.CallerRunsPolicy();

    private static ThreadPoolExecutor executorService = new ThreadPoolExecutor(9, 9, 1000, TimeUnit.MILLISECONDS, WORK_QUEUE, HANDLER);

    @Value("${zj.uploadAudio.path}")
    private String uploadAudioPath;

    @Value("${zj.mount.root.path}")
    private String uploadAudioResPath;
    
    @GetMapping("/cache")
    public Object cache(@NotNull String key) {
        if (!key.equals("aiqc_cache")) {
            return ResponseUtil.fail();
        }

        // 清除缓存
//        HomeCacheManager.clearAll();
        return ResponseUtil.ok("缓存已清除");
    }

    /**
     * 语音上传
     *
     * @param request 当用户已经登录时，非空。为登录状态为null
     * @return 首页数据
     */

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadFile(HttpServletRequest request) {
        //优先从缓存中读取
//        if (HomeCacheManager.hasData(HomeCacheManager.INDEX)) {
//            return ResponseUtil.ok(HomeCacheManager.getCacheData(HomeCacheManager.INDEX));
//        }
//        ExecutorService executorService = Executors.newFixedThreadPool(10);


        this.logger.debug("录音文件上传开始...");
//        try
//        {
//
//            File filePath = new File(this.uploadAudioPath + "/" + sysId + "/" + dirName);
//            FileUtils.forceMkdir(dir);
//            File newFile = new File(this.uploadAudioPath + "/" + sysId + "/" + dirName + "/" + file.getOriginalFilename());
//            file.transferTo(newFile);
//        }
//        catch (IOException e)
//        {
//            this.logger.debug("文件上传异常", e);
//        }

        MultipartHttpServletRequest params = ((MultipartHttpServletRequest) request);
        List<MultipartFile> files = ((MultipartHttpServletRequest) request)
                .getFiles("file");
        String sysId = params.getParameter("sysId");
        System.out.println("sysId:" + sysId);
        String dirName = params.getParameter("dirName");
        System.out.println("dirName:" + dirName);
        try {
            File filePath = new File(this.uploadAudioPath + "/" + sysId + "/" + dirName);
            this.logger.debug("上传服务器路径：" + filePath);

            if (!filePath.exists()) {
                filePath.mkdir();
            } else {
//                filePath.delete();
            }
            FileUtils.forceMkdir(filePath);
//            file.transferTo(newFile);
        } catch (IOException e)
        {
            this.logger.debug("文件上传异常", e);
        }
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    File newFile = new File(this.uploadAudioPath + "/" + sysId + "/" + dirName + "/" + file.getOriginalFilename());

                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(newFile));
//                            new File(file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    stream = null;
                    return "You failed to upload " + i + " => "
                            + e.getMessage();
                }
            } else {
                return "You failed to upload " + i
                        + " because the file was empty.";
            }
        }
        this.logger.debug("录音文件上传结束...");
        return ResponseUtil.ok();

    }


    @RequestMapping("/save")
    public
    @ResponseBody
    Object save(String sysId, String dirName) {
        RspSpeech rspSpeech = new RspSpeech();
        RepsVo repsVo = new RepsVo();
        List<SpeechVo> speechVoList = new ArrayList<SpeechVo>();

        String filePath = this.uploadAudioPath + "/" + sysId + "/" + dirName;

        // 开始时间
        long start = System.currentTimeMillis();
        try {
            speechVoList = asrService.uploadFile2(filePath);
            long end = System.currentTimeMillis() - start;
//            repsVo.setFileResultVoList(speechVoList);
//            repsVo.setRespCode("0");
//            repsVo.setTotalTime((end - start)/1000);
        } catch (Exception e) {
//            repsVo.setRespCode("1");
//            repsVo.setRespMessage(e.getMessage());
            e.printStackTrace();
        }
        this.logger.debug("xml解释个数:"+speechVoList.size());
    /*
        this.logger.debug("进入uploadAudio.uploadFilemsg...");
        File dir = new File(this.uploadAudioPath + "/" + sysId + "/" + dirName);
        Message msg = null;
        List<Message> listm = new ArrayList();
        List<String> fileNameList = new ArrayList();
        String idxName = null;
        this.logger.info("dir=" + dir);
        Collection<File> coll = FileUtils.listFiles(dir, FileFilterUtils.suffixFileFilter(""), FileFilterUtils.suffixFileFilter(""));
        String f;
        if (coll != null) {
            Iterator var12 = coll.iterator();

            while(var12.hasNext()) {
                File f = (File)var12.next();
                msg = new Message();
                msg.setFileName(f.getName());
                f = f.getName().substring(f.getName().lastIndexOf(".") + 1);
                if ("csv".equals(f.trim().toLowerCase())) {
                    idxName = f.getName();
                }

                msg.setPrefix(f);
                msg.setSize(FileUtils.sizeOf(f));
                msg.setUsername(this.getUserInfo(request).getId().toString());
                msg.setDate(new Date());
                listm.add(msg);
                fileNameList.add(f.getName());
            }
        }

        boolean isfage = false;
        Iterator var20 = fileNameList.iterator();

        while(var20.hasNext()) {
            f = (String)var20.next();
            if ("csv".equals(f.substring(f.lastIndexOf(".") + 1).trim().toLowerCase())) {
                isfage = true;
                break;
            }
        }

        List fileNameList;
        if (isfage) {
            this.logger.info("有csv文件..................................");
            fileNameList = this.uploadAudioSrviceImpl.verifyFileList(sysId, dirName, fileNameList);
        } else {
            this.logger.info("没有csv文件,进行自动生成..................................");
            fileNameList = this.uploadAudioSrviceImpl.genUploadVideoIndexInfo(sysId, dirName, fileNameList, dir);
        }

        if (fileNameList.size() == 0) {
            this.logger.info("上传录音文件与索引内容没有一个可以匹配");
        } else {
            this.logger.info("保存下来的录音文件集合长度--------------------------------:" + fileNameList.size());
            var20 = fileNameList.iterator();

            while(var20.hasNext()) {
                f = (String)var20.next();
                Iterator var15 = listm.iterator();

                while(var15.hasNext()) {
                    Message m = (Message)var15.next();
                    if (f.equals(m.getFileName())) {Audio u = new YyzjCUploadAudio();
                        u.setUploadId(String.valueOf(this.sequenceMapper.getNextVal("yyzj_c_upload_audio")));
                        u.setSysId(sysId);
                        u.setFileNameUpload(sysId + "/" + dirName + "/" + m.getFileName());
                        u.setFileNameShow(m.getFileName());
                        u.setFileSize((double)m.getSize());
                        u.setFileFormat(m.getPrefix());
                        u.setUploadUser(m.getUsername());
                        u.setUploadTime(m.getDate());
                        u.setTotalScoreId(totalScoreId);
                        this.uploadAudioSrviceImpl.insertSelective(u);
                        this.logger.info("添加上传数据到数据库成功,UploadId=" + u.getUploadId());
                    }
                }
            }

            final String idxName2;
            if (idxName == null) {
                idxName2 = "record.csv";
            } else {
                idxName2 = idxName;
            }

            this.logger.info("控制器中的CSV名称:" + idxName2);

        }
*/
        return ((Map)ResponseUtil.ok()).put("xml", speechVoList);
    }

}