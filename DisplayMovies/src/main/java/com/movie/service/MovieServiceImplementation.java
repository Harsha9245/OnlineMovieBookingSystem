package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.entity.MovieInfo;
import com.movie.repository.MovieRepository;



@Service
public class MovieServiceImplementation implements MovieServiceInterface {

	@Autowired
	MovieRepository mrepo;	
	
	@Override
	public List<MovieInfo> displayMovies() {
		List<MovieInfo> result=mrepo.findAll();
		return result;
	}
	
}
