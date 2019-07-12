package com.sinosoft.aiqc.zj.web;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.zj.dto.rule.QueryRuleInfosReqDto;
import com.sinosoft.aiqc.zj.dto.rule.RuleAddReqDto;
import com.sinosoft.aiqc.zj.service.RuleService;
import com.sun.istack.internal.NotNull;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/zj/rule", produces = "application/json;charset=UTF-8")
@Validated
public class RuleController {

    private final Logger logger = Logger.getLogger(RuleController.class);

    @Autowired
    private RuleService ruleService;


    /**
     * 质检规则列表查询接口
     *
     * @return
     */
    @PostMapping("/ruleInfos")
    @ResponseBody
    public String ruleInfos(@RequestBody @NotNull String reqStr) {
        logger.info("ruleInfos 接口请求报文：" + reqStr);

        Map<String, String> resultMap = new HashMap<>();

        QueryRuleInfosReqDto ruleInfosReqDto = JSON.parseObject(reqStr, QueryRuleInfosReqDto.class);

        String resultStr = ruleService.queryReluInfos(ruleInfosReqDto);

        logger.info("ruleInfos 接口返回报文：" + resultStr);

        if (resultStr == null || "".equals(resultStr)) {
            resultMap.put("resule", "failure");
            resultMap.put("message", "未查询到信息");
            resultStr = JSON.toJSONString(resultMap);
        }

        return resultStr;
    }

    ;

    /**
     * 添加
     *
     * @param ruleStr
     */
    @PostMapping("/add")
    public String addRule(@NotNull @RequestBody String ruleStr) {

        RuleAddReqDto ruleAddReqDto = JSON.parseObject(ruleStr, RuleAddReqDto.class);

        int resuleNum = ruleService.addRule(ruleAddReqDto);

        Map<String, String> resuleMap = new HashMap<>();
        if (resuleNum == 1) {
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "添加成功");
        } else {
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "添加失败");
        }

        return JSON.toJSONString(resuleMap);
    }

    @PostMapping("/update")
    public String update(@NotNull @RequestBody String ruleStr) {

        logger.info("update 规则修改接口请求报文：" + ruleStr);

        RuleAddReqDto ruleAddReqDto = JSON.parseObject(ruleStr, RuleAddReqDto.class);

        int result = ruleService.updateRule(ruleAddReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if (result == 1) {
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "更新成功");
        } else {
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "更新失败");
        }
        String resuleStr = JSON.toJSONString(resuleMap);
        logger.info("update 规则修改接口响应报文：" + resuleStr);
        return resuleStr;
    }

    @PostMapping("/detailedInfo")
    public String detailedInfo(@NotNull @RequestBody String ruleStr) {
        logger.info("detailedInfo 规则详细信息接口请求报文：" + ruleStr);
        RuleAddReqDto ruleAddReqDto = JSON.parseObject(ruleStr, RuleAddReqDto.class);

       ruleService.detailedInfo(ruleAddReqDto);


        return "";
    }

}
