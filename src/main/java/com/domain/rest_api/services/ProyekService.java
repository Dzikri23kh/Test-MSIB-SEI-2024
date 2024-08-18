package com.domain.rest_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.rest_api.models.entities.Proyek;
import com.domain.rest_api.models.repos.ProyekRepo;

@Service
@Transactional
public class ProyekService {
    
    @Autowired
    private ProyekRepo proyekRepo;

    public Proyek save(Proyek proyek){
        return proyekRepo.save(proyek);
    } 

    public Proyek findOne(Long id){
        return proyekRepo.findById(id).get();
    }

    public Iterable<Proyek> findAll(){
        return proyekRepo.findAll();
    }

    public void removeOne(Long id){
        proyekRepo.deleteById(id);
    }
}
