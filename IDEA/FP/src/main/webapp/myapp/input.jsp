<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>核酸检测试剂入库单</title>
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
<h1>核酸检测试剂入库单</h1>
<form action="../input" method="post">
    <table>
        <tr>
            <th>试剂ID</th>
            <td><input type="text" name="riId" required></td>
        </tr>
        <tr>
            <th>试剂生产厂商</th>
            <td><input type="text" name="rFactory" required></td>
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
