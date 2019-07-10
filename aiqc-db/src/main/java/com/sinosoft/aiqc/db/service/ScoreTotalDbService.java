package com.sinosoft.aiqc.db.service;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCScoreTotalMapper;
import com.sinosoft.aiqc.db.domain.YyzjCScoreTotal;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ScoreTotalDbService {

    private static Logger logger = Logger.getLogger(ScoreTotalDbService.class);

    @Resource
    private YyzjCScoreTotalMapper yyzjCScoreTotalMapper;

    /**
     * 模板规则分组表
     *
     * @param scoreTotalStr
     * @return
     */
    public int insertScoreTotal(String scoreTotalStr) {
        logger.info("insertScoreTotal 请求参数：" + scoreTotalStr);

        YyzjCScoreTotal scoreTotal = JSON.parseObject(scoreTotalStr, YyzjCScoreTotal.class);
        scoreTotal.setCreateUser("admin");
        scoreTotal.setCreateTime(LocalDateTime.now());
        scoreTotal.setDeleteMark("0");
        int resultCode = yyzjCScoreTotalMapper.insertSelective(scoreTotal);
        logger.info("insertScoreTotal 插入结果：" + resultCode);
        return resultCode;

    }

    /**
     * 根据ID查询
     *
     * @return
     */
    public YyzjCScoreTotal selectByPrimaryKey(String scoreTotalId) {
        logger.info("selectByPrimaryKey 请求参数：" + scoreTotalId);
        YyzjCScoreTotal yyzjCScoreTotal = yyzjCScoreTotalMapper.selectByPrimaryKey(Integer.parseInt(scoreTotalId));
        logger.info("selectByPrimaryKey 查询结果：" + JSON.toJSONString(yyzjCScoreTotal));

        return yyzjCScoreTotal;
    }

    /**
     * 根据ID批量查询
     *
     * @return
     */
    public List<YyzjCScoreTotal> selectByPrimaryKeys(List<String> totalScoreId) {
        logger.info("selectByPrimaryKeys 请求参数： totalScoreId=" + totalScoreId);
        List<YyzjCScoreTotal> scoreTotalList = yyzjCScoreTotalMapper.selectByPrimaryKeys(totalScoreId);
        logger.info("selectByPrimaryKeys 查询结果：scoreTotalList=" + JSON.toJSONString(scoreTotalList));
        return scoreTotalList;
    }

}
