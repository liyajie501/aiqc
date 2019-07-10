package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.OperLog;

public interface OperLogMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(OperLog paramOperLog);
  
  int insertSelective(OperLog paramOperLog);
  
  OperLog selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(OperLog paramOperLog);
  
  int updateByPrimaryKey(OperLog paramOperLog);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\OperLogMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */