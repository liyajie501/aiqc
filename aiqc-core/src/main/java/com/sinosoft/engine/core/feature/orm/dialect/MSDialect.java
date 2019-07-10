package com.sinosoft.engine.core.feature.orm.dialect;


public class MSDialect
        extends Dialect {
    protected static final String SQL_END_DELIMITER = ";";

    public String getLimitString(String sql, int offset, int limit) {
        return MSPageHepler.getLimitString(sql, offset, limit);
    }


    public String getCountString(String sql) {
        return MSPageHepler.getCountString(sql);
    }
}

