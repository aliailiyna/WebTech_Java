package service.inplementation;

import bean.User;
import dao.UserDAO;
import dao.exception.DAOException;
import dao.factory.DAOFactory;
import service.ClientService;
import service.exception.ServiceException;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    private final UserDAO userDao = DAOFactory.getInstance().getUserDAO();

    private boolean isLoginUnique(User user) throws ServiceException {
        try {
            List<User> users = userDao.getUsers();
            return users.stream().noneMatch(u -> u.getLogin().equals(user.getLogin()));
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override

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
