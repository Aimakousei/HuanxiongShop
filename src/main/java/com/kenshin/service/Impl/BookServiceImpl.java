package com.kenshin.service.Impl;

import com.kenshin.controller.Code;
import com.kenshin.dao.BookDao;
import com.kenshin.domain.Book;
import com.kenshin.exception.SystemException;
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
        return bookDao.addBook(book) > 0;
    }

    @Override
    public boolean deleteBook(Integer id) {
        return bookDao.deleteBook(id) > 0;
    }

    @Override
    public boolean updateBook(Book book) {
        return bookDao.updateBook(book) > 0;
    }

    @Override
    public Book getBookById(Integer id) {
        try {
            return bookDao.getBook(id);
        } catch (Exception e) {
            throw new SystemException(Code.BUSINESS_ERR, "服务器访问超时", e);
        }
    }

    @Override
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
