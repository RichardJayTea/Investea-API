package com.richardjaytea.investea.service;

import com.richardjaytea.investea.model.User;
import com.richardjaytea.investea.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getUsers()
    {
        List<User> users = new ArrayList<>();
        repository.findAll()
                .forEach(users::add);

        return users;
    }

    public void addUser(User user)
    {
        repository.save(user);
    }
}
