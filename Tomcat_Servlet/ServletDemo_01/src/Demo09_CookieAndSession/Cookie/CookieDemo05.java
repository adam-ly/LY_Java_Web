package Demo09_CookieAndSession.Cookie;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieDemo05")
public class CookieDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //由于是输出给浏览器，所以要设置好相应的解析编码方式
        response.setContentType("text/html;charset=utf-8");

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
        sos.write(content.getBytes("utf-8"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
