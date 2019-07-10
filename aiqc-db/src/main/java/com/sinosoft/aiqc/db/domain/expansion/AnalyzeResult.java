package com.sinosoft.aiqc.db.domain.expansion;

import java.util.List;

public class AnalyzeResult {

    private boolean result;
    private boolean errorFlag;
    private String errorContext;
    private List<EleGroupResult> markList;
    private String detailScoreId;


    public AnalyzeResult() {
    }

    public List<EleGroupResult> getMarkList() {
        return this.markList;
    }

    public void setMarkList(List<EleGroupResult> markList) {
        this.markList = markList;
    }

    public String getDetailScoreId() {
        return this.detailScoreId;
    }

    public void setDetailScoreId(String detailScoreId) {
        this.detailScoreId = detailScoreId;
    }

    public boolean isResult() {
        return this.result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean isErrorFlag() {
        return this.errorFlag;
    }

    public void setErrorFlag(boolean errorFlag) {
        this.errorFlag = errorFlag;
    }

    public String getErrorContext() {
        return this.errorContext;
    }

    public void setErrorContext(String errorContext) {
        this.errorContext = errorContext;
    }

}
