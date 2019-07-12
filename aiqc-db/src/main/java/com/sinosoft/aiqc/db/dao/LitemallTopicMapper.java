package com.sinosoft.aiqc.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.sinosoft.aiqc.db.domain.LitemallTopic;
import com.sinosoft.aiqc.db.domain.LitemallTopicExample;

public interface LitemallTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    long countByExample(LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int insert(LitemallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int insertSelective(LitemallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTopic selectOneByExample(LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTopic selectOneByExampleSelective(@Param("example") LitemallTopicExample example, @Param("selective") LitemallTopic.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTopic selectOneByExampleWithBLOBs(LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallTopic> selectByExampleSelective(@Param("example") LitemallTopicExample example, @Param("selective") LitemallTopic.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    List<LitemallTopic> selectByExampleWithBLOBs(LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    List<LitemallTopic> selectByExample(LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTopic selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallTopic.Column... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    LitemallTopic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTopic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallTopic record, @Param("example") LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") LitemallTopic record, @Param("example") LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallTopic record, @Param("example") LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(LitemallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_topic
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}