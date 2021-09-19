<%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/30
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <title>登录</title>

    <%--bootstrap css样式--%>
    <link rel="stylesheet" href="../CSS/bootstrap-3.4.1-dist/css/bootstrap.min.css">
    <%--jquery--%>
    <script src="../js/jquery-2.1.0.min.js"></script>
    <%--boostrap js--%>
    <script src="../CSS/bootstrap-3.4.1-dist/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        function refreshCode(){
            var code_img = document.getElementById("vcode");
            code_img.src="${pageContext.request.contextPath}/CheckCodeServlet?time=" + new Date().getTime();
        }
    </script>

</head>
<body>

<div class="container" style="width: 320px">

    <form action="${pageContext.request.contextPath}/WebLoginServlet">
        <h3 class="text-center"> 管理员登陆 </h3>
        <div class="form-group" style="margin-top: 5px">
            <label for="username">用户名：</label>
            <input name="account" type="email" class="form-control" id="username" placeholder="请输入用户名">
        </div>
        <div class="form-group">
            <label for="password">密码：</label>
            <input name="password" type="password" class="form-control" id="password" placeholder="请输入密码">
        </div>
        <div class="form-group form-inline">
            <label for="checkcode">验证码: </label>
            <input name="checkcode" type="text" id="checkcode" placeholder="请输入验证码" style="width: 100px">
            <a href="javascript:refreshCode();">
                <img style="width: 80px;height: 30px" src="${pageContext.request.contextPath}/CheckCodeServlet" title="看不清重新刷新" id="vcode"/>
            </a>
        </div>
        <hr/>
        <div class="form-group text-center" >
            <button type="submit" class="btn btn-primary">登录</button>
        </div>
    </form>

</div>

</body>
</html>
