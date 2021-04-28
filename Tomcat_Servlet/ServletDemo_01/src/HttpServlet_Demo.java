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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求体数据，注意post才有请求体

        System.out.println(req.getContentType());
        //字符输入流
        BufferedReader br = req.getReader();

        //字节输入流，用于文件上传
//        ServletInputStream
        System.out.println("doo post");
        String line = null;
        System.out.println(br.readLine());
        while ( (line = br.readLine()) != null ) {
            System.out.println(line);
        }
       System.out.println(req.getParameter("username"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        // *获取请求行数据 (有更好的方式获取)
        System.out.println(request.getMethod());//请求方法
        System.out.println("=============请求方法==============");
        System.out.println(request.getQueryString());//请求参数
        System.out.println("=============请求参数==============");
        System.out.println(request.getContextPath());//请求虚拟目录
        System.out.println("=============请求虚拟目录==============");
        System.out.println(request.getRequestURI());//统一资源标识符
        System.out.println("============统一资源标识符===============");
        System.out.println(request.getRequestURL());//统一资源定位符
        System.out.println("=============统一资源定位符==============");
        System.out.println(request.getProtocol());//获取协议以及其版本
        System.out.println("============获取协议以及其版本===============");
        System.out.println(request.getRemoteAddr());//获取客户机IP
        System.out.println("============/获取客户机IP===============");


        // *获取请求头数据
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + "--" + value);
        }
    }
}
