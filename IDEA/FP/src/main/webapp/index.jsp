<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的主页</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 100%;
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        header {
            background-color: #f1f1f1;
            padding: 20px;
            text-align: center;
        }

        nav {
            display: flex;
            justify-content: space-around;
            background-color: #333;
            padding: 10px;
        }

        nav a {
            color: white;
            text-decoration: none;
            padding: 8px 16px;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }

        main {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }

        .card {
            background-color: white;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            margin: 16px;
            padding: 16px;
            text-align: center;
            width: 300px;
        }

        .card img {
            width: 100%;
            height: auto;
        }

        footer {
            background-color: #f1f1f1;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <header>
        <h1>核酸检测系统</h1>
    </header>
    <main>
        <div class="card">
            <img src="../../../../img.image1.png" alt="图片1">
            <h2><a href="reagents.jsp">试剂查询</a></h2>
        </div>
        <div class="card">
            <img src="image2.jpg" alt="图片2">
            <h2><a href="input.jsp">试剂入库</a></h2>
        </div>
        <div class="card">
            <img src="image3.jpg" alt="图片3">
            <h2><a href="output.jsp">试剂出库</a></h2>
        </div>
        <div class="card">
            <img src="image4.jpg" alt="图片4">
            <h2><a href="reagents.jsp">试剂统计</a></h2>
        </div>
        <div class="card">
            <img src="image5.jpg" alt="图片5">
            <h2><a href="user.jsp">用户管理</a>></h2>
        </div>
    </main>
    <footer>
    </footer>
</div>
</body>
</html>
