package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjTQualityUserYyyymm;
import com.sinosoft.aiqc.db.domain.YyzjTQualityUserYyyymmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTQualityUserYyyymmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    long countByExample(YyzjTQualityUserYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTQualityUserYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String reportId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int insert(YyzjTQualityUserYyyymm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTQualityUserYyyymm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTQualityUserYyyymm selectOneByExample(YyzjTQualityUserYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTQualityUserYyyymm selectOneByExampleSelective(@Param("example") YyzjTQualityUserYyyymmExample example, @Param("selective") YyzjTQualityUserYyyymm.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTQualityUserYyyymm> selectByExampleSelective(@Param("example") YyzjTQualityUserYyyymmExample example, @Param("selective") YyzjTQualityUserYyyymm.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    List<YyzjTQualityUserYyyymm> selectByExample(YyzjTQualityUserYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTQualityUserYyyymm selectByPrimaryKeySelective(@Param("reportId") String reportId, @Param("selective") YyzjTQualityUserYyyymm.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    YyzjTQualityUserYyyymm selectByPrimaryKey(String reportId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTQualityUserYyyymm record, @Param("example") YyzjTQualityUserYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTQualityUserYyyymm record, @Param("example") YyzjTQualityUserYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTQualityUserYyyymm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_quality_user_yyyymm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTQualityUserYyyymm record);
}