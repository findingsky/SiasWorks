package web1;

import java.sql.*;

public class MySQLJDBCConnectionDemo
{
    public static void main(String[] args)
    {
        // ָ������
        String driver = "org.gjt.mm.mysql.Driver";
        // ���ݿ������ַ���
        String url = "jdbc:mysql://localhost:3306/JavaWeb?user='root';password='1qaz2wsx'";
        // ��ȡ���ݿ�����
        Connection conn = null;
        try
        {
            // ��������
            Class.forName(driver);
            // ��ȡ���ݿ�����
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
        // �ر����ݿ�����
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
