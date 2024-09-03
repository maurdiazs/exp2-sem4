package com.example.bdpeliculas.service;

import com.example.bdpeliculas.model.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
}