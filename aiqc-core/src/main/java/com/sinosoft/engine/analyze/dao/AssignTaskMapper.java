package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.AssignTask;

public interface AssignTaskMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(AssignTask paramAssignTask);
  
  int insertSelective(AssignTask paramAssignTask);
  
  AssignTask selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(AssignTask paramAssignTask);
  
  int updateByPrimaryKey(AssignTask paramAssignTask);
}
