package JDBC基础.JDBC封装;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

public class JDBCTool {
    static String url = null;
    static String user = null;
    static String psw = null;
    static String driver = null;
    
    static {
        System.out.println("初始化JDBCTool");
        try {
            //1、通过类加载器获取src路径下的文件
            ClassLoader classLoader = JDBCTool.class.getClassLoader();
            URL res = classLoader.getResource("jdbcconfig");
            
            //注意：getPath方法会自动编码路径字符串，所以如果包含中文或符号会被编码，导致路径找不到
//            String path = res.getPath();
            String path = res.toURI().getPath();//通过URI获取的路径不会被编码
            System.out.println("path = " + path);
            
            //2、加载文件
            Properties pro = new Properties();
            pro.load(new FileReader(path));
            
            //3、赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            psw = pro.getProperty("password");
            driver = pro.getProperty("driver");
            
            //4、注册驱动（mysql5以上可以省略）
            Class.forName(driver);
            
        }catch (IOException e){
            System.out.println("IO Error : " + e.getLocalizedMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Class Not Found");
        }catch (URISyntaxException e){
            System.out.println("uri exception");
        }
         
    }
    
    static Connection getconnection() throws SQLException{
        return DriverManager.getConnection(url,user,psw);
    }
    
    static void close(ResultSet set,Statement stmt, Connection conn) {
        if (set != null){
            try {
                set.close();
            }catch (SQLException e){
                System.out.println("set close exception");
            }
        }
        
        if (stmt != null){
            try {
                stmt.close();
            }catch (SQLException e){
                System.out.println("stmt close exception");
            }
        }
        if (conn != null){
            try {
                conn.close();
            }catch (SQLException e){
                System.out.println("conn close exception");
            }
        }


    }
}
