package model.repository;

import model.bean.User;
import java.util.List;
import java.sql.SQLException;

public interface UserRepositories {
    public void addNewUser(User user);

    public User findById(int id);

    public List<User> findAllUsers();

    public boolean deleteUser(int id);

    public boolean updateUser(User user);
}
