package dao.implementation;

import bean.User;
import dao.UserDAO;
import dao.exception.DAOException;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;
=======
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9

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
