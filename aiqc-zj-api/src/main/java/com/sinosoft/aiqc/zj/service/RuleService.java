package com.sinosoft.aiqc.zj.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCRuleMapper;
import com.sinosoft.aiqc.db.dao.YyzjCRuleToTypeMapper;
import com.sinosoft.aiqc.db.dao.YyzjCRuleTypeMapper;
import com.sinosoft.aiqc.db.domain.YyzjCProducerEleGroup;
import com.sinosoft.aiqc.db.domain.YyzjCRule;
import com.sinosoft.aiqc.db.service.RuleDbService;
import com.sinosoft.aiqc.zj.dto.rule.ProducerEleValue;
import com.sinosoft.aiqc.zj.dto.rule.QueryRuleInfosReqDto;
import com.sinosoft.aiqc.zj.dto.rule.RuleAddReqDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 质检规则
 */
@Service
public class RuleService {

    @Autowired
    private RuleDbService ruleDbService;

    /**
     * 质检规则清单查询
     * @return
     */
    public String queryReluInfos(QueryRuleInfosReqDto ruleInfosReqDto){


        // List<YyzjCRule> ruleInfos = ruleDbService.queryReluInfos(ruleInfosReqDto.getPageNum(), ruleInfosReqDto.getPageSize());
        List<YyzjCRule> ruleInfos = ruleDbService.queryReluInfos(JSON.toJSONString(ruleInfosReqDto));

        long count = ruleDbService.queryReluCount();

        Map<String, Object> resMap = new HashMap<String, Object>();
        resMap.put("total", count);
        resMap.put("ruleInfos", ruleInfos);
        return JSON.toJSONString(resMap);
    };

    /**
     * 添加质检规则
     * @param ruleAddReqDto
     */
    public void addRule(RuleAddReqDto ruleAddReqDto){

        Map<String, String> addMap = new HashMap<String, String>();

        Map<String,String> ruleMap = new HashMap<String, String>();
        ruleMap.put("analyzerId", ruleAddReqDto.getAnalyzerId());
        ruleMap.put("name", ruleAddReqDto.getName());
        ruleMap.put("info", ruleAddReqDto.getInfo());
        ruleMap.put("context", ruleAddReqDto.getContext());
        ruleMap.put("createUser", ruleAddReqDto.getCreateUser());
        ruleMap.put("ruleLabel", ruleAddReqDto.getRuleLabel());
        ruleMap.put("contextShow", ruleAddReqDto.getContextShow());

        List<Map<String, String>> yyzjCProducerEleGroupList = new ArrayList<Map<String, String>>();
        for(List<ProducerEleValue> producerEleValueList: ruleAddReqDto.getItem()) {
            int sort = 1;

            for (ProducerEleValue producerEleValue : producerEleValueList) {
                Map<String, String> producerEleValueMap = new HashMap<String, String>();
                producerEleValueMap.put("sort", Integer.toString(sort));
                sort++;
                yyzjCProducerEleGroupList.add(producerEleValueMap);
            }

        }

        addMap.put("ruleInfo", JSON.toJSONString(addMap));
        addMap.put("producerEleGroupList",  JSON.toJSONString(yyzjCProducerEleGroupList));
        addMap.put("producerEleValueList",  JSON.toJSONString(ruleAddReqDto.getItem()));

        ruleDbService.addRule(addMap);
    }

    /**
     * 修改质检规则
     */
    public int updateRule(RuleAddReqDto ruleAddReqDto){

        Map<String, String> updateMap = new HashMap<>();
        updateMap.put("ruleInfo", JSON.toJSONString(ruleAddReqDto));
       int resule =  ruleDbService.updateRule(updateMap);
       return resule;

    }

}
