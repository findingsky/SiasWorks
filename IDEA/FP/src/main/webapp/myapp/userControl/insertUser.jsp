<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <h1>添加用户</h1>
    <br>
    <form action="insertUser" method="post">
        用户ID: <input type="text" name="uId" required><br>
        用户名: <input type="text" name="username" required><br>
        <!-- 其他需要输入的字段 -->
        <input type="submit" value="添加">
    </form>
    <br>
    <%
        try {
            int result = (int) session.getAttribute("result");
            if (result > 0) {
                %>
                <p>添加成功</p>
                <br>
                <a href="userManagement.jsp">返回用户管理页面</a>
                <%
            } else {
                %>
                <p>添加失败</p>
                <br>
                <a href="userManagement.jsp">返回用户管理页面</a>
                <%
            }
        } catch (Exception e) {
            e.printStackTrace();
            <p>添加失败</p>
            <br>
            <a href="userManagement.jsp">返回用户管理页面</a>
        }
    %>
</body>
</html>
