package service;

import bean.User;
import service.exception.ServiceException;

public interface ClientService {
    void logIn(User user) throws ServiceException;
    void signUp(User user) throws ServiceException;
    void signOut(String login) throws ServiceException;
}
