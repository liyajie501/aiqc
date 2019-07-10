package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.analyze.cassandra.model.BaseData;
import com.sinosoft.aiqc.db.domain.YyzjTBaseData;
import com.sinosoft.aiqc.db.domain.YyzjTBaseDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTBaseDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    long countByExample(YyzjTBaseDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTBaseDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String baseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int insert(YyzjTBaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTBaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseData selectOneByExample(YyzjTBaseDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseData selectOneByExampleSelective(@Param("example") YyzjTBaseDataExample example, @Param("selective") YyzjTBaseData.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTBaseData> selectByExampleSelective(@Param("example") YyzjTBaseDataExample example, @Param("selective") YyzjTBaseData.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    List<YyzjTBaseData> selectByExample(YyzjTBaseDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTBaseData selectByPrimaryKeySelective(@Param("baseId") String baseId, @Param("selective") YyzjTBaseData.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    YyzjTBaseData selectByPrimaryKey(String baseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTBaseData record, @Param("example") YyzjTBaseDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTBaseData record, @Param("example") YyzjTBaseDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTBaseData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_base_data
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTBaseData record);


    List<BaseData> getBaseDataById(String var1);
}