package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.IndexDef;

public interface IndexDefMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(IndexDef paramIndexDef);
  
  int insertSelective(IndexDef paramIndexDef);
  
  IndexDef selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(IndexDef paramIndexDef);
  
  int updateByPrimaryKey(IndexDef paramIndexDef);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\IndexDefMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */