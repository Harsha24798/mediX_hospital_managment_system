package service.custom;

import dto.User;
import service.SuperService;

import java.util.List;

public interface UserService extends SuperService {
    boolean addUser(User user);
    boolean updateUser(String id, User user);
    boolean deleteUser(User user);
    User serachUser(String id);
    List<User> getAll();
}
