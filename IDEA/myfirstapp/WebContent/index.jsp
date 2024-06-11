<%@ page language="java" import="java.sql.*,dao.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

Connection con = JDBCUtil.getConnection();
DaoTest dao = new DaoTest(con);
Statement stmt=dao.getStmt();
String sql = "select id,name from jdbc_test ";
ResultSet rs = stmt.executeQuery(sql);
out.println("---数据库查询的结果----");
out.println("<br/>");
out.println("id\tname");
out.println("<br/>");
out.println("---------------------");
out.println("<br/>");
while (rs.next()) {
	String id = rs.getString("id");
	String name = rs.getString("name");
	out.print(id + "\t" + name+"\n");
	out.println("<br/>");
}

%>
</body>
</html>
