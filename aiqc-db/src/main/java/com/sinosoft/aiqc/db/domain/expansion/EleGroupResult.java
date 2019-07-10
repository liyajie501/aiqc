package com.sinosoft.aiqc.db.domain.expansion;

import java.util.ArrayList;
import java.util.List;

public class EleGroupResult {

    private String eleGroupId;
    private List<Mark> markList = new ArrayList<>();
    private List<Mark> notMarkList = new ArrayList();

    public void addMark(Mark mark) {
        this.markList.add(mark);
    }

    public int size() {
        return this.markList.size();
    }

    public EleGroupResult(String eleGroupId) {
        this.eleGroupId = eleGroupId;
    }

    public List<Mark> getNotMarkList() {
        return this.notMarkList;
    }

    public void setNotMarkList(List<Mark> notMarkList) {
        this.notMarkList = notMarkList;
    }

    public void addNotMark(Mark markNot) {
        this.notMarkList.add(markNot);
    }

    public int sizeNot() {
        return this.markList.size();
    }

    public String getEleGroupId() {
        return this.eleGroupId;
    }

    public void setEleGroupId(String eleGroupId) {
        this.eleGroupId = eleGroupId;
    }

    public List<Mark> getMarkList() {
        return this.markList;
    }

    public void setMarkList(List<Mark> markList) {
        this.markList = markList;
    }
}
