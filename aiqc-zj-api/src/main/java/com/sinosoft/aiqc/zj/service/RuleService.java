package com.sinosoft.aiqc.zj.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.domain.YyzjCRule;
import com.sinosoft.aiqc.db.service.RuleDbService;
import com.sinosoft.aiqc.zj.dto.rule.ProducerEleValue;
import com.sinosoft.aiqc.zj.dto.rule.QueryRuleInfosReqDto;
import com.sinosoft.aiqc.zj.dto.rule.RuleAddReqDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 质检规则
 */
@Service
@Transactional
public class RuleService {

    Logger logger = Logger.getLogger(RuleService.class);

    @Autowired
    private RuleDbService ruleDbService;

    /**
     * 质检规则清单查询
     *
     * @return
     */
    public String queryReluInfos(QueryRuleInfosReqDto ruleInfosReqDto) {


        List<YyzjCRule> ruleInfos = ruleDbService.queryReluInfos(JSON.toJSONString(ruleInfosReqDto), ruleInfosReqDto.getPageNum(), ruleInfosReqDto.getPageSize());

        long count = ruleDbService.queryReluCount();

        Map<String, Object> resMap = new HashMap<String, Object>();
        resMap.put("total", count);
        resMap.put("ruleInfos", ruleInfos);
        return JSON.toJSONString(resMap);
    }

    ;

    /**
     * 添加质检规则
     *
     * @param ruleAddReqDto
     */
    public int addRule(RuleAddReqDto ruleAddReqDto) {

        Map<String, String> addMap = new HashMap<String, String>();

        Map<String, String> ruleMap = new HashMap<String, String>();
        ruleMap.put("analyzerId", ruleAddReqDto.getAnalyzerId());
        ruleMap.put("name", ruleAddReqDto.getName());
        ruleMap.put("info", ruleAddReqDto.getInfo());
        ruleMap.put("context", ruleAddReqDto.getContext());
        ruleMap.put("createUser", ruleAddReqDto.getCreateUser());
        ruleMap.put("ruleLabel", ruleAddReqDto.getRuleLabel());
        ruleMap.put("contextShow", ruleAddReqDto.getContextShow());

        List<Map<String, String>> yyzjCProducerEleGroupList = new ArrayList<Map<String, String>>();
        for (List<ProducerEleValue> producerEleValueList : ruleAddReqDto.getItem()) {
            int sort = 1;

            for (ProducerEleValue producerEleValue : producerEleValueList) {
                Map<String, String> producerEleValueMap = new HashMap<String, String>();
                producerEleValueMap.put("sort", Integer.toString(sort));
                sort++;
                yyzjCProducerEleGroupList.add(producerEleValueMap);
            }

        }

        addMap.put("ruleInfo", JSON.toJSONString(addMap));
        addMap.put("producerEleGroupList", JSON.toJSONString(yyzjCProducerEleGroupList));
        addMap.put("producerEleValueList", JSON.toJSONString(ruleAddReqDto.getItem()));

        int resuleNum = ruleDbService.addRule(addMap);

        return resuleNum;
    }

    /**
     * 修改质检规则
     */
    public int updateRule(RuleAddReqDto ruleAddReqDto) {
        logger.info("updateRule 方法入参：" + ruleAddReqDto.toString());

        Map<String, String> updateMap = new HashMap<>();
        updateMap.put("ruleInfo", JSON.toJSONString(ruleAddReqDto));
        int resule = ruleDbService.updateRule(updateMap);

        logger.info("updateRule 方法出参：" + resule);
        return resule;

    }

    /**
     * 规则详细信息查询
     */
    public Map<String, Object> selectDetailedInfoByRuleId(RuleAddReqDto ruleAddReqDto) {
        logger.info("detailedInfo 方法入参：" + ruleAddReqDto.toString());

        Map<String, Object> detailedInfoMap = ruleDbService.selectDetailedInfoByRuleId(ruleAddReqDto.getRuleId());

        logger.info("updateRule 方法出参：" + detailedInfoMap.toString());
        return detailedInfoMap;

    }

}
