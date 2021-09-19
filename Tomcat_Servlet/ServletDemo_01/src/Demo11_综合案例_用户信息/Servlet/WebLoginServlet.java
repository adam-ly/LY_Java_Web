package Demo11_综合案例_用户信息.Servlet;

import Demo11_综合案例_用户信息.Model.User;
import Demo11_综合案例_用户信息.Service.UserService;
import Demo11_综合案例_用户信息.Service.UserServiceInterface;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/WebLoginServlet")
public class WebLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1、设置编码
        response.setCharacterEncoding("utf-8");

        //2、获取数据
        String checkCode = request.getParameter("checkcode");

        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");//确保验证码一次性

        //不一致
        if (!checkcode_server.equalsIgnoreCase(checkCode)){
            //1、传递登录错误信息
            request.setAttribute("login_msg","验证码错误");
            //2、转发请求到登陆页面
            request.getRequestDispatcher("/Login.jsp").forward(request,response);

            return;
        }

        //验证码正确，查询用户是否存在

        //直接转成map 通过 javabean转成model
        Map<String,String[]> map = request.getParameterMap();

        //3、封装User对象
        User user = new User();
        try {
            // 通过beantils将 map 的keyvalue 赋值给 user
            BeanUtils.populate(user, map);
        }catch (IllegalAccessException e){
            System.out.println(e);
        }catch (InvocationTargetException e){
            System.out.println(e);
        }
        //4、查询对象
        UserServiceInterface service = new UserService();
        User loginUser = service.login(user);

        if (loginUser != null){ // 登录成功
            //保存用户到session中
            session.setAttribute("user",loginUser);
            //跳转页面
            response.sendRedirect(request.getContextPath() + "/综合案例/page/WebIndex.jsp");
        }else{ //登录失败
            //1、传递登录错误信息
            request.setAttribute("login_msg","用户名或密码错误");
            //2、转发请求到登陆页面
            request.getRequestDispatcher("/综合案例/page/Login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
