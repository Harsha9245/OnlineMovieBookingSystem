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
import com.movie.entity.Show;
import com.movie.service.MovieServiceInterface;

@RestController
@RequestMapping("/movie")
@CrossOrigin("http://localhost:4200")
public class MovieRestController {
	@Autowired
	MovieServiceInterface service;
	
	
	
	@GetMapping("/display_shows/{theatrename}")
	public List<Show> displayShows(@PathVariable("theatrename") String theatrename) throws NoDataFoundException{
		List<Show> list = service.displayShows(theatrename);
		if(list.isEmpty()) {
			throw new NoDataFoundException("No Shows found");
		}
		return list;
	}
	
	

	
}
