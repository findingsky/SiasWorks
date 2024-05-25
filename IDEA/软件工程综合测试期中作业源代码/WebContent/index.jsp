<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <script language="javascript">
        function checkRealName() {
            var str = form1.realName.value;			//获取输入的真实姓名
            if (str == "") {		//当真实姓名为空时
                alert("请输入真实姓名！");
                form1.realName.focus();
                return;
            } else {				//当真实姓名不为空时
                var objExp = /[\u4E00-\u9FA5]{2,}/;	//创建RegExp对象
                if (objExp.test(str) == true) {		//判断是否匹配
                    alert("您输入的真实姓名正确！");
                } else {
                    alert("您输入的真实姓名不正确！");
                }
            }
        }
    </script>
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
<form action="result.jsp" method="post">
    用户名：<input type="text" name="name"/><br/>
    密 &nbsp&nbsp码:<input type="password" name="password" size="22"><br>
    确认密码 ：<input type="text" name="repassword"/><br/>
    请输入真实姓名：<input name="realName" type="text" id="realName">
    <input name="Button" type="button" onClick="checkRealName()" value="检测"><br>
    性&nbsp&nbsp别：
    <input name="sex" type="radio" value="男"/>男
    <input name="sex" type="radio" value="女"/>女<br/>

    爱&nbsp&nbsp 好：
    <div style="width:400px">
        <input name="like" type="checkbox" value="唱歌跳舞"/>唱歌跳舞
        <input name="like" type="checkbox" value="上网冲浪"/>上网冲浪
        <input name="like" type="checkbox" value="户外登山"/>户外登山<br/>
        <input name="like" type="checkbox" value="体育运动"/>体育运动
        <input name="like" type="checkbox" value="读书看报"/>读书看报
        <input name="like" type="checkbox" value="欣赏电影"/>欣赏电影
    </div>
    E-mail： <input type="text" name="E-mail"/><br/>
    学&nbsp&nbsp院： <input type="text" name="a"/>
    专&nbsp&nbsp业： <input type="text" name="b"/>
    班&nbsp&nbsp级： <input type="text" name="c"/><br/>
    个人简历： <input type="text" name="简历"/><br/>
    <input type="submit" value="提交"/>
    <input type="reset" name="reset" value="重新填写">
</form>
</body>
</html>