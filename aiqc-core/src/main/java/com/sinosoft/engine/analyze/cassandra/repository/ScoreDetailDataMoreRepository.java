package com.sinosoft.engine.analyze.cassandra.repository;

import com.sinosoft.engine.analyze.cassandra.model.ScoreDetailData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDetailDataMoreRepository extends CrudRepository<ScoreDetailData, String> {
}


