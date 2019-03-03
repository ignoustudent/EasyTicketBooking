/**
 * 
 */
package com.etb.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etb.config.dao.ShowRepository;
import com.etb.config.model.MovieDetails;
import com.etb.config.model.ShowDetails;

/**
 * @author Rakesh Singh
 *
 */
@Service
public class ShowService {

	@Autowired
	private ShowRepository showrepository;

	/**
	 * @param movie
	 * @return
	 */
	public Iterable<ShowDetails> getShowDetailsByMovie(MovieDetails movie) {
		
		return showrepository.findShowDetailsByMovieDetails(movie);
	}

	
	public ShowDetails findShowDetailsById(int showId) {
		
		return showrepository.findById(showId).get();
	}


	
	public ShowDetails getShowDetailsById(Integer showId) {
		
		return showrepository.findById(showId).get();
	}

	
	
}
