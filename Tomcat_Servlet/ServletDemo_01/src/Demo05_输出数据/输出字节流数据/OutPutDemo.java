package 输出数据_05.输出字节流数据;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/OutPutDemo")
public class OutPutDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8;");
        //字节流一般用来输出图片之类的数据
        ServletOutputStream sos = resp.getOutputStream();
        sos.write("你好 hello".getBytes("utf-8"));

    }
}
