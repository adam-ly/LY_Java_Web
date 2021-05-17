package Demo09_CookieAndSession.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemo02")
public class CookieDemo02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //发送cookie后，在不同浏览器访问Demo02，只有接收到cookie的浏览器发起的请求才带有cookie

        //获取Cookie
        Cookie[] cookies = req.getCookies();
        if (cookies == null) return;
        for (Cookie cookie : cookies){
            System.out.println("getValue = "   + cookie.getValue());
            System.out.println("getComment = " + cookie.getComment());
            System.out.println("getDomain = "  + cookie.getDomain());
            System.out.println("getName = "    + cookie.getName());
            System.out.println("getPath = "    + cookie.getPath());
            System.out.println("getVersion = " + cookie.getVersion());
            System.out.println("getMaxAge = "  + cookie.getMaxAge());
            System.out.println("getClass = "   + cookie.getClass());
            System.out.println("====================================");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
