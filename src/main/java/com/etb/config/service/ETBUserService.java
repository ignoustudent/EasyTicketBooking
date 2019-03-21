/**
 * 
 */
package com.etb.config.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.etb.config.exception.ETBBusinessLogicException;
import com.etb.config.model.User;

/**
 * @author Rakesh Singh
 *
 */
public interface ETBUserService extends UserDetailsService {

	public User register(User user) throws ETBBusinessLogicException;
	public User getUserById(Integer id);
	public User updatePassword(String email, String password);
	public void update(User user);
	public User getUserByEmail(String username);
}
