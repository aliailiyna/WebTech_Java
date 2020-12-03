package service;

import bean.Book;
import service.exception.ServiceException;

public interface LibraryService {
    void addBook(Book book) throws ServiceException;
    void editBook(int bookId) throws ServiceException;
    void deleteBook(int bookId) throws ServiceException;
}
