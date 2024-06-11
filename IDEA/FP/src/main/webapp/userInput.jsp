<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>核酸检测用户操作</title>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
    <h1>核酸检测用户注册</h1>
    <form action="../userInput" method="post">
        <table>
            <tr>
                <th>用户ID</th>
                <td><input type="text" name="uId" required></td>
            </tr>
            <tr>
                <th>用户名</th>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <th>密码</th>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <th>邮箱</th>
                <td><input type="email" name="email" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="保存">
                    <input type="reset" value="重置">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
