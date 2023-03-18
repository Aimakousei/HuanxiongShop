package com.kenshin.dao;

import com.kenshin.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("insert into book(id,bookName,description) values(#{id},#{bookName},#{description})")
    public boolean addBook(Book book);

    @Delete("delete from book where id = #{id}")
    public boolean deleteBook(Integer id);

    @Update("update book set bookName = #{bookName} , description = #{description} where id = #{id}")
    public boolean updateBook(Book book);

    @Select("select * from book where id = #{id}")
    public Book getBook(Integer id);

    @Select("select * from book")
    public List<Book> getAllBook();
}
