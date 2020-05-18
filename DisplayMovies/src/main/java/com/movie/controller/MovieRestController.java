/**
 * 
 */
package com.movie.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ControllerAdvice.NoDataFoundException;
import com.movie.entity.MovieInfo;
import com.movie.service.MovieServiceInterface;

@RestController
@RequestMapping("/movie")
@CrossOrigin("http://localhost:4200")
public class MovieRestController {
	@Autowired
	MovieServiceInterface service;
	
	

	@GetMapping("/display_movies")
	public ResponseEntity<List<MovieInfo>> displayMovies() throws NoDataFoundException{
		List<MovieInfo> result=service.displayMovies();
		if(result.isEmpty()) {
			throw new NoDataFoundException("No Movies available");
		}
		return new ResponseEntity<List<MovieInfo>>(result,HttpStatus.OK);

	}

}
