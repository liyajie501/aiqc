package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.constant.BaseInfo;
import com.huayunworld.znyyzj.engine.analyze.model.BaseData;
import java.util.List;

public interface BaseDataMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(BaseData paramBaseData);
  
  int insertSelective(BaseData paramBaseData);
  
  BaseData selectByPrimaryKey(String paramString);
  
  List<String> selectByWhereRrturnIds(BaseData paramBaseData);
  
  int updateByPrimaryKeySelective(BaseData paramBaseData);
  
  int updateByPrimaryKey(BaseData paramBaseData);
  
  int createNewTable(BaseData paramBaseData);
  
  List<String> selectByBaseInfo(BaseInfo paramBaseInfo);
  
  int countByBaseInfo(BaseInfo paramBaseInfo);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\BaseDataMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */