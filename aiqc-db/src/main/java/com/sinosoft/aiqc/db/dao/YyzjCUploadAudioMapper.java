package com.sinosoft.aiqc.db.dao;

import com.sinosoft.aiqc.db.domain.YyzjCUploadAudio;
import com.sinosoft.aiqc.db.domain.YyzjCUploadAudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyzjCUploadAudioMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    long countByExample(YyzjCUploadAudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int deleteByExample(YyzjCUploadAudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String uploadId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int insert(YyzjCUploadAudio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int insertSelective(YyzjCUploadAudio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCUploadAudio selectOneByExample(YyzjCUploadAudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCUploadAudio selectOneByExampleSelective(@Param("example") YyzjCUploadAudioExample example, @Param("selective") YyzjCUploadAudio.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<YyzjCUploadAudio> selectByExampleSelective(@Param("example") YyzjCUploadAudioExample example, @Param("selective") YyzjCUploadAudio.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    List<YyzjCUploadAudio> selectByExample(YyzjCUploadAudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    YyzjCUploadAudio selectByPrimaryKeySelective(@Param("uploadId") String uploadId, @Param("selective") YyzjCUploadAudio.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    YyzjCUploadAudio selectByPrimaryKey(String uploadId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YyzjCUploadAudio record, @Param("example") YyzjCUploadAudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YyzjCUploadAudio record, @Param("example") YyzjCUploadAudioExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YyzjCUploadAudio record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yyzj_c_upload_audio
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YyzjCUploadAudio record);
}