package com.sinosoft.engine.core.feature.orm.dialect;


public class PostgreDialect
        extends Dialect {
    protected static final String SQL_END_DELIMITER = ";";

    public String getLimitString(String sql, int offset, int limit) {
        return PostgrePageHepler.getLimitString(sql, offset, limit);
    }


    public String getCountString(String sql) {
        return PostgrePageHepler.getCountString(sql);
    }
}


