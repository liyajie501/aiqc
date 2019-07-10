         package com.sinosoft.engine.analyze;
/*    */
/*    */ import com.sinosoft.engine.analyze.cassandra.java.PageInfoCassandra;
/*    */ import com.sinosoft.engine.analyze.cassandra.model.ScoreTotalData;
/*    */ import java.util.List;
/*    */ import net.sf.json.JSONObject;
/*    */ import org.springframework.context.support.ClassPathXmlApplicationContext;
/*    */ import org.springframework.data.cassandra.core.CassandraOperations;
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
/*    */ public class App
/*    */ {
/*    */   public static void main(String[] args) {
/* 22 */     String[] conf = { "classpath:applicationContext.xml" };
/*    */
/*    */
/* 25 */     ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(conf);
/* 26 */     CassandraOperations cassandraOperations = (CassandraOperations)classPathXmlApplicationContext.getBean("cassandraOperations");
/* 27 */     PageInfoCassandra<ScoreTotalData> p = new PageInfoCassandra<ScoreTotalData>(ScoreTotalData.class);
/* 28 */     p.setCassandraOperations(cassandraOperations);
/*    */
/*    */
/* 31 */     String cql = "select * from znyyzj.YYZJ_T_SCORE_TOTAL_DATA where sys_id = 'sys1' and start_time > '2017-07-01 14:00:00+0000' and end_time < '2017-07-10 16:20:00+0000' and remote_uri='sip:1001' and local_uri='tel:2001' and call_type=1 and agent_id='1001'";
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/*    */
/* 39 */     List<ScoreTotalData> list = p.query(cql, 1L);
/*    */
/* 41 */     for (ScoreTotalData d : list)
/* 42 */       System.out.println(JSONObject.fromObject(d).toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyze\App.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */