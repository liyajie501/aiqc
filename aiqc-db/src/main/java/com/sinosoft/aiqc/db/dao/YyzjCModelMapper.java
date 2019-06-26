package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCModel;
import com.sinosoft.aiqc.db.domain.YyzjCModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    long countByExample(YyzjCModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String modelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int insert(YyzjCModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCModel selectOneByExample(YyzjCModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCModel selectOneByExampleSelective(@Param("example") YyzjCModelExample example, @Param("selective") YyzjCModel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCModel> selectByExampleSelective(@Param("example") YyzjCModelExample example, @Param("selective") YyzjCModel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    List<YyzjCModel> selectByExample(YyzjCModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCModel selectByPrimaryKeySelective(@Param("modelId") String modelId, @Param("selective") YyzjCModel.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    YyzjCModel selectByPrimaryKey(String modelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCModel record, @Param("example") YyzjCModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCModel record, @Param("example") YyzjCModelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCModel record);


    /**
     * 查询最大的ruleID
     * @return
     */
    String selectMaxModelId();
}