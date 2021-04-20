package JDBCTemplate;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import 数据库连接池.Druid.Druid封装.DruidTool;

import java.util.List;
import java.util.Map;

/**
 * JdbcTemplate涉及到5个包：
 * 1、spring-beans-5.0.0.RELEASE.jar //可以把结果集映射成对象
 * 2、spring-core-5.0.0.RELEASE.jar
 * 3、spring-jdbc-5.0.0.RELEASE.jar
 * 4、spring-tx-5.0.0.RELEASE.jar
 * 5、commons-logging-1.2.jar
 * */

public class Demo {

    //传入一个数据库连接池，JdbcTemplate会为我们管理它。开发者只需要专注于sql语句的编写即可。
    static JdbcTemplate template = new JdbcTemplate(DruidTool.getDataSource());

    public void update(){
        String update = "update student set birthday = ? where name = ?";
        //result 返回受影响的行数
        int result = template.update(update,"1990-03-06","Bruce");
        System.out.println("修改 = " + (result > 0 ? "成功" : "失败") );
    }

    @Test
    public void insert() {
        String insert = "insert into student VALUES(?,?,?,?,?,?)";
        int insertResult = template.update(insert,5,"Ahbishek",34,78,"1987-04-02",null);
        System.out.println(insertResult);
    }

    @Test
    public void query() {
        String sql = "select distinct * from student where name = ?";
        Map<String,Object> map = template.queryForMap(sql,"Bruce");
        System.out.println(map);

        String sql1= "Select DISTINCT * from student";
        List<Map<String,Object>> list = template.queryForList(sql1);
        System.out.println(list);
    }
    
    



}
