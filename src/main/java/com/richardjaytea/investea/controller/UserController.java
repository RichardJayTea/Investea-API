package com.richardjaytea.investea.controller;

import com.richardjaytea.investea.model.User;
import com.richardjaytea.investea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Long id)
    {
        service.updateUser(user);
    }

    @RequestMapping("user/{id}")
    public Optional<User> getUser(@PathVariable Long id)
    {
        return service.getUser(id);
    }
}
