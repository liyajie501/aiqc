package com.sinosoft.aiqc.asr.controller;

import com.sinosoft.aiqc.asr.model.RspSpeech;
import com.sinosoft.aiqc.asr.service.AsrService;
import com.sinosoft.aiqc.asr.service.JavaDemo;
import com.sinosoft.aiqc.asr.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by shaoxun on 2019/4/27.
 */

@Controller
@RequestMapping("/asr")
public class BaiduController {

    @Autowired
    private AsrService asrService;

    @RequestMapping("/toTxt.do")
    public @ResponseBody RspSpeech toTxt(@RequestParam("file") MultipartFile files[]) {
        RspSpeech rspSpeech = new RspSpeech();
        String uploadUrl = PropertiesUtil.getPropertyWithPath("/config.properties", "wavUrl");
        for (MultipartFile file : files){
            String fileName = file.getOriginalFilename();
            File targetFile = new File(uploadUrl, fileName);
            try {
                file.transferTo(targetFile);
                String audioPath = uploadUrl + fileName;
                JavaDemo javaDemo = new JavaDemo();
                //180.76.107.131:8050
                javaDemo.run(audioPath,"180.76.107.131", "8050", "1906","true");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return rspSpeech;
    }

}
