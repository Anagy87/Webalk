package hu.me.lev.service;

import hu.me.lev.model.Book;
import hu.me.lev.persist.exception.BookNotFoundException;

import java.util.List;

public interface BookService {

    Book getBook(int id) throws BookNotFoundException;

    Book getAuthor(String authorname) throws BookNotFoundException;

    List getAllBook();

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(Book book);

}
