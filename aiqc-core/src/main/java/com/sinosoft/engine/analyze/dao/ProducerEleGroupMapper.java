package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.ProducerEleGroup;
import com.sinosoft.engine.analyze.model.SqlResultMap001;

import java.util.List;

public interface ProducerEleGroupMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(ProducerEleGroup paramProducerEleGroup);
  
  int insertSelective(ProducerEleGroup paramProducerEleGroup);
  
  ProducerEleGroup selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(ProducerEleGroup paramProducerEleGroup);
  
  int updateByPrimaryKey(ProducerEleGroup paramProducerEleGroup);
  
  List<SqlResultMap001> getProducerEleValueExt(String paramString);
}

