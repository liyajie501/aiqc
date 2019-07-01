package com.sinosoft.aiqc.zj.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.service.DetectionTaskDbService;
import com.sinosoft.aiqc.zj.analyze.ScoreAnalyzeService;
import com.sinosoft.aiqc.zj.dto.detectionTask.DetectionTaskReqDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetectionTaskService {

    private final Logger logger = Logger.getLogger(DetectionTaskService.class);

    @Autowired
    private ScoreAnalyzeService scoreAnalyzeService;
    @Autowired
    private DetectionTaskDbService detectionTaskDbService;

    /**
     * 质检任务
     *
     * @param detectionTaskReqDto
     */
    public void detectionTask(DetectionTaskReqDto detectionTaskReqDto) {

        logger.info("添加质检任务>>>>>>>>>>>>>>>>>>");
        // 调用质检任务持久层并将质检任务入库
        String totalScoreId = detectionTaskDbService.addTask(JSON.toJSONString(detectionTaskReqDto));
        logger.info("质检任务主键ID totalScoreId :" + totalScoreId);
        detectionTaskReqDto.setTotalScoreId(totalScoreId);


        scoreAnalyzeService.scoreTask(detectionTaskReqDto);

    }

}
