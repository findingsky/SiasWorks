<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
    <h1>删除用户</h1>
    <br>
    <form action="deleteUser" method="post">
        用户ID: <input type="text" name="uId" required><br>
        <input type="submit" value="删除">
    </form>
    <br>
    <%
        try {
            int result = (int) session.getAttribute("result");
            if (result > 0) {
                %>
                <p>删除成功</p>
                <br>
                <a href="userManagement.jsp">返回用户管理页面</a>
                <%
            } else {
                %>
                <p>删除失败</p>
                <br>
                <a href="userManagement.jsp">返回用户管理页面</a>
                <%
            }
        } catch (Exception e) {
            e.printStackTrace();
            <p>删除失败</p>
            <br>
            <a href="userManagement.jsp">返回用户管理页面</a>
        }
    %>
</body>
</html>
