package com.sinosoft.aiqc.db.service;

import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.dao.YyzjCUploadAudioMapper;
import com.sinosoft.aiqc.db.domain.YyzjCUploadAudio;
import com.sinosoft.aiqc.db.domain.YyzjCUploadAudioExample;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UploadAudioDbService {

    private static Logger logger = Logger.getLogger(UploadAudioDbService.class);

    @Resource
    private YyzjCUploadAudioMapper yyzjCUploadAudioMapper;

    public List<YyzjCUploadAudio> selectByTotalScoreId(String totalScoreId) {
        logger.info("selectByTotalScoreId 请求参数：" + totalScoreId);

        YyzjCUploadAudioExample uploadAudioExample = new YyzjCUploadAudioExample();
        YyzjCUploadAudioExample.Criteria criteria = uploadAudioExample.createCriteria();
        criteria.andTotalScoreIdEqualTo(totalScoreId);

        List<YyzjCUploadAudio> uploadAudioList =  yyzjCUploadAudioMapper.selectByExampleSelective(uploadAudioExample);
        logger.info("selectByTotalScoreId 查询结果：" + JSON.toJSONString(uploadAudioList));
        return uploadAudioList;
    }
}
