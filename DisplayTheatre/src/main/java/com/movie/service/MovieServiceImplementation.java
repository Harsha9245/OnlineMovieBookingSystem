package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.entity.Theatre;
import com.movie.repository.TheatreRepository;


@Service
public class MovieServiceImplementation implements MovieServiceInterface {

	@Autowired
	TheatreRepository trepo;


	@Override
	public List<Theatre> displayTheatres(String moviename) {
		return trepo.findTheatresByMoviename(moviename);
	}


	
}
