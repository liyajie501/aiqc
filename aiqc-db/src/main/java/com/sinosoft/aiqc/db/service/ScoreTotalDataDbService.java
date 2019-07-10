package com.sinosoft.aiqc.db.service;

import com.sinosoft.aiqc.db.dao.YyzjTScoreTotalDataMapper;
import com.sinosoft.aiqc.db.domain.YyzjTScoreTotalData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScoreTotalDataDbService {

    @Resource
    private YyzjTScoreTotalDataMapper yyzjTScoreTotalDataMapper;


    public void insertScoreTotalData(YyzjTScoreTotalData tData) {
        yyzjTScoreTotalDataMapper.insert(tData);
    }

}
