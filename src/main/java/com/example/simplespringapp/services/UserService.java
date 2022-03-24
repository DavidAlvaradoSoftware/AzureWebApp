package com.example.simplespringapp.services;

import com.example.simplespringapp.models.User;
import com.example.simplespringapp.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getUserById(Integer userId){
        return userRepo.getById(userId);
    }

    public boolean postUser(User user){
        userRepo.save(user);
        return user.getiD() != null;
    }



}
