package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjLAlarmLogCopy;
import com.sinosoft.aiqc.db.domain.YyzjLAlarmLogCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjLAlarmLogCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    long countByExample(YyzjLAlarmLogCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjLAlarmLogCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String alarmLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int insert(YyzjLAlarmLogCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int insertSelective(YyzjLAlarmLogCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjLAlarmLogCopy selectOneByExample(YyzjLAlarmLogCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjLAlarmLogCopy selectOneByExampleSelective(@Param("example") YyzjLAlarmLogCopyExample example, @Param("selective") YyzjLAlarmLogCopy.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjLAlarmLogCopy> selectByExampleSelective(@Param("example") YyzjLAlarmLogCopyExample example, @Param("selective") YyzjLAlarmLogCopy.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    List<YyzjLAlarmLogCopy> selectByExample(YyzjLAlarmLogCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjLAlarmLogCopy selectByPrimaryKeySelective(@Param("alarmLogId") String alarmLogId, @Param("selective") YyzjLAlarmLogCopy.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    YyzjLAlarmLogCopy selectByPrimaryKey(String alarmLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjLAlarmLogCopy record, @Param("example") YyzjLAlarmLogCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjLAlarmLogCopy record, @Param("example") YyzjLAlarmLogCopyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjLAlarmLogCopy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_l_alarm_log_copy
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjLAlarmLogCopy record);
}