package com.sinosoft.aiqc.db.analyze.cassandra.repository;

import com.sinosoft.aiqc.db.analyze.cassandra.model.BaseData;
import com.sinosoft.aiqc.db.dao.YyzjTBaseDataMapper;
import com.sinosoft.aiqc.db.domain.YyzjTBaseData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BaseDataRepository {

    @Resource
    private YyzjTBaseDataMapper yyzjTBaseDataMapper;


    public YyzjTBaseData getBaseDataById(String baseId) {

        YyzjTBaseData baseData =  yyzjTBaseDataMapper.selectByPrimaryKey(baseId);
        return baseData;

    }
}
