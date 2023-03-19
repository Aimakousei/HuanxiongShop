package com.kenshin.service.Impl;

import com.kenshin.dao.BookDao;
import com.kenshin.domain.Book;
import com.kenshin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public boolean addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public boolean deleteBook(Integer id) {
        return bookDao.deleteBook(id);
    }

    @Override
    public boolean updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book getBookById(Integer id) {
        return bookDao.getBook(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
