package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.ProducerEleValue;

public interface ProducerEleValueMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ProducerEleValue paramProducerEleValue);
  
  int insertSelective(ProducerEleValue paramProducerEleValue);
  
  ProducerEleValue selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ProducerEleValue paramProducerEleValue);
  
  int updateByPrimaryKey(ProducerEleValue paramProducerEleValue);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ProducerEleValueMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */