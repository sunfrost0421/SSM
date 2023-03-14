package com.example;

import com.example.dao.BookDao;
import com.example.domain.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        Book book = bookDao.getById(2);
        System.out.println(System.getProperty("file.encoding"));//可以在setting-encoding中修改，这个表示工程控制台的解码方式
        System.out.println("0信1息2信息3");//编码方式为gbk，解码方式也要设置为gbk
        System.out.println(book);
    }

}
