package hu.me.lev.persist;


import hu.me.lev.model.Book;
import hu.me.lev.persist.exception.BookNotFoundException;

import java.util.List;

public interface bookDAO {

    Book selectBook(int id) throws BookNotFoundException;

    Book selectAuthor(String authorname) throws BookNotFoundException;

    List selectEveryBook();

    void updateBook(Book book);

    void insertBook(Book book);

    void deleteBook(Book book);

}
