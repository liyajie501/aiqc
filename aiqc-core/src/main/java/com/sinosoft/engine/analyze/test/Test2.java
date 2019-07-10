/*    */ package com.sinosoft.engine.analyze.test;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
/*    */ import java.text.ParseException;
/*    */ import java.util.Date;
/*    */ import org.apache.commons.lang.time.DateUtils;
/*    */ 
/*    */ 
/*    */ public class Test2
/*    */ {
/*    */   public static void main(String[] args) throws ParseException {
/* 12 */     String[] fmt = { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM", "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM" };
/*    */ 
/*    */ 
/*    */     
/* 16 */     Date date = DateUtils.parseDate("2017/9/18 09:01", fmt);
/* 17 */     System.out.println(CommonTools.getFormatDate(date));
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\test\Test2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */