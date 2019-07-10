package com.sinosoft.engine.analyze.model;

import com.sinosoft.engine.analyze.utils.CommonTools;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;


public class Task {
    private boolean saveBaseFile;
    private boolean saveBaseSourceData = Boolean.parseBoolean(CommonTools.getApplicationConf("engine.analyze.save.source"));

    private boolean saveWord = Boolean.parseBoolean(CommonTools.getApplicationConf("engine.analyze.save.word"));

    private boolean saveResultEle = Boolean.parseBoolean(CommonTools.getApplicationConf("engine.analyze.save.rule.exec.result.ele"));


    private boolean saveScoreTotalData = true;


    private boolean saveScoreDetailData = true;


    private boolean sendAlarm = true;


    private boolean saveScoreTotalDataDB = true;


    private boolean saveScoreDetailDataMore = true;


    private boolean saveBaseDataToES = true;


    private boolean analyzeFile;


    private Map<String, Set<String>> analyzeContents;


    private BlockingQueue<List<AnalyzeResult>> analyzeResultQueue;


    private String sysId;


    private int sysIdentity;


    private String remoteFile;


    private SoundIndex soundIndex;


    private String indexFileName;


    private String soundFileName;


    private String xmlFileName;


    private String emoFileName;


    private BaseData baseData;


    public boolean isSaveBaseDataToES() {
        return this.saveBaseDataToES;
    }


    public void setSaveBaseDataToES(boolean saveBaseDataToES) {
        this.saveBaseDataToES = saveBaseDataToES;
    }


    public boolean isSaveScoreTotalDataDB() {
        return this.saveScoreTotalDataDB;
    }


    public void setSaveScoreTotalDataDB(boolean saveScoreTotalDataDB) {
        this.saveScoreTotalDataDB = saveScoreTotalDataDB;
    }


    public boolean isSaveScoreDetailDataMore() {
        return this.saveScoreDetailDataMore;
    }


    public void setSaveScoreDetailDataMore(boolean saveScoreDetailDataMore) {
        this.saveScoreDetailDataMore = saveScoreDetailDataMore;
    }


    public boolean isSendAlarm() {
        return this.sendAlarm;
    }


    public void setSendAlarm(boolean sendAlarm) {
        this.sendAlarm = sendAlarm;
    }


    public Map<String, Set<String>> getAnalyzeContents() {
        return this.analyzeContents;
    }


    public void setAnalyzeContents(Map<String, Set<String>> analyzeContents) {
        this.analyzeContents = analyzeContents;
    }


    public BlockingQueue<List<AnalyzeResult>> getAnalyzeResultQueue() {
        return this.analyzeResultQueue;
    }


    public void setAnalyzeResultQueue(BlockingQueue<List<AnalyzeResult>> analyzeResultQueue) {
        this.analyzeResultQueue = analyzeResultQueue;
    }


    public boolean isSaveScoreTotalData() {
        return this.saveScoreTotalData;
    }


    public void setSaveScoreTotalData(boolean saveScoreTotalData) {
        this.saveScoreTotalData = saveScoreTotalData;
    }


    public boolean isSaveScoreDetailData() {
        return this.saveScoreDetailData;
    }


    public void setSaveScoreDetailData(boolean saveScoreDetailData) {
        this.saveScoreDetailData = saveScoreDetailData;
    }


    public boolean isSaveResultEle() {
        return this.saveResultEle;
    }


    public void setSaveResultEle(boolean saveResultEle) {
        this.saveResultEle = saveResultEle;
    }


    public String getEmoFileName() {
        return this.emoFileName;
    }


    public void setEmoFileName(String emoFileName) {
        this.emoFileName = emoFileName;
    }


    public boolean isSaveWord() {
        return this.saveWord;
    }


    public void setSaveWord(boolean saveWord) {
        this.saveWord = saveWord;
    }


    public boolean isSaveBaseSourceData() {
        return this.saveBaseSourceData;
    }


    public void setSaveBaseSourceData(boolean saveBaseSourceData) {
        this.saveBaseSourceData = saveBaseSourceData;
    }


    public boolean isSaveBaseFile() {
        return this.saveBaseFile;
    }


    public void setSaveBaseFile(boolean saveBaseFile) {
        this.saveBaseFile = saveBaseFile;
    }


    public boolean isAnalyzeFile() {
        return this.analyzeFile;
    }


    public void setAnalyzeFile(boolean analyzeFile) {
        this.analyzeFile = analyzeFile;
    }


    public BaseData getBaseData() {
        return this.baseData;
    }


    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }


    public SoundIndex getSoundIndex() {
        return this.soundIndex;
    }


    public void setSoundIndex(SoundIndex soundIndex) {
        this.soundIndex = soundIndex;
    }


    public String getSysId() {
        return this.sysId;
    }


    public void setSysId(String sysId) {
        this.sysId = sysId;
    }


    public int getSysIdentity() {
        return this.sysIdentity;
    }


    public void setSysIdentity(int sysIdentity) {
        this.sysIdentity = sysIdentity;
    }


    public String getRemoteFile() {
        return this.remoteFile;
    }


    public void setRemoteFile(String remoteFile) {
        this.remoteFile = remoteFile;
    }


    public String getSoundFileName() {
        return this.soundFileName;
    }


    public void setSoundFileName(String soundFileName) {
        this.soundFileName = soundFileName;
    }


    public String getXmlFileName() {
        return this.xmlFileName;
    }


    public void setXmlFileName(String xmlFileName) {
        this.xmlFileName = xmlFileName;
    }


    public String getIndexFileName() {
        return this.indexFileName;
    }


    public void setIndexFileName(String indexFileName) {
        this.indexFileName = indexFileName;
    }
}


