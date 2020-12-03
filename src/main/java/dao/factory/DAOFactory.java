package dao.factory;

import dao.BookDAO;
import dao.UserDAO;
import dao.implementation.SQLBookDAO;
import dao.implementation.SQLUserDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final BookDAO sqlBookImpl = new SQLBookDAO();
    private final UserDAO sqlUserImpl = new SQLUserDAO();

    private DAOFactory() {}

    public static DAOFactory getInstance() {
        return instance;
    }

    public BookDAO getBookDAO() {
        return sqlBookImpl;
    }

    public UserDAO getUserDAO() {
        return sqlUserImpl;
    }
}
