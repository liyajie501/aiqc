package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCScoreTotalMapper;
import com.sinosoft.aiqc.db.domain.YyzjCScoreTotal;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 质检任务持久层
 */
@Service
@Transactional
public class DetectionTaskDbService {

    @Resource
    private YyzjCScoreTotalMapper scoreTotalMapper;

    /**
     * 添加质检任务
     *
     * @param reqStr
     * @return 返回任务ID
     */
    public String addTask(String reqStr) {
        YyzjCScoreTotal scoreTotal = JSON.parseObject(reqStr, YyzjCScoreTotal.class);

        YyzjCScoreTotal scoreTotal_return = scoreTotalMapper.insertReturnClass(scoreTotal);

        return Integer.toString(scoreTotal_return.getTotalScoreId());

    }





}

