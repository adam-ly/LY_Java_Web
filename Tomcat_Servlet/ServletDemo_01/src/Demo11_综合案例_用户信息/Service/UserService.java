package Demo11_综合案例_用户信息.Service;

import Demo11_综合案例_用户信息.Dao.Dao;
import Demo11_综合案例_用户信息.Dao.UserDao;
import Demo11_综合案例_用户信息.Model.User;

import java.util.List;
import java.util.Map;

public class UserService implements UserServiceInterface{

    private UserDao dao;

    public UserService(){
        dao = new Dao();
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void findUserById(String userId) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deletedUsers(String[] ids) {

    }

    @Override
    public User[] findUserByPage(String currentPage, String rows, Map<String, String[]> condition) {
        return new User[0];
    }
}
