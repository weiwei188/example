package com.firstspringboot.springboot.controller;

import com.firstspringboot.springboot.entity.User;
import com.firstspringboot.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> selectAllUser(){
        return userService.selectAllUser();
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User selectUserById(@PathVariable("id") Integer id){
        return userService.selectUserById(id);
    }

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @RequestMapping(value = "/user/update", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
}
