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
/*    */ 
/*    */ 
/*    */ public class AnalyzePluginDurtime
/*    */   extends AnalyzeService
/*    */ {
/* 27 */   private static Logger logger = Logger.getLogger(AnalyzePluginDurtime.class);
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
/* 39 */     XmlResolverJsoup xmlJsoup = res.getXmlJsoup();
/* 40 */     List<ProducerEleValueExt> eleList = (List)rule.getEleGroupMap().get(eleGroupId);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     String cssQuery = "root record sentence_list sentence";
/* 49 */     Document doc = xmlJsoup.getDocument();
/*    */ 
/*    */     
/* 52 */     Elements resultInfo = doc.select(cssQuery);
/*    */     
/* 54 */     String time = getEleValue(eleList, "time");
/* 55 */     String ref = getEleValue(eleList, "ref");
/*    */ 
/*    */     
/* 58 */     float tt = Float.parseFloat(time);
/* 59 */     tt = tt * 60.0F * 1000.0F;
/*    */     
/* 61 */     int num = 0;
/* 62 */     String startTime = null;
/* 63 */     String endTime = null;
/* 64 */     for (Element o : resultInfo) {
/* 65 */       int st = Integer.parseInt(o.attr("start_time"));
/* 66 */       int et = Integer.parseInt(o.attr("end_time"));
/* 67 */       if (startTime == null) startTime = o.attr("start_time"); 
/* 68 */       endTime = o.attr("end_time");
/* 69 */       num += et - st;
/*    */     } 
/*    */     
/* 72 */     eleGroupResult.addMark(new MarkDuration(startTime, endTime, Integer.toString(num)));
/*    */     
/* 74 */     if ("1".equals(ref) && num > tt) return true; 
/* 75 */     if ("2".equals(ref) && num < tt) return true; 
/* 76 */     if ("3".equals(ref) && num == tt) return true;
/*    */     
/* 78 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\AnalyzePluginDurtime.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */