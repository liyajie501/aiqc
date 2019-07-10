package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.SysConfig;

public interface SysConfigMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(SysConfig paramSysConfig);
  
  int insertSelective(SysConfig paramSysConfig);
  
  SysConfig selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(SysConfig paramSysConfig);
  
  int updateByPrimaryKey(SysConfig paramSysConfig);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\SysConfigMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */