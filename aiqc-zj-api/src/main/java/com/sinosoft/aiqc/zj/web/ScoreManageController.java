package com.sinosoft.aiqc.zj.web;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.zj.common.Contanst;
import com.sinosoft.aiqc.zj.dto.Score.ScoreTotal;
import com.sinosoft.aiqc.zj.service.ScoreManageService;
import com.sun.istack.internal.NotNull;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/score", produces = "application/json;charset=UTF-8")
public class ScoreManageController {

    Logger logger = Logger.getLogger(ScoreManageController.class);

    @Autowired
    private ScoreManageService scoreManageService;

    /**
     * 添加质检任务接口
     *
     * @param reqStr
     * @return
     */
    @RequestMapping({"/add/do"})
    @ResponseBody
    public Object insertDo(@NotNull @RequestBody String reqStr) {

        ScoreTotal scoreTotal = JSON.parseObject(reqStr, ScoreTotal.class);
        int resultNum = scoreManageService.insertScoreInfo(scoreTotal);

        Map<String, String> resultMap = new HashMap<>();
        if (resultNum == 1) {
            resultMap.put("code", Integer.toString(Contanst.SUCCESS));
            resultMap.put("message", "添加成功！");
        } else {
            resultMap.put("code", Integer.toString(Contanst.ERROR));
            resultMap.put("message", "添加失败！");
        }

        return JSON.toJSONString(resultMap);
    }


}
