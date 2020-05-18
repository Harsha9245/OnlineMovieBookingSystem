package com.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movie.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show,Integer>{

	@Query("select s from Show s where theatre_name=?1")
	List<Show> displayShowsByTheatre(String theatrename);

}
