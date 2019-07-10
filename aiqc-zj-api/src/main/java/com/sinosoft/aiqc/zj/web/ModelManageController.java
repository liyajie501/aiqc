package com.sinosoft.aiqc.zj.web;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.zj.dto.model.ModelReqDto;
import com.sinosoft.aiqc.zj.service.ModelManageService;
import com.sun.istack.internal.NotNull;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 规则模板管理
 */
@RestController
@RequestMapping(value = "/model", produces = "application/json;charset=UTF-8")
@Validated
public class ModelManageController {

    private final Logger logger = Logger.getLogger(ModelManageController.class);

    @Autowired
    private ModelManageService modelManageService;

    /**
     *
     * @param reqStr
     * @return
     */
    @PostMapping("/modelInfo")
    @ResponseBody
    public String modelInfo(@RequestBody String reqStr, int pageNum, int pageSize){
        logger.debug("查询规则模板请求报文：" + reqStr);
        ModelReqDto modelReqDto = JSON.parseObject(reqStr, ModelReqDto.class);

        String  resStr= modelManageService.select(modelReqDto, pageNum, pageSize);
        logger.debug("查询规则模板响应报文：" + resStr);
        return resStr;
    }

    /**
     * 添加质检模板
     * @param reqStr
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public String addModel(@NotNull @RequestBody String reqStr){

        ModelReqDto modelReqDto = JSON.parseObject(reqStr, ModelReqDto.class);

        int resuleNum = modelManageService.addModel(modelReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if(resuleNum == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "添加成功");
        }
        if (resuleNum == 0){
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "添加失败");
        }

        return JSON.toJSONString(resuleMap);
    }

    /**
     * 规则模板修改
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public  String update(@NotNull @RequestBody String reqStr){
        ModelReqDto modelReqDto = JSON.parseObject(reqStr, ModelReqDto.class);

        int resuleNum = modelManageService.updateModel(modelReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if(resuleNum == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "修改成功");
        }
        if (resuleNum == 0){
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "修改失败");
        }
        return JSON.toJSONString(resuleMap);
    }
}
