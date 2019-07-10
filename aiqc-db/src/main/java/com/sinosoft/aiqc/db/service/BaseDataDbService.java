package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjTBaseDataMapper;
import com.sinosoft.aiqc.db.domain.YyzjTBaseData;
import com.sinosoft.aiqc.db.domain.YyzjTBaseDataExample;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BaseDataDbService {

    private static Logger logger = Logger.getLogger(BaseDataDbService.class);

    @Resource
    private YyzjTBaseDataMapper yyzjTBaseDataMapper;

    /**
     * 根据baseId查询
     *
     * @param baseId
     */
    public List<YyzjTBaseData> selectBybaseId(String baseId) {
        logger.info("selectBybaseId 请求参数：" + baseId);
        YyzjTBaseDataExample yyzjTBaseDataExample = new YyzjTBaseDataExample();
        YyzjTBaseDataExample.Criteria criteria = yyzjTBaseDataExample.createCriteria();
        criteria.andBaseIdEqualTo(baseId);
        List<YyzjTBaseData> yyzjTBaseDataList = yyzjTBaseDataMapper.selectByExampleSelective(yyzjTBaseDataExample);
        logger.info("selectBybaseId 查询结果：" + JSON.toJSONString(yyzjTBaseDataList));
        return yyzjTBaseDataList;
    }

    /**
     * 根据sysId查询
     *
     * @param sysId
     */
    public List<YyzjTBaseData> selectBySysId(String sysId) {
        logger.info("selectBySysId 请求参数：" + sysId);
        YyzjTBaseDataExample yyzjTBaseDataExample = new YyzjTBaseDataExample();
        YyzjTBaseDataExample.Criteria criteria = yyzjTBaseDataExample.createCriteria();
        criteria.andSysIdBakEqualTo(sysId);
        List<YyzjTBaseData> yyzjTBaseDataList = yyzjTBaseDataMapper.selectByExampleSelective(yyzjTBaseDataExample);
        logger.info("selectBySysId 查询结果：" + JSON.toJSONString(yyzjTBaseDataList));
        return yyzjTBaseDataList;
    }


    /**
     * 根据uploadId查询
     *
     * @param uploadId
     */
    public List<YyzjTBaseData> selectByUploadId(String uploadId) {
        logger.info("selectBybaseId 请求参数：" + uploadId);
        YyzjTBaseDataExample yyzjTBaseDataExample = new YyzjTBaseDataExample();
        YyzjTBaseDataExample.Criteria criteria = yyzjTBaseDataExample.createCriteria();
        criteria.andUploadIdEqualTo(uploadId);
        List<YyzjTBaseData> yyzjTBaseDataList = yyzjTBaseDataMapper.selectByExampleSelective(yyzjTBaseDataExample);
        logger.info("selectBybaseId 查询结果：" + JSON.toJSONString(yyzjTBaseDataList));
        return yyzjTBaseDataList;
    }
}
