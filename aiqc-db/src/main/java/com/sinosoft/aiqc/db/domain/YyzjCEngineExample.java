package com.sinosoft.aiqc.db.domain;

import java.util.ArrayList;
import java.util.List;

public class YyzjCEngineExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public YyzjCEngineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public YyzjCEngineExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public YyzjCEngineExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Criteria newAndCreateCriteria() {
        YyzjCEngineExample example = new YyzjCEngineExample();
        return example.createCriteria();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEngineIdIsNull() {
            addCriterion("engine_id is null");
            return (Criteria) this;
        }

        public Criteria andEngineIdIsNotNull() {
            addCriterion("engine_id is not null");
            return (Criteria) this;
        }

        public Criteria andEngineIdEqualTo(String value) {
            addCriterion("engine_id =", value, "engineId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIdEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIdNotEqualTo(String value) {
            addCriterion("engine_id <>", value, "engineId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIdNotEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThan(String value) {
            addCriterion("engine_id >", value, "engineId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIdGreaterThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThanOrEqualTo(String value) {
            addCriterion("engine_id >=", value, "engineId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIdGreaterThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThan(String value) {
            addCriterion("engine_id <", value, "engineId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIdLessThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThanOrEqualTo(String value) {
            addCriterion("engine_id <=", value, "engineId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIdLessThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIdLike(String value) {
            addCriterion("engine_id like", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotLike(String value) {
            addCriterion("engine_id not like", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdIn(List<String> values) {
            addCriterion("engine_id in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotIn(List<String> values) {
            addCriterion("engine_id not in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdBetween(String value1, String value2) {
            addCriterion("engine_id between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotBetween(String value1, String value2) {
            addCriterion("engine_id not between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTypeEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("`type` = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTypeNotEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("`type` <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTypeGreaterThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("`type` > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTypeGreaterThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("`type` >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTypeLessThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("`type` < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andTypeLessThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("`type` <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEngineIpIsNull() {
            addCriterion("engine_ip is null");
            return (Criteria) this;
        }

        public Criteria andEngineIpIsNotNull() {
            addCriterion("engine_ip is not null");
            return (Criteria) this;
        }

        public Criteria andEngineIpEqualTo(String value) {
            addCriterion("engine_ip =", value, "engineIp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIpEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_ip = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIpNotEqualTo(String value) {
            addCriterion("engine_ip <>", value, "engineIp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIpNotEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_ip <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIpGreaterThan(String value) {
            addCriterion("engine_ip >", value, "engineIp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIpGreaterThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_ip > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIpGreaterThanOrEqualTo(String value) {
            addCriterion("engine_ip >=", value, "engineIp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIpGreaterThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_ip >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIpLessThan(String value) {
            addCriterion("engine_ip <", value, "engineIp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIpLessThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_ip < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIpLessThanOrEqualTo(String value) {
            addCriterion("engine_ip <=", value, "engineIp");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEngineIpLessThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_ip <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEngineIpLike(String value) {
            addCriterion("engine_ip like", value, "engineIp");
            return (Criteria) this;
        }

        public Criteria andEngineIpNotLike(String value) {
            addCriterion("engine_ip not like", value, "engineIp");
            return (Criteria) this;
        }

        public Criteria andEngineIpIn(List<String> values) {
            addCriterion("engine_ip in", values, "engineIp");
            return (Criteria) this;
        }

        public Criteria andEngineIpNotIn(List<String> values) {
            addCriterion("engine_ip not in", values, "engineIp");
            return (Criteria) this;
        }

        public Criteria andEngineIpBetween(String value1, String value2) {
            addCriterion("engine_ip between", value1, value2, "engineIp");
            return (Criteria) this;
        }

        public Criteria andEngineIpNotBetween(String value1, String value2) {
            addCriterion("engine_ip not between", value1, value2, "engineIp");
            return (Criteria) this;
        }

        public Criteria andEnginePortIsNull() {
            addCriterion("engine_port is null");
            return (Criteria) this;
        }

        public Criteria andEnginePortIsNotNull() {
            addCriterion("engine_port is not null");
            return (Criteria) this;
        }

        public Criteria andEnginePortEqualTo(String value) {
            addCriterion("engine_port =", value, "enginePort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEnginePortEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_port = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnginePortNotEqualTo(String value) {
            addCriterion("engine_port <>", value, "enginePort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEnginePortNotEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_port <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnginePortGreaterThan(String value) {
            addCriterion("engine_port >", value, "enginePort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEnginePortGreaterThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_port > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnginePortGreaterThanOrEqualTo(String value) {
            addCriterion("engine_port >=", value, "enginePort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEnginePortGreaterThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_port >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnginePortLessThan(String value) {
            addCriterion("engine_port <", value, "enginePort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEnginePortLessThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_port < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnginePortLessThanOrEqualTo(String value) {
            addCriterion("engine_port <=", value, "enginePort");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEnginePortLessThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("engine_port <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEnginePortLike(String value) {
            addCriterion("engine_port like", value, "enginePort");
            return (Criteria) this;
        }

        public Criteria andEnginePortNotLike(String value) {
            addCriterion("engine_port not like", value, "enginePort");
            return (Criteria) this;
        }

        public Criteria andEnginePortIn(List<String> values) {
            addCriterion("engine_port in", values, "enginePort");
            return (Criteria) this;
        }

        public Criteria andEnginePortNotIn(List<String> values) {
            addCriterion("engine_port not in", values, "enginePort");
            return (Criteria) this;
        }

        public Criteria andEnginePortBetween(String value1, String value2) {
            addCriterion("engine_port between", value1, value2, "enginePort");
            return (Criteria) this;
        }

        public Criteria andEnginePortNotBetween(String value1, String value2) {
            addCriterion("engine_port not between", value1, value2, "enginePort");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("version = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionNotEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("version <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionGreaterThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("version > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionGreaterThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("version >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionLessThanColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("version < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andVersionLessThanOrEqualToColumn(YyzjCEngine.Column column) {
            addCriterion(new StringBuilder("version <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private YyzjCEngineExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(YyzjCEngineExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public YyzjCEngineExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        /**
         * This interface was generated by MyBatis Generator.
         * This interface corresponds to the database table yyzj_c_engine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table yyzj_c_engine
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_engine
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}