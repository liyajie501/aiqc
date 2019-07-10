package com.sinosoft.engine.analyze.service;

import com.sinosoft.engine.analyze.cassandra.model.BaseData;
import com.sinosoft.engine.analyze.model.AnalyzeResource;
import com.sinosoft.engine.analyze.model.Emotion;
import com.sinosoft.engine.analyze.model.Task;

import java.util.List;

public interface BaseDataService {
    BaseData generateBaseDataByTask(Task paramTask, AnalyzeResource paramAnalyzeResource);

    BaseData generateBaseDataByTask(Task paramTask, AnalyzeResource paramAnalyzeResource, BaseData paramBaseData);

    List<Emotion> getEmotionList(String paramString);
}