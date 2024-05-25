package db;

import java.sql.*;

public class Database1
{
    String driver = "org.gjt.mm.mysql.Driver";
    //����MySQL���ݿ�����ӵ�ַ
    String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
    //����������
    Connection conn = null;


    public Connection getConn()
    {
        try
        {
            //ʹ��JDBC�����������ݿ�����
            Class.forName(driver);
            //ʹ��DriverManager���getConnection()������������,��һ���ַ����������û���,
            //�ڶ����ַ�������������
            conn = DriverManager.getConnection(url, "root", "root");
            if (conn != null)
            {
                System.out.println("�ɹ�����JDBC����Դ.");
                return conn;
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return conn;
    }


    public Statement getStatement()
    {
        Statement stmt = null;
        conn = getConn();
        try
        {
            stmt = conn.createStatement();
            return stmt;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return stmt;
    }


}
