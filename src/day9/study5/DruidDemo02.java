package day9.study5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo02 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "王五");
            pstmt.setDouble(2, 1000);
            int count = pstmt.executeUpdate();
            System.out.println(count);
            JDBCUtils.close(pstmt, conn);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
