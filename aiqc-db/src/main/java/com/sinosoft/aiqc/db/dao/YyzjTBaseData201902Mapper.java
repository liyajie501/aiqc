package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjTBaseData201902;
import com.sinosoft.aiqc.db.domain.YyzjTBaseData201902Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTBaseData201902Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    long countByExample(YyzjTBaseData201902Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTBaseData201902Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String baseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int insert(YyzjTBaseData201902 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTBaseData201902 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseData201902 selectOneByExample(YyzjTBaseData201902Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseData201902 selectOneByExampleSelective(@Param("example") YyzjTBaseData201902Example example, @Param("selective") YyzjTBaseData201902.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTBaseData201902> selectByExampleSelective(@Param("example") YyzjTBaseData201902Example example, @Param("selective") YyzjTBaseData201902.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    List<YyzjTBaseData201902> selectByExample(YyzjTBaseData201902Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseData201902 selectByPrimaryKeySelective(@Param("baseId") String baseId, @Param("selective") YyzjTBaseData201902.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    YyzjTBaseData201902 selectByPrimaryKey(String baseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTBaseData201902 record, @Param("example") YyzjTBaseData201902Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTBaseData201902 record, @Param("example") YyzjTBaseData201902Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTBaseData201902 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data_201902
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTBaseData201902 record);
}