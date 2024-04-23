package db;
import java.sql.*;

public class Database1 {
	 String driver = "org.gjt.mm.mysql.Driver";
	    //定义MySQL数据库的联接地址
	    String url = "jdbc:mysql://localhost:3306/sias1?user='root';password='root'";
	    //声明联接类
	    Connection conn = null;
	
	
	
	public  Connection   getConn() {
		try{
		      //使用JDBC技术创建数据库联接
		      Class.forName(driver);
		      //使用DriverManager类的getConnection()方法建立联接,第一个字符参数定义用户名,
		      //第二个字符参数定义密码
		      conn = DriverManager.getConnection(url, "root", "root");
		      if(conn != null){
		        System.out.println("成功联接JDBC数据源.");
		        return conn;
		      }
		    }catch(Exception ex){
		      ex.printStackTrace();
		    }
		 return conn;
	}
	
	
	
	
	public   Statement     getStatement() {
		Statement stmt=null;
		conn=getConn();
		try {
		 stmt=conn.createStatement();
		return stmt;
		}catch(SQLException ex){
		      ex.printStackTrace();
		    }
		
		return stmt;
	}
	

}
