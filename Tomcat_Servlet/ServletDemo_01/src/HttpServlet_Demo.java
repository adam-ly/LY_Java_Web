import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/HttpServlet_Demo")
public class HttpServlet_Demo extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求体数据，注意post才有请求体

        //字符输入流
        BufferedReader br = request.getReader();

        //字节输入流，用于文件上传
//        ServletInputStream

        String line = null;
        while ( (line = br.readLine()) != null ) {
            System.out.println(line);
        }
        request.getParameter("");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(request, resp);

        System.out.println(request.getMethod());//请求方法
        System.out.println(request.getQueryString());//请求参数
        System.out.println(request.getContextPath());//请求虚拟目录
        System.out.println(request.getRequestURI());//统一资源标识符
        System.out.println(request.getRequestURL());//统一资源定位符
        System.out.println(request.getProtocol());//获取协议以及其版本
        System.out.println(request.getRemoteAddr());//获取客户机IP

        // *获取请求头数据
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + "--" + value);
        }
    }
}
