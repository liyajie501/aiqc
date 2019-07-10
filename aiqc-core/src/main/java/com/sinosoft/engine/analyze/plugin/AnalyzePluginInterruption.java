/*    */ package com.sinosoft.engine.analyze.plugin;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.*;
import com.huayunworld.znyyzj.engine.analyze.service.AnalyzeService;
import com.huayunworld.znyyzj.engine.analyze.service.XmlResolverJsoup;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AnalyzePluginInterruption
/*    */   extends AnalyzeService
/*    */ {
/* 25 */   private static Logger logger = Logger.getLogger(AnalyzePluginInterruption.class);
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
/* 37 */     XmlResolverJsoup xmlJsoup = res.getXmlJsoup();
/* 38 */     List<ProducerEleValueExt> eleList = (List)rule.getEleGroupMap().get(eleGroupId);
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
/* 50 */     String cssQuery = "root record interruption_list inter";
/* 51 */     Document doc = xmlJsoup.getDocument();
/* 52 */     if ("1".equals(rule.getUserType())) cssQuery = cssQuery + "[role=\"1\"]"; 
/* 53 */     if ("2".equals(rule.getUserType())) cssQuery = cssQuery + "[role=\"2\"]"; 
/* 54 */     Elements resultInfo = doc.select(cssQuery);
/*    */     
/* 56 */     String time = getEleValue(eleList, "time");
/* 57 */     String ref = getEleValue(eleList, "ref");
/*    */ 
/*    */     
/* 60 */     float tt = Float.parseFloat(time);
/* 61 */     tt *= 1000.0F;
/*    */     
/* 63 */     int num = 0;
/* 64 */     for (Element o : resultInfo) {
/* 65 */       int st = Integer.parseInt(o.attr("start_time"));
/* 66 */       int et = Integer.parseInt(o.attr("end_time"));
/* 67 */       num += et - st;
/*    */ 
/*    */ 
/*    */       
/* 71 */       eleGroupResult.addMark(new MarkInterruption(Integer.toString(st), Integer.toString(et), o.attr("role")));
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 77 */     if ("1".equals(ref) && num > tt) return true; 
/* 78 */     if ("2".equals(ref) && num < tt) return true; 
/* 79 */     if ("3".equals(ref) && num == tt) return true;
/*    */     
/* 81 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\AnalyzePluginInterruption.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */