package Demo05_输出数据.输出字符流数据;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/OutputCharDemo")
public class OutputCharDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //字符流一般用来输出文字内容的数据

        //在获取输出流之前设置才有效，告诉客户端当前的编码格式，浏览器自然会选择相应的解码
        resp.setContentType("text/html;charset=utf-8");

        //1、获取字符输出流
        PrintWriter pw = resp.getWriter();
        //2、输出数据
//        pw.write("<h1>hello response</h1>");
        pw.write("你好 <h1>hello response</h1>");
    }
}
