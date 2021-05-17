package Demo03_转发和重定向;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * 请求转发: 一种在资源内部跳转的方法
 * 优点：1、浏览器地址路径不需要改变
 *      2、只能转发到当前服务器的内部资源中
 *      3、转发是一次请求
 * 共享数据：在转发请求体的时候，给request添加新的数据
 * 1、域对象：代表一次请求的范围，可在范围内共享数据，即范围内的servlet都可以访问添加的数据
 * 2、request域：一般用于请求转发的多个资源中共享数据。
 * 方法：
 *   setAttribute、getAttribute、removeAttribute
 *
 */
@WebServlet("/HttpServletDemo_Forward")
public class HttpServletDemo_Forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");

        //共享数据
        req.setAttribute("newObject","obj");

        //获取请求转发对象,传入要转发的目的路径。因为是访问内部资源，所以不需要填写虚拟目录（如果有），
        req.getRequestDispatcher("/HttpServletDemo_Target").forward(req,resp);

        req.getServletContext();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
