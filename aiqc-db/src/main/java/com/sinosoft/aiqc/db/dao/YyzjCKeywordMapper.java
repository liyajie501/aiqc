package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCKeyword;
import com.sinosoft.aiqc.db.domain.YyzjCKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    long countByExample(YyzjCKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String keywordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int insert(YyzjCKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCKeyword selectOneByExample(YyzjCKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCKeyword selectOneByExampleSelective(@Param("example") YyzjCKeywordExample example, @Param("selective") YyzjCKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCKeyword> selectByExampleSelective(@Param("example") YyzjCKeywordExample example, @Param("selective") YyzjCKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    List<YyzjCKeyword> selectByExample(YyzjCKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCKeyword selectByPrimaryKeySelective(@Param("keywordId") String keywordId, @Param("selective") YyzjCKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    YyzjCKeyword selectByPrimaryKey(String keywordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCKeyword record, @Param("example") YyzjCKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCKeyword record, @Param("example") YyzjCKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCKeyword record);
}