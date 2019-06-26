package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCModelToRule;
import com.sinosoft.aiqc.db.domain.YyzjCModelToRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCModelToRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    long countByExample(YyzjCModelToRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCModelToRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    int insert(YyzjCModelToRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCModelToRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCModelToRule selectOneByExample(YyzjCModelToRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCModelToRule selectOneByExampleSelective(@Param("example") YyzjCModelToRuleExample example, @Param("selective") YyzjCModelToRule.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCModelToRule> selectByExampleSelective(@Param("example") YyzjCModelToRuleExample example, @Param("selective") YyzjCModelToRule.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    List<YyzjCModelToRule> selectByExample(YyzjCModelToRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCModelToRule record, @Param("example") YyzjCModelToRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_model_to_rule
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCModelToRule record, @Param("example") YyzjCModelToRuleExample example);
}