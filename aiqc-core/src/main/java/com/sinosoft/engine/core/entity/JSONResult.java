package com.sinosoft.engine.core.entity;


public class JSONResult<T> extends Result {
    private static final long serialVersionUID = 7880907731807860636L;
    private T data;

    public T getData() {
        return (T) this.data;
    }


    public void setData(T data) {
        this.data = data;
    }


    public JSONResult() {
    }


    public JSONResult(T data, String message, boolean success) {
        this.data = data;
        setMessage(message);
        setSuccess(success);
    }


    public JSONResult(T data, String message) {
        this.data = data;
        setMessage(message);
        setSuccess(true);
    }


    public JSONResult(T data) {
        this.data = data;
        setSuccess(true);
    }
}

