package com.sinosoft.engine.elasticsearch.service;

import java.util.List;

public interface ESDocService {
  void save(String paramString1, String paramString2, Object paramObject);
  
  void save(String paramString1, String paramString2, List<Object> paramList);
  
  void get();
  
  void del(String paramString);
  
  void update(String paramString);
  
  void multiGet(String... paramVarArgs) throws Exception;
  
  void bulk(String... paramVarArgs) throws Exception;
  
  void bulkProcesstor(String paramString1, String paramString2, String... paramVarArgs) throws Exception;
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\service\ESDocService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */