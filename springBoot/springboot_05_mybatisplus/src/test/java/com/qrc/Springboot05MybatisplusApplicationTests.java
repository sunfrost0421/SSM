package com.qrc;

import com.qrc.dao.UserDao;
import com.qrc.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot05MybatisplusApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        List<Users> users = userDao.selectList(null);
        System.out.println(users);
    }

}
