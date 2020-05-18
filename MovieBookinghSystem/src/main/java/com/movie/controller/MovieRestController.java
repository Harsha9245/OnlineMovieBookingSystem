/**
 * 
 */
package com.movie.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.movie.entity.MovieInfo;
import com.movie.entity.Show;
import com.movie.entity.Theatre;
import com.movie.service.MovieServiceInterface;

@RestController
@RequestMapping("/movie")
@CrossOrigin("http://localhost:4200")
public class MovieRestController {
	@Autowired
	MovieServiceInterface service;
	
	@PostMapping("/add_movies")
	public ResponseEntity<String> addmovies(@RequestBody MovieInfo movie) {
		String Check=null;
		MovieInfo result=service.addmovies(movie);
		if(result!=null) {
			 Check= "movies added!!";
		}
		else
			 Check= "Operation Unsuccessful!!";
		return new ResponseEntity<String>(Check,HttpStatus.OK);
	}

	@GetMapping("/display_movies")
	public ResponseEntity<List<MovieInfo>> displayMovies(){
		List<MovieInfo> result=service.displayMovies();
		return new ResponseEntity<List<MovieInfo>>(result,HttpStatus.OK);

	}
	
	@DeleteMapping("/delete_movies")
	public ResponseEntity<String> deleteMovies(){
		service.deleteMovies();
		return new ResponseEntity<String>("Deleted all movies",HttpStatus.OK);
		
	}
	
	@GetMapping("/display_theatres/{moviename}")
	public List<Theatre> displayTheatres(@PathVariable("moviename") String moviename){
		List<Theatre> list = service.displayTheatres(moviename);
		return list;
	}
	
	@GetMapping("/display_shows/{theatrename}")
	public List<Show> displayShows(@PathVariable("theatrename") String theatrename){
		List<Show> list = service.displayShows(theatrename);
		return list;
	}
	
	

	
}
