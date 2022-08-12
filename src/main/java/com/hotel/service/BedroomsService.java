package com.hotel.service;

import com.hotel.entites.Bedrooms;
import com.hotel.repository.BedroomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BedroomsService {

    @Autowired
    BedroomsRepository repository;

    public Bedrooms save(Bedrooms bedrooms){
        return repository.save(bedrooms);
    }
}
