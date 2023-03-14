package qrc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class BookController {
    @RequestMapping("/book/save")

    @ResponseBody
    public String save(){
        System.out.println("book save...");
        return "{'module':'book save'}";
    }
}
