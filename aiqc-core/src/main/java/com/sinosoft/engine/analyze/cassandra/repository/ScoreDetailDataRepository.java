package com.sinosoft.engine.analyze.cassandra.repository;

import com.sinosoft.engine.analyze.cassandra.model.ScoreDetailData;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDetailDataRepository extends CrudRepository<ScoreDetailData, String> {
    @Query("select count(*) from yyzj_t_score_detail_data where total_score_result_id = ?0 and agent_id = ?1 and rule_id = ?2 ALLOW FILTERING;")
    long countBy(String paramString1, String paramString2, String paramString3);

    @Query("select count(*) from yyzj_t_score_detail_data where create_time >= ?4 and create_time<=?5 and total_score_result_id = ?0  and agent_id = ?1 and rule_id = ?2 and detail_score = ?3 ALLOW FILTERING;")
    long countBy(String paramString1, String paramString2, String paramString3, Double paramDouble, Long paramLong1, Long paramLong2);

    @Query("select count(*) from yyzj_t_score_detail_data where total_score_result_id = ?0  and agent_id = ?1 ALLOW FILTERING;")
    long countBy(String paramString1, String paramString2);

    @Query("select count(*) from yyzj_t_score_detail_data where create_time >= ?2 and create_time<=?3 and total_score_result_id = ?0  and agent_id = ?1 ALLOW FILTERING;")
    long countBy(String paramString1, String paramString2, Long paramLong1, Long paramLong2);
}

