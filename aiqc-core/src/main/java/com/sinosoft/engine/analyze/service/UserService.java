package com.sinosoft.engine.analyze.service;

import com.huayunworld.znyyzj.engine.analyze.model.User;
import com.huayunworld.znyyzj.engine.core.generic.GenericService;

public interface UserService extends GenericService<User, Long> {
  User authentication(User paramUser);
  
  User selectByUsername(String paramString);
}


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\UserService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */