package day09.study5;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static {
        try{
            //加载配置文件
            Properties pro =new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() throws SQLException{
        return ds.getConnection();
    }

    //释放资源
    public static void close(Statement stmt,Connection conn){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException th) {
                th.printStackTrace();
            }
        }

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException th) {
                th.printStackTrace();
            }
        }
    }
    //释放资源
    public static void close(ResultSet res,Statement stmt, Connection conn){
        if(res!=null){
            try {
                res.close();
            } catch (SQLException th) {
                th.printStackTrace();
            }
        }

        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException th) {
                th.printStackTrace();
            }
        }

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException th) {
                th.printStackTrace();
            }
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }
}
