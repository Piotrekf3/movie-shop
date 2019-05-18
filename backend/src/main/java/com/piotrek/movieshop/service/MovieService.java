package com.piotrek.movieshop.service;

import com.piotrek.movieshop.dao.Dao;
import com.piotrek.movieshop.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class MovieService {

    @Autowired
    private Dao<Movie> movieDAO;

    @Transactional
    public Collection<Movie> getMovies() {
        return movieDAO.getAll();
    }

    @Transactional
    public Collection<Movie> getMovies(String category) {
        return movieDAO.getAll(category);
    }

    @Transactional
    public Movie getMovie(int id) {
        return movieDAO.get(id);
    }
}
