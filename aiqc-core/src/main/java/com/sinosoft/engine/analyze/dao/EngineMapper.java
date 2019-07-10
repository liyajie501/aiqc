package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.Engine;

public interface EngineMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Engine paramEngine);
  
  int insertSelective(Engine paramEngine);
  
  Engine selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Engine paramEngine);
  
  int updateByPrimaryKey(Engine paramEngine);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\EngineMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */