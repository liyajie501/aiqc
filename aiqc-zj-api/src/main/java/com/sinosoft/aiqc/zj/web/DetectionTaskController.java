package com.sinosoft.aiqc.zj.web;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.zj.dto.detectionTask.DetectionTaskReqDto;
import com.sinosoft.aiqc.zj.service.DetectionTaskService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * 质检任务板块
 */
@RestController
@RequestMapping(value = "/detection/task", produces = "application/json;charset=UTF-8")
@Validated
public class DetectionTaskController {

    private final Logger logger = Logger.getLogger(DetectionTaskController.class);

    @Autowired
    private DetectionTaskService detectionTaskService;
    /**
     * 添加质检任务
     *
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public String addTask(@NotNull @RequestBody String reqStr) {

        logger.info("添加质检任务>>>>>>>>>>>>>>>>>>>>>");
        logger.info("添加质检任务请求报文：" + reqStr);
        DetectionTaskReqDto detectionTaskReqDto = JSON.parseObject(reqStr, DetectionTaskReqDto.class);
        detectionTaskService.detectionTask(detectionTaskReqDto);




        return "";
    }
}
