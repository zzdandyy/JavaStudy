package day09.study3;

import day09.study2.MysqlDemo;

import java.sql.*;
import java.util.Scanner;

public class LoginDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        if (new LoginDemo01().login(username, password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }


    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        } else {
            Connection conn = MysqlDemo.getConnection();
            String sql = "select * from user where username= ? and password= ? ";
            PreparedStatement past = MysqlDemo.getPreparedStatement(conn, sql);
            try {
                past.setString(1, username);
                past.setString(2, password);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            ResultSet res = MysqlDemo.getResultSet(past);
            boolean isTrue = false;
            try {
                isTrue = res.next();
            } catch (SQLException th) {
                th.printStackTrace();
            }
            MysqlDemo.close(conn, past, res);
            return isTrue;
        }
    }
}
