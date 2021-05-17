package 设置Serverlet虚拟路径的几种方法_01;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//使用注解配置urlParttern

//1、设置虚拟路径,如果只有一个值可以省略urlPatterns
//@WebServlet("/Servlet_3_Demo_01")

//2、多层路径
//@WebServlet("/Servlet_3_Demo_01/demo_01")

//3、设置任意路径，*号表示任意访问路径，随便写一个路径名(可以为空)都能访问，
// 但是它的优先级最低，如果刚好输入的随机路径存在，会先访问对应的servlet
//@WebServlet("/Servlet_3_Demo_01/*")

//4、设置路径后缀
@WebServlet("/adb.do")

public class Servlet_3_Demo implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {}
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       System.out.println("Servlet_3_Demo_01 Service......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
