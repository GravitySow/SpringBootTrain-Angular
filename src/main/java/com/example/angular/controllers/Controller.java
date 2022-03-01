package com.example.angular.controllers;

import com.example.angular.entities.Superhero;
import com.example.angular.services.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("")
public class Controller {
    @Autowired
    private SuperheroService superheroService;

    @GetMapping(value = "/test")
    public String test(){
        return "Test";
    }

    @GetMapping(value = "/findall")
    public List<Superhero> findAll(){
        return superheroService.findAll();
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<String> save(@RequestBody Map<String,Object> inputs) throws Exception {
        return superheroService.save(inputs);
    }
}