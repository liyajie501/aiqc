package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCIndexDef;
import com.sinosoft.aiqc.db.domain.YyzjCIndexDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCIndexDefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    long countByExample(YyzjCIndexDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCIndexDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String indexId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int insert(YyzjCIndexDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCIndexDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCIndexDef selectOneByExample(YyzjCIndexDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCIndexDef selectOneByExampleSelective(@Param("example") YyzjCIndexDefExample example, @Param("selective") YyzjCIndexDef.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCIndexDef> selectByExampleSelective(@Param("example") YyzjCIndexDefExample example, @Param("selective") YyzjCIndexDef.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    List<YyzjCIndexDef> selectByExample(YyzjCIndexDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCIndexDef selectByPrimaryKeySelective(@Param("indexId") String indexId, @Param("selective") YyzjCIndexDef.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    YyzjCIndexDef selectByPrimaryKey(String indexId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCIndexDef record, @Param("example") YyzjCIndexDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCIndexDef record, @Param("example") YyzjCIndexDefExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCIndexDef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_index_def
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCIndexDef record);
}