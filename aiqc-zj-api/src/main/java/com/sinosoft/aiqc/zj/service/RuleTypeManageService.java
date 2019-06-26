package com.sinosoft.aiqc.zj.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.service.RuleTypeManageDbService;
import com.sinosoft.aiqc.zj.dto.rule.RuleTypeManageReqDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleTypeManageService {

    @Autowired
    private RuleTypeManageDbService ruleTypeManageDbService;


    /**
     * 查询规则库菜单
     * @return
     */
    public String queryRuleType(){

       String resuleStr = ruleTypeManageDbService.queryRuleType();

        return resuleStr;
    }

    /**
     * 根据规则库ID查询规则信息
     * @return
     */
    public String queryRuleInfo(RuleTypeManageReqDto ruleTypeManageReqDto){

        String resuleStr = ruleTypeManageDbService.queryRuleInfo(ruleTypeManageReqDto.getRuleTypeId(), ruleTypeManageReqDto.getName());

        return resuleStr;
    }

    /**
     * 添加规则库规则
     * @param ruleTypeManageReqDto
     * @return
     */
    public int addRule(RuleTypeManageReqDto ruleTypeManageReqDto){

       int resuleNum = ruleTypeManageDbService.addRule(JSON.toJSONString(ruleTypeManageReqDto));

       return resuleNum;
    }

    /**
     * 删除规则库规则
     * @param ruleTypeManageReqDto
     * @return
     */
    public int deleteRule(RuleTypeManageReqDto ruleTypeManageReqDto){

        int resuleNum = ruleTypeManageDbService.deleteRule(JSON.toJSONString(ruleTypeManageReqDto));

        return resuleNum;
    }

    /**
     *  规则库管理-添加规则库节点
     * @param ruleTypeManageReqDto
     * @return
     */
    public int addNode(RuleTypeManageReqDto ruleTypeManageReqDto){


        int resuleNum = ruleTypeManageDbService.addNode(JSON.toJSONString(ruleTypeManageReqDto));

        return resuleNum;
    }

    /**
     *  规则库管理-修改规则库节点
     * @param ruleTypeManageReqDto
     * @return
     */
    public int updateNode(RuleTypeManageReqDto ruleTypeManageReqDto){


        int resuleNum = ruleTypeManageDbService.updateNode(JSON.toJSONString(ruleTypeManageReqDto));

        return resuleNum;
    }


    /**
     *  规则库管理-修改规则库节点
     * @param ruleTypeManageReqDto
     * @return
     */
    public int deleteNode(RuleTypeManageReqDto ruleTypeManageReqDto){


        int resuleNum = ruleTypeManageDbService.deleteNode(JSON.toJSONString(ruleTypeManageReqDto));

        return resuleNum;
    }

}
