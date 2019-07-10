/*     */ package com.sinosoft.engine.core.util;
/*     */ 
/*     */ import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

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
/*     */ public class CookieUtils
/*     */ {
/*  28 */   public static Cookie setCookie(HttpServletResponse response, String name, String value, String path) { return addCookie(response, name, value, path, 1800); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Cookie addCookie(HttpServletResponse response, String name, String value, String path, int maxAge) {
/*  39 */     Cookie cookie = null;
/*     */     try {
/*  41 */       cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
/*  42 */       cookie.setMaxAge(maxAge);
/*  43 */       if (null != path) {
/*  44 */         cookie.setPath(path);
/*     */       }
/*  46 */       response.addCookie(cookie);
/*  47 */     } catch (UnsupportedEncodingException e) {
/*  48 */       e.printStackTrace();
/*     */     } 
/*  50 */     return cookie;
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
/*     */ 
/*     */   
/*     */   public static ArrayList<Cookie> addCookies(HttpServletResponse response, Map<String, String> values, String path, int maxAge) {
/*  64 */     Set<Map.Entry<String, String>> entries = values.entrySet();
/*  65 */     ArrayList<Cookie> cookies = new ArrayList<Cookie>();
/*     */     try {
/*  67 */       for (Map.Entry<String, String> entry : entries) {
/*  68 */         Cookie cookie = new Cookie((String)entry.getKey(), URLEncoder.encode((String)entry.getValue(), "UTF-8"));
/*  69 */         cookie.setMaxAge(maxAge);
/*  70 */         if (null != path) {
/*  71 */           cookie.setPath(path);
/*     */         }
/*  73 */         response.addCookie(cookie);
/*  74 */         cookies.add(cookie);
/*     */       } 
/*  76 */     } catch (UnsupportedEncodingException e) {
/*  77 */       e.printStackTrace();
/*     */     } 
/*  79 */     return cookies;
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
/*  90 */   public static String getCookie(HttpServletRequest request, String name) { return getCookie(request, null, name, false); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 100 */   public static String getCookie(HttpServletRequest request, HttpServletResponse response, String name) { return getCookie(request, response, name, true); }
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
/*     */   public static String getCookie(HttpServletRequest request, HttpServletResponse response, String name, boolean isRemoved) {
/* 113 */     String value = null;
/* 114 */     Cookie[] cookies = request.getCookies();
/* 115 */     if (cookies != null) {
/* 116 */       for (Cookie cookie : cookies) {
/* 117 */         if (cookie.getName().equals(name)) {
/*     */           try {
/* 119 */             value = URLDecoder.decode(cookie.getValue(), "UTF-8");
/* 120 */           } catch (UnsupportedEncodingException e) {
/* 121 */             e.printStackTrace();
/*     */           } 
/* 123 */           if (isRemoved) {
/* 124 */             cookie.setMaxAge(0);
/* 125 */             response.addCookie(cookie);
/*     */           } 
/* 127 */           return value;
/*     */         } 
/*     */       } 
/*     */     }
/* 131 */     return value;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\cor\\util\CookieUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */