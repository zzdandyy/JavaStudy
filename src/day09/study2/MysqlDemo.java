package day09.study2;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */
public class MysqlDemo {
    private static String url;
    private static String username;
    private static String password;

    //文件读取
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("src\\day9\\study2\\jdbc.properties"));
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //返回Connection对象
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }


    //返回Statement对象
    public static Statement getStatement(Connection conn) {
        Statement st = null;
        try {
            st = conn.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return st;
    }

    //返回PreparedStatement对象
    public static PreparedStatement getPreparedStatement(Connection conn,String sql) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return st;
    }

    //返回ResultSet对象
    public static ResultSet getResultSet(Statement st, String sql) {
        ResultSet res = null;
        try {
            res = st.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
    }

    public static ResultSet getResultSet(PreparedStatement st) {
        ResultSet res = null;
        try {
            res = st.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
    }


    //释放资源
    public static void close(Connection conn, Statement st) {
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

    //释放资源
    public static void close(Connection conn, Statement st, ResultSet res) {
        if (res != null) {
            try {
                res.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

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
    public static void close(Connection conn, PreparedStatement st) {
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

    //释放资源
    public static void close(Connection conn, PreparedStatement st, ResultSet res) {
        if (res != null) {
            try {
                res.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

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
