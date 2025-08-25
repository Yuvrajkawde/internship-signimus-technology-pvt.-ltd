package com.jdbcpackage;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsingStoredProcedure {

    public static void main(String[] args) throws SQLException {
        String url =  "jdbc:mysql://localhost:3306/spiderman_db";
        String user = "root";
        String password = "Root,12345";
        Connection con = DriverManager.getConnection(url,user,password);

        String callableSql = "{CALL adduser(?,?)}";
        CallableStatement callableStatement = con.prepareCall(callableSql);
        callableStatement.setString(1,"victor");
        callableStatement.setString(2, "35");
        int rowEffected = callableStatement.executeUpdate();
        System.out.println(rowEffected +" record added");
    }
}
