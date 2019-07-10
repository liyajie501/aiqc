package com.sinosoft.engine.analyze.cassandra.repository;

import com.sinosoft.engine.analyze.cassandra.model.IndexMsg;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexMsgRepository extends CrudRepository<IndexMsg, String> {
    @Query("select * from yyzj_t_index_msg where sys_id=?0 and lock_flag = 0 ALLOW FILTERING;")
    List<IndexMsg> getIndexMsgList(String paramString);
}
