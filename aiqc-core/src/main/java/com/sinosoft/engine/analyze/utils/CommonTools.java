/*     */ package com.sinosoft.engine.analyze.utils;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.net.URL;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import org.apache.commons.configuration.CompositeConfiguration;
/*     */ import org.apache.commons.configuration.PropertiesConfiguration;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.springframework.core.io.ClassPathResource;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CommonTools
/*     */ {
/*  25 */   private static Logger logger = Logger.getLogger(CommonTools.class);
/*  26 */   private static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String readFile(String fileName, String item) {
/*     */     try {
/*  36 */       CompositeConfiguration config = new CompositeConfiguration();
/*  37 */       config.addConfiguration(new PropertiesConfiguration((new ClassPathResource(fileName)).getPath()));
/*  38 */       return config.getString(item);
/*  39 */     } catch (Exception e) {
/*  40 */       logger.error("读取配置文件异常fileName=" + fileName + ",item" + item);
/*  41 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File getClassPathFile(String fileName) {
/*  51 */     ClassLoader classLoader = CommonTools.class.getClassLoader();
/*  52 */     URL url = classLoader.getResource(fileName);
/*  53 */     return new File(url.getFile());
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
/*     */   
/*  67 */   public static String getApplicationConf(String item) { return readFile("application.properties", item); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   public static String getUUID() { return UUID.randomUUID().toString().replaceAll("-", ""); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getUUID(int size) {
/*  83 */     if (size > 32) size = 32; 
/*  84 */     if (size < 1) size = 1; 
/*  85 */     return getUUID().substring(32 - size);
/*     */   }
/*     */   
/*     */   public static String getFormatDate(Date d) {
/*  89 */     DateFormat format2 = new SimpleDateFormat(DATE_FORMAT);
/*  90 */     return format2.format(d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getFormatDate(Date d, String f) {
/* 100 */     DateFormat format2 = new SimpleDateFormat(f);
/* 101 */     return format2.format(d);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static void main(String[] args) { System.out.println(getUUID(32).length()); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<String> getTableNameTimes(Date startTime, Date endTime) {
/* 117 */     Calendar caS = Calendar.getInstance();
/* 118 */     Calendar caE = Calendar.getInstance();
/* 119 */     caS.setTime(startTime);
/* 120 */     caE.setTime(endTime);
/* 121 */     int sYear = caS.get(1);
/* 122 */     int eYear = caE.get(1);
/* 123 */     int sMonth = caS.get(2) + 1;
/* 124 */     int eMonth = caE.get(2) + 1;
/* 125 */     List<String> tableNameTime = new ArrayList<String>();
/* 126 */     if (sYear != eYear)
/* 127 */     { int nY = eYear - sYear;
/* 128 */       if (nY > 1) for (int n = nY - 1; n > 0; ) { for (int m = 1; m <= 12; ) { tableNameTime.add("_" + (sYear + n) + "" + ((m > 9) ? Integer.valueOf(m) : ("0" + m))); m++; }  n--; }
/* 129 */           for (int s = 12; s - sMonth >= 0; ) { tableNameTime.add("_" + sYear + "" + ((s > 9) ? Integer.valueOf(s) : ("0" + s))); s--; }
/* 130 */        for (int s = 1; s <= eMonth; ) { tableNameTime.add("_" + eYear + "" + ((s > 9) ? Integer.valueOf(s) : ("0" + s))); s++; }
/*     */        }
/* 132 */     else { for (int s = sMonth; eMonth >= s; ) { tableNameTime.add("_" + sYear + "" + ((s > 9) ? Integer.valueOf(s) : ("0" + s))); s++; }
/*     */        }
/* 134 */      return tableNameTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Integer getDaysBetween(Date startTime, Date endTime) {
/* 143 */     Calendar caS = Calendar.getInstance();
/* 144 */     Calendar caE = Calendar.getInstance();
/* 145 */     caS.setTime(startTime);
/* 146 */     caE.setTime(endTime);
/*     */     
/* 148 */     caS.set(caS.get(1), caS.get(2), caS.get(5), 0, 0, 0);
/* 149 */     caE.set(caE.get(1), caE.get(2), caE.get(5), 0, 0, 0);
/* 150 */     caS.set(14, 0);
/* 151 */     caE.set(14, 0);
/*     */     
/* 153 */     int days = 0;
/* 154 */     while (caE.getTimeInMillis() - caS.getTimeInMillis() >= 0L) {
/* 155 */       days++;
/* 156 */       caS.set(caS.get(1), caS.get(2), caS.get(5) + 1, 0, 0, 0);
/*     */     } 
/* 158 */     return Integer.valueOf(days);
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\CommonTools.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */