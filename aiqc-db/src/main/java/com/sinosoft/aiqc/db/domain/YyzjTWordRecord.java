package com.sinosoft.aiqc.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class YyzjTWordRecord {

    private String word;
    private LocalDateTime callTime;
    private String baseId;
    private String sysId;
    private Integer count;
    private Integer role;
    private Integer sort;
    private String agentId;


    public String getWord() {
        return word;
    }


    public void setWord(String word) {
        this.word = word;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.call_time
     *
     * @return the value of yyzj_t_word_record.call_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCallTime() {
        return callTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.call_time
     *
     * @param callTime the value for yyzj_t_word_record.call_time
     *
     * @mbg.generated
     */
    public void setCallTime(LocalDateTime callTime) {
        this.callTime = callTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.base_id
     *
     * @return the value of yyzj_t_word_record.base_id
     *
     * @mbg.generated
     */
    public String getBaseId() {
        return baseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.base_id
     *
     * @param baseId the value for yyzj_t_word_record.base_id
     *
     * @mbg.generated
     */
    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.sys_id
     *
     * @return the value of yyzj_t_word_record.sys_id
     *
     * @mbg.generated
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.sys_id
     *
     * @param sysId the value for yyzj_t_word_record.sys_id
     *
     * @mbg.generated
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.count
     *
     * @return the value of yyzj_t_word_record.count
     *
     * @mbg.generated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.count
     *
     * @param count the value for yyzj_t_word_record.count
     *
     * @mbg.generated
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.role
     *
     * @return the value of yyzj_t_word_record.role
     *
     * @mbg.generated
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.role
     *
     * @param role the value for yyzj_t_word_record.role
     *
     * @mbg.generated
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.sort
     *
     * @return the value of yyzj_t_word_record.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.sort
     *
     * @param sort the value for yyzj_t_word_record.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_t_word_record.agent_id
     *
     * @return the value of yyzj_t_word_record.agent_id
     *
     * @mbg.generated
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_t_word_record.agent_id
     *
     * @param agentId the value for yyzj_t_word_record.agent_id
     *
     * @mbg.generated
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_word_record
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", word=").append(word);
        sb.append(", callTime=").append(callTime);
        sb.append(", baseId=").append(baseId);
        sb.append(", sysId=").append(sysId);
        sb.append(", count=").append(count);
        sb.append(", role=").append(role);
        sb.append(", sort=").append(sort);
        sb.append(", agentId=").append(agentId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_word_record
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
        YyzjTWordRecord other = (YyzjTWordRecord) that;
        return (this.getWord() == null ? other.getWord() == null : this.getWord().equals(other.getWord()))
            && (this.getCallTime() == null ? other.getCallTime() == null : this.getCallTime().equals(other.getCallTime()))
            && (this.getBaseId() == null ? other.getBaseId() == null : this.getBaseId().equals(other.getBaseId()))
            && (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_word_record
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWord() == null) ? 0 : getWord().hashCode());
        result = prime * result + ((getCallTime() == null) ? 0 : getCallTime().hashCode());
        result = prime * result + ((getBaseId() == null) ? 0 : getBaseId().hashCode());
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table yyzj_t_word_record
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        word("word", "word", "VARCHAR", false),
        callTime("call_time", "callTime", "TIMESTAMP", false),
        baseId("base_id", "baseId", "VARCHAR", false),
        sysId("sys_id", "sysId", "VARCHAR", false),
        count("count", "count", "INTEGER", true),
        role("role", "role", "INTEGER", true),
        sort("sort", "sort", "INTEGER", false),
        agentId("agent_id", "agentId", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
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
         * This method corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_t_word_record
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
         * This method corresponds to the database table yyzj_t_word_record
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