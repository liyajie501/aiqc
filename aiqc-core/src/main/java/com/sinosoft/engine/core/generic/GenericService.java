package com.sinosoft.engine.core.generic;

import java.util.List;

public interface GenericService<Model, PK> {
  int insert(Model paramModel);
  
  int update(Model paramModel);
  
  int delete(PK paramPK);
  
  Model selectById(PK paramPK);
  
  Model selectOne();
  
  List<Model> selectList();
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\core\generic\GenericService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */