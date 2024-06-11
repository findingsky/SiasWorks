<%@ page import="org.example.pojo.User" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<h1>用户信息</h1>
<table border="1">
    <tr>
        <th>用户ID</th>
        <th>用户名</th>
        <!-- 其他需要显示的字段 -->
    </tr>
    <tr>
        <%
            User user = (User) request.getAttribute("user");
        %>
        <td>${user.uId}</td>
        <td>${user.username}</td>

        <!-- 其他字段的显示 -->
    </tr>
</table>
<br>
<a href="selectUser.jsp">返回</a>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<h1>用户信息</h1>
<table>
    <tr>
        <th>用户ID</th>
        <td>${user.uId}</td>
    </tr>
    <tr>
        <th>用户名</th>
        <td>${user.username}</td>
    </tr>
    <tr>
        <th>密码</th>
        <td>${user.password}</td>
    </tr>
</table>
</body>
</html>
