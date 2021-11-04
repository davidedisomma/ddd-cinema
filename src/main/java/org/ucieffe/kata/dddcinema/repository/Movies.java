package org.ucieffe.kata.dddcinema.repository;

import org.ucieffe.kata.dddcinema.model.Date;
import org.ucieffe.kata.dddcinema.model.Movie;

import java.util.List;

public interface Movies {

    List<Movie> availableOn(Date date);
}
