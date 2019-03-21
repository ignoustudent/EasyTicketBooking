/**
 * 
 */
package com.etb.config.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etb.config.model.MovieDetails;
import com.etb.config.model.ShowDetails;

/**
 * @author Rakesh Singh
 *
 */
@Repository
public interface ShowRepository extends JpaRepository<ShowDetails, Integer>{

	/**
	 * @param movie
	 * @return
	 */
	Iterable<ShowDetails> findShowDetailsByMovieDetails(MovieDetails movie);

}
