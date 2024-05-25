<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <script language="javascript">
        function realSysTime(clock) {
            var now = new Date();			//创建Date对象
            var year = now.getFullYear();	//获取年份
            var month = now.getMonth();	//获取月份
            var date = now.getDate();		//获取日期
            var day = now.getDay();		//获取星期
            var hour = now.getHours();	//获取小时
            var minu = now.getMinutes();	//获取分钟
            var sec = now.getSeconds();	//获取秒钟
            month = month + 1;
            var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
            var week = arr_week[day];		//获取中文的星期
            var time = year + "年" + month + "月" + date + "日 " + week + " " + hour + ":" + minu + ":" + sec;	//组合系统时间
            clock.innerHTML = "当前时间：" + time;	//显示系统时间
        }

        window.onload = function () {
            window.setInterval("realSysTime(clock)", 1000);	//实时获取并显示系统时间
        }
    </script>
</head>
<body>
<div id="clock"></div>
你的名字：
<%=new String(request.getParameter("name").getBytes("ISO8859_1"), "UTF-8") %><br/>
你的密码：
<%=new String(request.getParameter("password").getBytes("ISO8859_1"), "UTF-8") %><br/>
你的真实姓名：
<%=new String(request.getParameter("realName").getBytes("ISO8859_1"), "UTF-8") %><br/>
性别：
<%=new String(request.getParameter("sex").getBytes("ISO8859_1"), "UTF-8") %><br/>
你的爱好：
<%
    String[] hobby = request.getParameterValues("like");
    for (int i = 0; i < hobby.length; i++)
    {
%>
<%=new String(hobby[i].getBytes("ISO8859_1"), "UTF-8")%>

<%} %><br/>
你的E-mail：
<%=new String(request.getParameter("E-mail").getBytes("ISO8859_1"), "UTF-8") %><br/>
你的学院：
<%=new String(request.getParameter("a").getBytes("ISO8859_1"), "UTF-8") %><br/>
你的专业：
<%=new String(request.getParameter("b").getBytes("ISO8859_1"), "UTF-8") %><br/>
你的班级：
<%=new String(request.getParameter("c").getBytes("ISO8859_1"), "UTF-8") %><br/>
<br/>
<br/>

</body>
</html>