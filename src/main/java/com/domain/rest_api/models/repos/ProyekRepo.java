package com.domain.rest_api.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.domain.rest_api.models.entities.Proyek;

public interface ProyekRepo extends CrudRepository<Proyek, Long>{
    
}
