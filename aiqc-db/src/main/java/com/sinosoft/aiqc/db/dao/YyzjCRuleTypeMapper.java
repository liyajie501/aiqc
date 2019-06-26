package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCRuleType;
import com.sinosoft.aiqc.db.domain.YyzjCRuleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCRuleTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    long countByExample(YyzjCRuleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCRuleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String ruleTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int insert(YyzjCRuleType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCRuleType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCRuleType selectOneByExample(YyzjCRuleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCRuleType selectOneByExampleSelective(@Param("example") YyzjCRuleTypeExample example, @Param("selective") YyzjCRuleType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCRuleType> selectByExampleSelective(@Param("example") YyzjCRuleTypeExample example, @Param("selective") YyzjCRuleType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    List<YyzjCRuleType> selectByExample(YyzjCRuleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCRuleType selectByPrimaryKeySelective(@Param("ruleTypeId") String ruleTypeId, @Param("selective") YyzjCRuleType.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    YyzjCRuleType selectByPrimaryKey(String ruleTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCRuleType record, @Param("example") YyzjCRuleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCRuleType record, @Param("example") YyzjCRuleTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCRuleType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_rule_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCRuleType record);

    /**
     * 查询规则库目录
     * @return
     */
    List<YyzjCRuleType> selectRuleTreeInfo();
}