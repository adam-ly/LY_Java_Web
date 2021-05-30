<%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/28
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中的数据</title>
</head>
<body>
<%
    session.setAttribute("name","hehe");

    //
    request.setAttribute("name","张三");
    session.setAttribute("age","23");
%>

<h3> el获取域的值 </h3>
<ol>
    <li>pageScope		--> pageContext </li>
    <li>requestScope 	--> request </li>
    <li>sessionScope 	--> session </li>
    <li>applicationScope --> application（ServletContext）</li>
</ol>

${requestScope.name}
${sessionScope.age}

<h3 style="color: red"> 如果值为空，那么显示空字符串，不像原本的out一样会输出null </h3>
${requestScope.haha}


<h3> 从最小的域中一次查找对应的值，找到就停止,可以看到，
     从最小的pageScode域打印出name，而session的name没有被打印</h3>
${name}

</body>
</html>
