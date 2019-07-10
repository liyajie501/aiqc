/*    */ package com.sinosoft.engine.analyze.service;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.cassandra.model.IndexMsg;
/*    */ import com.huayunworld.znyyzj.engine.analyze.cassandra.repository.IndexMsgRepository;
/*    */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.context.support.ClassPathXmlApplicationContext;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class Test
/*    */ {
/*    */   @Autowired
/*    */   private IndexMsgRepository indexMsgRepository;
/*    */   
/*    */   public void add() {
/* 23 */     for (int i = 0; i < 10; i++) {
/* 24 */       IndexMsg msg = new IndexMsg();
/* 25 */       msg.setFileDir("/aaaa/bbbb");
/* 26 */       msg.setFileName("xxxx.csv");
/* 27 */       msg.setLockFlag(Integer.valueOf(0));
/* 28 */       msg.setLockTime(new Date());
/* 29 */       msg.setMsgId(CommonTools.getUUID());
/* 30 */       msg.setSysId("sys2");
/* 31 */       this.indexMsgRepository.save(msg);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void start() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void select() {
/* 49 */     List<IndexMsg> list = this.indexMsgRepository.getIndexMsgList("sys1");
/* 50 */     for (IndexMsg msg : list) {
/* 51 */       System.out.println(msg.getSysId());
/*    */     }
/*    */     
/* 54 */     System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 62 */     String[] conf = { "classpath:applicationContext.xml" };
/*    */ 
/*    */     
/* 65 */     ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(conf);
/*    */ 
/*    */     
/* 68 */     Test t = (Test)classPathXmlApplicationContext.getBean("test");
/*    */     
/* 70 */     t.add();
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\Test.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */