package com.qrc.service;

import org.springframework.transaction.annotation.Transactional;
import com.qrc.domain.Book;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    public boolean save(Book book);
    /**
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);
    /**
     * 按照id修改
     * @param id
     * @return
     */
    public boolean delete(Integer id);
    /**
     * 按照id查找
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查找所有book
     * @return
     */
    public List<Book> getAll();
}
