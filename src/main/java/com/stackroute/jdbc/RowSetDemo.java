package com.stackroute.jdbc;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
public class RowSetDemo {
    //Creating and Executing RowSet
    public void rowSetDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating and Executing RowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/tables");
            rowSet.setUsername("root");
            rowSet.setPassword("Root@123");

            rowSet.setCommand("select * from employee");
            rowSet.execute();
            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Id: " + rowSet.getString(1));
                System.out.println("Name: " + rowSet.getString(2));
                System.out.println("Salary: " + rowSet.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}