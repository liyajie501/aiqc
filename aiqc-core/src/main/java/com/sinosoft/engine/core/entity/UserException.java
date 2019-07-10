package com.sinosoft.engine.core.entity;


public class UserException
        extends RuntimeException {
    private long date = System.currentTimeMillis();


    public long getDate() {
        return this.date;
    }
}


