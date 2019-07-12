
package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCDictMapper;
import com.sinosoft.aiqc.db.dao.YyzjDSysDictMapper;
import com.sinosoft.aiqc.db.domain.YyzjCDict;
import com.sinosoft.aiqc.db.domain.YyzjCDictExample;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PublicDbService {

    private final Logger logger = Logger.getLogger(PublicDbService.class);

    @Resource
    private YyzjDSysDictMapper yyzjDSysDictMapper;

    @Resource
    private YyzjCDictMapper yyzjCDictMapper;


    public List<YyzjCDict> queryDataDictionary(String type) {
        logger.debug("queryDataDictionary 方法入参：type=" + type);
            /*YyzjDSysDictExample yyzjDSysDictExample = new YyzjDSysDictExample();
            YyzjDSysDictExample.Criteria criteria = yyzjDSysDictExample.createCriteria();
            criteria.andParentIdEqualTo(parentId);

            List<YyzjDSysDict> yyzjDSysDictList = yyzjDSysDictMapper.selectByExample(yyzjDSysDictExample);*/

        YyzjCDictExample yyzjCDictExample = new YyzjCDictExample();
        YyzjCDictExample.Criteria criteria = yyzjCDictExample.createCriteria();
        criteria.andTypeEqualTo(type);

        List<YyzjCDict> yyzjCDictList = yyzjCDictMapper.selectByExample(yyzjCDictExample);

        logger.debug("queryDataDictionary 查询结果：parentId=" + JSON.toJSONString(yyzjCDictList));


        return yyzjCDictList;
    }


    public List<YyzjCDict> queryDataDictionary() {
        logger.debug("queryDataDictionary 进入>>>>>>>>>>>>>>>");

        YyzjCDictExample yyzjCDictExample = new YyzjCDictExample();

        List<YyzjCDict> yyzjCDictList = yyzjCDictMapper.selectByExample(yyzjCDictExample);

        logger.debug("queryDataDictionary 查询结果：parentId=" + JSON.toJSONString(yyzjCDictList));


        return yyzjCDictList;
    }
}
