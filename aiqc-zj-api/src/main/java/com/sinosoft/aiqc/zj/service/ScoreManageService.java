package com.sinosoft.aiqc.zj.service;


import com.alibaba.fastjson.JSON;
import com.sinosoft.aiqc.db.service.ScoreDetailDbService;
import com.sinosoft.aiqc.db.service.ScoreTotalDbService;
import com.sinosoft.aiqc.zj.common.Contanst;
import com.sinosoft.aiqc.zj.dto.Score.ScoreDetail;
import com.sinosoft.aiqc.zj.dto.Score.ScoreTotal;
import com.sinosoft.aiqc.zj.utils.HttpClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ScoreManageService {

    Logger logger = Logger.getLogger(ScoreManageService.class);

    @Autowired
    private ScoreDetailDbService scoreDetailDbService;
    @Autowired
    private ScoreTotalDbService scoreTotalDbService;

    @Value("${yyzj.analyze.web.path}")
    private String analyzeWebPath;


    public int insertScoreInfo(ScoreTotal scoreTotal) {

        int totalScoreId = scoreTotalDbService.insertScoreTotal(JSON.toJSONString(scoreTotal));

        ScoreDetail scoreDetail = scoreTotal.getScoreDetails();
        scoreDetail.setTotalScoreId(totalScoreId);
        int resultNum = scoreDetailDbService.insertScoreDateil(JSON.toJSONString(scoreDetail));

        if (scoreTotal.getPublishMark().equals("1")) {
                String url = this.analyzeWebPath + "rest/message/send/scoreTotalTask/" + scoreTotal.getTotalScoreId();
                String data = HttpClient.post(url);
                if (!data.equals(Contanst.SUCCESS)) {
                    this.logger.debug("调用质检任务接口失败:" + url);
                }
        }
        return resultNum;
    }


}
