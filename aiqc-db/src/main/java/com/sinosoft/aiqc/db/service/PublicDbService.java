package com.sinosoft.aiqc.db.service;

import com.sinosoft.aiqc.db.dao.YyzjDSysDictMapper;
import com.sinosoft.aiqc.db.domain.YyzjDSysDict;
import com.sinosoft.aiqc.db.domain.YyzjDSysDictExample;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PublicDbService {

    private final Log logger = LogFactory.getLog(PublicDbService.class);

    @Resource
    private  YyzjDSysDictMapper yyzjDSysDictMapper;

    public  List<YyzjDSysDict> queryDataDictionary(String parentId){

        YyzjDSysDictExample yyzjDSysDictExample = new YyzjDSysDictExample();
        YyzjDSysDictExample.Criteria criteria = yyzjDSysDictExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        logger.debug("");
        List<YyzjDSysDict> yyzjDSysDictList = yyzjDSysDictMapper.selectByExample(yyzjDSysDictExample);

        return yyzjDSysDictList;
    }
}
