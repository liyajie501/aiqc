package com.sinosoft.aiqc.zj.web;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.zj.dto.rule.RuleTypeManageReqDto;
import com.sinosoft.aiqc.zj.service.RuleTypeManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * 质检规则-规则库管理
 */
@Controller
@RequestMapping(
    value = "/rule/base", produces = "application/json;charset=UTF-8")

    public class RuleTypeManageController {
    @Autowired
    private RuleTypeManageService ruleTypeManageService;

    /**
     * 规则库-规则菜单查询
     * @param reqStr
     * @return
     */
    @PostMapping("/tree/load")
    @ResponseBody
    public String load(@RequestBody @NotNull String reqStr){

        String resuleStr = ruleTypeManageService.queryRuleType();
        return resuleStr;
    }

    /**
     * 规则库管理-规则信息
     * @param reqStr
     * @return
     */
    @PostMapping("/ruleInfo")
    @ResponseBody
    public String loadRelation(@RequestBody @NotNull String reqStr){
        RuleTypeManageReqDto ruleTypeManageReqDto = JSON.parseObject(reqStr, RuleTypeManageReqDto.class);

        String resuleStr = ruleTypeManageService.queryRuleInfo(ruleTypeManageReqDto);

        return resuleStr;
    }


    /**
     * 规则库管理-加入规则
     */
    @PostMapping("/addRule")
    @ResponseBody
    public String addRule(@RequestBody @NotNull String reqStr){

        RuleTypeManageReqDto ruleTypeManageReqDto = JSON.parseObject(reqStr, RuleTypeManageReqDto.class);
        int resuleNum = ruleTypeManageService.addRule(ruleTypeManageReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if(resuleNum == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "添加成功");
        } else if(resuleNum == 3){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "该规则已添加");
        } else if (resuleNum == 0){
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "添加失败");
        }

        return JSON.toJSONString(resuleMap);
    }


    /**
     * 规则库管理-删除规则
     * @return
     */
    @PostMapping("/deleteRule")
    @ResponseBody
    public String deleteRule(@RequestBody @NotNull String reqStr){
        RuleTypeManageReqDto ruleTypeManageReqDto = JSON.parseObject(reqStr, RuleTypeManageReqDto.class);
        int resuleNum = ruleTypeManageService.deleteRule(ruleTypeManageReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if(resuleNum == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "删除成功");
        }else{
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "删除失败");
        }

        return JSON.toJSONString(resuleMap);
    }

    /**
     * 添加规则库节点
     * @param reqStr
     * @return
     */
    @PostMapping("/addNode")
    @ResponseBody
    public String addNode(@RequestBody @NotNull String reqStr){
        RuleTypeManageReqDto ruleTypeManageReqDto = JSON.parseObject(reqStr, RuleTypeManageReqDto.class);
        int resuleNum =  ruleTypeManageService.addNode(ruleTypeManageReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if(resuleNum == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "添加成功");
        }
        if(resuleNum == 3){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "该节点已存在");
        }
        if (resuleNum == 0){
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "添加失败");
        }

        return JSON.toJSONString(resuleMap);
    }

    /**
     * 修改规则库节点
     * @param reqStr
     * @return
     */
    @PostMapping("/updateNode")
    @ResponseBody
    public String updateNode(@RequestBody @NotNull String reqStr){
        RuleTypeManageReqDto ruleTypeManageReqDto = JSON.parseObject(reqStr, RuleTypeManageReqDto.class);
        int resuleNum =  ruleTypeManageService.updateNode(ruleTypeManageReqDto);

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

    /**
     * 删除规则库节点
     * @param reqStr
     * @return
     */
    @PostMapping("/deleteNode")
    @ResponseBody
    public String deleteNode(@RequestBody @NotNull String reqStr){
        RuleTypeManageReqDto ruleTypeManageReqDto = JSON.parseObject(reqStr, RuleTypeManageReqDto.class);
        int resuleNum =  ruleTypeManageService.deleteNode(ruleTypeManageReqDto);

        Map<String, String> resuleMap = new HashMap<String, String>();
        if(resuleNum == 1){
            resuleMap.put("resultCode", "success");
            resuleMap.put("resultMessage", "删除成功");
        }
        if (resuleNum == 0){
            resuleMap.put("resultCode", "failure");
            resuleMap.put("resultMessage", "删除失败");
        }

        return JSON.toJSONString(resuleMap);
    }

}
