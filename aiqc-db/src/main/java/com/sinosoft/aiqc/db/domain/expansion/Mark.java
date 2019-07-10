package com.sinosoft.aiqc.db.domain.expansion;

public class Mark {

    public static final int TYPE_TEXT = 1;
    public static final int TYPE_VOLUME = 2;
    public static final int TYPE_EMOTION = 3;
    public static final int TYPE_INTERRUPTION = 4;
    public static final int TYPE_DURATION = 5;
    public static final int TYPE_SILENCE = 6;
    public static final int TYPE_SPEED = 7;
    private int t;
    private String st;
    private String et;

    public Mark(int t, String st, String et) {
        this.t = t;
        this.st = st;
        this.et = et;
    }

    public Mark(int t) {
        this.t = t;
    }

    public int getT() {
        return this.t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public String getSt() {
        return this.st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getEt() {
        return this.et;
    }

    public void setEt(String et) {
        this.et = et;
    }
}
