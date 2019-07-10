package com.sinosoft.engine.analyze.cassandra.repository;

import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class CassandraRepository {
    @Resource(name = "cqlTemplate")
    private CassandraTemplate cassandraTemplate = null;

    public void Test() {
    }
}

