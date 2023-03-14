package com.example.dao;

import org.apache.ibatis.annotations.*;
import com.example.domain.Book;

import java.util.List;

@Mapper
public interface BookDao {
    @Insert("insert into tb_book values(null, #{type}, #{name}, #{description})")
    public void save(Book book);
    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);
    @Delete("delete from tb_book where id = #{id}")
    public void delete(Integer id);
    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
    @Select("select * from tb_book")
    public List<Book> getAll();
}
