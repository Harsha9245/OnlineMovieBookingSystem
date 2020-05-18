package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.entity.MovieInfo;
@Repository
public interface MovieRepository extends JpaRepository<MovieInfo,Integer>{

}
