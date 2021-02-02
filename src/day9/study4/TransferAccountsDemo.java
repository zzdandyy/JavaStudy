package day9.study4;

import day9.study2.MysqlDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransferAccountsDemo {
    public static void main(String[] args) {
        String sqlSub = "update account set balance = balance- ? where id= ? ";
        String sqlAdd = "update account set balance = balance+ ? where id= ? ";
        Connection conn = MysqlDemo.getConnection();
        PreparedStatement ps1 = MysqlDemo.getPreparedStatement(conn, sqlSub);
        PreparedStatement ps2 = MysqlDemo.getPreparedStatement(conn, sqlAdd);
        try {
            //开启事务
            conn.setAutoCommit(false);

            ps1.setDouble(1, 500);
            ps1.setInt(2, 1);
            ps2.setDouble(1, 500);
            ps2.setInt(2, 2);
            ps1.executeUpdate();
            ps2.executeUpdate();

            //提交事务
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                //回滚事务
                conn.rollback();
            }
             catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        MysqlDemo.close(conn, ps1);
        MysqlDemo.close(conn, ps2);
    }
}