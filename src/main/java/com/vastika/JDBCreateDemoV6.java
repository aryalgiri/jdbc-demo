package com.vastika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCreateDemoV6 {
    public static void main(String[] args)  {
        String sql="create database jdbc_demo_db";
        Connection con = null;
        Statement st = null;

        try {
            //1. Register the driver (from java 6 onwards, it's not required though.
             Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Get connection object
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=UTC", "root", "root@123");
            //3. Get statement object
            st=con.createStatement();
            //4. Execute query
            st.executeUpdate(sql);
            System.out.println("Database created");
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                //5. Close the connection
                con.close();
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }



        }
    }


