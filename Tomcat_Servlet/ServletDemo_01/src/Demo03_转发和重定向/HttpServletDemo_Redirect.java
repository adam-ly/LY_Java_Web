package 转发和重定向_03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HttpServletDemo_Redirect")
public class HttpServletDemo_Redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /** 方法 1 */
        //1、设置响应状态码302
//        resp.setStatus(302);
          //2、设置响应头location
//        resp.setHeader("location","HttpServletDemo_Target");


        //使用动态虚拟目录，防止本地修改目录后导致客户端访问出错
        String context = req.getContextPath();
        System.out.println(context);

        /** 方法 2 */
        //2、使用重定向方法（重定向是两次请求），因为重定向算是新的请求，也是有由客户端发起，所以需要填写虚拟路径（如果有）
        resp.sendRedirect("HttpServletDemo_Target");
        //重定向可以访问外部资源
//        resp.sendRedirect("https://www.baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
}
