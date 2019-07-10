package com.sinosoft.engine.analyze.cassandra.repository;

import com.sinosoft.engine.analyze.cassandra.model.IndexMsg;
import com.sinosoft.engine.analyze.model.BaseData;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseDataRepository extends CrudRepository<BaseData, String> {
    @Query("select * from yyzj_t_index_msg where sys_id=?0 and lock_flag = 0 ALLOW FILTERING;")
    List<IndexMsg> getIndexMsgList(String paramString);

    @Query("select * from yyzj_t_base_data where base_id = ?0 ALLOW FILTERING")
    List<BaseData> getBaseDataById(String paramString);

    @Query("select * from yyzj_t_base_data where upload_id = ?0 ALLOW FILTERING")
    List<BaseData> getBaseDataByUploadId(String paramString);
}