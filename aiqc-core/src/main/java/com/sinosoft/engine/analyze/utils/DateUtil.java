/*     */ package com.sinosoft.engine.analyze.utils;
/*     */ 
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DateUtil
/*     */ {
/*     */   public static String formatDate(Date date, String formatString) {
/*  16 */     SimpleDateFormat format = new SimpleDateFormat(formatString);
/*  17 */     return format.format(date);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  23 */   public static String formatDate(Date date) { return formatDate(date, "yyyy-MM-dd HH:mm:ss"); }
/*     */ 
/*     */   
/*  26 */   public static Date formatString(String date) { return format(date, "yyyy-MM-dd HH:mm:ss"); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Date format(Date date, String formatString) {
/*  32 */     SimpleDateFormat format = new SimpleDateFormat(formatString);
/*  33 */     String dataStr = format.format(date);
/*  34 */     Date dataF = null;
/*     */     try {
/*  36 */       dataF = format.parse(dataStr);
/*  37 */     } catch (ParseException e) {
/*  38 */       e.printStackTrace();
/*     */     } 
/*  40 */     return dataF;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Date format(String date, String formatString) {
/*  46 */     SimpleDateFormat format = new SimpleDateFormat(formatString);
/*  47 */     Date dataF = null;
/*     */     try {
/*  49 */       dataF = format.parse(date);
/*  50 */     } catch (ParseException e) {
/*  51 */       e.printStackTrace();
/*     */     } 
/*  53 */     return dataF;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String formatString(String date, String formatString) {
/*  59 */     SimpleDateFormat format = new SimpleDateFormat(formatString);
/*  60 */     Date dataF = null;
/*  61 */     String dataStr = null;
/*     */     try {
/*  63 */       dataF = format.parse(date);
/*  64 */       dataStr = format.format(dataF);
/*  65 */     } catch (ParseException e) {
/*  66 */       e.printStackTrace();
/*     */     } 
/*  68 */     return dataStr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<String> getToday() {
/*  74 */     ca = Calendar.getInstance();
/*  75 */     ca.set(11, 23);
/*  76 */     ca.set(12, 59);
/*  77 */     ca.set(13, 59);
/*  78 */     String endTime = formatDate(ca.getTime(), "yyyy-MM-dd HH:mm:ss");
/*  79 */     ca.set(11, 0);
/*  80 */     ca.set(12, 0);
/*  81 */     ca.set(13, 0);
/*  82 */     String startTime = formatDate(ca.getTime(), "yyyy-MM-dd HH:mm:ss");
/*  83 */     List<String> list = new ArrayList<String>();
/*  84 */     list.add(startTime);
/*  85 */     list.add(endTime);
/*  86 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String changeToMSvalue(Integer time) {
/*  93 */     int second = time.intValue() / 1000 % 60;
/*  94 */     int millis = time.intValue() / 1000 / 60;
/*  95 */     String s = second + "";
/*  96 */     String m = millis + "";
/*  97 */     if (second <= 9) s = "0" + second; 
/*  98 */     if (millis <= 9) m = "0" + millis; 
/*  99 */     return m + "′" + s + "″";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Date getLastDate(Date date) {
/* 108 */     Calendar cal = Calendar.getInstance();
/* 109 */     cal.setTime(date);
/* 110 */     cal.add(2, -1);
/* 111 */     return cal.getTime();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<String> getMonthBetween(String minDate, String maxDate) throws ParseException {
/* 120 */     ArrayList<String> result = new ArrayList<String>();
/* 121 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
/*     */     
/* 123 */     Calendar min = Calendar.getInstance();
/* 124 */     Calendar max = Calendar.getInstance();
/*     */     
/* 126 */     min.setTime(sdf.parse(minDate));
/* 127 */     min.set(min.get(1), min.get(2), 1);
/*     */     
/* 129 */     max.setTime(sdf.parse(maxDate));
/* 130 */     max.set(max.get(1), max.get(2), 2);
/*     */     
/* 132 */     Calendar curr = min;
/* 133 */     while (curr.before(max)) {
/* 134 */       result.add(sdf.format(curr.getTime()));
/* 135 */       curr.add(2, 1);
/*     */     } 
/*     */     
/* 138 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<String> getEveryDay(String dateString) throws ParseException {
/* 147 */     SimpleDateFormat format = null;
/* 148 */     if (dateString.length() == 4) {
/* 149 */       List<String> listday = new ArrayList<String>();
/* 150 */       format = new SimpleDateFormat("yyyy");
/* 151 */       for (int i = 0; i < 12; i++) {
/* 152 */         listday.add(String.valueOf(i + 1));
/*     */       }
/* 154 */       return listday;
/*     */     } 
/*     */     
/* 157 */     List<String> listday = new ArrayList<String>();
/* 158 */     format = new SimpleDateFormat("yyyyMM");
/* 159 */     Date date = format.parse(dateString);
/* 160 */     Calendar calendar = new GregorianCalendar();
/* 161 */     calendar.setTime(date);
/* 162 */     for (int i = 0; i < calendar.getActualMaximum(5); i++) {
/* 163 */       listday.add(String.valueOf(i + 1));
/*     */     }
/* 165 */     return listday;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\DateUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */