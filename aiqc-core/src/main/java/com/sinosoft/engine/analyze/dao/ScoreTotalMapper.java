package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.ScoreTotal;

import java.util.List;

public interface ScoreTotalMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ScoreTotal paramScoreTotal);
  
  int insertSelective(ScoreTotal paramScoreTotal);
  
  ScoreTotal selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ScoreTotal paramScoreTotal);
  
  int updateByPrimaryKey(ScoreTotal paramScoreTotal);
  
  List<ScoreTotal> selectByPrimaryKeys(List<String> paramList);
  
  List<ScoreTotal> selectBySysId(String paramString);
  
  List<ScoreTotal> selectByWhere(ScoreTotal paramScoreTotal);
}


