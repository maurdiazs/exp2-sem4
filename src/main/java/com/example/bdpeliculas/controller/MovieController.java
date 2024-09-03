package com.example.bdpeliculas.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdpeliculas.model.Movie;
import com.example.bdpeliculas.service.MovieService;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
        
    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }
}   