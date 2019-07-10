package com.sinosoft.engine.core.feature.orm.mybatis;

import org.apache.ibatis.session.RowBounds;

import java.util.ArrayList;
import java.util.List;


public class Page<T>
        extends RowBounds {
    protected int pageNo;
    protected int pageSize;
    protected int offset;
    protected int limit;
    protected List<T> result;
    protected int totalCount;
    protected int totalPages;

    private void calcOffset() {
        this.offset = (this.pageNo - 1) * this.pageSize;
    }


    private void calcLimit() {
        this.limit = this.pageSize;
    }

    public Page() {
        this.pageNo = 1;
        this.pageSize = 15;
        this.result = new ArrayList();
        calcOffset();
        calcLimit();
    }

    public Page(int pageNo, int pageSize) {
        this.pageNo = 1;
        this.pageSize = 15;
        this.result = new ArrayList();
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        calcOffset();
        calcLimit();
    }


    public int getPageNo() {
        return this.pageNo;
    }


    public int getPageSize() {
        return this.pageSize;
    }


    public int getFirst() {
        return (this.pageNo - 1) * this.pageSize + 1;
    }


    public int getOffset() {
        return this.offset;
    }


    public int getLimit() {
        return this.limit;
    }


    public List<T> getResult() {
        return this.result;
    }


    public void setResult(List<T> result) {
        this.result = result;
    }


    public int getTotalCount() {
        return this.totalCount;
    }


    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        this.totalPages = getTotalPages();
    }


    public int getTotalPages() {
        if (this.totalCount < 0) {
            return -1;
        }
        int pages = this.totalCount / this.pageSize;
        return (this.totalCount % this.pageSize > 0) ? ++pages : pages;
    }


    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}

