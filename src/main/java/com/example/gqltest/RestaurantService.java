package com.example.gqltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> findAll() {
        return repository.findAll();
    }
}
