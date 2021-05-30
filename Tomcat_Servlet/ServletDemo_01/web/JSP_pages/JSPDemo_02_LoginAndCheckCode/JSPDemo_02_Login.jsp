<%--
  Created by IntelliJ IDEA.
  User: 71703
  Date: 2021/5/22
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
         window.onload = function(){
            document.getElementById("img").onclick = function(){
                this.src="/Jsp_LoginCheckCodeDemo?time=" + Date();
            }
        }

    </script>
</head>
<body>
<form action="/Jsp_LoginDemo">
    <table>
        <tr>
            <td> 用户名 </td>
            <td> <input type="text" name="username" > </td>
        </tr>
        <tr>
            <td> 密码 </td>
            <td> <input type="text" name="password" > </td>
        </tr>
        <tr>
            <td> 验证码 </td>
            <td> <input type="text" name="checkcode" > </td>
        </tr>
        <tr>
            <td> <img src="/Jsp_LoginCheckCodeDemo" style="width: 100px;height: 50px;" id="img"> </td>
        </tr>
        <tr>
            <td> <input type="submit" value="登录" > </td>
        </tr>
    </table>
</form>
<div> <%= request.getAttribute("cc_error") == null ? "" : request.getAttribute("cc_error") %> </div>

</body>
</html>
