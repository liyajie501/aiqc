package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.sinosoft.aiqc.db.dao.YyzjCModelMapper;
import com.sinosoft.aiqc.db.dao.YyzjCModelToRuleMapper;
import com.sinosoft.aiqc.db.domain.YyzjCModel;
import com.sinosoft.aiqc.db.domain.YyzjCModelExample;
import com.sinosoft.aiqc.db.domain.YyzjCModelToRule;
import com.sinosoft.aiqc.db.domain.YyzjCModelToRuleExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ModelManageDbService {

    @Resource
    private YyzjCModelMapper yyzjCModelMapper;
    @Resource
    private YyzjCModelToRuleMapper yyzjCModelToRuleMapper;

    public List<YyzjCModel> select(String modelStr, int pageNum, int pageSize){
        // 分页方法
        PageHelper.startPage(pageNum, pageSize);

        YyzjCModel model = JSON.parseObject(modelStr, YyzjCModel.class);

        YyzjCModelExample example = new YyzjCModelExample();
        YyzjCModelExample.Criteria criteria=example.createCriteria();
        if (model.getName() != null || !"".equals(model.getName())){
            criteria.andNameLike("%" + model.getName() + "%");
        }
        criteria.andDeleteMaskEqualTo("0");

        List<YyzjCModel> modelList = yyzjCModelMapper.selectByExampleSelective(example);
        return modelList;
    }

    /**
     * 添加规则模板
     * @param modelStr
     * @param modelToRuleStr
     * @return
     */
    public int addModel(String modelStr, String modelToRuleStr){

        int resultNum = 0;

        YyzjCModel model = JSON.parseObject(modelStr, YyzjCModel.class);

        String modelId = yyzjCModelMapper.selectMaxModelId();
        int modelId_int = Integer.parseInt(modelId) + 1;

        model.setModelId(Integer.toString(modelId_int));
        model.setPublishMask("0");
        model.setDeleteMask("0");
        model.setCreateTime(LocalDateTime.now());
        int result_A = yyzjCModelMapper.insert(model);

        int result_B = 0;
        List<YyzjCModelToRule> modelToRuleList = JSON.parseArray(modelToRuleStr, YyzjCModelToRule.class);
        for (YyzjCModelToRule modelToRule: modelToRuleList){
            modelToRule.setModelId(Integer.toString(modelId_int));
            result_B = yyzjCModelToRuleMapper.insert(modelToRule);
            // 添加多条数据 如果一条数据插入失败 则全部回滚
            if(result_B == 0){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                break;
            }
        }

        if(result_A == 1 && result_B == 1) {
            resultNum = 1;
        }

        return resultNum;
    }


    /**
     * 修改规则模板
     * @return
     */
    public int updateModel(String modelStr, String modelToRuleStr){

        int resultNum = 0;

        YyzjCModel model = JSON.parseObject(modelStr, YyzjCModel.class);
        int result_A = yyzjCModelMapper.updateByPrimaryKey(model);

        // 规则-模板关系表 yyzj_c_model_to_rule 修改=先删除原有信息，再插入新信息
        List<YyzjCModelToRule> modelToRuleList = JSON.parseArray(modelToRuleStr, YyzjCModelToRule.class);

        YyzjCModelToRuleExample modelToRuleExample = new YyzjCModelToRuleExample();
        YyzjCModelToRuleExample.Criteria criteria = modelToRuleExample.createCriteria();
        criteria.andModelIdEqualTo(modelToRuleList.get(0).getModelId());
        yyzjCModelToRuleMapper.deleteByExample(modelToRuleExample);

        int result_B = 0;
        for (YyzjCModelToRule modelToRule: modelToRuleList){
            modelToRule.setModelId(model.getModelId());
            result_B = yyzjCModelToRuleMapper.insert(modelToRule);

            // 添加多条数据 如果一条数据插入失败 则全部回滚
            if(result_B == 0){
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                break;
            }
        }

        if(result_A == 1 && result_B == 1) {
            resultNum = 1;
        }

        return  resultNum;
    }
}
