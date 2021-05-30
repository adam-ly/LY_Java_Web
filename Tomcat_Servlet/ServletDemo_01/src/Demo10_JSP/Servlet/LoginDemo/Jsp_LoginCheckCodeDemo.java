package Demo10_JSP.Servlet.LoginDemo;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Jsp_LoginCheckCodeDemo")
public class Jsp_LoginCheckCodeDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int witdh = 200;
        int height = 50;

        //1、创建图片对象
        BufferedImage image = new BufferedImage(witdh,height,BufferedImage.TYPE_INT_BGR);

        //2、填充颜色
        Graphics g = image.getGraphics();
        g.setColor(Color.green);
        g.fillRect(0,0,witdh,height);

        //3、画边框
        g.setColor(Color.pink);
        g.fillRect(1,1,witdh-2,height-2);


        g.setColor(Color.black);
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789";
        //生成随机角标
        Random ran = new Random();
        StringBuilder builde = new StringBuilder();
        for (int i = 1; i <= 4; i++){
            int index = ran.nextInt(str.length());
            char ch = str.charAt(index);
            // +"" 是将char转为string
            g.drawString(ch+"",witdh/5*i,height/2);
            System.out.println(ch+"");
            builde.append(ch);
        }
        String check_code = builde.toString();
        req.getSession().setAttribute("check_code",check_code);

        //干扰线
        g.setColor(Color.yellow);
        //随机生成坐标点

        for (int i = 0; i < 10; i++) {
            int x1 = ran.nextInt(witdh);
            int x2 = ran.nextInt(witdh);

            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }
        //3.将图片输出到页面展示
        ImageIO.write(image,"jpg",resp.getOutputStream());

    }
}
