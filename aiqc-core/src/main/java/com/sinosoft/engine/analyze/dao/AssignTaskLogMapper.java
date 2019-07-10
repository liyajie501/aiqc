package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.AssignTaskLog;

public interface AssignTaskLogMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(AssignTaskLog paramAssignTaskLog);
  
  int insertSelective(AssignTaskLog paramAssignTaskLog);
  
  AssignTaskLog selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(AssignTaskLog paramAssignTaskLog);
  
  int updateByPrimaryKey(AssignTaskLog paramAssignTaskLog);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\AssignTaskLogMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */