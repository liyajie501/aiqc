package com.sinosoft.aiqc.zj.analyze;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.domain.ModelToRule;
import com.sinosoft.aiqc.db.domain.YyzjCRule;
import com.sinosoft.aiqc.db.service.RuleDbService;
import com.sinosoft.aiqc.zj.analyze.entity.ContextShow;
import com.sinosoft.aiqc.zj.dto.detectionTask.DetectionTaskReqDto;
import jdk.nashorn.internal.scripts.JO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAnalyzeService {

    private final Logger logger = Logger.getLogger(ScoreAnalyzeService.class);

    @Autowired
    private RuleDbService ruleDbService;

    /**
     * 评分分析
     *
     * @param detectionTaskReqDto
     */
    public void scoreTask(DetectionTaskReqDto detectionTaskReqDto) {

        logger.info("质检任务-语音评分>>>>>>>>>>>>>>>>>>");
        // 根据模板ID(modelId)查询规则信息
        List<ModelToRule> ruleList = ruleDbService.selectRulesByModelId(detectionTaskReqDto.getModelId());

        for (ModelToRule rule : ruleList) {

            ContextShow contextShow = JSON.parseObject(rule.getContextShow(), ContextShow.class);
            if("".equals("")){


            }













































        }


    }


    public static void main(String[] args) {

        String str = "condition_A || condition_B && condition_C || condition_D && condition_E ";
        str = str.replace("||", " or ");
        str = str.replace("&&", " and ");
        System.out.println(str);
    }

}
