<%@ page import="Demo10_JSP.Servlet.LoginDemo.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/28
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setAge(20);
    user.setName("张三");
    user.setBirthDay(new Date());

    request.setAttribute("user",user);

    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list",list);

    Map map = new HashMap();
    map.put("sname","李四");
    map.put("gender","男");
    request.setAttribute("map",map);

%>

<h3>获取对象的值</h3>
${ requestScope.user } <br>
${ requestScope.user.name } <br>
${ requestScope.user.age } <br>
${ requestScope.user.birthDay } <br>

<h3> 获取list集合的值 </h3>
${list}<br>
${list[0]}<br>
list越界也不会显示错误或者闪退：${list[5]}<br>
${list[2].name};

<h3> 获取map集合的值 </h3>
写法1：${map.gender}<br>
写法2：${map["gender"]}<br>
</body>
</html>
