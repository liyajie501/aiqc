package com.sinosoft.aiqc.db.domain;

import java.util.ArrayList;
import java.util.List;

public class YyzjCProducerEleValueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public YyzjCProducerEleValueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
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
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public YyzjCProducerEleValueExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public YyzjCProducerEleValueExample orderBy(String ... orderByClauses) {
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
     * This method corresponds to the database table yyzj_c_producer_ele_value
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
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_producer_ele_value
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
     * This method corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Criteria newAndCreateCriteria() {
        YyzjCProducerEleValueExample example = new YyzjCProducerEleValueExample();
        return example.createCriteria();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_producer_ele_value
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

        public Criteria andEleValueIdIsNull() {
            addCriterion("ele_value_id is null");
            return (Criteria) this;
        }

        public Criteria andEleValueIdIsNotNull() {
            addCriterion("ele_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andEleValueIdEqualTo(String value) {
            addCriterion("ele_value_id =", value, "eleValueId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueIdEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueIdNotEqualTo(String value) {
            addCriterion("ele_value_id <>", value, "eleValueId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueIdNotEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueIdGreaterThan(String value) {
            addCriterion("ele_value_id >", value, "eleValueId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueIdGreaterThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueIdGreaterThanOrEqualTo(String value) {
            addCriterion("ele_value_id >=", value, "eleValueId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueIdGreaterThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueIdLessThan(String value) {
            addCriterion("ele_value_id <", value, "eleValueId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueIdLessThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueIdLessThanOrEqualTo(String value) {
            addCriterion("ele_value_id <=", value, "eleValueId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueIdLessThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueIdLike(String value) {
            addCriterion("ele_value_id like", value, "eleValueId");
            return (Criteria) this;
        }

        public Criteria andEleValueIdNotLike(String value) {
            addCriterion("ele_value_id not like", value, "eleValueId");
            return (Criteria) this;
        }

        public Criteria andEleValueIdIn(List<String> values) {
            addCriterion("ele_value_id in", values, "eleValueId");
            return (Criteria) this;
        }

        public Criteria andEleValueIdNotIn(List<String> values) {
            addCriterion("ele_value_id not in", values, "eleValueId");
            return (Criteria) this;
        }

        public Criteria andEleValueIdBetween(String value1, String value2) {
            addCriterion("ele_value_id between", value1, value2, "eleValueId");
            return (Criteria) this;
        }

        public Criteria andEleValueIdNotBetween(String value1, String value2) {
            addCriterion("ele_value_id not between", value1, value2, "eleValueId");
            return (Criteria) this;
        }

        public Criteria andEleIdIsNull() {
            addCriterion("ele_id is null");
            return (Criteria) this;
        }

        public Criteria andEleIdIsNotNull() {
            addCriterion("ele_id is not null");
            return (Criteria) this;
        }

        public Criteria andEleIdEqualTo(String value) {
            addCriterion("ele_id =", value, "eleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleIdEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleIdNotEqualTo(String value) {
            addCriterion("ele_id <>", value, "eleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleIdNotEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleIdGreaterThan(String value) {
            addCriterion("ele_id >", value, "eleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleIdGreaterThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ele_id >=", value, "eleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleIdGreaterThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleIdLessThan(String value) {
            addCriterion("ele_id <", value, "eleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleIdLessThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleIdLessThanOrEqualTo(String value) {
            addCriterion("ele_id <=", value, "eleId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleIdLessThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleIdLike(String value) {
            addCriterion("ele_id like", value, "eleId");
            return (Criteria) this;
        }

        public Criteria andEleIdNotLike(String value) {
            addCriterion("ele_id not like", value, "eleId");
            return (Criteria) this;
        }

        public Criteria andEleIdIn(List<String> values) {
            addCriterion("ele_id in", values, "eleId");
            return (Criteria) this;
        }

        public Criteria andEleIdNotIn(List<String> values) {
            addCriterion("ele_id not in", values, "eleId");
            return (Criteria) this;
        }

        public Criteria andEleIdBetween(String value1, String value2) {
            addCriterion("ele_id between", value1, value2, "eleId");
            return (Criteria) this;
        }

        public Criteria andEleIdNotBetween(String value1, String value2) {
            addCriterion("ele_id not between", value1, value2, "eleId");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdIsNull() {
            addCriterion("ele_group_id is null");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdIsNotNull() {
            addCriterion("ele_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdEqualTo(String value) {
            addCriterion("ele_group_id =", value, "eleGroupId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleGroupIdEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_group_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleGroupIdNotEqualTo(String value) {
            addCriterion("ele_group_id <>", value, "eleGroupId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleGroupIdNotEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_group_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleGroupIdGreaterThan(String value) {
            addCriterion("ele_group_id >", value, "eleGroupId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleGroupIdGreaterThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_group_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("ele_group_id >=", value, "eleGroupId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleGroupIdGreaterThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_group_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleGroupIdLessThan(String value) {
            addCriterion("ele_group_id <", value, "eleGroupId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleGroupIdLessThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_group_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleGroupIdLessThanOrEqualTo(String value) {
            addCriterion("ele_group_id <=", value, "eleGroupId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleGroupIdLessThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_group_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleGroupIdLike(String value) {
            addCriterion("ele_group_id like", value, "eleGroupId");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdNotLike(String value) {
            addCriterion("ele_group_id not like", value, "eleGroupId");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdIn(List<String> values) {
            addCriterion("ele_group_id in", values, "eleGroupId");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdNotIn(List<String> values) {
            addCriterion("ele_group_id not in", values, "eleGroupId");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdBetween(String value1, String value2) {
            addCriterion("ele_group_id between", value1, value2, "eleGroupId");
            return (Criteria) this;
        }

        public Criteria andEleGroupIdNotBetween(String value1, String value2) {
            addCriterion("ele_group_id not between", value1, value2, "eleGroupId");
            return (Criteria) this;
        }

        public Criteria andEleValueIsNull() {
            addCriterion("ele_value is null");
            return (Criteria) this;
        }

        public Criteria andEleValueIsNotNull() {
            addCriterion("ele_value is not null");
            return (Criteria) this;
        }

        public Criteria andEleValueEqualTo(String value) {
            addCriterion("ele_value =", value, "eleValue");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueNotEqualTo(String value) {
            addCriterion("ele_value <>", value, "eleValue");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueNotEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueGreaterThan(String value) {
            addCriterion("ele_value >", value, "eleValue");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueGreaterThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueGreaterThanOrEqualTo(String value) {
            addCriterion("ele_value >=", value, "eleValue");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueGreaterThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueLessThan(String value) {
            addCriterion("ele_value <", value, "eleValue");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueLessThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueLessThanOrEqualTo(String value) {
            addCriterion("ele_value <=", value, "eleValue");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueLessThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueLike(String value) {
            addCriterion("ele_value like", value, "eleValue");
            return (Criteria) this;
        }

        public Criteria andEleValueNotLike(String value) {
            addCriterion("ele_value not like", value, "eleValue");
            return (Criteria) this;
        }

        public Criteria andEleValueIn(List<String> values) {
            addCriterion("ele_value in", values, "eleValue");
            return (Criteria) this;
        }

        public Criteria andEleValueNotIn(List<String> values) {
            addCriterion("ele_value not in", values, "eleValue");
            return (Criteria) this;
        }

        public Criteria andEleValueBetween(String value1, String value2) {
            addCriterion("ele_value between", value1, value2, "eleValue");
            return (Criteria) this;
        }

        public Criteria andEleValueNotBetween(String value1, String value2) {
            addCriterion("ele_value not between", value1, value2, "eleValue");
            return (Criteria) this;
        }

        public Criteria andEleValueTypeIsNull() {
            addCriterion("ele_value_type is null");
            return (Criteria) this;
        }

        public Criteria andEleValueTypeIsNotNull() {
            addCriterion("ele_value_type is not null");
            return (Criteria) this;
        }

        public Criteria andEleValueTypeEqualTo(Integer value) {
            addCriterion("ele_value_type =", value, "eleValueType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueTypeEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueTypeNotEqualTo(Integer value) {
            addCriterion("ele_value_type <>", value, "eleValueType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueTypeNotEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueTypeGreaterThan(Integer value) {
            addCriterion("ele_value_type >", value, "eleValueType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueTypeGreaterThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ele_value_type >=", value, "eleValueType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueTypeGreaterThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueTypeLessThan(Integer value) {
            addCriterion("ele_value_type <", value, "eleValueType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueTypeLessThanColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ele_value_type <=", value, "eleValueType");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andEleValueTypeLessThanOrEqualToColumn(YyzjCProducerEleValue.Column column) {
            addCriterion(new StringBuilder("ele_value_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andEleValueTypeIn(List<Integer> values) {
            addCriterion("ele_value_type in", values, "eleValueType");
            return (Criteria) this;
        }

        public Criteria andEleValueTypeNotIn(List<Integer> values) {
            addCriterion("ele_value_type not in", values, "eleValueType");
            return (Criteria) this;
        }

        public Criteria andEleValueTypeBetween(Integer value1, Integer value2) {
            addCriterion("ele_value_type between", value1, value2, "eleValueType");
            return (Criteria) this;
        }

        public Criteria andEleValueTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ele_value_type not between", value1, value2, "eleValueType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_producer_ele_value
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private YyzjCProducerEleValueExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(YyzjCProducerEleValueExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public YyzjCProducerEleValueExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_producer_ele_value
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
         * This interface corresponds to the database table yyzj_c_producer_ele_value
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table yyzj_c_producer_ele_value
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_producer_ele_value
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