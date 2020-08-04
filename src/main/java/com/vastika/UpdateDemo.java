package com.vastika;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL="update user_tbl set user_name='gita', password='dd' where id=2";

    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection();
            Statement st=con.createStatement()
        ){
            st.executeUpdate(SQL);
            System.out.println("update successful!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
