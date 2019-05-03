package com.piotrek.movieshop.rest;

import com.piotrek.movieshop.entity.Movie;
import com.piotrek.movieshop.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
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
