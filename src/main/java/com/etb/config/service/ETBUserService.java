/**
 * 
 */
package com.etb.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etb.config.model.User;
import com.etb.config.repo.ETBUserDao;

/**
 * @author Rakesh Singh
 *
 */
@Service
public class ETBUserService {

	@Autowired
	private ETBUserDao etbUserDao;
	
	public User register(User user) {
		
		return etbUserDao.save(user);
	}

	public User getUserById(Integer id) {
		
		return etbUserDao.findById(id).get();
	}
}
