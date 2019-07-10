/*    */ package com.sinosoft.engine.core.util;
/*    */ 
/*    */ import java.util.UUID;
/*    */ import org.apache.commons.codec.digest.DigestUtils;
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
/*    */ public class ApplicationUtils
/*    */ {
/* 21 */   public static String randomUUID() { return UUID.randomUUID().toString(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   public static String md5Hex(String value) { return DigestUtils.md5Hex(value); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   public static String sha1Hex(String value) { return DigestUtils.sha1Hex(value); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 51 */   public static String sha256Hex(String value) { return DigestUtils.sha256Hex(value); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\cor\\util\ApplicationUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */