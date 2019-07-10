package com.sinosoft.engine.analyze.cassandra.java;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ColumnDefinitions;
import com.datastax.driver.core.HostDistance;
import com.datastax.driver.core.PoolingOptions;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;


public class CassandraTest {
    public Cluster cluster;
    public Session session;

    public void connect() {
        PoolingOptions poolingOptions = new PoolingOptions();


        poolingOptions.setCoreConnectionsPerHost(HostDistance.LOCAL, 2).setMaxConnectionsPerHost(HostDistance.LOCAL, 4)
                .setCoreConnectionsPerHost(HostDistance.REMOTE, 2).setMaxConnectionsPerHost(HostDistance.REMOTE, 4);


        this
                .cluster = Cluster.builder().addContactPoints(new String[]{"192.168.0.191"}).withPort(9042).withCredentials("cassandra", "cassandra").withPoolingOptions(poolingOptions).build();


        this.session = this.cluster.connect();
    }


    public void createKeyspace() {
        String cql = "CREATE KEYSPACE if not exists mydb WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}";
        this.session.execute(cql);
    }


    public void createTable() {
        String cql = "CREATE TABLE if not exists mydb.test (a text,b int,c text,d int,PRIMARY KEY (a, b))";
        this.session.execute(cql);
    }


    public void insert() {
        String cql = "INSERT INTO mydb.test (a , b , c , d ) VALUES ( 'a2',4,'c2',6);";
        this.session.execute(cql);
    }


    public void update() {
        String cql = "UPDATE mydb.test SET d = 1234 WHERE a='aa' and b=2;";

        String cql2 = "INSERT INTO mydb.test (a,b,d) VALUES ( 'aa',2,1234);";

        this.session.execute(cql);
    }


    public void delete() {
        String cql = "DELETE d FROM mydb.test WHERE a='aa' AND b=2;";

        String cql2 = "DELETE FROM mydb.test WHERE a='aa';";
        this.session.execute(cql);
        this.session.execute(cql2);
    }


    public void query() {
        String cql = "SELECT * FROM mydb.test;";
        String cql2 = "SELECT a,b,c,d FROM mydb.test;";

        ResultSet resultSet = this.session.execute(cql);
        System.out.print("这里是字段名：");
        for (ColumnDefinitions.Definition definition : resultSet.getColumnDefinitions()) {
            System.out.print(definition.getName() + " ");
        }
        System.out.println();
        System.out.println(String.format("%s\t%s\t%s\t%s\t\n%s", new Object[]{"a", "b", "c", "d", "--------------------------------------------------------------------------"}));

        for (Row row : resultSet) {

            System.out.println(String.format("%s\t%d\t%s\t%d\t", new Object[]{row.getString("a"), Integer.valueOf(row.getInt("b")), row
                    .getString("c"), Integer.valueOf(row.getInt("d"))}));
        }
    }


    public static void main(String[] args) {
        CassandraTest t = new CassandraTest();
        t.connect();
        t.mytest();
    }


    public void mytest() {
        String cql = "select * from znyyzj.YYZJ_T_SCORE_TOTAL_DATA where sys_id = 'sys1' and start_time > '2017-07-01 14:00:00+0000' and end_time < '2017-07-10 16:20:00+0000' and remote_uri='sip:1001' and local_uri='tel:2001' and call_type=1 and agent_id='1001' and sequence_num>1499398173296 limit 5 ALLOW FILTERING";


        System.out.println(cql);


        ResultSet resultSet = this.session.execute(cql);
        System.out.print("这里是字段名：");
        for (ColumnDefinitions.Definition definition : resultSet.getColumnDefinitions())
            System.out.print(definition.getName() + "\t\t");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        for (Row row : resultSet) {
            String ss = "";
            ss = ss + "\t" + row.getString("sys_id");
            ss = ss + "\t" + row.getLong("sequence_num");
            ss = ss + "\t" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Long.valueOf(row.getDate("start_time").getTime()));
            ss = ss + "\t" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Long.valueOf(row.getDate("end_time").getTime()));
            ss = ss + "\t" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Long.valueOf(row.getDate("create_time").getTime()));
            ss = ss + "\t" + row.getInt("record_duration");
            ss = ss + "\t" + row.getInt("statement_number");
            ss = ss + "\t" + row.getString("score_total_data_id");
            ss = ss + "\t" + row.getString("agent_id");
            ss = ss + "\t" + row.getString("base_id");
            ss = ss + "\t" + row.getInt("call_type");
            ss = ss + "\t" + row.getString("local_uri");
            ss = ss + "\t" + row.getString("remote_uri");
            ss = ss + "\t" + row.getDouble("total_score");
            ss = ss + "\t" + row.getString("total_score_id");
            System.out.println(ss);
        }
    }


    private String pattern(String str) {
        if (StringUtils.isBlank(str)) return null;
        str = str.toUpperCase();
        str = str.trim();
        StringBuilder b = new StringBuilder();
        for (String m : str.split("")) {
            b.append("[").append(m).append("|").append(m.toLowerCase()).append("]");
        }
        return b.toString();
    }
}


