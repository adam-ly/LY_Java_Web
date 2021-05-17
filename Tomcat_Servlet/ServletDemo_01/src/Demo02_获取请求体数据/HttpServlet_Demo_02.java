package Demo02_获取请求体数据;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* 介绍通用获取请求参数的方式，同时适用于Get和Post
* */

@WebServlet("/HttpServlet_Demo_02")
public class HttpServlet_Demo_02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //乱码处理，tomcat没有为post方法左乱码处理
        req.setCharacterEncoding("utf-8");

        // 获取请求参数通用方式，可以适用于get和post，不需要区分
//        1. String getParameter(String name):根据参数名称获取参数值    username=zs&password=123
//        2. String[] getParameterValues(String name):根据参数名称获取参数值的数组  hobby=xx&hobby=game
//        3. Enumeration<String> getParameterNames():获取所有请求的参数名称
//        4. Map<String,String[]> getParameterMap():获取所有参数的map集合

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //乱码处理、tomcat8以上已经将get方式的乱码问题解决
    }
}

