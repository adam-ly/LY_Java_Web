<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/28
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List list = new ArrayList();
    request.setAttribute("list",list);

%>

<h3> cif 没有else条件 只能再写一个cif去判断另外的情况 </h3>
<c:if test="${not empty list}">
    list 不为空
</c:if>


</body>
</html>
