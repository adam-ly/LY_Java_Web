package Lesson_08_文件下载_08;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/DownloadDemo")
public class DownloadDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、获取请求参数、文件名称
        String fileName = req.getParameter("filename");
        //2、使用字节输入流加载文件进内存
        ServletContext context = req.getServletContext();
        String realPath = context.getRealPath("/img/"+fileName);

        FileInputStream inputStream = new FileInputStream(realPath);

        //3、设置响应头
        String mimeType = context.getMimeType(fileName);
        resp.setContentType(fileName);

        //解决中文文件名问题
//        //1、获取user-agent请求头
//        String agent = req.getHeader("user-agent");
//        //2、

        //Content-disposition 是 MIME 协议的扩展，MIME 协议指示 MIME 用户代理如何显示附加的文件。
        //Content-Disposition为属性名disposition-type是以什么方式下载,attachment是指附件方式下载
        //实例：("Content-Disposition","attachment;filename=FileName.txt");
        resp.setHeader("content-disposition","attachment;filename="+fileName);

        ServletOutputStream sos = resp.getOutputStream();
        byte[] buff = new byte[1024*8];
        int len = 0;
        while ( (len = inputStream.read(buff)) != -1){
            sos.write(buff,0,len);
        }
        inputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
    }
}
