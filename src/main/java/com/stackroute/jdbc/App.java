package com.stackroute.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
        simpleJdbcDemo.getEmployeeDetails();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("mrudula","m");
        DatabaseMetadataDemo databaseMetadataDemo = new DatabaseMetadataDemo();
        databaseMetadataDemo.databaseMetadataDemo();
        JdbcBatchDemo jdbcBatchDemo = new JdbcBatchDemo();
        jdbcBatchDemo.jdbcBatchDemo();
        JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
        jdbcBatchDemo.jdbcBatchDemo();
        ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
        resultSetMetadataDemo.resultSetMetaDataDemo();
        RowSetDemo rowSetDemo=new RowSetDemo();
        rowSetDemo.rowSetDemo();

    }
}
