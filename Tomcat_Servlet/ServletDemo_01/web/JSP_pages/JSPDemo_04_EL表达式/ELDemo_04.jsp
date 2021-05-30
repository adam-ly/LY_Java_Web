<%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/28
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>隐式对象</title>
</head>
<body>
<%
   String path = request.getContextPath();
%>
    ${path};<br>
    ${pageContext.request}<br>
    ${pageContext.request.servletPath}<br>
    ${pageContext.request.contextPath}<br>

</body>
</html>
