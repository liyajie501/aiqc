package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.ScoreResult;
import java.util.List;

public interface ScoreResultMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ScoreResult paramScoreResult);
  
  int insertSelective(ScoreResult paramScoreResult);
  
  ScoreResult selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ScoreResult paramScoreResult);
  
  int updateByPrimaryKey(ScoreResult paramScoreResult);
  
  List<ScoreResult> selectWhereScoreResult(ScoreResult paramScoreResult);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ScoreResultMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */