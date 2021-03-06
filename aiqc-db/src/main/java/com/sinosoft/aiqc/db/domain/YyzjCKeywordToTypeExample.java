package com.sinosoft.aiqc.db.domain;

import java.util.ArrayList;
import java.util.List;

public class YyzjCKeywordToTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public YyzjCKeywordToTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
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
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public YyzjCKeywordToTypeExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public YyzjCKeywordToTypeExample orderBy(String ... orderByClauses) {
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
     * This method corresponds to the database table yyzj_c_keyword_to_type
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
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
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
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static Criteria newAndCreateCriteria() {
        YyzjCKeywordToTypeExample example = new YyzjCKeywordToTypeExample();
        return example.createCriteria();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_keyword_to_type
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

        public Criteria andKeywordTypeIdIsNull() {
            addCriterion("keyword_type_id is null");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdIsNotNull() {
            addCriterion("keyword_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdEqualTo(String value) {
            addCriterion("keyword_type_id =", value, "keywordTypeId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordTypeIdEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_type_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdNotEqualTo(String value) {
            addCriterion("keyword_type_id <>", value, "keywordTypeId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordTypeIdNotEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_type_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdGreaterThan(String value) {
            addCriterion("keyword_type_id >", value, "keywordTypeId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordTypeIdGreaterThanColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_type_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_type_id >=", value, "keywordTypeId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordTypeIdGreaterThanOrEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_type_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdLessThan(String value) {
            addCriterion("keyword_type_id <", value, "keywordTypeId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordTypeIdLessThanColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_type_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdLessThanOrEqualTo(String value) {
            addCriterion("keyword_type_id <=", value, "keywordTypeId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordTypeIdLessThanOrEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_type_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdLike(String value) {
            addCriterion("keyword_type_id like", value, "keywordTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdNotLike(String value) {
            addCriterion("keyword_type_id not like", value, "keywordTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdIn(List<String> values) {
            addCriterion("keyword_type_id in", values, "keywordTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdNotIn(List<String> values) {
            addCriterion("keyword_type_id not in", values, "keywordTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdBetween(String value1, String value2) {
            addCriterion("keyword_type_id between", value1, value2, "keywordTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIdNotBetween(String value1, String value2) {
            addCriterion("keyword_type_id not between", value1, value2, "keywordTypeId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIsNull() {
            addCriterion("keyword_id is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIsNotNull() {
            addCriterion("keyword_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordIdEqualTo(String value) {
            addCriterion("keyword_id =", value, "keywordId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordIdEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotEqualTo(String value) {
            addCriterion("keyword_id <>", value, "keywordId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordIdNotEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordIdGreaterThan(String value) {
            addCriterion("keyword_id >", value, "keywordId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordIdGreaterThanColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordIdGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_id >=", value, "keywordId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordIdGreaterThanOrEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordIdLessThan(String value) {
            addCriterion("keyword_id <", value, "keywordId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordIdLessThanColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordIdLessThanOrEqualTo(String value) {
            addCriterion("keyword_id <=", value, "keywordId");
            return (Criteria) this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andKeywordIdLessThanOrEqualToColumn(YyzjCKeywordToType.Column column) {
            addCriterion(new StringBuilder("keyword_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andKeywordIdLike(String value) {
            addCriterion("keyword_id like", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotLike(String value) {
            addCriterion("keyword_id not like", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIn(List<String> values) {
            addCriterion("keyword_id in", values, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotIn(List<String> values) {
            addCriterion("keyword_id not in", values, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdBetween(String value1, String value2) {
            addCriterion("keyword_id between", value1, value2, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotBetween(String value1, String value2) {
            addCriterion("keyword_id not between", value1, value2, "keywordId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private YyzjCKeywordToTypeExample example;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        protected Criteria(YyzjCKeywordToTypeExample example) {
            super();
            this.example = example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public YyzjCKeywordToTypeExample example() {
            return this.example;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
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
         * This interface corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public interface ICriteriaAdd {
            /**
             * This method was generated by MyBatis Generator.
             * This method corresponds to the database table yyzj_c_keyword_to_type
             *
             * @mbg.generated
             * @project https://github.com/itfsw/mybatis-generator-plugin
             */
            Criteria add(Criteria add);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yyzj_c_keyword_to_type
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