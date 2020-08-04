package com.vastika;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertDemo {
        public static final String SQL="insert into user_tbl(user_name, password) values('ramu', 'aa'),('shyam', 'bb')";

        public static void main(String[] args) {
            try(Connection con= DBUtil.getConnection();
                Statement st=con.createStatement()
            ){
                st.executeUpdate(SQL);
                System.out.println("first insertion successful!!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

