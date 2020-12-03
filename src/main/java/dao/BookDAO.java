package dao;

import bean.Book;

public interface BookDAO {
    void addBook(Book book);
    void deleteBook(Book book);
    void delete(int BookId);
}
