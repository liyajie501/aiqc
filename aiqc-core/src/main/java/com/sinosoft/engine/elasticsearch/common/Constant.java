/*   */ package com.sinosoft.engine.elasticsearch.common;
/*   */ 
/*   */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
/*   */ 
/*   */ public interface Constant {
/* 6 */   public static final String INDEX_NAME = CommonTools.readFile("elasticsearch.properties", "znyyzj.elasticsearch.index");
/* 7 */   public static final String TYPE_BASEDATA = CommonTools.readFile("elasticsearch.properties", "znyyzj.elasticsearch.type");
/*   */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\common\Constant.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */