/*    */ package com.sinosoft.engine.analyze.service.impl;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.service.mq.SoundTaskProducer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/*    */
/*    */
/*    */
/*    */
/*    */ 
/*    */ @Component
/*    */ public class SoundTaskProducerImpl
/*    */   implements SoundTaskProducer {
/* 12 */   private static Logger logger = Logger.getLogger(SoundTaskProducerImpl.class);
/*    */   
/*    */   @Autowired
/*    */   private SendMessage sendMessage;
/*    */   
/*    */   public void producer(Serializable messageSound) {
/* 18 */     logger.info("发送录音质检消息:" + messageSound.toString());
/*    */     try {
/* 20 */       this.sendMessage.sendMessage("SOUND_MESSAGE_NEED_ANALYZE", messageSound);
/* 21 */     } catch (Exception e) {
/* 22 */       logger.error("发送录音质检消息【失败】：" + this.sendMessage.toString(), e);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\impl\SoundTaskProducerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */