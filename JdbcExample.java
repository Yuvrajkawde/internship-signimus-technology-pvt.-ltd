package com.jdbcpackage;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {
        String url =  "jdbc:mysql://localhost:3306/spiderman_db";
        String user = "root";
        String password = "Root,12345";
        Connection conn = DriverManager.getConnection(url, user, password);
//        String insertSql = "insert into users (name, age) values(?,?)";
//        PreparedStatement ps = conn.prepareStatement(insertSql);
//        ps.setString(1, "dhoni");
//        ps.setString(2, "45");
//        int rowEffect = ps.executeUpdate();


//        String readSql = "select * from users";
//        PreparedStatement ps = conn.prepareStatement(readSql);
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()){
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String age = rs.getString("age");
//
//            System.out.println("Id : "+ id+ ", Name : "+ name+ ", Age : " +age);
//        }
//
//        String deleteSql = "delete from users where id = ?";
//        PreparedStatement ps = conn.prepareStatement(deleteSql);
//        ps.setInt(1, 3);
//        int rowEffected = ps.executeUpdate();
//        System.out.println(rowEffected+" rows effected");

        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);

           ps.setString(1, "MS dhoni");
           ps.setString(2, "46");
           ps.setInt(3, 2);
        int rowEffected = ps.executeUpdate();
        System.out.println(rowEffected+" rows effected");
    }
}
