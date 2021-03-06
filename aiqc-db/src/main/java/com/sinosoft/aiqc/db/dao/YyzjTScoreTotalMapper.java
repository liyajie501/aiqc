package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjTScoreTotal;
import com.sinosoft.aiqc.db.domain.YyzjTScoreTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjTScoreTotalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    long countByExample(YyzjTScoreTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjTScoreTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String totalScoreResId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int insert(YyzjTScoreTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int insertSelective(YyzjTScoreTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotal selectOneByExample(YyzjTScoreTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotal selectOneByExampleSelective(@Param("example") YyzjTScoreTotalExample example, @Param("selective") YyzjTScoreTotal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjTScoreTotal> selectByExampleSelective(@Param("example") YyzjTScoreTotalExample example, @Param("selective") YyzjTScoreTotal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    List<YyzjTScoreTotal> selectByExample(YyzjTScoreTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjTScoreTotal selectByPrimaryKeySelective(@Param("totalScoreResId") String totalScoreResId, @Param("selective") YyzjTScoreTotal.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    YyzjTScoreTotal selectByPrimaryKey(String totalScoreResId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjTScoreTotal record, @Param("example") YyzjTScoreTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjTScoreTotal record, @Param("example") YyzjTScoreTotalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjTScoreTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_t_score_total
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjTScoreTotal record);
}