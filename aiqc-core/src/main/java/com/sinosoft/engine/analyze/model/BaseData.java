package com.sinosoft.engine.analyze.model;


import org.apache.commons.beanutils.PropertyUtils;

public class BaseData extends com.sinosoft.engine.analyze.cassandra.model.BaseData {
    private String tableNameSuffix;

    public BaseData() {}

    public BaseData(BaseData base) {
        try {
            PropertyUtils.copyProperties(this, base);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





    public String getTableNameSuffix() { return this.tableNameSuffix; }


    public void setTableNameSuffix(String tableNameSuffix) { this.tableNameSuffix = tableNameSuffix; }
}

