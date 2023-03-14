package qrc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import qrc.domain.User;


//@ResponseBody
//@Controller
@RestController
@RequestMapping("/users2")
public class UserController2 {
//    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @PostMapping
    public String save(User user){
        System.out.println("user save..." + user);
        return "{'module':'save'}";
    }

//    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String save(@PathVariable int id){
        System.out.println("user delete..." + id);
        return "{'module':'delete'}";
    }

//    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @PutMapping
    public String update(User user){
        System.out.println("user update..." + user);
        return "{'module':'update'}";
    }

//    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable int id){
        System.out.println("user getById..." + id);
        return "{'module':'getById'}";
    }

//    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'getAll'}";
    }
}
