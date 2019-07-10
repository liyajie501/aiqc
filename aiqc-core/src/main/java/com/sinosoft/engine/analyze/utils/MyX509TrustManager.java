/*    */ package com.sinosoft.engine.analyze.utils;
/*    */ 
/*    */ import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

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
/*    */ public class MyX509TrustManager
/*    */   implements X509TrustManager
/*    */ {
/*    */   public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
/*    */   
/*    */   public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
/*    */   
/* 21 */   public X509Certificate[] getAcceptedIssuers() { return null; }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\MyX509TrustManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */