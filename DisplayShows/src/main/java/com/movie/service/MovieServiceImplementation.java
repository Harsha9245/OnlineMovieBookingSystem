package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.entity.Show;
import com.movie.repository.ShowRepository;


@Service
public class MovieServiceImplementation implements MovieServiceInterface {


	@Autowired
	ShowRepository srepo;
	

	@Override
	public List<Show> displayShows(String theatrename) {
		return srepo.displayShowsByTheatre(theatrename);
	}	
	
}
