package com.sinosoft.aiqc.zj.service;

import com.sinosoft.aiqc.db.domain.YyzjCDict;
import com.sinosoft.aiqc.db.service.PublicDbService;
import com.sinosoft.aiqc.zj.dto.common.DataDictionaryReqDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PublicService {

    private final Logger logger = Logger.getLogger(PublicService.class);

    @Autowired
    private PublicDbService publicDbService;

    /**
     * 查询所有数据字典
     *
     * @param dataDictionaryReqDto
     * @return
     */
    public List<YyzjCDict> queryDataDictionary(DataDictionaryReqDto dataDictionaryReqDto) {
        logger.info("");

        List<YyzjCDict> yyzjCDictList = publicDbService.queryDataDictionary(dataDictionaryReqDto.getParentId());

        return yyzjCDictList;
    }

    /**
     * 查询所有数据字典
     *
     * @return
     */
    public List<YyzjCDict> queryDataDictionary() {
        logger.info("");

        List<YyzjCDict> yyzjCDictList = publicDbService.queryDataDictionary();

        return yyzjCDictList;
    }
}
