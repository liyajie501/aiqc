package com.sinosoft.engine.analyze.service;

import com.huayunworld.znyyzj.engine.analyze.model.Category;
import java.util.List;

public interface CategoryService {
  List<Category> CategoryList(Category paramCategory);
  
  int updateByPrimaryKeySelective(Category paramCategory);
  
  int insertSelective(Category paramCategory);
  
  List<Category> CategoryBatch(List<String> paramList);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\CategoryService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */