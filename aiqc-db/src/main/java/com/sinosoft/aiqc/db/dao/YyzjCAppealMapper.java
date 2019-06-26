package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCAppeal;
import com.sinosoft.aiqc.db.domain.YyzjCAppealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCAppealMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    long countByExample(YyzjCAppealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCAppealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String appealId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int insert(YyzjCAppeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCAppeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCAppeal selectOneByExample(YyzjCAppealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCAppeal selectOneByExampleSelective(@Param("example") YyzjCAppealExample example, @Param("selective") YyzjCAppeal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCAppeal> selectByExampleSelective(@Param("example") YyzjCAppealExample example, @Param("selective") YyzjCAppeal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    List<YyzjCAppeal> selectByExample(YyzjCAppealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCAppeal selectByPrimaryKeySelective(@Param("appealId") String appealId, @Param("selective") YyzjCAppeal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    YyzjCAppeal selectByPrimaryKey(String appealId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCAppeal record, @Param("example") YyzjCAppealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCAppeal record, @Param("example") YyzjCAppealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCAppeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_appeal
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCAppeal record);
}