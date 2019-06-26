package com.sinosoft.aiqc.zj.web;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.domain.YyzjDSysDict;
import com.sinosoft.aiqc.zj.dto.common.DataDictionaryReqDto;
import com.sinosoft.aiqc.zj.service.PublicService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/zj/public", produces = "application/json;charset=UTF-8")
@Validated
public class PublicController {

    private final Log logger = LogFactory.getLog(PublicController.class);

    @Autowired
    private PublicService publicService;


    /**
     * 数据字典获取接口
     * @param reqstr
     * @return
     */
    @PostMapping("/queryDataDictionary")
    @ResponseBody
    public String queryDataDictionary(@NotNull @RequestBody String reqstr){
        logger.debug("queryDataDictionary 获取数据字典方法执行开始>>>>>>>>>>>");
        logger.debug("请求报文：" + reqstr);
        System.out.println("请求报文：" + reqstr);
        // 请求报文=>实体类
        DataDictionaryReqDto dataDictionaryReqDto = JSON.parseObject(reqstr, DataDictionaryReqDto.class);
        System.out.println(dataDictionaryReqDto.getParentId());

        List<YyzjDSysDict> yyzjDSysDictList = publicService.queryDataDictionary(dataDictionaryReqDto);

        logger.debug("queryDataDictionary 获取数据字典方法执行开始>>>>>>>>>>>");

        return JSON.toJSONString(yyzjDSysDictList);
    }
}
