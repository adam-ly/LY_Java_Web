package Demo01_设置Serverlet虚拟路径的几种方法;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo implements Servlet {

    //普通的Servlet配置，在web.xml中配置

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
