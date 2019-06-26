package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjTBaseDataYyyymm;
import com.sinosoft.aiqc.db.domain.YyzjTBaseDataYyyymmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTBaseDataYyyymmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    long countByExample(YyzjTBaseDataYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTBaseDataYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String baseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int insert(YyzjTBaseDataYyyymm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTBaseDataYyyymm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseDataYyyymm selectOneByExample(YyzjTBaseDataYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseDataYyyymm selectOneByExampleSelective(@Param("example") YyzjTBaseDataYyyymmExample example, @Param("selective") YyzjTBaseDataYyyymm.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTBaseDataYyyymm> selectByExampleSelective(@Param("example") YyzjTBaseDataYyyymmExample example, @Param("selective") YyzjTBaseDataYyyymm.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    List<YyzjTBaseDataYyyymm> selectByExample(YyzjTBaseDataYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseDataYyyymm selectByPrimaryKeySelective(@Param("baseId") String baseId, @Param("selective") YyzjTBaseDataYyyymm.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    YyzjTBaseDataYyyymm selectByPrimaryKey(String baseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTBaseDataYyyymm record, @Param("example") YyzjTBaseDataYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTBaseDataYyyymm record, @Param("example") YyzjTBaseDataYyyymmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTBaseDataYyyymm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_yyyymm
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTBaseDataYyyymm record);
}