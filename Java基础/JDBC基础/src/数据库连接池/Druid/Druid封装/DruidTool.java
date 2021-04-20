package 数据库连接池.Druid.Druid封装;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidTool {

    private static DataSource ds;

    static {
        try {

            Properties pro = new Properties();
            pro.load(DruidTool.class.getClassLoader().getResourceAsStream("druiddemo"));

            ds = DruidDataSourceFactory.createDataSource(pro);

        }catch (IOException e){

        }catch (Exception e){

        }
    }

    /**
     * 获取连接
     **/
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 获取连接池
     **/
    public static DataSource getDataSource(){
        return ds;
    }

    /**
     * 释放资源
     */
    public static void close(Statement stmt, Connection conn){
        close(null,stmt,conn);
    }

    public static  void close(ResultSet rs,Statement stmt,Connection conn){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();// <归还>连接!
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
