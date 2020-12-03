package dao;

import bean.User;
import dao.exception.DAOException;

public interface UserDAO {
    void signUp(User user) throws DAOException;
    void logIn(User user) throws DAOException;
}
