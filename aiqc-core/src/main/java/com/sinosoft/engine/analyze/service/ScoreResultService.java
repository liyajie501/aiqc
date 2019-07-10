package com.sinosoft.engine.analyze.service;

import com.huayunworld.znyyzj.engine.analyze.model.ScoreResult;

import java.util.List;

public interface ScoreResultService {
  List<ScoreResult> selectWhereScoreResult(ScoreResult paramScoreResult);
  
  int updateByPrimaryKeySelective(ScoreResult paramScoreResult);
  
  void runCountScoreTotalResult(String paramString);
  
  List<ScoreResult> getNeedCountScoreTotalResult();
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\ScoreResultService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */