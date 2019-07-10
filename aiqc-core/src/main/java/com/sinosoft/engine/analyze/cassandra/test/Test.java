package com.sinosoft.engine.analyze.cassandra.test;

import com.datastax.driver.core.*;


public class Test {
    public Cluster cluster;
    public Session session;

    public void connect1() {
        this
                .cluster = Cluster.builder().addContactPoints(new String[]{"192.168.0.191"}).withPort(9042).withCredentials("cassandra", "cassandra").build();
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
        String cql = "SELECT * FROM znyyzj.yyzj_t_score_total_data;";

        ResultSet resultSet = this.session.execute(cql);
        System.out.print("这里是字段名：");
        for (ColumnDefinitions.Definition definition : resultSet.getColumnDefinitions()) {
            System.out.print(definition.getName() + " ");
        }
        System.out.println();
        for (Row row : resultSet) {
            System.out.println(row
                    .getString("score_total_data_id") + "\t" + row
                    .getString("base_id"));
        }
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.connect1();
        t.query();
    }
}

