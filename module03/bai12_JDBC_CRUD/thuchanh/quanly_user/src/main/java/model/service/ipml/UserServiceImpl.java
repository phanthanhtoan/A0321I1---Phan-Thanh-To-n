package model.service.ipml;

import model.bean.User;
import model.repository.impl.UserRepositoriesImpl;
import model.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepositoriesImpl userRepositories = new UserRepositoriesImpl();

    @Override
    public void addNewUser(User user) {
        userRepositories.addNewUser(user);
    }

    @Override
    public User findById(int id) {
        return userRepositories.findById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepositories.findAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        return userRepositories.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userRepositories.updateUser(user);
    }
}
