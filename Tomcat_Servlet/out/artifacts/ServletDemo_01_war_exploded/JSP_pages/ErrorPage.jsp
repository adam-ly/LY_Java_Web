<%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/22
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>

<h1> 服务器内部出错。。 </h1>


 //设置isErrorPage为true，那么该页面可以显示excption信息
<%
    String message = exception.getMessage();
    out.print(message);
%>


</body>
</html>
