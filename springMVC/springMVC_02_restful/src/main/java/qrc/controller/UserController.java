package qrc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import qrc.domain.User;


//Controller表示能被springMVC扫描到
@Controller
public class UserController {
    //每一个方法都对应一个RequestMapping，用来定义一个资源访问路径
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    //浏览器的请求传入形参
    public String save(User user){
        System.out.println("user save..." + user);
        return "{'module':'save'}";
    }

    //rest风格从请求的路径参数获取变量
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String save(@PathVariable int id){
        System.out.println("user delete..." + id);
        return "{'module':'delete'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(User user){
        System.out.println("user update..." + user);
        return "{'module':'update'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable int id){
        System.out.println("user getById..." + id);
        return "{'module':'getById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'getAll'}";
    }
}
