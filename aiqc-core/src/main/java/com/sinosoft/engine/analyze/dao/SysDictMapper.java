package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.SysDict;

public interface SysDictMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(SysDict paramSysDict);
  
  int insertSelective(SysDict paramSysDict);
  
  SysDict selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(SysDict paramSysDict);
  
  int updateByPrimaryKey(SysDict paramSysDict);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\SysDictMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */