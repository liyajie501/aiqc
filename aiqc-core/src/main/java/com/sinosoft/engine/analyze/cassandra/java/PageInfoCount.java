/*    */ package com.sinosoft.engine.analyze.cassandra.java;
/*    */ 
/*    */ import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/*    */
/*    */ 
/*    */ @Table("PageInfoCount")
/*    */ public class PageInfoCount
/*    */ {
/*    */   @PrimaryKey("count")
/*    */   private Long count;
/*    */   
/* 12 */   public Long getCount() { return this.count; }
/*    */ 
/*    */ 
/*    */   
/* 16 */   public void setCount(Long count) { this.count = count; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\cassandra\java\PageInfoCount.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */