package com.Moonhalf;

import java.sql.*;

public class JdbcUtil {

    private static String url= "jdbc:mysql://localhost:3306/escape?useUnicode=true&characterEncoding=utf8&useSSL=true";
    private static String user= "root";
    private static String password= "Nuomi233@";


    //1.获得连接
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //2.释放资源
    public static void close(Connection con,Statement sta,ResultSet res){
        if(res!=null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(sta!=null){
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection con,Statement sta){
        close(con, sta, null);
    }

    public static void close(Connection con,PreparedStatement sta,ResultSet res){
        close(con, (Statement)sta, res);
    }
    public static void close(Connection con,PreparedStatement sta){
        close(con, (Statement)sta, null);
    }

    public static void main(String[] args) {
        System.out.println(JdbcUtil.getConnection());
    }
}

