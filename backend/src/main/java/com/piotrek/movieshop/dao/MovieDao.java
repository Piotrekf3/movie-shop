package com.piotrek.movieshop.dao;

import com.piotrek.movieshop.entity.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class MovieDao implements Dao<Movie> {



    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Movie get(int id) {

        Session currentSession = sessionFactory.getCurrentSession();

        Movie movie = currentSession.get(Movie.class, id);

        return movie;

    }

    @Override
    public Collection<Movie> getAll() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query<Movie> query = currentSession.createQuery("from Movie", Movie.class);

        List<Movie> movies = query.getResultList();

        return movies;

    }

    public Collection<Movie> getAll(String category) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Movie> query = currentSession.createQuery("from Movie where category = :category", Movie.class);

        query.setParameter("category", category);

        List<Movie> movies = query.getResultList();

        return movies;

    }
}
