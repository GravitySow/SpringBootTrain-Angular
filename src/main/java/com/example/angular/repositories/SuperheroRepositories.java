package com.example.angular.repositories;

import com.example.angular.entities.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepositories extends JpaRepository<Superhero, Integer> {
    List<Superhero> findAll();
}
