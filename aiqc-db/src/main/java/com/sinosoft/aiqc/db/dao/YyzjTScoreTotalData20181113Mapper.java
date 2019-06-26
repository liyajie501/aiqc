package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjTScoreTotalData20181113;
import com.sinosoft.aiqc.db.domain.YyzjTScoreTotalData20181113Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTScoreTotalData20181113Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    long countByExample(YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String scoreTotalDataId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int insert(YyzjTScoreTotalData20181113 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTScoreTotalData20181113 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181113 selectOneByExample(YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181113 selectOneByExampleSelective(@Param("example") YyzjTScoreTotalData20181113Example example, @Param("selective") YyzjTScoreTotalData20181113.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181113 selectOneByExampleWithBLOBs(YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTScoreTotalData20181113> selectByExampleSelective(@Param("example") YyzjTScoreTotalData20181113Example example, @Param("selective") YyzjTScoreTotalData20181113.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    List<YyzjTScoreTotalData20181113> selectByExampleWithBLOBs(YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    List<YyzjTScoreTotalData20181113> selectByExample(YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotalData20181113 selectByPrimaryKeySelective(@Param("scoreTotalDataId") String scoreTotalDataId, @Param("selective") YyzjTScoreTotalData20181113.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    YyzjTScoreTotalData20181113 selectByPrimaryKey(String scoreTotalDataId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTScoreTotalData20181113 record, @Param("example") YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") YyzjTScoreTotalData20181113 record, @Param("example") YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTScoreTotalData20181113 record, @Param("example") YyzjTScoreTotalData20181113Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTScoreTotalData20181113 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(YyzjTScoreTotalData20181113 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total_data_20181113
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTScoreTotalData20181113 record);
}