/*    */ package com.sinosoft.engine.analyze.service.impl;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.dao.UserMapper;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.User;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.UserExample;
/*    */ import com.huayunworld.znyyzj.engine.analyze.service.UserService;
/*    */ import com.huayunworld.znyyzj.engine.core.generic.GenericDao;
/*    */ import com.huayunworld.znyyzj.engine.core.generic.GenericServiceImpl;
/*    */ import java.util.List;
/*    */ import javax.annotation.Resource;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class UserServiceImpl
/*    */   extends GenericServiceImpl<User, Long>
/*    */   implements UserService
/*    */ {
/*    */   @Resource
/*    */   private UserMapper userMapper;
/*    */   
/* 31 */   public int insert(User model) { return this.userMapper.insertSelective(model); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 36 */   public int update(User model) { return this.userMapper.updateByPrimaryKeySelective(model); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 41 */   public int delete(Long id) { return this.userMapper.deleteByPrimaryKey(id); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 46 */   public User authentication(User user) { return this.userMapper.authentication(user); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 51 */   public User selectById(Long id) { return this.userMapper.selectByPrimaryKey(id); }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 56 */   public GenericDao<User, Long> getDao() { return this.userMapper; }
/*    */ 
/*    */ 
/*    */   
/*    */   public User selectByUsername(String username) {
/* 61 */     UserExample example = new UserExample();
/* 62 */     example.createCriteria().andUsernameEqualTo(username);
/* 63 */     List<User> list = this.userMapper.selectByExample(example);
/* 64 */     return (User)list.get(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\impl\UserServiceImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */