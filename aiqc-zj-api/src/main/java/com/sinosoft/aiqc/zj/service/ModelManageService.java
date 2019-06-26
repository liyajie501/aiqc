package com.sinosoft.aiqc.zj.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.domain.YyzjCModel;
import com.sinosoft.aiqc.db.service.ModelManageDbService;
import com.sinosoft.aiqc.zj.dto.model.ModelReqDto;
import com.sinosoft.aiqc.zj.dto.model.ModelToRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelManageService {

    @Autowired
    private ModelManageDbService modelManageDbService;

    /**
     * 查询规则模板列表信息
     * @param modelReqDto
     * @return
     */
    public String select(ModelReqDto modelReqDto, int pageNum, int pageSize){

        List<YyzjCModel> modelList = modelManageDbService.select(JSON.toJSONString(modelReqDto), pageNum, pageSize);

        return JSON.toJSONString(modelList);
    }

    /**
     * 添加规则模板
     * @param modelReqDto
     * @return
     */
    public int addModel(ModelReqDto modelReqDto){

        List<ModelToRule> modelToRuleList = modelReqDto.getModelToRule();

        int resultNum = modelManageDbService.addModel(JSON.toJSONString(modelReqDto),JSON.toJSONString(modelToRuleList));

        return resultNum;
    }

    /**
     * 修改规则模型
     * @param modelReqDto
     * @return
     */
    public int updateModel(ModelReqDto modelReqDto){

        List<ModelToRule> modelToRuleList = modelReqDto.getModelToRule();

        int resultNum = modelManageDbService.updateModel(JSON.toJSONString(modelReqDto),JSON.toJSONString(modelToRuleList));

        return resultNum;
    }
}
