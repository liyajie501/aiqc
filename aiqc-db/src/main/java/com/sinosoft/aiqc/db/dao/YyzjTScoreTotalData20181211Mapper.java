package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjTScoreTotalData20181211;
import com.sinosoft.aiqc.db.domain.YyzjTScoreTotalData20181211Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTScoreTotalData20181211Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    long countByExample(YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String scoreTotalDataId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int insert(YyzjTScoreTotalData20181211 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTScoreTotalData20181211 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181211 selectOneByExample(YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181211 selectOneByExampleSelective(@Param("example") YyzjTScoreTotalData20181211Example example, @Param("selective") YyzjTScoreTotalData20181211.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181211 selectOneByExampleWithBLOBs(YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTScoreTotalData20181211> selectByExampleSelective(@Param("example") YyzjTScoreTotalData20181211Example example, @Param("selective") YyzjTScoreTotalData20181211.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    List<YyzjTScoreTotalData20181211> selectByExampleWithBLOBs(YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    List<YyzjTScoreTotalData20181211> selectByExample(YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181211 selectByPrimaryKeySelective(@Param("scoreTotalDataId") String scoreTotalDataId, @Param("selective") YyzjTScoreTotalData20181211.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    YyzjTScoreTotalData20181211 selectByPrimaryKey(String scoreTotalDataId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTScoreTotalData20181211 record, @Param("example") YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") YyzjTScoreTotalData20181211 record, @Param("example") YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTScoreTotalData20181211 record, @Param("example") YyzjTScoreTotalData20181211Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTScoreTotalData20181211 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(YyzjTScoreTotalData20181211 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181211
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTScoreTotalData20181211 record);
}