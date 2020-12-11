package dao;

import bean.User;
import dao.exception.DAOException;
import java.util.List;


public interface UserDAO {
    void signUp(User user) throws DAOException;
    void logIn(User user) throws DAOException;
    List<User> getUsers() throws DAOException;
}
