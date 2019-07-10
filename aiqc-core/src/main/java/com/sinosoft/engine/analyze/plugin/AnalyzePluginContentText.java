/*     */ package com.sinosoft.engine.analyze.plugin;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.*;
import com.huayunworld.znyyzj.engine.analyze.service.AnalyzeService;
import com.huayunworld.znyyzj.engine.analyze.service.XmlResolverJsoup;
import net.sf.json.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashSet;
import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AnalyzePluginContentText
/*     */   extends AnalyzeService
/*     */ {
/*  34 */   private static Logger logger = Logger.getLogger(AnalyzePluginContentText.class);
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
/*     */   public boolean analyzeEleGroup(RuleCore rule, String eleGroupId, AnalyzeResource res, EleGroupResult eleGroupResult) throws Exception {
/*  46 */     XmlResolverJsoup xmlJsoup = res.getXmlJsoup();
/*  47 */     List<ProducerEleValueExt> eleList = (List)rule.getEleGroupMap().get(eleGroupId);
/*     */     
/*  49 */     String cssQuery = "sentence";
/*  50 */     Document doc = xmlJsoup.getDocument();
/*     */     
/*  52 */     if ("1".equals(rule.getUserType())) cssQuery = cssQuery + "[role=\"1\"]"; 
/*  53 */     if ("2".equals(rule.getUserType())) cssQuery = cssQuery + "[role=\"2\"]"; 
/*  54 */     String isWord = getEleValue(eleList, "isWord");
/*  55 */     if ("1".equals(isWord)) cssQuery = cssQuery + " word";
/*     */     
/*  57 */     Elements resultInfo = doc.select(cssQuery);
/*     */ 
/*     */     
/*  60 */     String content = getEleValue(eleList, "content");
/*  61 */     String count = getEleValue(eleList, "count");
/*     */     
/*  63 */     String regular = getEleValue(eleList, "regular");
/*  64 */     String ref = getEleValue(eleList, "ref");
/*  65 */     String location = getEleValue(eleList, "location");
/*  66 */     String role = getEleValue(eleList, "role");
/*     */     
/*  68 */     int countInt = Integer.parseInt(count);
/*  69 */     int locationInt = Integer.parseInt(location);
/*  70 */     int num = 0;
/*  71 */     int lineNum = 0;
/*  72 */     Set<String> markStr = new HashSet<String>();
/*  73 */     Set<String> noMarkStr = new HashSet<String>();
/*  74 */     for (Element o : resultInfo) {
/*  75 */       lineNum++;
/*  76 */       if (locationInt > 0 && lineNum > locationInt)
/*  77 */         break;  if ((locationInt < 0 && lineNum <= resultInfo.size() + locationInt) || (
/*  78 */         StringUtils.isNotBlank(role) && !"0".equals(role) && !o.attr("role").equals(role)))
/*  79 */         continue;  String line = o.attr("text");
/*  80 */       String startTime = o.attr("start_time");
/*  81 */       String endTime = o.attr("end_time");
/*  82 */       if ("1".equals(isWord)) {
/*     */         
/*  84 */         if (line.trim().equals(content)) num++;
/*     */       
/*     */       } else {
/*  87 */         List<AnalyzeService.StrPost> f = null;
/*  88 */         if ("2".equals(regular)) {
/*  89 */           if (content.indexOf(",") != -1 || content.indexOf("，") != -1) {
/*  90 */             content = content.replace(",", "|");
/*  91 */             content = content.replace("，", "|");
/*     */           } 
/*  93 */           f = findStrRegular(line, content);
/*     */         
/*     */         }
/*  96 */         else if (content.indexOf(",") != -1 || content.indexOf("，") != -1) {
/*  97 */           content = content.replace(",", "|");
/*  98 */           content = content.replace("，", "|");
/*  99 */           f = findStrRegular(line, content);
/*     */         } else {
/* 101 */           f = findStr(line, content);
/*     */         } 
/*     */         
/* 104 */         if (f != null) {
/* 105 */           num += f.size();
/* 106 */           markStr.clear();
/* 107 */           for (AnalyzeService.StrPost sp : f) markStr.add(sp.getText()); 
/* 108 */           eleGroupResult.addMark(new MarkText(startTime, endTime, StringUtils.join(markStr, "|")));
/*     */         } else {
/*     */           
/* 111 */           noMarkStr.clear();
/* 112 */           noMarkStr.add(content);
/* 113 */           eleGroupResult.addNotMark(new MarkText(StringUtils.join(noMarkStr, "|")));
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 118 */       if ("1".equals(ref) && num > countInt) return true; 
/* 119 */       if ("2".equals(ref) && num < countInt) return true; 
/* 120 */       if ("3".equals(ref) && num == countInt) return true; 
/*     */     } 
/* 122 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 128 */     AnalyzeService a = new AnalyzePluginContentText();
/* 129 */     List<AnalyzeService.StrPost> f = a.findStrRegular("说了这么多,相信大家都明白了以上几个方法的使用,该说说正则表达式的分组在java中是怎么使用的", "相信.+使用");
/*     */     
/* 131 */     System.out.println(f.size());
/* 132 */     System.out.println(JSONArray.fromObject(f).toString());
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\AnalyzePluginContentText.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */