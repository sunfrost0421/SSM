package com.qrc.controller;


import com.qrc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Value("${lesson}")
    private String lesson;
    @Value("${user.age}")
    private Integer age;
    @Value("${user.likes[0]}")
    private String favorite;

    @Autowired
    private Environment environment;//加载所有的环境变量


    @Autowired
    private User user;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("lesson:"+lesson+"    age:"+age+"    favorite:"+favorite);
        System.out.println("-------------------------------------------------");
        System.out.println(environment.getProperty("lesson"));
        System.out.println("-------------------------------------------------");
        System.out.println(user);
        return "hello spring boot";
    }


}
