package com.jdbcpackage;

import java.sql.*;

public class JdbcExample2 {
    public static void main(String[] args) throws SQLException {
        String url =  "jdbc:mysql://localhost:3306/spiderman_db";
        String user = "root";
        String password = "Root,12345";
        Connection conn = DriverManager.getConnection(url, user, password);
//        String insertSql = "insert into users (name, age) values('dhoni','46')";
//        Statement statement = conn.createStatement();
//
//        int rowEffect = statement.executeUpdate(insertSql);
//        System.out.println(rowEffect+" rows effected");

//        String readSql = "select * from users";
//        Statement statement = conn.createStatement();
//        ResultSet rs = statement.executeQuery(readSql);
//        while (rs.next()){
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//           String age = rs.getString("age");
//
//            System.out.println("Id : "+ id+ ", Name : "+ name+ ", Age : " +age);
//        }


//
        String deleteSql = "delete from users where id = 4";
        Statement statement = conn.createStatement();

        int rowEffected = statement.executeUpdate(deleteSql);
       System.out.println(rowEffected+" rows effected");

//        String sql = "UPDATE users SET name = 'sachin', age = '55' WHERE id = 2";
//        Statement statement = conn.createStatement();
//        int rowEffected = statement.executeUpdate(sql);
//
//         System.out.println(rowEffected+" rows effected");
    }
}
