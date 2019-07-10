package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.Appeal;

public interface AppealMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Appeal paramAppeal);
  
  int insertSelective(Appeal paramAppeal);
  
  Appeal selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Appeal paramAppeal);
  
  int updateByPrimaryKey(Appeal paramAppeal);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\AppealMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */