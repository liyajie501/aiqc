package com.sinosoft.aiqc.db.service;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCRuleMapper;
import com.sinosoft.aiqc.db.dao.YyzjCRuleToTypeMapper;
import com.sinosoft.aiqc.db.dao.YyzjCRuleTypeMapper;
import com.sinosoft.aiqc.db.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class RuleTypeManageDbService {

    @Resource
    private YyzjCRuleToTypeMapper yyzjCRuleToTypeMapper;

    @Resource
    private YyzjCRuleTypeMapper yyzjCRuleTypeMapper;

    @Resource
    private YyzjCRuleMapper yyzjCRuleMapper;

    /**
     * 查询规则库目录
     * @return
     */
    public String queryRuleType(){

        List<YyzjCRuleType> yyyzjCRuleType = yyzjCRuleTypeMapper.selectRuleTreeInfo();

        return JSON.toJSONString(yyyzjCRuleType);
    }

    /**
     * 根据规则库目录查询规则
     * @return
     */
    public String queryRuleInfo(String ruleTypeId, String name){

        List<YyzjCRule> yyzjCRuleList = yyzjCRuleMapper.selectRuleInfoByRuleTypeID(ruleTypeId, name);

        return JSON.toJSONString(yyzjCRuleList);
    }

    /**
     * 添加规则库规则
     * @param addStr
     * @return
     */
    public int addRule(String addStr){

        int resuleNum = 0;

        YyzjCRuleToType yyzjCRuleToType = JSON.parseObject(addStr, YyzjCRuleToType.class);

        YyzjCRuleToTypeExample example = new YyzjCRuleToTypeExample();
        YyzjCRuleToTypeExample.Criteria criteria = example.createCriteria();
        criteria.andRuleIdEqualTo(yyzjCRuleToType.getRuleId());
        criteria.andRuleTypeIdEqualTo(yyzjCRuleToType.getRuleTypeId());
        long count = yyzjCRuleToTypeMapper.countByExample(example);
        if (count <= 0){
            resuleNum =  yyzjCRuleToTypeMapper.insert(yyzjCRuleToType);
        } else if (count > 0){
            resuleNum = 3;
        }


       return resuleNum;
    }

    /**
     * 删除规则库规则
     * @param addStr
     * @return
     */
    public int deleteRule(String addStr){

        YyzjCRuleToType yyzjCRuleToType = JSON.parseObject(addStr, YyzjCRuleToType.class);
        YyzjCRuleToTypeExample example = new YyzjCRuleToTypeExample();
        YyzjCRuleToTypeExample.Criteria criteria = example.createCriteria();
        criteria.andRuleIdEqualTo(yyzjCRuleToType.getRuleId());
        criteria.andRuleTypeIdEqualTo(yyzjCRuleToType.getRuleTypeId());

        int resuleNum =  yyzjCRuleToTypeMapper.deleteByExample(example);

        return resuleNum;
    }


    /**
     * 规则库管理-添加规则库节点
     * @param addStr
     * @return
     */
    public int addNode(String addStr){
        int resuleNum = 0;

        YyzjCRuleType yyzjCRuleType= JSON.parseObject(addStr, YyzjCRuleType.class);

        YyzjCRuleTypeExample example = new YyzjCRuleTypeExample();
        YyzjCRuleTypeExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(yyzjCRuleType.getName());
        criteria.andParentIdEqualTo(yyzjCRuleType.getParentId());
        long count = yyzjCRuleTypeMapper.countByExample(example);
        if (count <= 0) {
            resuleNum = yyzjCRuleTypeMapper.insert(yyzjCRuleType);
        } else if (count > 0){
            resuleNum = 3;
        }
        return resuleNum;
    }

    /**
     * 规则库管理-修改规则库节点
     * @param addStr
     * @return
     */
    public int updateNode(String addStr){

        YyzjCRuleType yyzjCRuleType= JSON.parseObject(addStr, YyzjCRuleType.class);

        YyzjCRuleTypeExample example = new YyzjCRuleTypeExample();
        YyzjCRuleTypeExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(yyzjCRuleType.getName());
        criteria.andParentIdEqualTo(yyzjCRuleType.getParentId());


        int  resuleNum = yyzjCRuleTypeMapper.updateByExampleSelective(yyzjCRuleType, example);

        return resuleNum;
    }


    /**
     * 规则库管理-删除规则库节点
     * @param addStr
     * @return
     */
    public int deleteNode(String addStr){

        YyzjCRuleType yyzjCRuleType= JSON.parseObject(addStr, YyzjCRuleType.class);

        int  resuleNum = yyzjCRuleTypeMapper.deleteByPrimaryKey(yyzjCRuleType.getRuleTypeId());

        return resuleNum;
    }
}
