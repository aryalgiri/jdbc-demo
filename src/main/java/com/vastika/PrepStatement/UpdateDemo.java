package com.vastika.PrepStatement;

import com.vastika.DBUtil;
import com.vastika.util.QueryUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
    public static void main(String[] args) {
        try(Connection con= DBUtil.getConnection(); PreparedStatement ps =con.prepareStatement(QueryUtil.UPDATE_SQL)){
            ps.setString(1, "Hari Uprety");
            ps.setString(2,"aa1b1");
            ps.setInt(3,4);
            ps.executeUpdate();
            System.out.println("data updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
