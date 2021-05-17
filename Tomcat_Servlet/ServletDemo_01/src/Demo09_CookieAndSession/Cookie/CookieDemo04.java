package Demo09_CookieAndSession.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemo04")
public class CookieDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、创建Cookie
        Cookie cookie1 = new Cookie("msg","CookieDemo04_cookieMsg");

        /**设置cookie的存活时间
           setMaxAge(int seconds)
        1、正数：将cookie数据写入到硬盘中。进行持久化存储，seconds代表存活时间
        2、负数：默认值，客户端关闭后删除
        3、零：删除Cookie信息
        * */
        cookie1.setMaxAge(0);


        //2、发送cookie
        response.addCookie(cookie1);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
