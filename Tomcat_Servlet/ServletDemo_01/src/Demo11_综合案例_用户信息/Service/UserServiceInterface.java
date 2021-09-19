package Demo11_综合案例_用户信息.Service;

import Demo11_综合案例_用户信息.Model.User;

import java.util.List;
import java.util.Map;

public interface UserServiceInterface {

    public List<User> findAll();

    User login(User user);

    void addUser(User user);

    void deleteUser(User user);

    void findUserById(String userId);

    void updateUser(User user);

    void deletedUsers(String[] ids);

    User[] findUserByPage(String currentPage, String rows, Map<String,String[]> condition);
}
