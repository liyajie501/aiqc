package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.Analyzer;

public interface AnalyzerMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Analyzer paramAnalyzer);
  
  int insertSelective(Analyzer paramAnalyzer);
  
  Analyzer selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Analyzer paramAnalyzer);
  
  int updateByPrimaryKey(Analyzer paramAnalyzer);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\AnalyzerMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */