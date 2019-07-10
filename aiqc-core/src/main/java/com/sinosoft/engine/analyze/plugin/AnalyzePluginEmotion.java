/*     */ package com.sinosoft.engine.analyze.plugin;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.AnalyzeResource;
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.EleGroupResult;
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.Emotion;
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.MarkEmotion;
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.ProducerEleValueExt;
/*     */ import com.huayunworld.znyyzj.engine.analyze.model.RuleCore;
/*     */ import com.huayunworld.znyyzj.engine.analyze.service.AnalyzeService;
/*     */ import com.huayunworld.znyyzj.engine.analyze.service.XmlResolverJsoup;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.jsoup.nodes.Document;
/*     */ import org.jsoup.nodes.Element;
/*     */ import org.jsoup.select.Elements;
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
/*     */ public class AnalyzePluginEmotion
/*     */   extends AnalyzeService
/*     */ {
/*  30 */   private static Logger logger = Logger.getLogger(AnalyzePluginEmotion.class);
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
/*  42 */     List<ProducerEleValueExt> eleList = (List)rule.getEleGroupMap().get(eleGroupId);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     String value = getEleValue(eleList, "value");
/*  52 */     String ref = getEleValue(eleList, "ref");
/*  53 */     String emotionType = getEleValue(eleList, "emotion_type");
/*  54 */     String valueType = getEleValue(eleList, "value_type");
/*     */     
/*  56 */     float tt = Float.parseFloat(value);
/*     */     
/*  58 */     List<Emotion> list = res.getEmotionList();
/*  59 */     float num = 0.0F;
/*  60 */     for (Emotion e : list) {
/*  61 */       if ((!"0".equals(rule.getUserType()) && e.getRole() != Integer.parseInt(rule.getUserType())) || (
/*  62 */         !"3".equals(emotionType) && e.getEmotionType() != Integer.parseInt(emotionType)))
/*  63 */         continue;  num += e.getEndTime() - e.getStartTime();
/*     */       
/*  65 */       eleGroupResult.addMark(new MarkEmotion(Integer.toString((int)e.getStartTime() * 1000), Integer.toString((int)e.getEndTime() * 1000), Integer.toString(e.getEmotionType())));
/*     */     } 
/*     */     
/*  68 */     if ("2".equals(valueType)) {
/*  69 */       XmlResolverJsoup xmlJsoup = res.getXmlJsoup();
/*  70 */       float callTime = getCallTime(xmlJsoup, rule.getUserType());
/*  71 */       callTime /= 1000.0F;
/*  72 */       num /= callTime;
/*  73 */       num *= 100.0F;
/*     */     } 
/*     */     
/*  76 */     if ("1".equals(ref) && num > tt) return true; 
/*  77 */     if ("2".equals(ref) && num < tt) return true; 
/*  78 */     if ("3".equals(ref) && num == tt) return true;
/*     */     
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private float getCallTime(XmlResolverJsoup xmlJsoup, String role) throws IOException {
/*  91 */     String cssQuery = "root record sentence_list sentence";
/*  92 */     Document doc = xmlJsoup.getDocument();
/*  93 */     if ("1".equals(role)) cssQuery = cssQuery + "[role=\"1\"]"; 
/*  94 */     if ("2".equals(role)) cssQuery = cssQuery + "[role=\"2\"]"; 
/*  95 */     Elements resultInfo = doc.select(cssQuery);
/*  96 */     int callTime = 0;
/*  97 */     for (Element o : resultInfo) {
/*  98 */       int st = Integer.parseInt(o.attr("start_time"));
/*  99 */       int et = Integer.parseInt(o.attr("end_time"));
/* 100 */       callTime += et - st;
/*     */     } 
/* 102 */     return callTime;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\plugin\AnalyzePluginEmotion.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */