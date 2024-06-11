<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.pojo.Reagents" %>
<%@ page import="org.example.service.ReagentsService" %>
<%@ page import="org.springframework.stereotype.Controller" %>
<%@ page import="org.springframework.web.bind.annotation.RequestMapping" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %>
<!DOCTYPE html>
<html>
<head>
    <title>试剂信息</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>试剂信息</h1>
    <table border="1">
        <tr>
            <th>试剂ID</th>
            <th>试剂工厂</th>
        </tr>
        <c:forEach items="${reagents}" var="r">
            <tr>
                <td>${r.rId}</td>
                <td>${r.rFactory}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
