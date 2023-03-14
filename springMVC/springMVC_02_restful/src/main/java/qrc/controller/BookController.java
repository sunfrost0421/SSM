package qrc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qrc.domain.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    //保存
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("save..." + book);
        return "{'module':'book save success'}";
    }



    //查询所有
    @GetMapping
    public List<Book> getAll(){
        Book b1 = new Book(1, "计算机", "计算机组成原理","111");
        Book b2 = new Book(2, "艺术", "画图", "222");
        List<Book> bs = new ArrayList<>();
        bs.add(b1);
        bs.add(b2);
        return bs;
    }
}
