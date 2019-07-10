package com.sinosoft.engine.analyze.dao;

import com.sinosoft.engine.analyze.model.Category;
import java.util.List;

public interface CategoryMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(Category paramCategory);
  
  int insertSelective(Category paramCategory);
  
  Category selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(Category paramCategory);
  
  int updateByPrimaryKey(Category paramCategory);
  
  List<Category> CategoryList(Category paramCategory);
  
  List<Category> CategoryBatch(List<String> paramList);
}

