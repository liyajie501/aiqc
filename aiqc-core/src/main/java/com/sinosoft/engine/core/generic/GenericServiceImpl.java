/*    */ package com.sinosoft.engine.core.generic;
/*    */ 
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class GenericServiceImpl<Model, PK>
/*    */   extends Object
/*    */   implements GenericService<Model, PK>
/*    */ {
/*    */   public abstract GenericDao<Model, PK> getDao();
/*    */   
/* 30 */   public int insert(Model model) { return getDao().insertSelective(model); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 39 */   public int update(Model model) { return getDao().updateByPrimaryKeySelective(model); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 48 */   public int delete(PK id) { return getDao().deleteByPrimaryKey(id); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 58 */   public Model selectById(PK id) { return (Model)getDao().selectByPrimaryKey(id); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 63 */   public Model selectOne() { return null; }
/*    */ 
/*    */ 
/*    */   
/* 67 */   public List<Model> selectList() { return null; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\core\generic\GenericServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */