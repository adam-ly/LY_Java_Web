<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Demo10_JSP.Servlet.LoginDemo.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/29
  Time: 12:45
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
    list.add(new User(4,"小明",new Date()));
    list.add(new User(1,"小红",new Date()));
    list.add(new User(2,"小黑",new Date()));
    list.add(new User(6,"小白",new Date()));
    list.add(new User(7,"小狗",new Date()));
    request.setAttribute("list",list);
%>

<table border="1px" align="center">
    <th>编号</th>
    <th>年龄</th>
    <th>姓名</th>
    <th>生日</th>
    <c:forEach items="${list}" var="user" varStatus="s">
        <tr>
            <td> ${s.count} </td>
            <td> ${user.age} </td>
            <td> ${user.name} </td>
            <td> ${user.birthDay} </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
