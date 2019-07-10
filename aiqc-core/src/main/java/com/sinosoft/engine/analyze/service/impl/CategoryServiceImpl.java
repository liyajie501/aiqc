/*    */ package com.sinosoft.engine.analyze.service.impl;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.dao.CategoryMapper;
import com.huayunworld.znyyzj.engine.analyze.model.Category;
import com.huayunworld.znyyzj.engine.analyze.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class CategoryServiceImpl
/*    */   implements CategoryService
/*    */ {
/*    */   @Autowired
/*    */   private CategoryMapper categoryMapper;
/*    */   
/*    */   public List<Category> CategoryList(Category record) {
/* 29 */     if (record.getName() != null && record.getName() != "")
/* 30 */       record.setName("%" + record.getName() + "%"); 
/* 31 */     return this.categoryMapper.CategoryList(record);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 39 */   public int updateByPrimaryKeySelective(Category record) { return this.categoryMapper.updateByPrimaryKeySelective(record); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 47 */   public int insertSelective(Category record) { return this.categoryMapper.insertSelective(record); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 55 */   public List<Category> CategoryBatch(List<String> CategoryId) { return this.categoryMapper.CategoryBatch(CategoryId); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\impl\CategoryServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */