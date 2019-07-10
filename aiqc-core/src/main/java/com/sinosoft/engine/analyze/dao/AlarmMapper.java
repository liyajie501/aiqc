package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.Alarm;

import java.util.List;

public interface AlarmMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Alarm paramAlarm);
  
  int insertSelective(Alarm paramAlarm);
  
  Alarm selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Alarm paramAlarm);
  
  int updateByPrimaryKey(Alarm paramAlarm);
  
  List<Alarm> selectAllUse();
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\AlarmMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */