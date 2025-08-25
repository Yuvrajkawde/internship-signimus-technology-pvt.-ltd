package com.jdbcpackage;

import java.sql.*;

public class StudentCRUD {

    public Connection dbUtil() throws SQLException {
        String url =  "jdbc:mysql://localhost:3306/spiderman_db";
        String user = "root";
        String password = "Root,12345";
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public void addStudent() throws SQLException {
        String sqlInsert = "insert into student(name, email) values(?,?)";
        PreparedStatement pstmt = dbUtil().prepareStatement(sqlInsert);
        pstmt.setString(1,"rolex");
        pstmt.setString(2, "rolex@gmail.com");
        int rowEffected = pstmt.executeUpdate();
        System.out.println(rowEffected+" row added");
    }

    public void getAllStudent() throws SQLException {
        String sqlRead = "select * from student";
        PreparedStatement pstmt = dbUtil().prepareStatement(sqlRead);
        ResultSet rs = pstmt.executeQuery();
        System.out.println();
        System.out.println(" Student Records");
        System.out.println(" ---------------------------------------------");
        while (rs.next()){
            String name = rs.getString("name");
            String email = rs.getString("email");
            System.out.println(" Name : "+ name+", email : "+ email);
        }
    }

    public void updateStudent() throws SQLException {
        String sqlUpdate = "update student set name=?, email=? where id=?";
        PreparedStatement pstmt = dbUtil().prepareStatement(sqlUpdate);
        pstmt.setString(1,"yuvraj");
        pstmt.setString(2, "yuvraj@gmail.com");
        pstmt.setInt(3,1);
        int rowEffeted = pstmt.executeUpdate();
        System.out.println();
        System.out.println(" ---------------------------------------------");
        System.out.println(rowEffeted+ " row updated");
    }

    public void deleteStudent() throws SQLException {
        String sqlDelete = "delete from student where id = ?";
        PreparedStatement pstmt = dbUtil().prepareStatement(sqlDelete);
        pstmt.setInt(1,4);
        int rowDeleted = pstmt.executeUpdate();
        System.out.println();
        System.out.println(" ---------------------------------------------");
        System.out.println(rowDeleted + " Row Deleted");
    }
    public static void main(String[] args) throws SQLException {

        StudentCRUD std = new StudentCRUD();
       // std.addStudent();
        std.getAllStudent();
       // std.updateStudent();
        std.deleteStudent();
    }
}
