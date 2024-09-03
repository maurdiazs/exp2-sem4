package com.example.bdpeliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bdpeliculas.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}