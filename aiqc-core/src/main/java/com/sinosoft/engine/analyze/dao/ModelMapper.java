package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.Model;

public interface ModelMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Model paramModel);
  
  int insertSelective(Model paramModel);
  
  Model selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Model paramModel);
  
  int updateByPrimaryKey(Model paramModel);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ModelMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */