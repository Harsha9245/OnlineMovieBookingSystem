package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.entity.MovieInfo;
import com.movie.entity.Show;
import com.movie.entity.Theatre;
import com.movie.repository.MovieRepository;
import com.movie.repository.ShowRepository;
import com.movie.repository.TheatreRepository;


@Service
public class MovieServiceImplementation implements MovieServiceInterface {

	@Autowired
	MovieRepository mrepo;
	@Autowired
	TheatreRepository trepo;
	@Autowired
	ShowRepository srepo;
	
	
	
	
	@Override
	public List<MovieInfo> displayMovies() {
		List<MovieInfo> result=mrepo.findAll();
		return result;
	}
	
	@Override
	public MovieInfo addmovies(MovieInfo movie) {
		return mrepo.save(movie);
	}
	
	@Override
	public void deleteMovies() {
		 mrepo.deleteAll();
	}

	@Override
	public List<Theatre> displayTheatres(String moviename) {
		return trepo.findTheatresByMoviename(moviename);
	}

	@Override
	public List<Show> displayShows(String theatrename) {
		return srepo.displayShowsByTheatre(theatrename);
	}	
	
}
