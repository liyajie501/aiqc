package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.ScoreTotalData;

import java.util.List;

public interface ScoreTotalDataMapper {
    int deleteByPrimaryKey(String paramString);

    int insert(ScoreTotalData paramScoreTotalData);

    int insertSelective(ScoreTotalData paramScoreTotalData);

    ScoreTotalData selectByPrimaryKey(String paramString);

    int updateByPrimaryKeySelective(ScoreTotalData paramScoreTotalData);

    int updateByPrimaryKeyWithBLOBs(ScoreTotalData paramScoreTotalData);

    int updateByPrimaryKey(ScoreTotalData paramScoreTotalData);

    void createNewTable(ScoreTotalData paramScoreTotalData);

    List<String> getAllAgentIds(ScoreTotalData paramScoreTotalData);

    List<ScoreTotalData> selectByWhere(ScoreTotalData paramScoreTotalData);

    int countByWhere(ScoreTotalData paramScoreTotalData);
}