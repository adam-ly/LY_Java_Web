package Demo11_综合案例_用户信息.Dao;

import Demo11_综合案例_用户信息.Model.User;
import Demo11_综合案例_用户信息.Model.PageBean;

import java.util.List;
import java.util.Map;

public class Dao implements UserDao {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {

        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User findById(String Id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        return 0;
    }

    @Override
    public PageBean<User> findByPage(int start, int rows, Map<String, String[]> condition) {
        return null;
    }
}
