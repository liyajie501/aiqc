package com.sinosoft.engine.core.feature.orm.dialect;

public abstract class Dialect {
    public abstract String getLimitString(String paramString, int paramInt1, int paramInt2);

    public abstract String getCountString(String paramString);
}


