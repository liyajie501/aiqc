package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCKeywordToType;
import com.sinosoft.aiqc.db.domain.YyzjCKeywordToTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCKeywordToTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    long countByExample(YyzjCKeywordToTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCKeywordToTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    int insert(YyzjCKeywordToType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCKeywordToType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCKeywordToType selectOneByExample(YyzjCKeywordToTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCKeywordToType selectOneByExampleSelective(@Param("example") YyzjCKeywordToTypeExample example, @Param("selective") YyzjCKeywordToType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCKeywordToType> selectByExampleSelective(@Param("example") YyzjCKeywordToTypeExample example, @Param("selective") YyzjCKeywordToType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    List<YyzjCKeywordToType> selectByExample(YyzjCKeywordToTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCKeywordToType record, @Param("example") YyzjCKeywordToTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_keyword_to_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCKeywordToType record, @Param("example") YyzjCKeywordToTypeExample example);
}