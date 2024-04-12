package sias1;

import java.sql.*;

public class MySQLJDBCConnectionDemo {
  public static void main(String[] args) {
    //�������ݿ����ӵ���������
    String driver = "org.gjt.mm.mysql.Driver";
    //����MySQL���ݿ�����ӵ�ַ
    String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
    //����������
    Connection conn = null;
    try{
      //ʹ��JDBC�����������ݿ�����
      Class.forName(driver);
      //ʹ��DriverManager���getConnection()������������,��һ���ַ����������û���,
      //�ڶ����ַ�������������
      conn = DriverManager.getConnection(url, "root", "root");
      if(conn != null){
        System.out.println("�ɹ�����JDBC����Դ.");
      }
    }catch(Exception ex){
      ex.printStackTrace();
    }
    try{
      //�ر����ݿ�������
      conn.close();
    }catch(Exception ex){
      ex.printStackTrace();
    }
  }
}
