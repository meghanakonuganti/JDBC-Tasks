package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcBatchDemo {
    public void jdbcBatchDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "Root@123");
            connection.setAutoCommit(false);

            Statement stmt = connection.createStatement();
            stmt.addBatch("insert into employee values(6,'bunny',20,'m')");
            stmt.addBatch("insert into employee values(7,'addy',21,'m')");

            stmt.executeBatch();//executing the batch

            connection.commit();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

