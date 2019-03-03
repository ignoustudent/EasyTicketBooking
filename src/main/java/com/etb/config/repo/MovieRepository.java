/**
 * 
 */
package com.etb.config.repo;

import org.springframework.data.repository.CrudRepository;

import com.etb.config.model.MovieDetails;

/**
 * @author Rakesh Singh
 *
 */
public interface MovieRepository extends CrudRepository<MovieDetails, Integer>{

}
