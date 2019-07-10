package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.ScoreAgentRule;
import java.util.List;

public interface ScoreAgentRuleMapper {
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(ScoreAgentRule paramScoreAgentRule);
  
  int inserts(List<ScoreAgentRule> paramList);
  
  int insertSelective(ScoreAgentRule paramScoreAgentRule);
  
  ScoreAgentRule selectByPrimaryKey(Integer paramInteger);
  
  int updateByPrimaryKeySelective(ScoreAgentRule paramScoreAgentRule);
  
  int updateByPrimaryKey(ScoreAgentRule paramScoreAgentRule);
  
  List<ScoreAgentRule> selectByWhere(ScoreAgentRule paramScoreAgentRule);
  
  void checkNeedCount(ScoreAgentRule paramScoreAgentRule);
  
  int countByWhere(ScoreAgentRule paramScoreAgentRule);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ScoreAgentRuleMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */