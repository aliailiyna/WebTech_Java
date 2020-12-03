package service;

import bean.Book;

public interface LibraryService {
    void addBook(Book book);
    void editBook(int bookId);
    void deleteBook(int bookId);
}
