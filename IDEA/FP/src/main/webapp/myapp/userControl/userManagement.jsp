<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
</head>
<body>
    <h1>用户管理</h1>
    <br>
    <form action="selectUser.jsp" method="get">
        用户ID: <input type="text" name="uId" required><br>
        <input type="submit" value="查询用户">
    </form>
    <br>
    <form action="insertUser.jsp" method="post">
        用户ID: <input type="text" name="uId" required><br>
        用户名: <input type="text" name="username" required><br>
        <!-- 其他字段的输入 -->
        <input type="submit" value="添加用户">
    </form>
    <br>
    <form action="deleteUser.jsp" method="post">
        用户ID: <input type="text" name="uId" required><br>
        <input type="submit" value="删除用户">
    </form>
</body>
</html>
