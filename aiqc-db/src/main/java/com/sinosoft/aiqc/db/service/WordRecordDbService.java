package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjTWordRecordMapper;
import com.sinosoft.aiqc.db.domain.YyzjTWordRecord;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WordRecordDbService {

    Logger logger = Logger.getLogger(WordRecordDbService.class);

    @Resource
    private YyzjTWordRecordMapper yyzjTWordRecordMapper;

    // List<YyzjTWordRecord> wordRecordList
    public void insertWordRecord(Iterable<YyzjTWordRecord> wordRecordList) {
        logger.info("insertWordRecord 方法入参：" + JSON.toJSONString(wordRecordList));
        int resuleCode;
        for (YyzjTWordRecord wordRecord : wordRecordList) {
            resuleCode = yyzjTWordRecordMapper.insert(wordRecord);
            logger.info("insertWordRecord 插入结果：" + resuleCode + "； YyzjTWordRecord [" + wordRecord.toString() + "]");
        }
    }



}
