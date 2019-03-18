/**
 * 
 */
package com.etb.config.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etb.config.model.User;

/**
 * @author Rakesh Singh
 *
 */
@Repository
public interface ETBUserDao extends CrudRepository<User, Integer> {

	
}
