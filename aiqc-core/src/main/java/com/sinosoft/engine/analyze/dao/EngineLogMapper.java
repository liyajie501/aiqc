package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.EngineLog;

public interface EngineLogMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(EngineLog paramEngineLog);
  
  int insertSelective(EngineLog paramEngineLog);
  
  EngineLog selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(EngineLog paramEngineLog);
  
  int updateByPrimaryKey(EngineLog paramEngineLog);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\EngineLogMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */