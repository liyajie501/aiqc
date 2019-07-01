package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.*;
import com.sinosoft.aiqc.db.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 质检规则
 */
@Service
@Transactional
public class RuleDbService {

    @Resource
    private YyzjCRuleMapper yyzjCRuleMapper;
    @Resource
    private YyzjCProducerEleGroupMapper yyzjCProducerEleGroupMapper;
    @Resource
    private YyzjCProducerEleValueMapper YyzjCProducerEleValueMapper;
    @Resource
    private YyzjCRuleToTypeMapper yyzjCRuleToTypeMapper;
    @Resource
    private YyzjCRuleTypeMapper yyzjCRuleTypeMapper;

    /**
     * 质检规则清单查询
     *
     * @return
     */
    public List<YyzjCRule> queryReluInfos(String reqStr) {
        YyzjCRule yyzjCRule = JSON.parseObject(reqStr, YyzjCRule.class);
        yyzjCRule.setDeleteMark("0");
        yyzjCRule.setBuiltinMark("0");
        yyzjCRule.setDictParentId("rule_label");

        List<YyzjCRule> ruleInfos = yyzjCRuleMapper.selectRuleInfos(yyzjCRule);

        return ruleInfos;
    }

    ;

    /**
     * 查询规则总数
     *
     * @return
     */
    public long queryReluCount() {

        YyzjCRule yyzjCRule = new YyzjCRule();
        yyzjCRule.setDeleteMark("0");
        yyzjCRule.setBuiltinMark("0");
        yyzjCRule.setDictParentId("rule_label");

        long count = yyzjCRuleMapper.selectRuleCount(yyzjCRule);
        return count;
    }


    /**
     * 添加质检规则
     *
     * @param
     */
    public void addRule(Map<String, String> addMap) {

        String ruleId = yyzjCRuleMapper.selectMaxRuleId();
        int ruleId_int = Integer.parseInt(ruleId) + 1;
        String groupId = yyzjCProducerEleGroupMapper.selectMaxGroupId();
        int groupId_int = Integer.parseInt(groupId) + 1;

        // 添加质检规则
        YyzjCRule yyzjCRule = JSON.parseObject(addMap.get("ruleInfo"), YyzjCRule.class);
        yyzjCRule.setRuleId(Integer.toString(ruleId_int));
        yyzjCRule.setDeleteMark("0");
        yyzjCRule.setPublishMark("1");
        yyzjCRule.setBuiltinMark("0");
        int result = yyzjCRuleMapper.insertSelective(yyzjCRule);


        List<YyzjCProducerEleGroup> yyzjCProducerEleGroupList = JSON.parseObject(addMap.get("producerEleGroupList"), List.class);
        for (YyzjCProducerEleGroup yyzjCProducerEleGroup : yyzjCProducerEleGroupList) {
            yyzjCProducerEleGroup.setEleGroupId(Integer.toString(groupId_int));
            yyzjCProducerEleGroup.setRuleId(Integer.toString(ruleId_int));
            int result_B = yyzjCProducerEleGroupMapper.insertSelective(yyzjCProducerEleGroup);
        }

        List<YyzjCProducerEleValue> producerEleValueList = JSON.parseObject(addMap.get("producerEleValueList"), List.class);
        for (YyzjCProducerEleValue producerEleValue : producerEleValueList) {
            producerEleValue.setEleGroupId(Integer.toString(groupId_int));
            int result_C = YyzjCProducerEleValueMapper.insertSelective(producerEleValue);
        }

    }

    /**
     * 修改质检规则
     */
    public int updateRule(Map<String, String> updateMap) {

        YyzjCRule yyzjCRule = JSON.parseObject(updateMap.get("ruleInfo"), YyzjCRule.class);

        YyzjCRuleExample yyzjCRuleExample = new YyzjCRuleExample();
        YyzjCRuleExample.Criteria criteria = YyzjCRuleExample.newAndCreateCriteria();
        criteria.andRuleIdEqualTo(yyzjCRule.getRuleId());
        int result = yyzjCRuleMapper.updateByPrimaryKeySelective(yyzjCRule);
        return result;
    }


    public List<ModelToRule> selectRulesByModelId(String modelId) {

        List<ModelToRule> ruleList = yyzjCRuleMapper.selectRulesByModelId(modelId);

        return ruleList;
    }
}
