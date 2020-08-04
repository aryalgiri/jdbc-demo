package com.vastika;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
    public static final String SQL="select * from user_tbl";

    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection();
            Statement st=con.createStatement()
        ){
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
               /* System.out.println("id is: "+ rs.getInt("id"));
                System.out.println("username is: "+ rs.getString("user_name"));
                System.out.println("password is: "+ rs.getString("password"));
                System.out.println("=================");*/
                System.out.println("id is: "+ rs.getInt(1));
                /*System.out.println("username is: "+ rs.getString(2));
                System.out.println("password is: "+ rs.getString("password"));*/
            }
            System.out.println("select query successful!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
