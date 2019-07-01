package com.sinosoft.aiqc.zj.web;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.zj.dto.rule.QueryRuleInfosReqDto;
import com.sinosoft.aiqc.zj.dto.rule.RuleAddReqDto;
import com.sinosoft.aiqc.zj.service.RuleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/zj/rule", produces = "application/json;charset=UTF-8")
@Validated
public class RuleController {

    private final Log logger = LogFactory.getLog(RuleController.class);

    @Autowired
    private RuleService ruleService;


    /**
     * 质检规则列表查询接口
     * @return
     */
    @PostMapping("/ruleInfos")
    @ResponseBody
    public String ruleInfos(@NotNull @RequestBody String reqStr){

        QueryRuleInfosReqDto ruleInfosReqDto = JSON.parseObject(reqStr, QueryRuleInfosReqDto.class);
       //  Map<String, Integer> ruleInfosReqMap = JSON.parseObject(reqStr, Map.class);
        String resStr = ruleService.queryReluInfos(ruleInfosReqDto);

        return resStr;
    };

    /**
     * 添加规则
     * @param ruleStr
     */
    @PostMapping("/add")
    public void addRule(@NotNull @RequestBody String ruleStr){

        RuleAddReqDto ruleAddReqDto = JSON.parseObject(ruleStr, RuleAddReqDto.class);

        ruleService.addRule(ruleAddReqDto);
    }

    @PostMapping("/update")
    public String update(@NotNull @RequestBody String ruleStr){

        RuleAddReqDto ruleAddReqDto = JSON.parseObject(ruleStr, RuleAddReqDto.class);

        int result = ruleService.updateRule(ruleAddReqDto);
        Map<String, String> resuleMap = new HashMap<String, String>();
        if(result == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "更新成功");
        }else{
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "更新失败");
        }

        return JSON.toJSONString(resuleMap);
    }

}
