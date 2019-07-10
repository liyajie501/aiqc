/*    */ package com.sinosoft.engine.analyze.service.impl;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.data.redis.core.RedisTemplate;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class SendMessage
/*    */ {
/*    */   @Autowired
/*    */   private RedisTemplate<String, Object> redisTemplate;
/*    */   
/* 14 */   public RedisTemplate<String, Object> getRedisTemplate() { return this.redisTemplate; }
/*    */ 
/*    */ 
/*    */   
/* 18 */   public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) { this.redisTemplate = redisTemplate; }
/*    */ 
/*    */ 
/*    */   
/* 22 */   public void sendMessage(String channel, Serializable message) { this.redisTemplate.convertAndSend(channel, message); }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\impl\SendMessage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */