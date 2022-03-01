package com.example.angular.services;

import com.example.angular.entities.Superhero;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface SuperheroService {
    List<Superhero> findAll();

    ResponseEntity<String> save(Map<String,Object> inputs) throws Exception;
}
