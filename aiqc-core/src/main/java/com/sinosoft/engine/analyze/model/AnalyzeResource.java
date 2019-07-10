package com.sinosoft.engine.analyze.model;

import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.service.BaseDataService;
import com.sinosoft.engine.analyze.service.XmlResolverDom4j;
import com.sinosoft.engine.analyze.service.XmlResolverJsoup;
import org.apache.log4j.Logger;

import java.util.List;


public class AnalyzeResource {
    private static Logger logger = Logger.getLogger(AnalyzeResource.class);


    private BaseData baseData;

    private XmlResolverDom4j xmlDom4j;

    private XmlResolverJsoup xmlJsoup;

    private String resultXmlFile;

    private String emotionFile;

    private List<Emotion> emotionList;


    public void init(BaseDataService baseSvc) throws Exception {
        logger.info("resultXmlFile:" + this.resultXmlFile);
        logger.info("emotionFile:" + this.emotionFile);

        this.xmlDom4j = new XmlResolverDom4j(this.resultXmlFile);
        this.xmlJsoup = new XmlResolverJsoup(this.resultXmlFile);
        this.xmlDom4j.getDocument();
        this.emotionList = baseSvc.getEmotionList(this.emotionFile);
    }


    public String getResultXmlFile() {
        return this.resultXmlFile;
    }


    public void setResultXmlFile(String resultXmlFile) {
        this.resultXmlFile = resultXmlFile;
    }


    public XmlResolverDom4j getXmlDom4j() {
        return this.xmlDom4j;
    }


    public void setXmlDom4j(XmlResolverDom4j xmlDom4j) {
        this.xmlDom4j = xmlDom4j;
    }


    public XmlResolverJsoup getXmlJsoup() {
        return this.xmlJsoup;
    }


    public void setXmlJsoup(XmlResolverJsoup xmlJsoup) {
        this.xmlJsoup = xmlJsoup;
    }


    public List<Emotion> getEmotionList() {
        return this.emotionList;
    }


    public void setEmotionList(List<Emotion> emotionList) {
        this.emotionList = emotionList;
    }


    public String getEmotionFile() {
        return this.emotionFile;
    }


    public void setEmotionFile(String emotionFile) {
        this.emotionFile = emotionFile;
    }


    public BaseData getBaseData() {
        return this.baseData;
    }


    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }
}

