package com.MiApiAnime.demo.controller;

import com.MiApiAnime.demo.domain.model.Movie;
import com.MiApiAnime.demo.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")

public class MovieController {
private final MovieRepository movieRepository;
MovieController(MovieRepository movieRepository){
    this.movieRepository=movieRepository;
}

@GetMapping("/")
    public List<Movie> jujas(){
    return movieRepository.findAll();
}

@GetMapping("/mars")
    public String marses(){
    return "Mars";
}

@PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie){
    return movieRepository.save(movie);
}
}
