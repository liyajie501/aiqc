package com.sinosoft.aiqc.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class YyzjSAnalyzeNum {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_s_analyze_num.analyze_id
     *
     * @mbg.generated
     */
    private String analyzeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_s_analyze_num.sys_id
     *
     * @mbg.generated
     */
    private String sysId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_s_analyze_num.data_time
     *
     * @mbg.generated
     */
    private String dataTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_s_analyze_num.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_s_analyze_num.analyze_file_count
     *
     * @mbg.generated
     */
    private Integer analyzeFileCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_s_analyze_num.alarm_file_count
     *
     * @mbg.generated
     */
    private Integer alarmFileCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_s_analyze_num.analyze_id
     *
     * @return the value of yyzj_s_analyze_num.analyze_id
     *
     * @mbg.generated
     */
    public String getAnalyzeId() {
        return analyzeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_s_analyze_num.analyze_id
     *
     * @param analyzeId the value for yyzj_s_analyze_num.analyze_id
     *
     * @mbg.generated
     */
    public void setAnalyzeId(String analyzeId) {
        this.analyzeId = analyzeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_s_analyze_num.sys_id
     *
     * @return the value of yyzj_s_analyze_num.sys_id
     *
     * @mbg.generated
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_s_analyze_num.sys_id
     *
     * @param sysId the value for yyzj_s_analyze_num.sys_id
     *
     * @mbg.generated
     */
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_s_analyze_num.data_time
     *
     * @return the value of yyzj_s_analyze_num.data_time
     *
     * @mbg.generated
     */
    public String getDataTime() {
        return dataTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_s_analyze_num.data_time
     *
     * @param dataTime the value for yyzj_s_analyze_num.data_time
     *
     * @mbg.generated
     */
    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_s_analyze_num.create_time
     *
     * @return the value of yyzj_s_analyze_num.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_s_analyze_num.create_time
     *
     * @param createTime the value for yyzj_s_analyze_num.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_s_analyze_num.analyze_file_count
     *
     * @return the value of yyzj_s_analyze_num.analyze_file_count
     *
     * @mbg.generated
     */
    public Integer getAnalyzeFileCount() {
        return analyzeFileCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_s_analyze_num.analyze_file_count
     *
     * @param analyzeFileCount the value for yyzj_s_analyze_num.analyze_file_count
     *
     * @mbg.generated
     */
    public void setAnalyzeFileCount(Integer analyzeFileCount) {
        this.analyzeFileCount = analyzeFileCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_s_analyze_num.alarm_file_count
     *
     * @return the value of yyzj_s_analyze_num.alarm_file_count
     *
     * @mbg.generated
     */
    public Integer getAlarmFileCount() {
        return alarmFileCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_s_analyze_num.alarm_file_count
     *
     * @param alarmFileCount the value for yyzj_s_analyze_num.alarm_file_count
     *
     * @mbg.generated
     */
    public void setAlarmFileCount(Integer alarmFileCount) {
        this.alarmFileCount = alarmFileCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_s_analyze_num
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", analyzeId=").append(analyzeId);
        sb.append(", sysId=").append(sysId);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", analyzeFileCount=").append(analyzeFileCount);
        sb.append(", alarmFileCount=").append(alarmFileCount);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_s_analyze_num
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
        YyzjSAnalyzeNum other = (YyzjSAnalyzeNum) that;
        return (this.getAnalyzeId() == null ? other.getAnalyzeId() == null : this.getAnalyzeId().equals(other.getAnalyzeId()))
            && (this.getSysId() == null ? other.getSysId() == null : this.getSysId().equals(other.getSysId()))
            && (this.getDataTime() == null ? other.getDataTime() == null : this.getDataTime().equals(other.getDataTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAnalyzeFileCount() == null ? other.getAnalyzeFileCount() == null : this.getAnalyzeFileCount().equals(other.getAnalyzeFileCount()))
            && (this.getAlarmFileCount() == null ? other.getAlarmFileCount() == null : this.getAlarmFileCount().equals(other.getAlarmFileCount()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_s_analyze_num
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnalyzeId() == null) ? 0 : getAnalyzeId().hashCode());
        result = prime * result + ((getSysId() == null) ? 0 : getSysId().hashCode());
        result = prime * result + ((getDataTime() == null) ? 0 : getDataTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAnalyzeFileCount() == null) ? 0 : getAnalyzeFileCount().hashCode());
        result = prime * result + ((getAlarmFileCount() == null) ? 0 : getAlarmFileCount().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table yyzj_s_analyze_num
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        analyzeId("analyze_id", "analyzeId", "CHAR", false),
        sysId("sys_id", "sysId", "CHAR", false),
        dataTime("data_time", "dataTime", "CHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        analyzeFileCount("analyze_file_count", "analyzeFileCount", "INTEGER", false),
        alarmFileCount("alarm_file_count", "alarmFileCount", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
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
         * This method corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_s_analyze_num
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
         * This method corresponds to the database table yyzj_s_analyze_num
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