package dao;

import bean.Book;
import dao.exception.DAOException;

public interface BookDAO {
    void addBook(Book book) throws DAOException;
    void deleteBook(Book book) throws DAOException;
    void delete(int BookId) throws DAOException;
}
