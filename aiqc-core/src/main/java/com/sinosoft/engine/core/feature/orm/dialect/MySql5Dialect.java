package com.sinosoft.engine.core.feature.orm.dialect;


public class MySql5Dialect
        extends Dialect {
    protected static final String SQL_END_DELIMITER = ";";

    public String getLimitString(String sql, int offset, int limit) {
        return MySql5PageHepler.getLimitString(sql, offset, limit);
    }


    public String getCountString(String sql) {
        return MySql5PageHepler.getCountString(sql);
    }
}
