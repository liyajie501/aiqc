package com.sinosoft.aiqc.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class YyzjCKeyword {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.keyword_id
     *
     * @mbg.generated
     */
    private String keywordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.creater_user
     *
     * @mbg.generated
     */
    private String createrUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.update_user
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.update_time
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_keyword.valid
     *
     * @mbg.generated
     */
    private String valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.keyword_id
     *
     * @return the value of yyzj_c_keyword.keyword_id
     *
     * @mbg.generated
     */
    public String getKeywordId() {
        return keywordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.keyword_id
     *
     * @param keywordId the value for yyzj_c_keyword.keyword_id
     *
     * @mbg.generated
     */
    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.name
     *
     * @return the value of yyzj_c_keyword.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.name
     *
     * @param name the value for yyzj_c_keyword.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.creater_user
     *
     * @return the value of yyzj_c_keyword.creater_user
     *
     * @mbg.generated
     */
    public String getCreaterUser() {
        return createrUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.creater_user
     *
     * @param createrUser the value for yyzj_c_keyword.creater_user
     *
     * @mbg.generated
     */
    public void setCreaterUser(String createrUser) {
        this.createrUser = createrUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.create_time
     *
     * @return the value of yyzj_c_keyword.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.create_time
     *
     * @param createTime the value for yyzj_c_keyword.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.update_user
     *
     * @return the value of yyzj_c_keyword.update_user
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.update_user
     *
     * @param updateUser the value for yyzj_c_keyword.update_user
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.update_time
     *
     * @return the value of yyzj_c_keyword.update_time
     *
     * @mbg.generated
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.update_time
     *
     * @param updateTime the value for yyzj_c_keyword.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_keyword.valid
     *
     * @return the value of yyzj_c_keyword.valid
     *
     * @mbg.generated
     */
    public String getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_keyword.valid
     *
     * @param valid the value for yyzj_c_keyword.valid
     *
     * @mbg.generated
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keywordId=").append(keywordId);
        sb.append(", name=").append(name);
        sb.append(", createrUser=").append(createrUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", valid=").append(valid);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
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
        YyzjCKeyword other = (YyzjCKeyword) that;
        return (this.getKeywordId() == null ? other.getKeywordId() == null : this.getKeywordId().equals(other.getKeywordId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreaterUser() == null ? other.getCreaterUser() == null : this.getCreaterUser().equals(other.getCreaterUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getKeywordId() == null) ? 0 : getKeywordId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreaterUser() == null) ? 0 : getCreaterUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        keywordId("keyword_id", "keywordId", "CHAR", false),
        name("name", "name", "VARCHAR", true),
        createrUser("creater_user", "createrUser", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateUser("update_user", "updateUser", "VARCHAR", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        valid("valid", "valid", "CHAR", true);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
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
         * This method corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_keyword
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
         * This method corresponds to the database table yyzj_c_keyword
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