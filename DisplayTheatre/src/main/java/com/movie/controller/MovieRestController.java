/**
 * 
 */
package com.movie.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ControllerAdvice.NoDataFoundException;
import com.movie.entity.Theatre;
import com.movie.service.MovieServiceInterface;

@RestController
@RequestMapping("/movie")
@CrossOrigin("http://localhost:4200")
public class MovieRestController {
	@Autowired
	MovieServiceInterface service;
	
	
	@GetMapping("/display_theatres/{moviename}")
	public List<Theatre> displayTheatres(@PathVariable("moviename") String moviename) throws NoDataFoundException{
		List<Theatre> list = service.displayTheatres(moviename);
		if(list.isEmpty()) {
			throw new NoDataFoundException("No Theatres found");
		}
		return list;
	}
	
	
	}
	
