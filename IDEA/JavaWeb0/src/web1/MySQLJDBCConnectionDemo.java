package web1;

import java.sql.*;

public class MySQLJDBCConnectionDemo
{
    public static void main(String[] args)
    {
        // 指定驱动
        String driver = "org.gjt.mm.mysql.Driver";
        // 数据库连接字符串
        String url = "jdbc:mysql://localhost:3306/JavaWeb?user='root';password='1qaz2wsx'";
        // 获取数据库连接
        Connection conn = null;
        try
        {
            // 加载驱动
            Class.forName(driver);
            // 获取数据库连接
            conn = DriverManager.getConnection(url, "root", "1qaz2wsx");
            if (conn != null)
            {
                System.out.println("Successfully connected to MySQL server!");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        // 关闭数据库连接
        try
        {
            conn.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
