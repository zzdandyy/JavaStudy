package day09.study1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo01 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
        String username = "root";
        String password = "aa2217117";
        String sql1 = "insert into students values(11,3,'小李','B',91)";
        String sql2 = "update students set class_id=2 where id=11";
        String sql3 = "delete from students where id=10";
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            st = conn.createStatement();

            int count1 = st.executeUpdate(sql1);
            if (count1 > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }

            int count2 = st.executeUpdate(sql2);
            if (count2 > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }

            int count3 = st.executeUpdate(sql3);
            if (count3 > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
}
