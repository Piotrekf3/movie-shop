package com.piotrek.movieshop.com.piotrek.movieshop.dao;

import java.util.Collection;

public interface Dao<T> {

    T get(int id);

    Collection<T> getAll();

}
