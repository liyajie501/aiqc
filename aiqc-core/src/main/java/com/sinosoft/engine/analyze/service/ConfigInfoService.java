/*    */ package com.sinosoft.engine.analyze.service;
/*    */ 
/*    */ import com.huayunworld.znyyzj.engine.analyze.dao.JoinSysMapper;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.Engine;
/*    */ import com.huayunworld.znyyzj.engine.analyze.model.JoinSys;
/*    */ import com.huayunworld.znyyzj.engine.analyze.utils.CommonTools;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class ConfigInfoService
/*    */ {
/*    */   @Autowired
/*    */   private JoinSysMapper joinSysMapper;
/*    */   
/* 30 */   public List<JoinSys> getScanSysList(Engine obj) { return this.joinSysMapper.getScanSysList(obj); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Engine getMyInfo() {
/* 38 */     Engine e = new Engine();
/* 39 */     e.setEngineIp(CommonTools.getApplicationConf("sys_ip"));
/* 40 */     e.setEnginePort(CommonTools.getApplicationConf("sys_port"));
/* 41 */     e.setType("1");
/* 42 */     e.setVersion("1.0");
/* 43 */     return e;
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\service\ConfigInfoService.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */