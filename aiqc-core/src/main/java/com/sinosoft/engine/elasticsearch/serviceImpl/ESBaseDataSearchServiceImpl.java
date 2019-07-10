/*     */ package com.sinosoft.engine.elasticsearch.serviceImpl;
/*     */ 
/*     */ import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.huayunworld.znyyzj.engine.elasticsearch.common.Constant;
import com.huayunworld.znyyzj.engine.elasticsearch.doc.BaseData;
import com.huayunworld.znyyzj.engine.elasticsearch.service.ESBaseDataSearchService;
import net.sf.json.JSONArray;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.*;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Service
/*     */ public class ESBaseDataSearchServiceImpl
/*     */   implements ESBaseDataSearchService
/*     */ {
/*  46 */   private static final Logger logger = Logger.getLogger(ESBaseDataSearchServiceImpl.class);
/*     */   @Autowired
/*     */   private ElasticsearchTemplate esTemplate;
/*     */   
/*     */   public PageInfo<BaseData> getByBaseData(BaseData baseData, int pageNum, int size, String sortField, String order) {
/*  51 */     logger.info("进入查询es分页getByBaseData方法...");
/*  52 */     PageInfo<BaseData> page = new PageInfo<BaseData>();
/*     */     try {
/*  54 */       SearchRequestBuilder reqBuilder = createSearchRequestBuilder(baseData);
/*     */       
/*  56 */       if ("asc".equals(order)) {
/*  57 */         reqBuilder.addSort(StringUtils.isEmpty(sortField) ? "startTime" : sortField, SortOrder.ASC);
/*     */       } else {
/*  59 */         reqBuilder.addSort(StringUtils.isEmpty(sortField) ? "startTime" : sortField, SortOrder.DESC);
/*     */       } 
/*     */       
/*  62 */       size = (size == 0) ? 10 : size;
/*  63 */       int from = ((pageNum <= 0) ? 1 : (pageNum - 1)) * size;
/*  64 */       if (from >= 0 && size > 0) reqBuilder.setFrom(from).setSize(size); 
/*  65 */       SearchResponse resp = (SearchResponse)reqBuilder.execute().actionGet();
/*     */       
/*  67 */       logger.info("执行查询es分页数据..." + reqBuilder.toString());
/*  68 */       List<BaseData> list = new ArrayList<BaseData>();
/*  69 */       page.setSize(size);
/*  70 */       page.setPageNum(pageNum);
/*  71 */       page.setTotal(resp.getHits().getTotalHits());
/*  72 */       page.setStartRow(from);
/*  73 */       SearchHit[] hits = resp.getHits().getHits();
/*  74 */       for (SearchHit h : hits) list.add(JSONObject.parseObject(h.getSourceAsString(), BaseData.class)); 
/*  75 */       page.setList(list);
/*  76 */       logger.info("查询es分页数据【完成】");
/*  77 */     } catch (Exception e) {
/*  78 */       logger.error("查询es分页数据【失败】", e);
/*     */     } 
/*  80 */     return page;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<Object, Object> getGroupAndCount(BaseData baseData, String groupBy) {
/*  86 */     SearchRequestBuilder reqBuilder = createSearchRequestBuilder(baseData);
/*  87 */     reqBuilder.addAggregation(AggregationBuilders.terms("group_field").field(groupBy));
/*  88 */     SearchResponse searchResponse = (SearchResponse)reqBuilder.get();
/*  89 */     Terms terms1 = (Terms)searchResponse.getAggregations().get("group_field");
/*  90 */     List<Terms.Bucket> buckets = terms1.getBuckets();
/*  91 */     Map<Object, Object> map = new HashMap<Object, Object>();
/*  92 */     for (Terms.Bucket bt : buckets) map.put(bt.getKey(), Long.valueOf(bt.getDocCount())); 
/*  93 */     return map;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<BaseData> getByBaseData(BaseData baseData, Pageable pageable) {
/*  99 */     Map<String, String> map = new HashMap<String, String>();
/*     */     try {
/* 101 */       map = BeanUtils.describe(baseData);
/* 102 */     } catch (Exception e) {
/* 103 */       e.printStackTrace();
/*     */     } 
/* 105 */     Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
/*     */     
/* 107 */     NativeSearchQueryBuilder nativeSearchQueryBuilder = (new NativeSearchQueryBuilder()).withIndices(new String[] { Constant.INDEX_NAME }).withTypes(new String[] { Constant.INDEX_NAME }).withSearchType(SearchType.DEFAULT).withPageable(pageable);
/*     */     
/* 109 */     while (iterator.hasNext()) {
/* 110 */       if (StringUtils.isEmpty((String)((Map.Entry)iterator.next()).getValue()))
/* 111 */         continue;  nativeSearchQueryBuilder.withQuery(QueryBuilders.matchQuery((String)((Map.Entry)iterator.next()).getKey(), ((Map.Entry)iterator.next()).getValue()));
/*     */     } 
/* 113 */     return this.esTemplate.multiGet(nativeSearchQueryBuilder.build(), BaseData.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public BaseData getById(String baseId) {
/* 118 */     NativeSearchQuery build = (new NativeSearchQueryBuilder()).withQuery(QueryBuilders.matchQuery("baseId", baseId)).build();
/* 119 */     LinkedList<BaseData> multiGet = this.esTemplate.multiGet(build, BaseData.class);
/* 120 */     return (multiGet != null && multiGet.size() > 0) ? (BaseData)multiGet.get(0) : null;
/*     */   }
/*     */ 
/*     */   
/*     */   private SearchRequestBuilder createSearchRequestBuilder(BaseData baseData) {
/* 125 */     logger.info("进入创建createSearchRequestBuilder方法..");
/*     */ 
/*     */     
/* 128 */     SearchRequestBuilder reqBuilder = this.esTemplate.getClient().prepareSearch(new String[] { Constant.INDEX_NAME }).setTypes(new String[] { Constant.TYPE_BASEDATA }).setSearchType(SearchType.QUERY_THEN_FETCH).setExplain(true).setQuery(QueryBuilders.matchAllQuery());
/*     */     
/*     */     try {
/* 131 */       logger.debug("封装基础信息查询条件...");
/* 132 */       Map<String, String> map = new HashMap<String, String>();
/* 133 */       map = BeanUtils.describe(baseData);
/* 134 */       Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
/* 135 */       RangeQueryBuilder range = QueryBuilders.rangeQuery("startTime");
/* 136 */       BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
/* 137 */       while (iterator.hasNext()) {
/* 138 */         Map.Entry<String, String> next = (Map.Entry)iterator.next();
/* 139 */         if (next.getValue() == null || next.getValue() == "" || 
/* 140 */           "class".equals(next.getKey()))
/* 141 */           continue;  if ("startTime".equals(next.getKey())) {
/* 142 */           range.gte(Long.valueOf(baseData.getStartTime().getTime())); continue;
/* 143 */         }  if ("endTime".equals(next.getKey())) {
/* 144 */           range.lte(Long.valueOf(baseData.getEndTime().getTime())); continue;
/* 145 */         }  if ("categories".equals(next.getKey())) {
/* 146 */           boolQuery.must(QueryBuilders.termsQuery((String)next.getKey(), JSONArray.fromObject(baseData.getCategories()))); continue;
/* 147 */         }  if ("callInfo".equals(next.getKey())) {
/* 148 */           boolQuery.must(QueryBuilders.matchPhraseQuery((String)next.getKey(), baseData.getCallInfo())); continue;
/*     */         } 
/* 150 */         boolQuery.must(QueryBuilders.matchQuery((String)next.getKey(), next.getValue()));
/*     */       } 
/* 152 */       if (range != null)
/* 153 */         boolQuery.must(range); 
/* 154 */       reqBuilder.setQuery(boolQuery);
/* 155 */       logger.error("封装基础信息查询条件【完成】");
/* 156 */     } catch (Exception e) {
/* 157 */       logger.info("封装基础信息查询条件【失败】", e);
/*     */     } 
/* 159 */     return reqBuilder;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\elasticsearch\serviceImpl\ESBaseDataSearchServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */