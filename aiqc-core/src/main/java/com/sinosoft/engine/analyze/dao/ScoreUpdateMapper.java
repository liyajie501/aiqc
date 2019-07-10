package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.ScoreUpdate;

public interface ScoreUpdateMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ScoreUpdate paramScoreUpdate);
  
  int insertSelective(ScoreUpdate paramScoreUpdate);
  
  ScoreUpdate selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ScoreUpdate paramScoreUpdate);
  
  int updateByPrimaryKey(ScoreUpdate paramScoreUpdate);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ScoreUpdateMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */