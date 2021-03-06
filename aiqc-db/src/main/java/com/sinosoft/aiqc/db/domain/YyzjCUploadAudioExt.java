package com.sinosoft.aiqc.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class YyzjCUploadAudioExt {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_upload_audio_ext.ext_id
     *
     * @mbg.generated
     */
    private String extId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_upload_audio_ext.upload_id
     *
     * @mbg.generated
     */
    private String uploadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_upload_audio_ext.index_code
     *
     * @mbg.generated
     */
    private String indexCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_upload_audio_ext.index_value
     *
     * @mbg.generated
     */
    private String indexValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yyzj_c_upload_audio_ext.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_upload_audio_ext.ext_id
     *
     * @return the value of yyzj_c_upload_audio_ext.ext_id
     *
     * @mbg.generated
     */
    public String getExtId() {
        return extId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_upload_audio_ext.ext_id
     *
     * @param extId the value for yyzj_c_upload_audio_ext.ext_id
     *
     * @mbg.generated
     */
    public void setExtId(String extId) {
        this.extId = extId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_upload_audio_ext.upload_id
     *
     * @return the value of yyzj_c_upload_audio_ext.upload_id
     *
     * @mbg.generated
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_upload_audio_ext.upload_id
     *
     * @param uploadId the value for yyzj_c_upload_audio_ext.upload_id
     *
     * @mbg.generated
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_upload_audio_ext.index_code
     *
     * @return the value of yyzj_c_upload_audio_ext.index_code
     *
     * @mbg.generated
     */
    public String getIndexCode() {
        return indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_upload_audio_ext.index_code
     *
     * @param indexCode the value for yyzj_c_upload_audio_ext.index_code
     *
     * @mbg.generated
     */
    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_upload_audio_ext.index_value
     *
     * @return the value of yyzj_c_upload_audio_ext.index_value
     *
     * @mbg.generated
     */
    public String getIndexValue() {
        return indexValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_upload_audio_ext.index_value
     *
     * @param indexValue the value for yyzj_c_upload_audio_ext.index_value
     *
     * @mbg.generated
     */
    public void setIndexValue(String indexValue) {
        this.indexValue = indexValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yyzj_c_upload_audio_ext.sort
     *
     * @return the value of yyzj_c_upload_audio_ext.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yyzj_c_upload_audio_ext.sort
     *
     * @param sort the value for yyzj_c_upload_audio_ext.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio_ext
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", extId=").append(extId);
        sb.append(", uploadId=").append(uploadId);
        sb.append(", indexCode=").append(indexCode);
        sb.append(", indexValue=").append(indexValue);
        sb.append(", sort=").append(sort);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio_ext
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
        YyzjCUploadAudioExt other = (YyzjCUploadAudioExt) that;
        return (this.getExtId() == null ? other.getExtId() == null : this.getExtId().equals(other.getExtId()))
            && (this.getUploadId() == null ? other.getUploadId() == null : this.getUploadId().equals(other.getUploadId()))
            && (this.getIndexCode() == null ? other.getIndexCode() == null : this.getIndexCode().equals(other.getIndexCode()))
            && (this.getIndexValue() == null ? other.getIndexValue() == null : this.getIndexValue().equals(other.getIndexValue()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio_ext
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExtId() == null) ? 0 : getExtId().hashCode());
        result = prime * result + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        result = prime * result + ((getIndexCode() == null) ? 0 : getIndexCode().hashCode());
        result = prime * result + ((getIndexValue() == null) ? 0 : getIndexValue().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table yyzj_c_upload_audio_ext
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        extId("ext_id", "extId", "CHAR", false),
        uploadId("upload_id", "uploadId", "CHAR", false),
        indexCode("index_code", "indexCode", "VARCHAR", false),
        indexValue("index_value", "indexValue", "VARCHAR", false),
        sort("sort", "sort", "INTEGER", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
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
         * This method corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table yyzj_c_upload_audio_ext
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
         * This method corresponds to the database table yyzj_c_upload_audio_ext
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