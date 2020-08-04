package com.vastika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreateDemo {
 // public static final String DRIVER_NAME="com.mysql.jdbc.Driver";
    //public static final String SQL="create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(50), primary key(id))";
    public static final String TABLE_CREATE_SQL="create table user_table(id int not null auto_increment, user_name varchar(45), password varchar(50), mobile_no bigint, address varchar(255), primary key(id))";

    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection();
            Statement st=con.createStatement()
        ){
            st.executeUpdate(TABLE_CREATE_SQL);
            System.out.println("table created!!");
        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }
}
