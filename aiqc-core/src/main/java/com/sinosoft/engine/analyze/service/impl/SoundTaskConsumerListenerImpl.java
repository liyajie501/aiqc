/*    */ package com.sinosoft.engine.analyze.service.impl;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.cassandra.model.BaseData;
import com.huayunworld.znyyzj.engine.analyze.model.AnalyzeResult;
import com.huayunworld.znyyzj.engine.analyze.model.MessageSound;
import com.huayunworld.znyyzj.engine.analyze.service.CacheService;
import com.huayunworld.znyyzj.engine.analyze.service.IndexFileHandleService;
import com.huayunworld.znyyzj.engine.analyze.service.mq.SoundTaskConsumerListener;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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
/*    */
/*    */
/*    */ 
/*    */ @Component("soundTaskConsumerListener")
/*    */ public class SoundTaskConsumerListenerImpl
/*    */   implements SoundTaskConsumerListener {
/* 21 */   private static Logger logger = Logger.getLogger(SoundTaskConsumerListenerImpl.class);
/*    */   
/*    */   @Autowired
/*    */   private CacheService cacheService;
/*    */   
/*    */   public void handleMessage(Serializable message) throws Exception {
/* 27 */     logger.info("进入录音质检消息处理方法...");
/*    */     try {
/* 29 */       if (message instanceof MessageSound) {
/* 30 */         logger.info("处理质检录音消息:" + message.toString());
/*    */         
/* 32 */         MessageSound messageVo = (MessageSound)message;
/* 33 */         if (StringUtils.isBlank(messageVo.getBaseId())) throw new RuntimeException("参数错误：baseId为空"); 
/* 34 */         logger.info("查询录音基础信息:baseId=" + messageVo.getBaseId());
/* 35 */         List<BaseData> list = this.cacheService.getBaseDataRepository().getBaseDataById(messageVo.getBaseId());
/* 36 */         if (list == null || list.size() == 0) throw new Exception("Nosql没有找到数据baseId=" + messageVo.getBaseId()); 
/* 37 */         BaseData base = (BaseData)list.get(0);
/* 38 */         BlockingQueue<List<AnalyzeResult>> queue = new LinkedBlockingQueue<List<AnalyzeResult>>();
/* 39 */         if (!IndexFileHandleService.addManuTask(base, messageVo.getScoreTotalId(), null, queue)) throw new Exception("添加总分任务质检录音数据失败"); 
/* 40 */         logger.info("加入质检task处理【成功】" + message);
/*    */       }
/*    */     
/* 43 */     } catch (Exception e) {
/* 44 */       logger.error("加入质检task处理【失败】:" + message, e);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\impl\SoundTaskConsumerListenerImpl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */