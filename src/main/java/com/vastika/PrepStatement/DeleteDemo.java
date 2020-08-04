package com.vastika.PrepStatement;

import com.vastika.DBUtil;
import com.vastika.util.QueryUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection(); PreparedStatement ps =con.prepareStatement(QueryUtil.DELETE_SQL)){
            ps.setInt(1,6);
            ps.executeUpdate();
            System.out.println("data deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
