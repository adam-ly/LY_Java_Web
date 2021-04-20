package JDBC基础.JDBC封装;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo {

    @Test
    public void Test() {

        PreparedStatement stmt = null;
        Connection conn = null;

        try {
            conn = JDBCTool.getconnection();
            conn.setAutoCommit(false);//关闭自动commit，改为用事务提交

            String sql = "INSERT INTO student VALUES(?,?,32,23.5,NULL,NULL);";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,3);
            stmt.setString(2,"Bruce");
            int result = stmt.executeUpdate();
            
            conn.commit();//提交

            System.out.println("插入数据 : " + ( result == 1 ? "成功" : "失败" ));

        }catch (SQLException e){
            try {
                if (conn != null){
                    conn.rollback();
                }
            }catch (SQLException e1){
                e1.printStackTrace();
            }
        }finally {
            JDBCTool.close(null,stmt,conn);
        }

    }


}
