package hu.me.lev.persist.inmemory;

import hu.me.lev.model.Book;
import hu.me.lev.persist.bookDAO;
import hu.me.lev.persist.exception.BookNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bookDAOImpl implements bookDAO {
    private Map<Integer, Book> book;

    public bookDAOImpl(Map<Integer, Book> book) {
        this.book = book;
    }
    public bookDAOImpl(){
        this.book = new HashMap<>();
        book.put(1,new Book(1,"Beadandokonyv","Mr. Nagy",990));

    }

    @Override
    public Book selectBook(int id) throws BookNotFoundException {
        if (!book.keySet().contains(id)){
            throw new BookNotFoundException();
        }
        return book.get(id);
    }

    @Override
    public Book selectAuthor(String authorname) throws BookNotFoundException {
        if (!book.keySet().contains(authorname)){
            throw new BookNotFoundException();
        }
        return book.get(authorname);
    }

    @Override
    public List selectEveryBook() {
        return null;
    }

    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void insertBook(Book book) {
        this.book.put(book.getId(), book);
    }

    @Override
    public void deleteBook(Book book) {

    }
}
