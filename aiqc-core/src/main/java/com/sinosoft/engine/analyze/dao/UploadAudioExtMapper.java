package com.sinosoft.engine.analyze.dao;

import com.huayunworld.znyyzj.engine.analyze.model.UploadAudioExt;

public interface UploadAudioExtMapper {
  int deleteByPrimaryKey(String paramString);
  
  int insert(UploadAudioExt paramUploadAudioExt);
  
  int insertSelective(UploadAudioExt paramUploadAudioExt);
  
  UploadAudioExt selectByPrimaryKey(String paramString);
  
  int updateByPrimaryKeySelective(UploadAudioExt paramUploadAudioExt);
  
  int updateByPrimaryKey(UploadAudioExt paramUploadAudioExt);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\UploadAudioExtMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */