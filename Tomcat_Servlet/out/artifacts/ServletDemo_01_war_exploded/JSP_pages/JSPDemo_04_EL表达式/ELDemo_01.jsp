<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/23
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title</title>
</head>
<body>
<P> EL表达式 </P>
    ${ 3 > 4 };
    \${ 3 > 4 };

<p> EL运算符 </p>
<h3>算数运算符</h3>
   ${3 + 4}<br>
   ${3 / 4}<br>
   ${3 div 4}<br>
   ${3 % 4}<br>
   ${3 mod 4}<br>
<h3>比较运算符</h3>
   ${3 == 4}<br>

<h3>逻辑运算符</h3>
   ${3 > 4  && 3 < 4}<br>
   ${3 > 4  and 3 < 4}<br>

<h4>empty运算符</h4>
   <%
       String str = "";
       ArrayList list = new ArrayList();
   %>
${not empty str};
${not empty list};
</body>
</html>
