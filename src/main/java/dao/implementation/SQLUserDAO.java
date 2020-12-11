package dao.implementation;

import bean.User;
import dao.UserDAO;
import dao.exception.DAOException;

import java.util.ArrayList;
import java.util.List;

public class SQLUserDAO implements UserDAO {
    private final List<User> users = new ArrayList<>();

    public SQLUserDAO() {
        users.add(new User("User", "Password"));
    }

    @Override
    public void signUp(User user) throws DAOException {

    }

    @Override
    public void logIn(User user) throws DAOException {

    }

    @Override
    public List<User> getUsers() throws DAOException {
        return users;
    }
}
