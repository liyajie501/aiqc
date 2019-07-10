package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.UploadAudio;

import java.util.List;

public interface UploadAudioMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(UploadAudio paramUploadAudio);
  
  int insertSelective(UploadAudio paramUploadAudio);
  
  UploadAudio selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(UploadAudio paramUploadAudio);
  
  int updateByPrimaryKey(UploadAudio paramUploadAudio);
  
  List<String> selectByTotalScoreId(String paramString);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\UploadAudioMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */