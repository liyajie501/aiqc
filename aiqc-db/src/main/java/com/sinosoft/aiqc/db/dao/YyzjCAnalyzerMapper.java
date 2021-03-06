package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCAnalyzer;
import com.sinosoft.aiqc.db.domain.YyzjCAnalyzerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCAnalyzerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    long countByExample(YyzjCAnalyzerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCAnalyzerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String analyzerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int insert(YyzjCAnalyzer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCAnalyzer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCAnalyzer selectOneByExample(YyzjCAnalyzerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCAnalyzer selectOneByExampleSelective(@Param("example") YyzjCAnalyzerExample example, @Param("selective") YyzjCAnalyzer.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCAnalyzer> selectByExampleSelective(@Param("example") YyzjCAnalyzerExample example, @Param("selective") YyzjCAnalyzer.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    List<YyzjCAnalyzer> selectByExample(YyzjCAnalyzerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCAnalyzer selectByPrimaryKeySelective(@Param("analyzerId") String analyzerId, @Param("selective") YyzjCAnalyzer.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    YyzjCAnalyzer selectByPrimaryKey(String analyzerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCAnalyzer record, @Param("example") YyzjCAnalyzerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCAnalyzer record, @Param("example") YyzjCAnalyzerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCAnalyzer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_analyzer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCAnalyzer record);
}