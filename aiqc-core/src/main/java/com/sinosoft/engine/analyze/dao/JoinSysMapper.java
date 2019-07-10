package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.Engine;
import com.huayunworld.znyyzj.engine.analyze.model.JoinSys;

import java.util.List;

public interface JoinSysMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(JoinSys paramJoinSys);
  
  int insertSelective(JoinSys paramJoinSys);
  
  JoinSys selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(JoinSys paramJoinSys);
  
  int updateByPrimaryKey(JoinSys paramJoinSys);
  
  List<JoinSys> getScanSysList(Engine paramEngine);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\JoinSysMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */