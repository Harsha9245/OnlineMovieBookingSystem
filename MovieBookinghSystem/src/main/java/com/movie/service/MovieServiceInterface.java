package com.movie.service;

import java.util.List;


import com.movie.entity.MovieInfo;
import com.movie.entity.Show;
import com.movie.entity.Theatre;


public interface MovieServiceInterface {

	List<MovieInfo> displayMovies();

	MovieInfo addmovies(MovieInfo movie);

	void deleteMovies();

	List<Theatre> displayTheatres(String moviename);

	List<Show> displayShows(String theatrename);

}
