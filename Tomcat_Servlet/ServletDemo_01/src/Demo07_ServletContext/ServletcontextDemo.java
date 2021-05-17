package Demo07_ServletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletcontextDemo")
public class ServletcontextDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //ServletContext的两种获取方式，它是一个单利对象
        ServletContext context1 = req.getServletContext();
        ServletContext context2 = this.getServletContext();
        System.out.println(context1 == context2);

        //获取MIME类型
        String fileName = "a.jpg";
        String mimeType = context1.getMimeType(fileName);
        System.out.println(mimeType);

        //域类型:设置之后，后面请求到其他servlet中都可以一直获取到了。
        //因为servletcontext的生命周期跟服务器一致，并且是个单例。
        context1.setAttribute("name","adam");

        //获取文件的服务器路径,
        String realPath = context1.getRealPath("/a.txt");
        System.out.println(realPath);

        //b文件的获取方式
        String b_path = context1.getRealPath("/WEB-INF/b.txt");
        System.out.println(b_path);

        //c文件的获取方式，打包时src下面的java文件会被编译成class文件然后放到WEB-INF的classes目录
        String c_path = context1.getRealPath("WEB-INF/classes/ServletContext_07/c.txt");
        System.out.println(c_path);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
