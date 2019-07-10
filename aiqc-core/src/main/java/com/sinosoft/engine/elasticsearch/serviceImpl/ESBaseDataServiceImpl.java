/*    */ package com.sinosoft.engine.elasticsearch.serviceImpl;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.huayunworld.znyyzj.engine.elasticsearch.common.Constant;
/*    */ import com.huayunworld.znyyzj.engine.elasticsearch.doc.BaseData;
/*    */ import com.huayunworld.znyyzj.engine.elasticsearch.service.ESBaseDataService;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
/*    */ import org.springframework.data.elasticsearch.core.query.IndexQuery;
/*    */ import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class ESBaseDataServiceImpl
/*    */   implements ESBaseDataService
/*    */ {
/* 26 */   private static final Logger logger = Logger.getLogger(ESBaseDataServiceImpl.class);
/*    */   @Autowired
/*    */   private ElasticsearchTemplate esTemplate;
/*    */   
/*    */   public boolean save(BaseData record) {
/*    */     try {
/* 32 */       tagDimension(record);
/* 33 */       IndexQuery indexQuery = (new IndexQueryBuilder()).withId(record.getBaseId()).withObject(record).build();
/* 34 */       indexQuery.setIndexName(Constant.INDEX_NAME);
/* 35 */       indexQuery.setType(Constant.TYPE_BASEDATA);
/*    */       try {
/* 37 */         this.esTemplate.index(indexQuery);
/* 38 */       } catch (Throwable e) {
/* 39 */         logger.error("ESBaseDataServiceImpl.save异常捕捉,不影响入库" + e.getMessage());
/*    */       } 
/* 41 */       return true;
/* 42 */     } catch (Exception e) {
/* 43 */       logger.error("插入或更新【失败】.", e);
/* 44 */       return false;
/*    */     } 
/*    */   }
/*    */   public boolean save(List<BaseData> records) {
/*    */     try {
/* 49 */       List<IndexQuery> queries = new ArrayList<IndexQuery>();
/* 50 */       for (BaseData record : records) {
/* 51 */         IndexQuery indexQuery = (new IndexQueryBuilder()).withId(record.getBaseId()).withObject(record).build();
/* 52 */         queries.add(indexQuery);
/*    */       } 
/* 54 */       this.esTemplate.bulkIndex(queries);
/* 55 */       return true;
/* 56 */     } catch (Exception e) {
/* 57 */       logger.error("批量插入或更新【失败】", e);
/* 58 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void tagDimension(BaseData record) {
/* 63 */     Date startTime = record.getStartTime();
/* 64 */     Calendar ca = Calendar.getInstance();
/* 65 */     ca.setTime(startTime);
/* 66 */     StringBuilder sb = new StringBuilder();
/* 67 */     sb.append("[").append(ca.get(1)).append(", ");
/* 68 */     sb.append(ca.get(1)).append(addZeroBefore(ca.get(2) + 1)).append(", ");
/* 69 */     sb.append(ca.get(1)).append(addZeroBefore(ca.get(2) + 1)).append(addZeroBefore(ca.get(5))).append(", ");
/* 70 */     sb.append(ca.get(1)).append(addZeroBefore(ca.get(2) + 1)).append(addZeroBefore(ca.get(5)))
/* 71 */       .append(addZeroBefore(ca.get(11))).append("]");
/* 72 */     record.setDateTag(sb.toString());
/* 73 */     JSONObject jo = new JSONObject();
/*    */     
/* 75 */     jo.put("categories", record.getCategories());
/*    */     
/* 77 */     jo.put("dateTag", record.getDateTag());
/*    */     
/* 79 */     record.setDimension(jo.toString());
/*    */   }
/*    */   
/* 82 */   private Object addZeroBefore(int time) { return (time > 9) ? Integer.valueOf(time) : ("0" + time); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\serviceImpl\ESBaseDataServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */