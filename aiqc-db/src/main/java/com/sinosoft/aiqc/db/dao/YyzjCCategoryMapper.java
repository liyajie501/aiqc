package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCCategory;
import com.sinosoft.aiqc.db.domain.YyzjCCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    long countByExample(YyzjCCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int insert(YyzjCCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCCategory selectOneByExample(YyzjCCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCCategory selectOneByExampleSelective(@Param("example") YyzjCCategoryExample example, @Param("selective") YyzjCCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCCategory> selectByExampleSelective(@Param("example") YyzjCCategoryExample example, @Param("selective") YyzjCCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    List<YyzjCCategory> selectByExample(YyzjCCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCCategory selectByPrimaryKeySelective(@Param("categoryId") String categoryId, @Param("selective") YyzjCCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    YyzjCCategory selectByPrimaryKey(String categoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCCategory record, @Param("example") YyzjCCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCCategory record, @Param("example") YyzjCCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCCategory record);
}