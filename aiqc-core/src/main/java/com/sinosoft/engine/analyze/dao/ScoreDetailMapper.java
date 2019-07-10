package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.RuleAndScoreDetail;
import com.sinosoft.engine.analyze.model.ScoreDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreDetailMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ScoreDetail paramScoreDetail);
  
  int insertSelective(ScoreDetail paramScoreDetail);
  
  ScoreDetail selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ScoreDetail paramScoreDetail);
  
  int updateByPrimaryKey(ScoreDetail paramScoreDetail);
  
  List<RuleAndScoreDetail> selectByTotalScoreId(@Param("totalScoreId") String paramString, @Param("ruleIds") List<String> paramList);
  
  List<String> selectRuleIdsByTotalScoreId(@Param("totalScoreId") String paramString);
}