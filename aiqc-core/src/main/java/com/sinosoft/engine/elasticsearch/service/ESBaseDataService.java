package com.sinosoft.engine.elasticsearch.service;

import com.huayunworld.znyyzj.engine.elasticsearch.doc.BaseData;

import java.util.List;

public interface ESBaseDataService {
  boolean save(BaseData paramBaseData);
  
  boolean save(List<BaseData> paramList);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\service\ESBaseDataService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */