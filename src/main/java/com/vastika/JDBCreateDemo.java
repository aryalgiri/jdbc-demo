package com.vastika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCreateDemo {
        public static final String DRIVER_NAME="com.mysql.jdbc.Driver";
        public static final String URL = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";
        public static final String USER_NAME = "root";
        public static final String PASSWORD = "root@123";
        public static final String sql="create database jdbc_demo_db";

        public static void main (String[]args){
            try (Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                 Statement st = con.createStatement()
            ) {
                st.executeUpdate(sql);
                System.out.println("database created!!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

