package com.domain.rest_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.rest_api.models.entities.User;
import com.domain.rest_api.models.repos.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public User save(User user){
        return userRepo.save(user);
    }

    public User findOne(Long id){
        return userRepo.findById(id).get();
    }

    public Iterable<User> findAll(){
        return userRepo.findAll();
    }

    public void removeOne(Long id){
        userRepo.deleteById(id);
    }

    
}
