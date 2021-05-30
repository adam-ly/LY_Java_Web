<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/22
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="../ErrorPage.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <%
     /**案例：记住上一次的访问时间
      * 1. 访问一个Servlet，如果是第一次访问，则提示：您好，欢迎您首次访问。
      * 2. 如果不是第一次访问，则提示：欢迎回来，您上次访问时间为:显示时间字符串
      */

     boolean isFirstTime = true;
     Cookie[] cookies = request.getCookies();
     if (cookies != null && cookies.length > 0){
         for (Cookie cookie : cookies){
             if (cookie.getName().equals("hasLogin")){
                 isFirstTime = false;
                 break;
             }
         }
     }

     if (isFirstTime){
         Cookie cookie = new Cookie("hasLogin","hasLogin");
         //可以在这里setMaxAge设置存活时间,每次访问都刷新一次。
         cookie.setMaxAge( 3600 * 24 );//一天
         response.addCookie(cookie);
     }
     System.out.println("isfirstTime - " + (isFirstTime?"yes":"no"));
     ServletOutputStream sos = response.getOutputStream();
     String time = (new SimpleDateFormat("YYYY年MM月d日 HH:mm:ss")).format(new Date());
     String content = isFirstTime ? "您好，欢迎您首次访问。" : ("欢迎回来，您上次访问时间为:" + time);
     content = "<h1>" + content + "</h1>";
     <%=content%>
 %>
</body>
</html>
