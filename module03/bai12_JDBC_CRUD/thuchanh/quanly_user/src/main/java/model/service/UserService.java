package model.service;

import model.bean.User;
import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public void addNewUser(User user);

    public User findById(int id);

    public List<User> findAllUsers();

    public boolean deleteUser(int id);

    public boolean updateUser(User user);
}
