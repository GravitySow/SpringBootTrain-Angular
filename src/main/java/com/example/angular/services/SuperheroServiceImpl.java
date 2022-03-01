package com.example.angular.services;

import com.example.angular.entities.Superhero;
import com.example.angular.repositories.SuperheroRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SuperheroServiceImpl implements SuperheroService{
    @Autowired
    SuperheroRepositories superheroRepositories;

    public List<Superhero> findAll(){
        return superheroRepositories.findAll();
    }

    public ResponseEntity<String> save(Map<String,Object> inputs) throws Exception {
        Superhero superhero = new Superhero();

        superhero.setAlias((String) inputs.get("alias"));
        superhero.setFirstname((String) inputs.get("firstname"));
        superhero.setSurname((String) inputs.get("surname"));

        superheroRepositories.save(superhero);
        return new ResponseEntity<>("Insert Success", HttpStatus.OK);
    }
}
