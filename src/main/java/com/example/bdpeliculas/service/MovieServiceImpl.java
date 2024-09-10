package com.example.bdpeliculas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdpeliculas.model.Movie;
import com.example.bdpeliculas.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }
    
    @Override
    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Long id, Movie movie){
        if(movieRepository.existsById(id)){
            movie.setId(id);
            return movieRepository.save(movie);
        }else{
            return null; 
        }
    }

    @Override
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }   
        
}