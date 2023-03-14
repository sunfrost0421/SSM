package qrc.controller;


import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import qrc.domain.Book;
import qrc.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR, flag);
    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR, flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR, flag);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book res = bookService.getById(id);
        Integer code = (res != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (res != null) ? "数据查询成功!" : "数据查询失败，请重试!";
        return new Result(code,res,msg);
    }
    @GetMapping
    public Result getAll() {
        List<Book> res = bookService.getAll();
        Integer code = (res != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (res != null) ? "数据查询成功!" : "数据查询失败，请重试!";
        return new Result(code,res,msg);
    }
}
