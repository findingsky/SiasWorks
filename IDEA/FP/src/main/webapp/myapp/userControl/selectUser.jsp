<%@ page import="org.example.pojo.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询用户</title>
</head>
<body>
    <h1>查询用户</h1>
    <br>
    <form action="selectUser" method="get">
        用户ID: <input type="text" name="uId" required><br>
        <input type="submit" value="查询">
    </form>
    <br>
    <%
        try {
            User user = (User) session.getAttribute("user");
            if (user != null) {
                %>
                <h2>用户信息</h2>
                <table border="1">
                    <tr>
                        <th>用户ID</th>
                        <th>用户名</th>
                        <!-- 其他需要显示的字段 -->
                    </tr>
                    <tr>
                        <td>${user.uId}</td>
                        <td>${user.username}</td>
                        <!-- 其他字段的显示 -->
                    </tr>
                </table>
                <br>
                <a href="userManagement.jsp">返回用户管理页面</a>
                <%
            } else {
                %>
                <p>用户不存在</p>
                <br>
                <a href="userManagement.jsp">返回用户管理页面</a>
                <%
            }
        } catch (Exception e) {
            e.printStackTrace();
            <p>查询失败</p>
            <br>
            <a href="userManagement.jsp">返回用户管理页面</a>
        }
    %>
</body>
</html>
