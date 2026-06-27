package com.huajie.app.controller;

import runtime.JhpRuntime;
import com.huajie.app.service.UserService;
import com.huajie.app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/user")
class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public  User getById(@PathVariable("id")  Integer id) 
    {
        return userService.getById(id);
    }
    @GetMapping("/list")
    public  List<User> listAll() 
    {
        return userService.list();
    }
    @PostMapping("/save")
    public  Boolean save(@RequestBody  User user) 
    {
        return userService.save(user);
    }
    @PutMapping("/update")
    public  Boolean update(@RequestBody  User user) 
    {
        return userService.updateById(user);
    }
    @DeleteMapping("/{id}")
    public  Boolean delete(@PathVariable("id")  Integer id) 
    {
        return userService.removeById(id);
    }
    @GetMapping("/email/{email}")
    public  User getByEmail(@PathVariable("email")  String email) 
    {
        UserService user = userService.getByEmail(email);
        JhpRuntime.echo("用户姓名: ", user.name, "\\n");
        return user;
    }
    @GetMapping("/result/{id}")
    public  Result<User> getUserResult(@PathVariable("id")  Integer id) 
    {
        User user = userService.getById(id);
        User user2 = new User();
        Result<User> result = new Result<User>();
        result.code = 200;
        result.msg = "success";
        result.data = user;
        JhpRuntime.echo("姓名: ", result.getData().name, "\\n");
        return result;
    }
}
