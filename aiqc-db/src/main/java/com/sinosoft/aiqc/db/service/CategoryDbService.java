package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCCategoryMapper;
import com.sinosoft.aiqc.db.domain.YyzjCCategory;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryDbService {

    Logger logger = Logger.getLogger(CategoryDbService.class);

    @Resource
    private YyzjCCategoryMapper yyzjCCategoryMapper;

    public List<YyzjCCategory> selectCategoryListBySysId(String sysId) {
        logger.info("selectCategoryListBy 方法入参：" + sysId);

        YyzjCCategory category = new YyzjCCategory();
        category.setDeleteMark("0");
        if (StringUtils.isNotBlank(sysId)) {
            category.setSysId(sysId);
        }

        List<YyzjCCategory> categoryList = yyzjCCategoryMapper.selectByExampleSelective(category);
        logger.info("selectCategoryListBy 查询结果：" + JSON.toJSONString(categoryList));
        return categoryList;
    }


}
