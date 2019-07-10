/*     */ package com.sinosoft.engine.analyze.utils;
/*     */ 
/*     */ import com.alibaba.druid.util.StringUtils;
/*     */ import com.github.pagehelper.util.StringUtil;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URL;
/*     */ import java.net.URLDecoder;
/*     */ import java.net.URLEncoder;
/*     */ import java.security.SecureRandom;
/*     */ import javax.net.ssl.HostnameVerifier;
/*     */ import javax.net.ssl.HttpsURLConnection;
/*     */ import javax.net.ssl.SSLContext;
/*     */ import javax.net.ssl.SSLSession;
/*     */ import javax.net.ssl.TrustManager;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.http.HttpResponse;
/*     */ import org.apache.http.client.methods.HttpGet;
/*     */ import org.apache.http.client.methods.HttpPost;
/*     */ import org.apache.http.entity.StringEntity;
/*     */ import org.apache.http.impl.client.DefaultHttpClient;
/*     */ import org.apache.http.util.EntityUtils;
/*     */ import org.apache.log4j.Logger;
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
/*     */ public class HttpClient
/*     */ {
/*  39 */   private static Logger logger = Logger.getLogger(HttpClient.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String post(String url, String data, boolean needResponse) {
/*  46 */     DefaultHttpClient client = new DefaultHttpClient();
/*  47 */     HttpPost post = new HttpPost(url);
/*     */     try {
/*  49 */       if (!StringUtils.isEmpty(data)) {
/*     */         
/*  51 */         StringEntity entity = new StringEntity(data, "utf-8");
/*  52 */         entity.setContentEncoding("UTF-8");
/*  53 */         entity.setContentType("application/json");
/*  54 */         post.setEntity(entity);
/*     */       } 
/*  56 */       HttpResponse result = client.execute(post);
/*  57 */       if (!needResponse) {
/*  58 */         return null;
/*     */       }
/*  60 */       if (result.getStatusLine().getStatusCode() == 200) {
/*  61 */         return EntityUtils.toString(result.getEntity());
/*     */       }
/*  63 */     } catch (Exception e) {
/*  64 */       e.printStackTrace();
/*  65 */       return "0";
/*     */     } 
/*  67 */     logger.error("post请求" + url + "地址失败！");
/*  68 */     return "0";
/*     */   }
/*     */   
/*     */   public static String get(String url, String data, boolean needResponse) {
/*  72 */     DefaultHttpClient client = new DefaultHttpClient();
/*  73 */     HttpGet get = new HttpGet(url);
/*     */     try {
/*  75 */       if (!StringUtils.isEmpty(data)) {
/*     */         
/*  77 */         StringEntity entity = new StringEntity(data, "utf-8");
/*  78 */         entity.setContentEncoding("UTF-8");
/*  79 */         entity.setContentType("application/json");
/*     */       } 
/*     */       
/*  82 */       HttpResponse result = client.execute(get);
/*  83 */       if (!needResponse) {
/*  84 */         return null;
/*     */       }
/*  86 */       if (result.getStatusLine().getStatusCode() == 200) {
/*  87 */         return EntityUtils.toString(result.getEntity());
/*     */       }
/*  89 */     } catch (Exception e) {
/*  90 */       e.printStackTrace();
/*  91 */       return "Error";
/*     */     } 
/*  93 */     logger.error("get请求" + url + "地址失败！");
/*  94 */     return "Error";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean downLoadFromUrl(String fileUrl, String fileLocal) throws Exception {
/* 105 */     boolean isFalge = true;
/* 106 */     SSLContext sslcontext = SSLContext.getInstance("SSL", "SunJSSE");
/* 107 */     sslcontext.init(null, new TrustManager[] { new MyX509TrustManager() }, new SecureRandom());
/*     */     
/* 109 */     fileLocal = fileLocal.replace("%5F", "_");
/* 110 */     URL url = new URL(fileUrl);
/* 111 */     URLEncoder.encode(url.toString(), "UTF-8");
/* 112 */     HostnameVerifier ignoreHostnameVerifier = new HostnameVerifier() {
/*     */         public boolean verify(String s, SSLSession sslsession) {
/* 114 */           return true;
/*     */         }
/*     */       };
/* 117 */     HttpsURLConnection.setDefaultHostnameVerifier(ignoreHostnameVerifier);
/* 118 */     HttpsURLConnection.setDefaultSSLSocketFactory(sslcontext.getSocketFactory());
/* 119 */     HttpsURLConnection urlCon = (HttpsURLConnection)url.openConnection();
/* 120 */     urlCon.setConnectTimeout(6000);
/* 121 */     urlCon.setReadTimeout(60000);
/* 122 */     int code = urlCon.getResponseCode();
/* 123 */     if (code != 200) {
/* 124 */       isFalge = false;
/* 125 */       throw new Exception("录音文件读取失败，路径：" + urlCon.getURL());
/*     */     } 
/*     */     
/* 128 */     DataInputStream in = new DataInputStream(urlCon.getInputStream());
/* 129 */     DataOutputStream out = new DataOutputStream(new FileOutputStream(fileLocal));
/* 130 */     IOUtils.copy(in, out);
/* 131 */     out.close();
/* 132 */     in.close();
/* 133 */     return isFalge;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String post(String url, String data, boolean needResponse, boolean needEncode) {
/*     */     try {
/* 146 */       if (needEncode)
/* 147 */         url = URLDecoder.decode(url, "UTF-8"); 
/* 148 */     } catch (UnsupportedEncodingException e) {
/* 149 */       e.printStackTrace();
/* 150 */       throw new RuntimeException("url编码异常");
/*     */     } 
/* 152 */     return post(url, data, needResponse);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String post(String url, String data, boolean needResponse, boolean needEncode, String encodeType) {
/*     */     try {
/* 163 */       if (needEncode && StringUtil.isNotEmpty(encodeType))
/* 164 */         url = URLDecoder.decode(url, encodeType); 
/* 165 */     } catch (UnsupportedEncodingException e) {
/* 166 */       e.printStackTrace();
/* 167 */       throw new RuntimeException("url编码异常,编码格式为：" + encodeType);
/*     */     } 
/* 169 */     return post(url, data, needResponse);
/*     */   }
/*     */   
/* 172 */   public static String post(String url, String data) { return post(url, data, true); }
/*     */ 
/*     */   
/* 175 */   public static String post(String url) { return post(url, null, true); }
/*     */ 
/*     */ 
/*     */   
/* 179 */   public static String get(String url) { return get(url, null, true); }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\HttpClient.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */