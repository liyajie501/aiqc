package com.sinosoft.aiqc.zj.service;

import com.sinosoft.aiqc.db.dao.YyzjDSysDictMapper;
import com.sinosoft.aiqc.db.domain.YyzjDSysDict;
import com.sinosoft.aiqc.db.domain.YyzjDSysDictExample;
import com.sinosoft.aiqc.db.service.PublicDbService;
import com.sinosoft.aiqc.zj.dto.common.DataDictionaryReqDto;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PublicService {

    private final Log logger = LogFactory.getLog(PublicService.class);

    @Autowired
    private PublicDbService publicDbService;

    public  List<YyzjDSysDict> queryDataDictionary(DataDictionaryReqDto dataDictionaryReqDto){

        List<YyzjDSysDict> yyzjDSysDictList = publicDbService.queryDataDictionary(dataDictionaryReqDto.getParentId());

        return yyzjDSysDictList;
    }
}
