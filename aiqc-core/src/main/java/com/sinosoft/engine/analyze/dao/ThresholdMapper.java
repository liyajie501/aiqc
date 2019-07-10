package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.Threshold;

public interface ThresholdMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Threshold paramThreshold);
  
  int insertSelective(Threshold paramThreshold);
  
  Threshold selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Threshold paramThreshold);
  
  int updateByPrimaryKey(Threshold paramThreshold);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ThresholdMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */