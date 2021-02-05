package day09.study1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //连接数据库，获得Connection对象
        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
        String username = "root";
        String password = "aa2217117";
        Connection conn = DriverManager.getConnection(url, username, password);

        //创建执行sql语句的对象
        Statement st = conn.createStatement();
        PreparedStatement pst = conn.prepareStatement("");
        //管理事务
        conn.setAutoCommit(false);  //关闭自动提交，即开启事务
        conn.commit(); //提交事务
        conn.rollback(); //回滚

        //Statement对象
        st.execute("");  //可以执行任意的sql语句
        st.executeUpdate("");  //执行DML语句（增删改表中的数据）和DDL（对数据库和表执行操作），返回值是int（影响的行数）
        st.executeQuery("");  //执行DQL语句（select）
    }
}
