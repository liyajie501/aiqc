package com.sinosoft.engine.elasticsearch.service;

import com.github.pagehelper.PageInfo;
import com.huayunworld.znyyzj.engine.elasticsearch.doc.BaseData;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface ESBaseDataSearchService {
  List<BaseData> getByBaseData(BaseData paramBaseData, Pageable paramPageable);
  
  PageInfo<BaseData> getByBaseData(BaseData paramBaseData, int paramInt1, int paramInt2, String paramString1, String paramString2);
  
  Map<Object, Object> getGroupAndCount(BaseData paramBaseData, String paramString);
  
  BaseData getById(String paramString);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\service\ESBaseDataSearchService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */