package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTransactionDemo {

    public void transactionDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "Root@123");
            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into employee values(8,'abhi',24,'m')");
            stmt.executeUpdate("insert into employee values(9,'umesh',23,'m')");
            con.commit();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}