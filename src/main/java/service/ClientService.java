package service;

import bean.User;
import service.exception.ServiceException;

public interface ClientService {
    boolean logIn(User user) throws ServiceException;
    boolean signUp(User user) throws ServiceException;
    void signOut(String login) throws ServiceException;
}
