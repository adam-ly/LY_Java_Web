package 数据库连接池.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {

    public static void main(String[] args) throws Exception {

        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druiddemo");

        Properties pro = new Properties();
        pro.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();

        System.out.println(conn);
    }

}
