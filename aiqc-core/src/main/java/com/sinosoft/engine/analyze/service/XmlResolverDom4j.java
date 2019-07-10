/*     */ package com.sinosoft.engine.analyze.service;
/*     */ 
/*     */ import com.huayunworld.znyyzj.engine.analyze.cassandra.model.BaseDataXml;
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import net.sf.json.JSONObject;
/*     */ import org.dom4j.Attribute;
/*     */ import org.dom4j.Document;
/*     */ import org.dom4j.DocumentException;
/*     */ import org.dom4j.Element;
/*     */ import org.dom4j.io.SAXReader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class XmlResolverDom4j
/*     */ {
/*     */   private String xmlFile;
/*     */   private Document document;
/*     */   
/*  25 */   public XmlResolverDom4j(String xmlFile) { this.xmlFile = xmlFile; }
/*     */ 
/*     */   
/*     */   public Document getDocument() throws DocumentException {
/*  29 */     if (this.document != null) return this.document;
/*     */     
/*  31 */     SAXReader reader = new SAXReader();
/*     */     
/*  33 */     this.document = reader.read(new File(this.xmlFile));
/*  34 */     return this.document;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<BaseDataXml> getXmlAllData() throws DocumentException {
/*  44 */     List<BaseDataXml> list = new ArrayList<BaseDataXml>();
/*     */     
/*  46 */     Element root = getDocument().getRootElement();
/*     */     
/*  48 */     listNodes(root, -1, 1, 1, list);
/*  49 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void listNodes(Element node, int parentId, int currId, int nodeSort, List<BaseDataXml> resultList) {
/*  55 */     BaseDataXml xml = new BaseDataXml();
/*  56 */     xml.setNodeCode(Integer.valueOf(currId++));
/*  57 */     xml.setParentNodeCode(Integer.valueOf(parentId));
/*  58 */     xml.setNodeName(node.getName());
/*  59 */     xml.setProperty(Integer.valueOf(Integer.parseInt("0")));
/*  60 */     xml.setSort(Integer.valueOf(nodeSort));
/*  61 */     resultList.add(xml);
/*     */ 
/*     */ 
/*     */     
/*  65 */     List<Attribute> list = node.attributes();
/*     */     
/*  67 */     int sort = 1;
/*  68 */     for (Attribute attribute : list) {
/*     */       
/*  70 */       BaseDataXml attr = new BaseDataXml();
/*  71 */       attr.setNodeCode(Integer.valueOf(currId++));
/*  72 */       attr.setParentNodeCode(xml.getNodeCode());
/*  73 */       attr.setNodeName(node.getName());
/*  74 */       attr.setProperty(Integer.valueOf(Integer.parseInt("1")));
/*  75 */       attr.setSort(Integer.valueOf(sort++));
/*     */ 
/*     */       
/*  78 */       attr.setPropertyCode(attribute.getName());
/*  79 */       attr.setPropertyValue(attribute.getValue());
/*     */ 
/*     */       
/*  82 */       resultList.add(attr);
/*     */     } 
/*     */     
/*  85 */     if (!node.getTextTrim().equals("")) {
/*  86 */       System.out.println(node.getName() + "：" + node.getText());
/*     */     }
/*     */ 
/*     */     
/*  90 */     Iterator<Element> iterator = node.elementIterator();
/*  91 */     int nSort = 1;
/*  92 */     while (iterator.hasNext()) {
/*  93 */       Element e = (Element)iterator.next();
/*  94 */       listNodes(e, xml.getNodeCode().intValue(), currId, nSort++, resultList);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws DocumentException {
/* 102 */     XmlResolverDom4j d = new XmlResolverDom4j("D:/work/workspace/analyze/xml/LHDC_65593a520004cfae_20170609154523_01084661891_sip-913303_1002.xml");
/* 103 */     List<BaseDataXml> list = d.getXmlAllData();
/* 104 */     for (BaseDataXml x : list)
/* 105 */       System.out.println(JSONObject.fromObject(x).toString()); 
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\XmlResolverDom4j.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */