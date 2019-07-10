package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.Keyword;

public interface KeywordMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Keyword paramKeyword);
  
  int insertSelective(Keyword paramKeyword);
  
  Keyword selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Keyword paramKeyword);
  
  int updateByPrimaryKey(Keyword paramKeyword);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\KeywordMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */