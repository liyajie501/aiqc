/*    */ package com.sinosoft.engine.analyze.service;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
import org.apache.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;
import java.util.Map;

/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */ 
/*    */ public class DynamicClassLoader
/*    */   extends ClassLoader {
/* 14 */   private static Logger logger = Logger.getLogger(DynamicClassLoader.class);
/*    */   
/* 16 */   private Map<String, Class> loadCassMap = new Hashtable();
/*    */   
/* 18 */   private String classLoaderUrl = CommonTools.getApplicationConf("engine.analyze.class.loader.url");
/*    */ 
/*    */   
/* 21 */   public static DynamicClassLoader my = new DynamicClassLoader();
/*    */ 
/*    */ 
/*    */   
/* 25 */   public DynamicClassLoader() { this(DynamicClassLoader.class.getClassLoader()); }
/*    */ 
/*    */   
/* 28 */   public DynamicClassLoader(ClassLoader parent) { super(parent); }
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
/* 41 */   public Class loadClass(String className, String version) throws Throwable { return loadClass(this.classLoaderUrl, className, version); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Class loadClass(String classPath, String className, String version) throws Throwable {
/* 47 */     synchronized (this) {
/*    */       
/* 49 */       String key = className + ":" + version;
/* 50 */       Class c = (Class)this.loadCassMap.get(key);
/* 51 */       if (c != null) return c; 
/* 52 */       logger.info("动态加载类：" + key);
/* 53 */       String url = classPathParser(classPath) + classNameParser(className);
/* 54 */       System.out.println(url);
/* 55 */       URL myUrl = new URL(url);
/* 56 */       URLConnection connection = myUrl.openConnection();
/* 57 */       InputStream input = connection.getInputStream();
/* 58 */       ByteArrayOutputStream buffer = new ByteArrayOutputStream();
/* 59 */       int data = input.read();
/* 60 */       while (data != -1) {
/* 61 */         buffer.write(data);
/* 62 */         data = input.read();
/*    */       } 
/* 64 */       input.close();
/* 65 */       byte[] classData = buffer.toByteArray();
/* 66 */       c = defineClass(noSuffix(className), classData, 0, classData.length);
/* 67 */       this.loadCassMap.put(key, c);
/* 68 */       return c;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 78 */   private String pathParser(String path) { return path.replaceAll("\\\\", "/"); }
/*    */ 
/*    */   
/*    */   private String classPathParser(String path) {
/* 82 */     String classPath = pathParser(path);
/* 83 */     if (!classPath.startsWith("file:")) {
/* 84 */       classPath = "file:" + classPath;
/*    */     }
/* 86 */     if (!classPath.endsWith("/")) {
/* 87 */       classPath = classPath + "/";
/*    */     }
/* 89 */     return classPath;
/*    */   }
/*    */ 
/*    */   
/* 93 */   private String classNameParser(String className) { return className.substring(0, className.lastIndexOf(".")).replaceAll("\\.", "/") + className
/* 94 */       .substring(className.lastIndexOf(".")); }
/*    */ 
/*    */ 
/*    */   
/* 98 */   private String noSuffix(String className) { return className.substring(0, className.lastIndexOf(".")); }
/*    */   
/*    */   public static void main(String[] arguments) throws Exception {}
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\DynamicClassLoader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */