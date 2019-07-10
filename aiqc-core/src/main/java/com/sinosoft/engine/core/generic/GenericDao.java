package com.sinosoft.engine.core.generic;

public interface GenericDao<Model, PK> {
  int insertSelective(Model paramModel);
  
  int updateByPrimaryKeySelective(Model paramModel);
  
  int deleteByPrimaryKey(PK paramPK);
  
  Model selectByPrimaryKey(PK paramPK);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\core\generic\GenericDao.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */