package JDBC基础.JDBC入门;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {

        //1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2、获取数据库连接对象,url是指具体的数据库
        String url = "jdbc:mysql://127.0.0.1:3306/testdatabase?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=GMT";
        String user = "root";
        String psw = "3488755";
        Connection conn = DriverManager.getConnection(url,
                user,psw);

        //3.定义sql语句
        String sql = "INSERT INTO student VALUES(13,\"Sarah\",32,23.5,NULL,NULL);";

        //4.获取执行sql的对象 statement，由于Statement有sql注入的问题，所以正常都会用PrepareStament
//        Statement stmt = conn.createStatement();
        String sql1 = "delete from student where name = ?";
        PreparedStatement stmt = conn.prepareStatement(sql1);
        stmt.setString(1,"lili");

        //6.执行sql,
//        boolean result = stmt.executeu(sql); //execute方法结果集不为空才为true，所以查询语句都会为true
        int result = stmt.executeUpdate();

        //7.处理结果 true:结果为resultset false:没有结果
        System.out.println("删除:" + (result == 1 ?"成功":"失败"));

        //8.释放资源
        stmt.close();
        conn.close();
    }
}
