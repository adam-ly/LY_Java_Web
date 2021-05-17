package Demo02_获取请求体数据;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;


@WebServlet("/HttpServlet_Demo")
public class HttpServlet_Demo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求体数据，注意post才有请求体
        req.setCharacterEncoding("utf-8");
        System.out.println(req.getContentType());

        //req在这里只能用其中一种方法去获取参数值，比如获取map之后再获取字符输入流或获取不到，猜想可能底层都是通过获取流，
        //流读完就没了
        
        //1、获取所有参数的map集合
        Map<String,String[]> parameterMap = req.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for (String name: keySet) {
            String[] values = parameterMap.get(name);
            for (String value: values) {
                System.out.println(value);
            }
            System.out.println("-------------------------");
        }

        //2、字符输入流
//        BufferedReader br = req.getReader();
//        System.out.println(br.readLine() + "-- " + req.getParameter("username"));
//        //字节输入流，用于文件上传
//        String line = null;
//        while ( (line = br.readLine()) != null ) {
//            System.out.println(line);
//        }
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
