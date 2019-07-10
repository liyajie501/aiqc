package com.sinosoft.aiqc.zj.web;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.domain.YyzjCDict;
import com.sinosoft.aiqc.zj.dto.common.DataDictionaryReqDto;
import com.sinosoft.aiqc.zj.service.PublicService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/zj/public", produces = "application/json;charset=UTF-8")
@Validated
public class PublicController {

    private final Logger logger = Logger.getLogger(PublicController.class);

    @Autowired
    private PublicService publicService;


    /**
     * 数据字典获取接口
     *
     * @param reqstr
     * @return
     */
    @PostMapping("/queryDataDictionary")
    @ResponseBody
    public String queryDataDictionary(@RequestBody String reqstr) {
        logger.info("queryDataDictionary 获取数据字典方法执行开始>>>>>>>>>>>");
        logger.info("请求报文：" + reqstr);
        // 请求报文=>实体类
        DataDictionaryReqDto dataDictionaryReqDto = null;
        if (reqstr != null) {
            dataDictionaryReqDto = JSON.parseObject(reqstr, DataDictionaryReqDto.class);
        }
        List<YyzjCDict> yyzjCDictList = publicService.queryDataDictionary(dataDictionaryReqDto);

        logger.info("queryDataDictionary 获取数据字典方法执行开始>>>>>>>>>>>");

        return JSON.toJSONString(yyzjCDictList);
    }
}
