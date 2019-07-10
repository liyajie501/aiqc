/*    */ package com.sinosoft.engine.analyze.utils;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class JDBCUtil {
/* 12 */   Connection conn = null;
/* 13 */   String driver = CommonTools.getApplicationConf("SqlServerjdbc.driver");
/* 14 */   String url = CommonTools.getApplicationConf("SqlServerjdbc.url");
/* 15 */   String username = CommonTools.getApplicationConf("SqlServerjdbc.username");
/* 16 */   String password = CommonTools.getApplicationConf("SqlServerjdbc.password");
/* 17 */   ResultSet rs = null;
/* 18 */   Statement stmt = null;
/*    */ 
/*    */   
/*    */   public Connection openConnection() throws ClassNotFoundException, SQLException {
/*    */     try {
/* 23 */       Class.forName(this.driver);
/* 24 */       this.conn = DriverManager.getConnection(this.url, this.username, this.password);
/* 25 */     } catch (ClassNotFoundException e) {
/* 26 */       e.printStackTrace();
/* 27 */     } catch (SQLException e) {
/* 28 */       e.printStackTrace();
/*    */     } 
/* 30 */     return this.conn;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<String> findData(String uniqueid) throws SQLException {
/* 35 */     String sql = "SELECT VOICE_CASE_ID FROM INTERACTIONS WHERE KS_CALL_IDENTIFIER IN (SELECT KS_CALL_IDENTIFIER \tFROM INTERACTION_METADATA WHERE\tMETADATA_TYPE = 'Call_IDS'AND METADATA_NAME = 'UCID' AND METADATA_VALUE = " + uniqueid + ")";
/* 36 */     this.stmt = this.conn.createStatement();
/* 37 */     this.rs = this.stmt.executeQuery(sql);
/* 38 */     List<String> list = new ArrayList<String>();
/* 39 */     while (this.rs.next()) {
/* 40 */       list.add(this.rs.getString("VOICE_CASE_ID"));
/*    */     }
/* 42 */     return list;
/*    */   }
/*    */   
/*    */   public void closeConnection() {
/* 46 */     if (this.rs != null) {
/*    */       try {
/* 48 */         this.rs.close();
/* 49 */       } catch (SQLException e) {
/* 50 */         e.printStackTrace();
/*    */       } finally {
/* 52 */         this.rs = null;
/*    */       } 
/*    */     }
/* 55 */     if (this.stmt != null) {
/*    */       try {
/* 57 */         this.stmt.close();
/* 58 */       } catch (SQLException e) {
/* 59 */         e.printStackTrace();
/*    */       } finally {
/* 61 */         this.stmt = null;
/*    */       } 
/*    */     }
/* 64 */     if (this.conn != null)
/*    */       try {
/* 66 */         this.conn.close();
/* 67 */       } catch (SQLException e) {
/* 68 */         e.printStackTrace();
/*    */       } finally {
/* 70 */         this.conn = null;
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\JDBCUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */