package service.inplementation;

import bean.User;
import dao.UserDAO;
import dao.exception.DAOException;
import dao.factory.DAOFactory;
import service.ClientService;
import service.exception.ServiceException;

import java.util.List;

<<<<<<< HEAD
public class ClientServiceImpl implements ClientService {
    private final UserDAO userDao = DAOFactory.getInstance().getUserDAO();
=======
    @Override
    public void logIn(User user) throws ServiceException {
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9

    private boolean isLoginUnique(User user) throws ServiceException {
        try {
            List<User> users = userDao.getUsers();
            return users.stream().noneMatch(u -> u.getLogin().equals(user.getLogin()));
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
<<<<<<< HEAD
    public boolean logIn(User user) throws ServiceException {
        if (user.getLogin().equals("") || user.getPassword().equals("")) {
            throw new ServiceException("Fields can't be empty");
        } else {
            try {
                if (isLoginUnique(user)) {
                    userDao.signUp(user);
                    return true;
                } else {
                    return false;
                }
            } catch (DAOException e) {
                throw new ServiceException(e);
            }
        }
    }
=======
    public void signUp(User user) throws ServiceException{
>>>>>>> 8a241d8a3b22173744448d7a10665f95bfe182e9

    @Override
    public boolean signUp(User user) throws ServiceException{
        if (user.getLogin().equals("") || user.getPassword().equals("")) {
            throw new ServiceException("Fields can't be empty");
        } else {
            try {
                if (isLoginUnique(user)) {
                    userDao.signUp(user);
                    return true;
                } else {
                    return false;
                }
            } catch (DAOException e) {
                throw new ServiceException(e);
            }
        }
    }

    @Override
    public void signOut(String login) throws ServiceException{

    }
}
