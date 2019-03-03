/**
 * 
 */
package com.etb.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etb.config.model.MovieDetails;
import com.etb.config.repo.MovieRepository;

/**
 * @author Rakesh Singh
 *
 */

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieReppsitory;

	public Iterable<MovieDetails> getMovies() {
		
		return movieReppsitory.findAll();
	}

	
	public MovieDetails getMovieDetailsById(Integer movieId) {
		
		return movieReppsitory.findById(movieId).get();
	}
	
	
}
