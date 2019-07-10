package com.sinosoft.engine.analyze.cassandra.repository;

import com.sinosoft.engine.analyze.cassandra.model.WordRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRecordRepository extends CrudRepository<WordRecord, String> {
}