package com.sinosoft.aiqc.db.service;

import com.sinosoft.aiqc.db.dao.YyzjRBaseDataXmlMapper;
import com.sinosoft.aiqc.db.domain.YyzjRBaseDataXml;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BaseDataXmlDbService {

    @Resource
    private YyzjRBaseDataXmlMapper yyzjRBaseDataXmlMapper;

    public void insertBaseDataXml(Iterable<YyzjRBaseDataXml> baseDataXmlList) {
        for (YyzjRBaseDataXml baseDataXml : baseDataXmlList) {
            yyzjRBaseDataXmlMapper.insert(baseDataXml);
        }
    }



}
