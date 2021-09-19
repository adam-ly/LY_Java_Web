package Demo11_综合案例_用户信息.Servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("pragma","no-cache");
        resp.setHeader("cache-control","no-cache");
        resp.setHeader("expire","0");

        int witdh = 80;
        int height = 30;

        //1、创建图片对象
        BufferedImage image = new BufferedImage(witdh,height,BufferedImage.TYPE_INT_BGR);

        //2、填充颜色
        Graphics g = image.getGraphics();
        g.setColor(Color.green);
        g.fillRect(0,0,witdh,height);

        //3、画边框
        g.setColor(Color.red);
        g.setFont(new Font("黑体",Font.BOLD,24));
        g.fillRect(1,1,witdh-2,height-2);
        g.setColor(Color.yellow);
        String code = getcheckCode();
        g.drawString(code,15,25);

        HttpSession session = req.getSession();
        session.setAttribute("CHECKCODE_SERVER",code);

        //4.将图片输出到页面展示
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }

    private String getcheckCode(){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789";
        //生成随机角标
        Random ran = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 4; i++){
            int index = ran.nextInt(str.length());
            char ch = str.charAt(index);
            sb.append(ch);
        }
        return sb.toString();
    }
}
