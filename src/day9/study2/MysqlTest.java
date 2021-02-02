package day9.study2;

import day9.study1.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MysqlTest {
    public static void main(String[] args) throws SQLException {

        ArrayList<Student> students = new ArrayList<>();
        String sql = "select * from students";
        Connection conn = MysqlDemo.getConnection();
        Statement st = MysqlDemo.getStatement(conn);
        ResultSet result = MysqlDemo.getResultSet(st, sql);

        //遍历查询并存入集合中
        while (result.next()) {
            students.add(new Student(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4), result.getInt(5)));
        }
        //遍历集合并输出
        for (Student s : students) {
            System.out.println(s.getId() + "\t" + s.getClass_id() + "\t" + s.getName() + "\t" + s.getGender() + "\t" + s.getScore());
        }

        MysqlDemo.close(conn, st, result);
    }
}
