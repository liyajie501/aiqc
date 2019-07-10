package com.sinosoft.engine.analyze.dao;

import com.github.pagehelper.Page;
import com.huayunworld.znyyzj.engine.analyze.model.User;
import com.huayunworld.znyyzj.engine.analyze.model.UserExample;
import com.huayunworld.znyyzj.engine.core.generic.GenericDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends GenericDao<User, Long> {
  int countByExample(UserExample paramUserExample);
  
  int deleteByExample(UserExample paramUserExample);
  
  int deleteByPrimaryKey(Long paramLong);
  
  int insert(User paramUser);
  
  int insertSelective(User paramUser);
  
  List<User> selectByExample(UserExample paramUserExample);
  
  User selectByPrimaryKey(Long paramLong);
  
  int updateByExampleSelective(@Param("record") User paramUser, @Param("example") UserExample paramUserExample);
  
  int updateByExample(@Param("record") User paramUser, @Param("example") UserExample paramUserExample);
  
  int updateByPrimaryKeySelective(User paramUser);
  
  int updateByPrimaryKey(User paramUser);
  
  User authentication(@Param("record") User paramUser);
  
  List<User> selectByExampleAndPage(Page<User> paramPage, UserExample paramUserExample);
  
  List<String> selectByUserId(String paramString);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\dao\UserMapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */