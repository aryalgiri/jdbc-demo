package com.vastika;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    public static final String SQL="delete from user_tbl where id=2";

    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection();
            Statement st=con.createStatement()
        ){
            st.executeUpdate(SQL);
            System.out.println("delete successful!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
