package qrc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import qrc.domain.User;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module':'user delete'}";
    }
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String username, int age){
        System.out.println("普通参数传递 name==" + username + "年龄 age==" + age);
        System.out.println("user commonParam...");
        return "{'module':'user commonParam'}";
    }
    //如果请求中的参数名与pojo类中的属性名一样，也可以自动实现绑定
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("POJO参数传递 name==" + user);
        System.out.println("user pojoParam...");
        return "{'module':'user pojoParam'}";
    }
    //数组参数
    //集合参数

    //json参数
    @RequestMapping("/jsonParam")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("json参数传递 likes==" + likes);
        System.out.println("user jsonParam...");
        return "{'module':'user jsonParam'}";
    }


}
