package com.sinosoft.engine.analyze.cassandra.repository;

import com.sinosoft.engine.analyze.model.ScoreTotalData;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreTotalDataRepository extends CrudRepository<ScoreTotalData, String> {
    @Query("select count(*) from yyzj_t_score_total_data where total_score_id = ?0 ALLOW FILTERING;")
    long countBy(String paramString);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\cassandra\repository\ScoreTotalDataRepository.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */