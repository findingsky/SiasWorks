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

	public DaoTest(Connection con) {//���캯��
		this.con = con;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void createTable() throws SQLException {
		stmt.executeUpdate("DROP TABLE IF EXISTS `jdbc_test` ");//ɾ����ͬ���Ƶı�
		String sql = "create table jdbc_test(id int,name varchar(100)) ";
		stmt.executeUpdate(sql);//ִ��SQL
		System.out.println("jdbc_test�������");
	}

	public void insert() throws SQLException {
		String sql1 = "insert into jdbc_test values(1,'tom') ";
		String sql2 = "insert into jdbc_test values(2,'����') ";
		String sql3 = "insert into jdbc_test values(3,'999') ";
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);
		int[] results = stmt.executeBatch();//��������sql������1��1��1
		for (int i = 0; i < results.length; i++) {
			System.out.println("��" + (i + 1) + "�β��뷵��" + results[0] + "�����");
		}
	}

	public void select() throws SQLException {
		String sql = "select id,name from jdbc_test ";
		rs = stmt.executeQuery(sql);
		System.out.println("---���ݿ��ѯ�Ľ��----");
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
