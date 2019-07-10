/*    */ package com.sinosoft.engine.analyze.utils;
/*    */ 
/*    */ import java.util.Iterator;
import java.util.List;

/*    */
/*    */ 
/*    */ public class ListIterable<T> extends Object implements Iterable<T> {
/*    */   List<T> list;
/*    */   
/*  9 */   public ListIterable(List<T> list) { this.list = list; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 14 */   public Iterator<T> iterator() { return this.list.iterator(); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\ListIterable.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */