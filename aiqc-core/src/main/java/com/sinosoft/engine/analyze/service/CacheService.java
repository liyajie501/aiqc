package com.sinosoft.engine.analyze.service;

import com.sinosoft.engine.alarm.service.impl.CheckAlarmServiceImpl;
import com.sinosoft.engine.analyze.cassandra.repository.*;
import com.sinosoft.engine.analyze.dao.*;
import com.sinosoft.engine.analyze.model.ScoreTotal;
import com.sinosoft.engine.analyze.model.ScoreTotalData;
import com.sinosoft.engine.analyze.service.mq.SoundTaskProducer;
import com.sinosoft.engine.analyze.utils.CommonTools;
import com.sinosoft.engine.elasticsearch.service.ESBaseDataService;
import com.sinosoft.engine.elasticsearch.serviceImpl.ESBaseDataSearchServiceImpl;
import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class CacheService {
    private static Logger logger = Logger.getLogger(CacheService.class);

    @Autowired
    public JoinSysMapper joinSysMapper;

    @Autowired
    public ModelMapper ModelMapper;

    @Autowired
    public RuleMapper RuleMapper;

    @Autowired
    public AnalyzerMapper AnalyzerMapper;
    @Autowired
    public ScoreTotalMapper ScoreTotalMapper;
    @Autowired
    public ScoreDetailMapper ScoreDetailMapper;
    @Autowired
    public BaseDataMapper BaseDataMapper;
    @Autowired
    public ProducerEleGroupMapper producerEleGroupMapper;
    @Autowired
    public IndexMsgRepository indexMsgRepository;
    @Autowired
    public BaseDataRepository baseDataRepository;
    @Autowired
    public BaseDataXmlRepository baseDataXmlRepository;
    @Autowired
    public ScoreTotalDataRepository scoreTotalDataRepository;
    @Autowired
    public ScoreDetailDataRepository scoreDetailDataRepository;
    @Autowired
    public WordRecordRepository wordRecordRepository;
    @Autowired
    public CheckAlarmServiceImpl checkAlarmServiceImpl;
    @Autowired
    public ScoreResultMapper scoreResultMapper;
    @Autowired
    public SoundTaskProducer soundTaskProducerImpl;
    @Autowired
    public ScoreTotalDataMapper scoreTotalDataMapper;
    @Autowired
    public CategoryMapper categoryMapper;
    @Autowired
    public ESBaseDataService eSBaseDataServiceImpl;
    @Autowired
    public ESBaseDataSearchServiceImpl eSBaseDataSearchServiceImpl;
    @Autowired
    public UserMapper userMapper;
    @Autowired
    public ScoreAgentRuleMapper scoreAgentRuleMapper;
    @Autowired
    public UploadAudioMapper uploadAudioMapper;

    public UploadAudioMapper getUploadAudioMapper() {
        return this.uploadAudioMapper;
    }


    public void setUploadAudioMapper(UploadAudioMapper uploadAudioMapper) {
        this.uploadAudioMapper = uploadAudioMapper;
    }


    private static SimpleDateFormat YYYYMMdd = new SimpleDateFormat("yyyyMMdd");

    private static Date sequenceValDate = new Date();

    public ScoreAgentRuleMapper getScoreAgentRuleMapper() {
        return this.scoreAgentRuleMapper;
    }


    public void setScoreAgentRuleMapper(ScoreAgentRuleMapper scoreAgentRuleMapper) {
        this.scoreAgentRuleMapper = scoreAgentRuleMapper;
    }


    public UserMapper getUserMapper() {
        return this.userMapper;
    }


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public ESBaseDataSearchServiceImpl geteSBaseDataSearchServiceImpl() {
        return this.eSBaseDataSearchServiceImpl;
    }


    public void seteSBaseDataSearchServiceImpl(ESBaseDataSearchServiceImpl eSBaseDataSearchServiceImpl) {
        this.eSBaseDataSearchServiceImpl = eSBaseDataSearchServiceImpl;
    }


    private static long sequenceVal = sequenceValDate.getTime();


    public ESBaseDataService geteSBaseDataServiceImpl() {
        return this.eSBaseDataServiceImpl;
    }


    public void seteSBaseDataServiceImpl(ESBaseDataService eSBaseDataServiceImpl) {
        this.eSBaseDataServiceImpl = eSBaseDataServiceImpl;
    }


    public ScoreTotalData saveScoreTotalDataToDB(ScoreTotal st, ScoreTotalData scoreTotalData) {
        String tableNameSuffix = "_" + YYYYMMdd.format(st.getCreateTime());
        com.sinosoft.engine.analyze.model.ScoreTotalData mysqldata = new ScoreTotalData(scoreTotalData);
        mysqldata.setTableNameSuffix(tableNameSuffix);

        getScoreTotalDataMapper().insert(mysqldata);
        logger.info("保存ScoreTotalData到MySql中【成功】");


        return scoreTotalData;
    }


    public static long getSequenceVal() {
        if (!DateUtils.truncatedEquals(new Date(), sequenceValDate, 5)) {

            sequenceValDate = new Date();
            sequenceVal = sequenceValDate.getTime();
        }

        sequenceVal++;
        return sequenceVal;
    }


    public static boolean DEL_TEMP_FILE = Boolean.parseBoolean(CommonTools.getApplicationConf("engine.analyze.class.loader.url"));


    public static boolean lockFile(int sysIdentity, String fileName) {
        return true;
    }


    public static boolean unLockFile(int sysIdentity, String fileName) {
        return true;
    }


    public static boolean needScan(int sysIdentity, String dirName) {
        return true;
    }


    public CategoryMapper getCategoryMapper() {
        return this.categoryMapper;
    }


    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }


    public SoundTaskProducer getSoundTaskProducerImpl() {
        return this.soundTaskProducerImpl;
    }


    public void setSoundTaskProducerImpl(SoundTaskProducer soundTaskProducerImpl) {
        this.soundTaskProducerImpl = soundTaskProducerImpl;
    }


    public ScoreResultMapper getScoreResultMapper() {
        return this.scoreResultMapper;
    }


    public void setScoreResultMapper(ScoreResultMapper scoreResultMapper) {
        this.scoreResultMapper = scoreResultMapper;
    }


    public JoinSysMapper getJoinSysMapper() {
        return this.joinSysMapper;
    }


    public void setJoinSysMapper(JoinSysMapper joinSysMapper) {
        this.joinSysMapper = joinSysMapper;
    }


    public ModelMapper getModelMapper() {
        return this.ModelMapper;
    }


    public void setModelMapper(ModelMapper modelMapper) {
        this.ModelMapper = modelMapper;
    }


    public RuleMapper getRuleMapper() {
        return this.RuleMapper;
    }


    public void setRuleMapper(RuleMapper ruleMapper) {
        this.RuleMapper = ruleMapper;
    }


    public AnalyzerMapper getAnalyzerMapper() {
        return this.AnalyzerMapper;
    }


    public void setAnalyzerMapper(AnalyzerMapper analyzerMapper) {
        this.AnalyzerMapper = analyzerMapper;
    }


    public ScoreTotalMapper getScoreTotalMapper() {
        return this.ScoreTotalMapper;
    }


    public void setScoreTotalMapper(ScoreTotalMapper scoreTotalMapper) {
        this.ScoreTotalMapper = scoreTotalMapper;
    }


    public ScoreDetailMapper getScoreDetailMapper() {
        return this.ScoreDetailMapper;
    }


    public void setScoreDetailMapper(ScoreDetailMapper scoreDetailMapper) {
        this.ScoreDetailMapper = scoreDetailMapper;
    }


    public ProducerEleGroupMapper getProducerEleGroupMapper() {
        return this.producerEleGroupMapper;
    }


    public void setProducerEleGroupMapper(ProducerEleGroupMapper producerEleGroupMapper) {
        this.producerEleGroupMapper = producerEleGroupMapper;
    }


    public IndexMsgRepository getIndexMsgRepository() {
        return this.indexMsgRepository;
    }


    public void setIndexMsgRepository(IndexMsgRepository indexMsgRepository) {
        this.indexMsgRepository = indexMsgRepository;
    }


    public BaseDataRepository getBaseDataRepository() {
        return this.baseDataRepository;
    }


    public void setBaseDataRepository(BaseDataRepository baseDataRepository) {
        this.baseDataRepository = baseDataRepository;
    }


    public BaseDataXmlRepository getBaseDataXmlRepository() {
        return this.baseDataXmlRepository;
    }


    public void setBaseDataXmlRepository(BaseDataXmlRepository baseDataXmlRepository) {
        this.baseDataXmlRepository = baseDataXmlRepository;
    }


    public ScoreTotalDataRepository getScoreTotalDataRepository() {
        return this.scoreTotalDataRepository;
    }


    public void setScoreTotalDataRepository(ScoreTotalDataRepository scoreTotalDataRepository) {
        this.scoreTotalDataRepository = scoreTotalDataRepository;
    }


    public ScoreDetailDataRepository getScoreDetailDataRepository() {
        return this.scoreDetailDataRepository;
    }


    public void setScoreDetailDataRepository(ScoreDetailDataRepository scoreDetailDataRepository) {
        this.scoreDetailDataRepository = scoreDetailDataRepository;
    }


    public WordRecordRepository getWordRecordRepository() {
        return this.wordRecordRepository;
    }


    public void setWordRecordRepository(WordRecordRepository wordRecordRepository) {
        this.wordRecordRepository = wordRecordRepository;
    }


    public CheckAlarmServiceImpl getCheckAlarmServiceImpl() {
        return this.checkAlarmServiceImpl;
    }


    public void setCheckAlarmServiceImpl(CheckAlarmServiceImpl checkAlarmServiceImpl) {
        this.checkAlarmServiceImpl = checkAlarmServiceImpl;
    }


    public BaseDataMapper getBaseDataMapper() {
        return this.BaseDataMapper;
    }


    public void setBaseDataMapper(BaseDataMapper baseDataMapper) {
        this.BaseDataMapper = baseDataMapper;
    }


    public ScoreTotalDataMapper getScoreTotalDataMapper() {
        return this.scoreTotalDataMapper;
    }


    public void setScoreTotalDataMapper(ScoreTotalDataMapper scoreTotalDataMapper) {
        this.scoreTotalDataMapper = scoreTotalDataMapper;
    }
}
