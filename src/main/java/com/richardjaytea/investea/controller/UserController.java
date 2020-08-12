package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.model.User;
import com.richardjaytea.investea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("user/all")
    public List<User> getAllUsers()
    {
        return service.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user)
    {
        service.addUser(user);
    }
}
