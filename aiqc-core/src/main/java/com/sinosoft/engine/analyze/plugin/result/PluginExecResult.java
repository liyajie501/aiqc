/*    */ package com.sinosoft.engine.analyze.plugin.result;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import net.sf.json.JSONArray;
/*    */ import org.apache.commons.lang.StringUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PluginExecResult<T extends PluginExecResultEle>
/*    */   extends Object
/*    */ {
/*    */   public static final String FIELD_SPLIT_STR = "|";
/*    */   public static final String LINE_SPLIT_STR = ">>";
/* 23 */   private Collection<T> data = new ArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 29 */   public void addAll(Collection<T> d) { this.data.addAll(d); }
/*    */ 
/*    */   
/* 32 */   public void add(T d) { this.data.add(d); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   public JSONArray getResult() { return JSONArray.fromObject(this.data); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getSmallResult() {
/* 49 */     if (this.data == null || this.data.size() == 0) return null; 
/* 50 */     StringBuilder s = new StringBuilder();
/* 51 */     for (Iterator iterator = this.data.iterator(); iterator.hasNext(); ) { T t = (T)(PluginExecResultEle)iterator.next();
/* 52 */       List<String> list = t.getSmallResult();
/* 53 */       s.append(StringUtils.join(list, "|")).append(">>"); }
/*    */     
/* 55 */     if (s.length() > 0) {
/* 56 */       s.delete(s.length() - 2, s.length());
/*    */     }
/* 58 */     return s.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\result\PluginExecResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */