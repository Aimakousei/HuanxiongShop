package com.kenshin;

import com.kenshin.config.SpringConfig;
import com.kenshin.domain.Book;
import com.kenshin.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void addBookTest(){
        Book book = new Book();
        book.setBookName("南极qq");
        book.setDescription("南极在哪里wwe");
        bookService.addBook(book);
    }

    @Test
    public void updateBookTest(){
        Book book = new Book();
        book.setId(2);
        book.setBookName("北极");
        book.setDescription("北极是个好地方");
        bookService.updateBook(book);
    }

    @Test
    public void deleteBookTest(){
        bookService.deleteBook(2);
    }

    @Test
    public void getBookTest(){
        System.out.println(bookService.getBook(1));
        System.out.println(bookService.getBook(3));
    }

    @Test
    public void getAllBookTest(){
        System.out.println("/////////////");
        System.out.println(bookService.getAllBook());
    }
}
