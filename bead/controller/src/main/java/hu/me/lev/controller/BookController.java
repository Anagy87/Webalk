package hu.me.lev.controller;

import hu.me.lev.model.Book;
import hu.me.lev.persist.exception.BookNotFoundException;
import hu.me.lev.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @RequestMapping(value = "/getBook")
    public String getBook(@RequestParam("id") int id) throws BookNotFoundException {
        return bookService.getBook(id).toString();
    }

    @RequestMapping(value = "/getAuthor")
    public String getBook(@RequestParam("authorname") String authorname) throws BookNotFoundException {
        return bookService.getAuthor(authorname).toString();
    }

    @RequestMapping
    public String addBook(@RequestParam("id") int id,
                          @RequestParam("name") String name,
                          @RequestParam("authorname") String authorname,
                          @RequestParam("price") int price){
         bookService.addBook(new Book(id, name, authorname, price));
        return "OK";
    }

    @ExceptionHandler(BookNotFoundException.class)
    public String BookNotFoundExceptionHandler(){
        return "No book found with that id";
    }
}
