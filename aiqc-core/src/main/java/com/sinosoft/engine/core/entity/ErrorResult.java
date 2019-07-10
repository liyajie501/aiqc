package com.sinosoft.engine.core.entity;

import java.util.HashMap;
import java.util.Map;


public class ErrorResult extends Result {
    private static final long serialVersionUID = 8567221653356186674L;
    private Map<String, Object> errors = new HashMap();


    public Map<String, Object> getErrors() {
        return this.errors;
    }


    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }
}


