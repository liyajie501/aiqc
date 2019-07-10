package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCScoreDetailMapper;
import com.sinosoft.aiqc.db.domain.YyzjCScoreDetail;
import com.sinosoft.aiqc.db.domain.extend.RuleAndScoreDetail;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ScoreDetailDbService {

    Logger logger = Logger.getLogger(ScoreDetailDbService.class);

    @Resource
    private YyzjCScoreDetailMapper yyzjCScoreDetailMapper;


    public int insertScoreDateil(String scoreDetailStr) {
        logger.info("insertScoreDateil 方法入参：" + scoreDetailStr);
        YyzjCScoreDetail yyzjCScoreDetail = JSON.parseObject(scoreDetailStr, YyzjCScoreDetail.class);
        yyzjCScoreDetail.setCreateUser("admin");
        yyzjCScoreDetail.setCreateTime(LocalDateTime.now());
        yyzjCScoreDetail.setPublishMark("1");
        yyzjCScoreDetail.setDeleteMark("0");
        int resuleCode = yyzjCScoreDetailMapper.insert(yyzjCScoreDetail);
        logger.info("insertScoreDateil insert结果：" + resuleCode);
        return resuleCode;

    }


    public List<RuleAndScoreDetail> selectByTotalScoreId(String totalScoreId, List<String> ruleIds) {
        logger.info("selectByTotalScoreId 方法入参 totalScoreId：" + totalScoreId + "；ruleIds：" + JSON.toJSONString(ruleIds));
        List<RuleAndScoreDetail> ruleAndScoreDetailList = yyzjCScoreDetailMapper.selectByTotalScoreId(totalScoreId, ruleIds);
        logger.info("selectByTotalScoreId 查询结果：" + JSON.toJSONString(ruleAndScoreDetailList));
        return ruleAndScoreDetailList;
    }

}
