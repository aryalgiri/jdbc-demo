package com.vastika.PrepStatement;

import com.vastika.DBUtil;
import com.vastika.util.QueryUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection(); PreparedStatement ps =con.prepareStatement(QueryUtil.INSERT_SQL)){
            ps.setString(1, "Shyam Nepal");
            ps.setString(2,"aa1");
            ps.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
