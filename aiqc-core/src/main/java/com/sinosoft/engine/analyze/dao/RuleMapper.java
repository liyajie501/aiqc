package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.Rule;

import java.util.List;

public interface RuleMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Rule paramRule);
  
  int insertSelective(Rule paramRule);
  
  Rule selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Rule paramRule);
  
  int updateByPrimaryKey(Rule paramRule);
  
  List<Rule> selectByPrimaryKeys(List<String> paramList);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\RuleMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */