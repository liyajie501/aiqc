package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.AlarmLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlarmLogMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(AlarmLog paramAlarmLog);
  
  int insertSelective(AlarmLog paramAlarmLog);
  
  AlarmLog selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(AlarmLog paramAlarmLog);
  
  int updateByPrimaryKey(AlarmLog paramAlarmLog);
  
  List<AlarmLog> getReadySendAlarmList(@Param("list") List<String> paramList);
  
  void createNewTable(@Param("tableNameSuffix") String paramString);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\AlarmLogMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */