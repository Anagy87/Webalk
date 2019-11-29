package hu.me.lev.web;

import hu.me.lev.persist.bookDAO;
import hu.me.lev.persist.inmemory.bookDAOImpl;
import hu.me.lev.service.BookService;
import hu.me.lev.service.impl.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "hu.me.lev.controller")
public class BookApplicationContext extends WebMvcConfigurerAdapter {

    @Bean
    public BookService bookService(){
        return new BookServiceImpl(bookDAO());
    }

    @Bean(name = "BookDAO")
    public bookDAO bookDAO(){
        return new bookDAOImpl();
    }
}
