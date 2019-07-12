package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sinosoft.aiqc.db.dao.*;
import com.sinosoft.aiqc.db.domain.*;
import com.sinosoft.aiqc.db.domain.extend.YyzjCProducerEleValueExt;
import org.apache.log4j.Logger;
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

    Logger logger = Logger.getLogger(RuleDbService.class);

    @Resource
    private YyzjCRuleMapper yyzjCRuleMapper;
    @Resource
    private YyzjCProducerEleGroupMapper yyzjCProducerEleGroupMapper;
    @Resource
    private YyzjCProducerEleValueMapper yyzjCProducerEleValueMapper;
    @Resource
    private YyzjCRuleToTypeMapper yyzjCRuleToTypeMapper;
    @Resource
    private YyzjCRuleTypeMapper yyzjCRuleTypeMapper;

    /**
     * 质检规则清单查询
     *
     * @return
     */
    public List<YyzjCRule> queryReluInfos(String reqStr, int pageNum, int pageSize) {
        logger.info("queryReluInfos 方法入参：" + reqStr);

        PageHelper.startPage(pageNum, pageSize);

         /* YyzjCRule yyzjCRule = JSON.parseObject(reqStr, YyzjCRule.class);
        yyzjCRule.setDeleteMark("0");
        yyzjCRule.setBuiltinMark("0");*/

        Map<String, Object> yyzjCRuleMap = JSON.parseObject(reqStr);
        yyzjCRuleMap.put("deleteMark", "0");
        yyzjCRuleMap.put("builtinMark", "0");
        yyzjCRuleMap.put("pageNum", Integer.toString(pageNum));
        yyzjCRuleMap.put("pageSize", Integer.toString(pageSize));
        logger.info("queryReluInfos 查询条件：" + JSON.toJSONString(yyzjCRuleMap));

        List<YyzjCRule> ruleInfos = yyzjCRuleMapper.selectRuleInfos(yyzjCRuleMap);
        PageInfo<YyzjCRule> pageInfo = new PageInfo<>(ruleInfos);
        System.out.println(JSON.toJSONString(pageInfo));

       /* YyzjCRuleExample yyzjCRuleExample = new YyzjCRuleExample();
        YyzjCRuleExample.Criteria criteria = yyzjCRuleExample.createCriteria();
        criteria.andDeleteMarkEqualTo("0");
        criteria.andBuiltinMarkEqualTo("0");
        List<YyzjCRule> ruleInfos = yyzjCRuleMapper.selectByExampleSelective(yyzjCRuleExample);*/

        logger.info("queryReluInfos 查询结果：" + JSON.toJSONString(ruleInfos));
        return ruleInfos;
    }

    ;

    /**
     * 查询规则总数
     *
     * @return
     */
    public long queryReluCount() {

        /*YyzjCRule yyzjCRule = new YyzjCRule();
        yyzjCRule.setDeleteMark("0");
        yyzjCRule.setBuiltinMark("0");
        yyzjCRule.setDictParentId("rule_label");
        // selectRuleCount*/
        YyzjCRuleExample yyzjCRuleExample = new YyzjCRuleExample();
        YyzjCRuleExample.Criteria criteria = yyzjCRuleExample.createCriteria();
        criteria.andBuiltinMarkEqualTo("0");
        criteria.andDeleteMarkEqualTo("0");

        long count = yyzjCRuleMapper.countByExample(yyzjCRuleExample);

        return count;
    }


    /**
     * 添加质检规则
     *
     * @param
     */
    public int addRule(Map<String, String> addMap) {

        int resuleNum;

        // 查询最大RuleId
        String ruleId = yyzjCRuleMapper.selectMaxRuleId();
        int ruleId_int = Integer.parseInt(ruleId) + 1;

        // 查询最大GroupId
        String groupId = yyzjCProducerEleGroupMapper.selectMaxGroupId();
        int groupId_int = Integer.parseInt(groupId) + 1;

        // 添加质检规则
        YyzjCRule yyzjCRule = JSON.parseObject(addMap.get("ruleInfo"), YyzjCRule.class);
        yyzjCRule.setRuleId(Integer.toString(ruleId_int));
        yyzjCRule.setDeleteMark("0");
        yyzjCRule.setPublishMark("1");
        yyzjCRule.setBuiltinMark("0");
        resuleNum = yyzjCRuleMapper.insertSelective(yyzjCRule);


        List<YyzjCProducerEleGroup> yyzjCProducerEleGroupList = JSON.parseObject(addMap.get("producerEleGroupList"), List.class);
        for (YyzjCProducerEleGroup yyzjCProducerEleGroup : yyzjCProducerEleGroupList) {
            yyzjCProducerEleGroup.setEleGroupId(Integer.toString(groupId_int));
            yyzjCProducerEleGroup.setRuleId(Integer.toString(ruleId_int));
            resuleNum = yyzjCProducerEleGroupMapper.insertSelective(yyzjCProducerEleGroup);
        }

        List<YyzjCProducerEleValue> producerEleValueList = JSON.parseObject(addMap.get("producerEleValueList"), List.class);
        for (YyzjCProducerEleValue producerEleValue : producerEleValueList) {
            producerEleValue.setEleGroupId(Integer.toString(groupId_int));
            resuleNum = yyzjCProducerEleValueMapper.insertSelective(producerEleValue);
        }

        return resuleNum;
    }

    /**
     * 修改质检规则
     */
    public int updateRule(Map<String, String> updateMap) {
        logger.info("updateRule 方法入参：" + updateMap.toString());
        logger.info("ruleInfo：" + updateMap.get("ruleInfo"));
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


    public List<YyzjCRule> selectByPrimaryKeys(List<String> var1) {
        List<YyzjCRule> ruleList = yyzjCRuleMapper.selectByPrimaryKeys(var1);
        return ruleList;
    }


    /**
     * 根据ruleId查询规则详细信息
     * @param ruleId
     * @return
     */
    public  Map<String, Object> selectDetailedInfoByRuleId(String ruleId) {
        Map<String, Object> detailedInfoMap = new HashMap<>();

        YyzjCRule yyzjCRule = yyzjCRuleMapper.selectByPrimaryKey(ruleId);

        List<YyzjCProducerEleValueExt> yyzjCProducerEleValueExtList = yyzjCProducerEleValueMapper.getProducerEleValueExt(ruleId);

        detailedInfoMap.put("ruleInfo", yyzjCRule);
        detailedInfoMap.put("item", yyzjCProducerEleValueExtList);

        return detailedInfoMap;
    }
}
