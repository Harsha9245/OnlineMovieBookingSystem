package com.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movie.entity.Theatre;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {

	
	@Query("select t from Theatre t where moviename=?1")
	List<Theatre> findTheatresByMoviename(String moviename);

}
