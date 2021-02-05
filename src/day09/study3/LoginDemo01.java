package day09.study3;

import day09.study2.MysqlDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginDemo01 {
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
            String sql = "select * from user where username='" + username + "' and password='" + password + "'";
            Statement st = MysqlDemo.getStatement(conn);
            ResultSet res = MysqlDemo.getResultSet(st, sql);
            boolean isTrue = false;
            try {
                isTrue = res.next();
            } catch (SQLException th) {
                th.printStackTrace();
            }
            MysqlDemo.close(conn, st, res);
            return isTrue;
        }
    }
}
