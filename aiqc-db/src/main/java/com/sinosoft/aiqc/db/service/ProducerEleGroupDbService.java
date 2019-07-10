package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCProducerEleValueMapper;
import com.sinosoft.aiqc.db.domain.extend.YyzjCProducerEleValueExt;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProducerEleGroupDbService {

    Logger logger = Logger.getLogger(ProducerEleGroupDbService.class);

    @Resource
    private YyzjCProducerEleValueMapper yyzjCProducerEleValueMapper;

    public List<YyzjCProducerEleValueExt> getProducerEleValueExt(String ruleId) {

        logger.info("getProducerEleValueExt 方法入参：ruleId=" + ruleId);
        List<YyzjCProducerEleValueExt> producerEleValueExtList = yyzjCProducerEleValueMapper.getProducerEleValueExt(ruleId);
        logger.info("getProducerEleValueExt 查询结果：ruleId=" + JSON.toJSONString(producerEleValueExtList));

        return producerEleValueExtList;

    }
}
