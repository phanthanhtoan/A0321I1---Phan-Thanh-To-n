package model.service.dao;

import model.bean.User;

import java.sql.SQLException;

public interface IUserDAO {
    public User getUserById(int id);

    public void insertUserStore(User user) throws SQLException;
}
