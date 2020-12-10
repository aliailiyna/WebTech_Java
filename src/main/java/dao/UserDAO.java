package dao;

import bean.User;
import dao.exception.DAOException;
<<<<<<< HEAD

import java.util.List;
=======
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9

public interface UserDAO {
    void signUp(User user) throws DAOException;
    void logIn(User user) throws DAOException;
<<<<<<< HEAD
    List<User> getUsers() throws DAOException;
=======
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9
}
