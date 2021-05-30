package Demo10_JSP.Servlet.LoginDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Jsp_LoginDemo")
public class Jsp_LoginDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkcode = request.getParameter("checkcode");

        Object obj = request.getSession().getAttribute("check_code");
        if (obj.equals(checkcode)){
            //correct
            System.out.println("验证码正确");
            //通过SQL判断账号密码是否相同，详细就不写了

            String path = request.getContextPath() + "/JSP_pages/JSPDemo_02_LoginAndCheckCode/JSPDemo_02_LoginSuccess.jsp";
            System.out.println(path);
            response.sendRedirect(path);

        }else{
            System.out.println("验证码错误");
            //fail
             request.setAttribute("cc_error","验证码错误");
             String path = "/JSP_pages/JSPDemo_02_LoginAndCheckCode/JSPDemo_02_Login.jsp";
             request.getRequestDispatcher(path).forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
