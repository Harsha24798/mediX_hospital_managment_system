package service.custom.imp;

import com.google.inject.Inject;
import dto.User;
import entity.UserEntity;
import org.modelmapper.ModelMapper;
import repository.custom.UserDao;
import service.custom.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Inject
    UserDao dao;

    @Override
    public boolean addUser(User user) {
        System.out.println("Service : " + user);

        UserEntity map = new ModelMapper().map(user, UserEntity.class);
        dao.save(map);
        return false;
    }

    @Override
    public boolean updateUser(String id, User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public User serachUser(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return List.of();
    }
}
