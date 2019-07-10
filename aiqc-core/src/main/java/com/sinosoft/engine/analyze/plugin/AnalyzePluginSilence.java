/*    */ package com.sinosoft.engine.analyze.plugin;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.AnalyzeResource;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.EleGroupResult;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.MarkSilence;
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
/*    */ public class AnalyzePluginSilence
/*    */   extends AnalyzeService
/*    */ {
/* 24 */   private static Logger logger = Logger.getLogger(AnalyzePluginSilence.class);
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
/* 36 */     XmlResolverJsoup xmlJsoup = res.getXmlJsoup();
/* 37 */     List<ProducerEleValueExt> eleList = (List)rule.getEleGroupMap().get(eleGroupId);
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
/* 48 */     String cssQuery = "root record silence_list silence";
/* 49 */     Document doc = xmlJsoup.getDocument();
/* 50 */     Elements resultInfo = doc.select(cssQuery);
/*    */     
/* 52 */     String second = getEleValue(eleList, "second");
/* 53 */     String count = getEleValue(eleList, "count");
/* 54 */     String ref = getEleValue(eleList, "ref");
/*    */ 
/*    */     
/* 57 */     int countInt = Integer.parseInt(count);
/* 58 */     int secondInt = Integer.parseInt(second);
/* 59 */     secondInt *= 1000;
/*    */ 
/*    */     
/* 62 */     int num = 0;
/* 63 */     for (Element o : resultInfo) {
/* 64 */       int st = Integer.parseInt(o.attr("start_time"));
/* 65 */       int et = Integer.parseInt(o.attr("end_time"));
/* 66 */       if (et - st > secondInt) {
/* 67 */         num++;
/*    */ 
/*    */         
/* 70 */         eleGroupResult.addMark(new MarkSilence(o.attr("start_time"), o.attr("end_time"), Integer.toString(et - st)));
/*    */       } 
/*    */     } 
/*    */     
/* 74 */     if ("1".equals(ref) && num > countInt) return true; 
/* 75 */     if ("2".equals(ref) && num < countInt) return true; 
/* 76 */     if ("3".equals(ref) && num == countInt) return true;
/*    */     
/* 78 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\AnalyzePluginSilence.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */