package com.sinosoft.engine.core.entity;

import java.io.Serializable;


public class Result
        implements Serializable {
    private static final long serialVersionUID = 6288374846131788743L;
    private String message;
    private int statusCode;
    private boolean success;

    public String getMessage() {
        return this.message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public boolean isSuccess() {
        return this.success;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }


    public int getStatusCode() {
        return this.statusCode;
    }


    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}


