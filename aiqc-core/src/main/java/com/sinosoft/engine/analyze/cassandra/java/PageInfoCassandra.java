package com.sinosoft.engine.analyze.cassandra.java;

import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.data.cassandra.core.CassandraOperations;
import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PageInfoCassandra<T extends PageInfoBean>
        extends PageInfo<T> {
    private static Logger logger = Logger.getLogger(PageInfoCassandra.class);

    private CassandraOperations cassandraOperations;
    private String queryFlag;
    private String startRowStr;
    private String endRowStr;
    private String sequenceNum;
    private int pageNum;

    public PageInfoCassandra(Class entityClass) {
        this.sequenceNum = "sequence_num";


        this.pageNum = 1;

        this.pageSize = 10;

        this.size = 0;

        this.total = 0L;

        this.pages = 1;


        this.entityClass = entityClass;
    }

    private int pageSize;
    private int size;
    private long total;
    private int pages;
    private List<T> list;
    private Class entityClass;

    public void init(int pageSize) {
        this.pageSize = pageSize;
    }


    public List<T> next(String cql) {
        long n = this.pageNum;
        if (this.pageNum + 1 <= this.pages) {
            n = (this.pageNum + 1);
            return query(cql, n);
        }
        return null;
    }


    public List<T> previous(String cql) {
        long n = this.pageNum;
        if (this.pageNum - 1 >= 1) {
            n = (this.pageNum - 1);
            return query(cql, n);
        }
        return null;
    }


    public List<T> query(String cql, long pageNumNew) {
        List<T> list;
        if (StringUtils.isBlank(cql)) return null;
        if (this.pageSize <= 0) return null;
        if (pageNumNew < 1L || pageNumNew > this.pages) return null;

        String queryFlag2 = digest(cql);
        if (this.queryFlag == null || !this.queryFlag.equals(queryFlag2)) {
            this.queryFlag = queryFlag2;

            this.total = execCqlCount(cql);
            logger.info("分页总记录=" + this.total);
            this.pageNum = 1;
            this.pages = (int) ((this.total % this.pageSize > 0L) ? (this.total / this.pageSize + 1L) : (this.total / this.pageSize));
            logger.info("分页数=" + this.pages);
            this.startRowStr = null;
        }

        if (this.total == 0L) return null;

        do {
            String cqlTemp = cql;
            if (this.startRowStr != null) {
                if (this.pageNum < pageNumNew) {

                    this.pageNum++;
                    cqlTemp = cqlTemp + " and " + this.sequenceNum + " > " + this.endRowStr;
                }
                if (this.pageNum > pageNumNew) {

                    this.pageNum--;
                    cqlTemp = cqlTemp + " and " + this.sequenceNum + " < " + this.startRowStr;
                }
            }

            cqlTemp = cqlTemp + " limit " + this.pageSize + " ALLOW FILTERING";
            logger.info("分页pageNum=" + this.pageNum + ",cql=" + cqlTemp);
            list = execCqlQuery(cqlTemp);

        }
        while (this.pageNum != pageNumNew);
        return list;
    }


    private List<T> execCqlQuery(String cql) {
        try {
            List<T> select = this.cassandraOperations.select(cql, this.entityClass);
            this.startRowStr = ((PageInfoBean) select.get(0)).getSequenceNum().toString();
            this.endRowStr = ((PageInfoBean) select.get(select.size() - 1)).getSequenceNum().toString();
            return select;
        } catch (Exception e) {
            logger.error("执行分页查询异常", e);
            return null;
        }
    }


    private int execCqlCount(String cql) {
        try {
            Pattern p = Pattern.compile("(" + pattern("select") + ") (.+) (" + pattern("from") + ".+$)");
            Matcher m = p.matcher(cql);
            if (m.find()) {
                cql = "select count(1) " + m.group(3) + " ALLOW FILTERING";
            }
            logger.info("分页cql=" + cql);
            long t = ((PageInfoCount) this.cassandraOperations.selectOne(cql, PageInfoCount.class)).getCount().longValue();
            return (int) t;
        } catch (Exception e) {
            logger.error("分页查看总记录条数异常", e);
            return 0;
        }
    }


    public String generateCql(String queryCql) {
        if (StringUtils.isBlank(queryCql)) return null;
        return queryCql.replaceAll(pattern("ALLOW") + "\\s+" + pattern("FILTERING"), "");
    }


    public String getQueryFlag() {
        return this.queryFlag;
    }


    public void setQueryFlag(String queryFlag) {
        this.queryFlag = queryFlag;
    }


    private String pattern(String str) {
        if (StringUtils.isBlank(str)) return null;
        str = str.toUpperCase();
        str = str.trim();
        StringBuilder b = new StringBuilder();
        for (String m : str.split("")) {
            if (m.length() != 0)
                b.append("[").append(m).append("|").append(m.toLowerCase()).append("]");
        }
        return b.toString();
    }

    private String digest(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            return base64en.encode(md5.digest(str.getBytes("utf-8")));
        } catch (Exception e) {
            logger.error("MD5加密异常", e);
            return str;
        }
    }


    public CassandraOperations getCassandraOperations() {
        return this.cassandraOperations;
    }


    public void setCassandraOperations(CassandraOperations cassandraOperations) {
        this.cassandraOperations = cassandraOperations;
    }


    public String getSequenceNum() {
        return this.sequenceNum;
    }


    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }


    public int getPageNum() {
        return this.pageNum;
    }


    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }


    public int getPageSize() {
        return this.pageSize;
    }


    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public int getSize() {
        return this.size;
    }


    public void setSize(int size) {
        this.size = size;
    }


    public long getTotal() {
        return this.total;
    }


    public void setTotal(int total) {
        this.total = total;
    }


    public int getPages() {
        return this.pages;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }


    public List<T> getList() {
        return this.list;
    }


    public void setList(List<T> list) {
        this.list = list;
    }


    public String getStartRowStr() {
        return this.startRowStr;
    }


    public void setStartRowStr(String startRowStr) {
        this.startRowStr = startRowStr;
    }


    public String getEndRowStr() {
        return this.endRowStr;
    }


    public void setEndRowStr(String endRowStr) {
        this.endRowStr = endRowStr;
    }
}
