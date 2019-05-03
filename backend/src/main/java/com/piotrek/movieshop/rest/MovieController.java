package com.piotrek.movieshop.rest;

import com.piotrek.movieshop.entity.Movie;
import com.piotrek.movieshop.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public Collection<Movie> movies() {
        return movieService.getMovies();
    }

    @GetMapping("/movies/{id}")
    public Movie movies(@PathVariable int id) {
        return movieService.getMovie(id);
    }

}
