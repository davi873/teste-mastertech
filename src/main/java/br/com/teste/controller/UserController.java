package br.com.teste.controller;

import br.com.teste.datasource.model.User;
import br.com.teste.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    private List<User> getAllUser(){
       return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    private User getUserById(@PathVariable(value = "id",required = true) int id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    private int saveOrUpdate(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user.getId();
    }
}
