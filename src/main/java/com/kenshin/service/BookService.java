package com.kenshin.service;

import com.kenshin.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 新增
     * @param book
     */
    public boolean addBook(Book book);

    /**
     * 删除
     * @param id
     */
    public boolean deleteBook(Integer id);

    /**
     * 更新
     * @param book
     */
    public boolean updateBook(Book book);

    /**
     * 获取单个
     * @param id
     * @return
     */
    public Book getBookById(Integer id);

    /**
     * 获取全部
     * @return
     */
    public List<Book> getAllBook();
}
