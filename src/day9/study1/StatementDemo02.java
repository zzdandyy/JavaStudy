package day9.study1;

import java.sql.*;
import java.util.ArrayList;

public class StatementDemo02 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC";
        String username = "root";
        String password = "aa2217117";
        String sql = "select * from school.students";
        Connection conn = null;
        Statement st = null;
        ArrayList<Student> students = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(url, username, password);
            st = conn.createStatement();
            ResultSet result = st.executeQuery(sql);

            //遍历查询并存入集合中
            while (result.next()) {
                students.add(new Student(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4), result.getInt(5)));
            }
            //遍历集合并输出
            for (Student s : students) {
                System.out.println(s.getId() + "\t" + s.getClass_id() + "\t" + s.getName() + "\t" + s.getGender() + "\t" + s.getScore());
            }

            result.close();

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
