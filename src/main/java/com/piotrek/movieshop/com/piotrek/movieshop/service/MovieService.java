package com.piotrek.movieshop.com.piotrek.movieshop.service;

import com.piotrek.movieshop.com.piotrek.movieshop.dao.Dao;
import com.piotrek.movieshop.com.piotrek.movieshop.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

public class MovieService {

    @Autowired
    private Dao<Movie> movieDAO;

    @Transactional
    public Collection<Movie> getMovies() {
        return movieDAO.getAll();
    }

    @Transactional
    public Movie getMovie(int id) {
        return movieDAO.get(id);
    }
}
