<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>核酸检测试剂操作</title>
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
    <h1>核酸检测试剂操作</h1>
    <form action="ReagentsServiceImpl" method="post">
        <table>
            <tr>
                <th>试剂ID</th>
                <td><input type="text" name="rId" required></td>
            </tr>
            <tr>
                <th>试剂名称</th>
                <td><input type="text" name="rName" required></td>
            </tr>
            <tr>
                <th>试剂类型</th>
                <td><input type="text" name="rType" required></td>
            </tr>
            <tr>
                <th>试剂生产厂商</th>
                <td><input type="text" name="rFactory" required></td>
            </tr>
            <tr>
                <th>试剂库存</th>
                <td><input type="number" name="rStock" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="保存">
                    <input type="reset" value="重置">
                </td>
            </tr>
