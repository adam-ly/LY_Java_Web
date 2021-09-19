package Demo11_综合案例_用户信息.Dao;

import Demo11_综合案例_用户信息.Model.User;
import Demo11_综合案例_用户信息.Model.PageBean;

import java.util.Map;
import java.util.List;

// 用户增删改查接口
public interface UserDao {

    public List<User> findAll();

    User findUserByUsernameAndPassword(String username,String password);

    void add(User user);

    void delete(User user);

    User findById(String Id);

    void update(User user);

    //总记录数
    int findTotalCount(Map<String,String[]> condition);

    //分页记录
    PageBean<User> findByPage(int start, int rows, Map<String,String[]> condition);

}
