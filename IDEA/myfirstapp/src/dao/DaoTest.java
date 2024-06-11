package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoTest {
	Connection con;
	Statement stmt;
	ResultSet rs;

	public Connection getCon() {
		return con;
	}

	public Statement getStmt() {
		return stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public DaoTest(Connection con) {//构造函数
		this.con = con;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void createTable() throws SQLException {
		stmt.executeUpdate("DROP TABLE IF EXISTS `jdbc_test` ");//删除相同名称的表
		String sql = "create table jdbc_test(id int,name varchar(100)) ";
		stmt.executeUpdate(sql);//执行SQL
		System.out.println("jdbc_test表创建完毕");
	}

	public void insert() throws SQLException {
		String sql1 = "insert into jdbc_test values(1,'tom') ";
		String sql2 = "insert into jdbc_test values(2,'张三') ";
		String sql3 = "insert into jdbc_test values(3,'999') ";
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);
		int[] results = stmt.executeBatch();//批量运行sql，返回1，1，1
		for (int i = 0; i < results.length; i++) {
			System.out.println("第" + (i + 1) + "次插入返回" + results[0] + "条结果");
		}
	}

	public void select() throws SQLException {
		String sql = "select id,name from jdbc_test ";
		rs = stmt.executeQuery(sql);
		System.out.println("---数据库查询的结果----");
		System.out.println("id\tname");
		System.out.println("---------------------");
		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			System.out.print(id + "\t" + name+"\n");
		}
	}

	public static void main(String[] args) {
		Connection con = JDBCUtil.getConnection();
		DaoTest dao = new DaoTest(con);
		try {
			dao.createTable();
			dao.insert();
			dao.select();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(dao.getRs(), dao.getStmt(), dao.getCon());
		}
	}

}
