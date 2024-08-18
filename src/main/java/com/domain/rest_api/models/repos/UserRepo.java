package com.domain.rest_api.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.domain.rest_api.models.entities.User;

public interface UserRepo extends CrudRepository<User, Long>{
    
}
