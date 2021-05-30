package Demo09_CookieAndSession.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemo03")
public class CookieDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //通过能够获取cookie数组便知道,可以发送多个cookie，默认情况下，浏览器关闭后cookie会被清空掉

        //1、创建Cookie
        Cookie cookie1 = new Cookie("msg","hello");
        Cookie cookie2 = new Cookie("name","张三");

        //2、发送多个cookie
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
