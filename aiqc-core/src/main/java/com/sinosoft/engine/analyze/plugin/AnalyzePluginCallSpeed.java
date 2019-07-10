/*    */ package com.sinosoft.engine.analyze.plugin;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.AnalyzeResource;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.EleGroupResult;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.MarkSpeed;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.ProducerEleValueExt;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.RuleCore;
/*    */ import com.huayunworld.znyyzj.engine.analyze.service.AnalyzeService;
/*    */ import com.huayunworld.znyyzj.engine.analyze.service.XmlResolverJsoup;
/*    */ import java.util.List;
/*    */ import org.apache.log4j.Logger;
/*    */ import org.jsoup.nodes.Document;
/*    */ import org.jsoup.nodes.Element;
/*    */ import org.jsoup.select.Elements;
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
/*    */ public class AnalyzePluginCallSpeed
/*    */   extends AnalyzeService
/*    */ {
/* 31 */   private static Logger logger = Logger.getLogger(AnalyzePluginCallSpeed.class);
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
/*    */   public boolean analyzeEleGroup(RuleCore rule, String eleGroupId, AnalyzeResource res, EleGroupResult eleGroupResult) throws Exception {
/* 43 */     XmlResolverJsoup xmlJsoup = res.getXmlJsoup();
/* 44 */     List<ProducerEleValueExt> eleList = (List)rule.getEleGroupMap().get(eleGroupId);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     String cssQuery = "sentence";
/* 53 */     Document doc = xmlJsoup.getDocument();
/* 54 */     if ("1".equals(rule.getUserType())) cssQuery = cssQuery + "[role=\"1\"]"; 
/* 55 */     if ("2".equals(rule.getUserType())) cssQuery = cssQuery + "[role=\"2\"]"; 
/* 56 */     Elements resultInfo = doc.select(cssQuery);
/*    */     
/* 58 */     String speed = getEleValue(eleList, "speed");
/* 59 */     String count = getEleValue(eleList, "count");
/* 60 */     String ref = getEleValue(eleList, "ref");
/*    */     
/* 62 */     float speedf = Float.parseFloat(speed);
/*    */     
/* 64 */     int countInt = Integer.parseInt(count);
/*    */     
/* 66 */     int num = 0;
/* 67 */     for (Element o : resultInfo) {
/* 68 */       float sd = Float.parseFloat(o.attr("speed"));
/* 69 */       String startTime = o.attr("start_time");
/* 70 */       String endTime = o.attr("end_time");
/* 71 */       if (sd >= speedf) {
/* 72 */         num++;
/* 73 */         eleGroupResult.addMark(new MarkSpeed(startTime, endTime, Float.toString(sd)));
/*    */       } 
/*    */     } 
/* 76 */     if ("1".equals(ref) && num > countInt) return true; 
/* 77 */     if ("2".equals(ref) && num < countInt) return true; 
/* 78 */     if ("3".equals(ref) && num == countInt) return true;
/*    */     
/* 80 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\AnalyzePluginCallSpeed.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */