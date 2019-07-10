package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.ProducerEle;

public interface ProducerEleMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ProducerEle paramProducerEle);
  
  int insertSelective(ProducerEle paramProducerEle);
  
  ProducerEle selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ProducerEle paramProducerEle);
  
  int updateByPrimaryKey(ProducerEle paramProducerEle);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\ProducerEleMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */