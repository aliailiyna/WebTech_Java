package service;

import bean.User;
import service.exception.ServiceException;

public interface ClientService {
<<<<<<< HEAD
    boolean logIn(User user) throws ServiceException;
    boolean signUp(User user) throws ServiceException;
=======
    void logIn(User user) throws ServiceException;
    void signUp(User user) throws ServiceException;
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9
    void signOut(String login) throws ServiceException;
}
