package com.sinosoft.aiqc.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class YyzjCKeywordToType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword_to_type.keyword_type_id
     *
     * @mbg.generated
     */
    private String keywordTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword_to_type.keyword_id
     *
     * @mbg.generated
     */
    private String keywordId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword_to_type.keyword_type_id
     *
     * @return the value of yyzj_c_keyword_to_type.keyword_type_id
     *
     * @mbg.generated
     */
    public String getKeywordTypeId() {
        return keywordTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword_to_type.keyword_type_id
     *
     * @param keywordTypeId the value for yyzj_c_keyword_to_type.keyword_type_id
     *
     * @mbg.generated
     */
    public void setKeywordTypeId(String keywordTypeId) {
        this.keywordTypeId = keywordTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword_to_type.keyword_id
     *
     * @return the value of yyzj_c_keyword_to_type.keyword_id
     *
     * @mbg.generated
     */
    public String getKeywordId() {
        return keywordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword_to_type.keyword_id
     *
     * @param keywordId the value for yyzj_c_keyword_to_type.keyword_id
     *
     * @mbg.generated
     */
    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keywordTypeId=").append(keywordTypeId);
        sb.append(", keywordId=").append(keywordId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        YyzjCKeywordToType other = (YyzjCKeywordToType) that;
        return (this.getKeywordTypeId() == null ? other.getKeywordTypeId() == null : this.getKeywordTypeId().equals(other.getKeywordTypeId()))
            && (this.getKeywordId() == null ? other.getKeywordId() == null : this.getKeywordId().equals(other.getKeywordId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeywordTypeId() == null) ? 0 : getKeywordTypeId().hashCode());
        result = prime * result + ((getKeywordId() == null) ? 0 : getKeywordId().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        keywordTypeId("keyword_type_id", "keywordTypeId", "CHAR", false),
        keywordId("keyword_id", "keywordId", "CHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword_to_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}