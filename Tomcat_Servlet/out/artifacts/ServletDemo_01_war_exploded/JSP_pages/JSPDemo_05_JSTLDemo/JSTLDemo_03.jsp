<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/29
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foreach</title>
</head>
<body>
<%--
    foreach:相当于java代码的for语句
        1. 完成重复的操作
            for(int i = 0; i < 10; i ++){ }
            * 属性：
                begin：开始值
                end：结束值
                var：临时变量
                step：步长
                varStatus:循环状态对象
                index:容器中元素的索引，从0开始
                count:循环次数，从1开始
        2. 遍历容器
            List<User> list;
            for(User user : list){

            }
            * 属性：
                items:容器对象
                var:容器中元素的临时变量
                varStatus:循环状态对象
                    index:容器中元素的索引，从0开始
                    count:循环次数，从1开始
--%>
<%
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    request.setAttribute("list",list);
%>

<c:forEach begin="0" end="13" step="2" var="i" varStatus="bb" >
   i: ${i} index: ${bb.index} count: ${bb.count}<br>
</c:forEach>
<c:forEach items="${list}" var="str" varStatus="s">
    index: ${s.index} count: ${s.count} content: ${str} <br>
</c:forEach>

</body>
</html>
