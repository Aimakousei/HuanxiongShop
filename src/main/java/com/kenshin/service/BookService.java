package com.kenshin.service;

import com.kenshin.domain.Book;

import java.util.List;

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
    public Book getBook(Integer id);

    /**
     * 获取全部
     * @return
     */
    public List<Book> getAllBook();
}
