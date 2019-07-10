package com.sinosoft.aiqc.db.service;

import com.sinosoft.aiqc.db.dao.YyzjTScoreDetailDataMapper;
import com.sinosoft.aiqc.db.domain.YyzjTScoreDetailData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScoreDetailDataDbService {

    @Resource
    private YyzjTScoreDetailDataMapper yyzjTScoreDetailDataMapper;

    public void insertScoreDetailData(YyzjTScoreDetailData scoreDetailData){
        yyzjTScoreDetailDataMapper.insert(scoreDetailData);
    }

}
