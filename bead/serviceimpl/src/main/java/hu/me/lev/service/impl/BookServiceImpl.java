package hu.me.lev.service.impl;

import hu.me.lev.model.Book;
import hu.me.lev.persist.bookDAO;
import hu.me.lev.persist.exception.BookNotFoundException;
import hu.me.lev.service.BookService;

import java.security.InvalidParameterException;
import java.util.List;

public class BookServiceImpl implements BookService {
    private bookDAO bookDAO;

    public BookServiceImpl(bookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Book getBook(int id) throws BookNotFoundException {
        if (id<1){throw new InvalidParameterException("id cannot be less than one");}
        return bookDAO.selectBook(id);
    }

    @Override
    public Book getAuthor(String authorname) throws BookNotFoundException {
        if (authorname==null){throw new InvalidParameterException("Author name cannot be empty");}
        return bookDAO.selectAuthor(authorname);
    }

    @Override
    public List getAllBook() {
        return null;
    }

    @Override
    public void addBook(Book book) {
        if (book.getId()<1) {throw new InvalidParameterException("id cannot be less than one");}
        if (book.getName().isEmpty()) {throw new InvalidParameterException("name cannot be empty");}
        bookDAO.insertBook(book);
    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void removeBook(Book book) {

    }
}
