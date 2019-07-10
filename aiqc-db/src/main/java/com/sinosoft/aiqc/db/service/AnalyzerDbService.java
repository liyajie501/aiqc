package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCAnalyzerMapper;
import com.sinosoft.aiqc.db.domain.YyzjCAnalyzer;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AnalyzerDbService {

    Logger logger = Logger.getLogger(AnalyzerDbService.class);

    @Resource
    private YyzjCAnalyzerMapper yyzjCAnalyzerMapper;

    public YyzjCAnalyzer selectByPrimaryKey(String analyzerId) {
        logger.info("selectByPrimaryKey 方法入参 analyzerId：" + analyzerId);
        YyzjCAnalyzer analyzer = yyzjCAnalyzerMapper.selectByPrimaryKey(analyzerId);
        logger.info("selectByPrimaryKey 查询结果：" + JSON.toJSONString(analyzer));
        return analyzer;
    }
}
