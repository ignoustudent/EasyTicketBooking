/**
 * 
 */
package com.etb.config.service.impl;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.etb.config.exception.ETBBusinessLogicException;
import com.etb.config.model.Role;
import com.etb.config.model.User;
import com.etb.config.repo.ETBUserDao;
import com.etb.config.service.ETBUserService;

/**
 * @author Rakesh Singh
 *
 */
@Service
public class ETBUserServiceImpl implements ETBUserService {

	private static final Logger log = LoggerFactory.getLogger(ETBUserServiceImpl.class);
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private ETBUserDao etbUserDao;
	
	public User register(User user) throws ETBBusinessLogicException {
		
		log.info("PatientServiceImpl.create() Persisting Patient  Details");
		if(!user.getPassword().equals(user.getConfirmPassword())){
			log.error("EtbUserServiceImpl.register(): Password Mismatch throwing exception");
			throw new ETBBusinessLogicException("userCredential.password", "Password Mismatch");
		
		}
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRole(Role.USER);
		return etbUserDao.save(user);
	}

	public User getUserById(Integer id) {
		
		return etbUserDao.findById(id).get();
	}

	@Override
	public User updatePassword(String email, String password) {
		log.info("@@@@@@@@@@@@@@@Going to Update Password @@@@@@@@@@@@@@@@{}",email);
		User userCred = etbUserDao.getUserByEmail(email);
		if(userCred != null){
			
			userCred.setPassword(bCryptPasswordEncoder.encode(password));
			//LOGGER.info("@@@@@@@@@@@@@ Decrypting Details @@@@@@@@@@@{}",bCryptPasswordEncoder.d);
			etbUserDao.save(userCred);
			return userCred;
		}
		return null;
	}
	
	@Override
	public UserDetails loadUserByUsername(String userName) {
		User userCredential = etbUserDao.getUserByEmail(userName);
		log.info("@@@@@@@@@@@@@@@Going to login with  User Name @@@@@@@@@@@@@@@@{}",userName);
		GrantedAuthority authority = new SimpleGrantedAuthority(userCredential.getRole().toString());
		org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(userCredential.getEmail(), userCredential.getPassword(), Arrays.asList(authority));
		UserDetails userDetails = (UserDetails)user;
		log.info("@@@@@@@@@@@@@@@ Returning from loadUserByUsername @@@@@@@@@@@@@@@@{}",userName);
		return userDetails;
	}

	/* (non-Javadoc)
	 * @see com.etb.config.service.ETBUserService#update(com.etb.config.model.User)
	 */
	@Override
	public void update(User user) {
		
		etbUserDao.save(user);
		
	}

	/* (non-Javadoc)
	 * @see com.etb.config.service.ETBUserService#getUserByEmail(java.lang.String)
	 */
	@Override
	public User getUserByEmail(String username) {
		
		return etbUserDao.getUserByEmail(username);
	}


}
