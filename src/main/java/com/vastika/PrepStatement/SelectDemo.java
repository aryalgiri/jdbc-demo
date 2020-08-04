package com.vastika.PrepStatement;

import com.vastika.DBUtil;
import com.vastika.util.QueryUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {
    public static void main(String[] args) {
            try(Connection con= DBUtil.getConnection(); PreparedStatement ps =con.prepareStatement(QueryUtil.LIST_SQL)){
                ResultSet rs=ps.executeQuery();
                while (rs.next()){
                    System.out.println("id : "+ rs.getInt("id"));
                    System.out.println("user name : "+rs.getString("user_name"));
                    System.out.println("password : "+ rs.getString("password"));
                    System.out.println("=====================");

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

