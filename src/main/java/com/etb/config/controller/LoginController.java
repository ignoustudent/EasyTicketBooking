/**
 * 
 */
package com.etb.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etb.config.model.User;

/**
 * @author Rakesh Singh
 *
 */

@Controller
public class LoginController {

	
	@RequestMapping(value="/login")
	private String loginPage(ModelMap model) {
		
		model.addAttribute("user", new User());
		return "login";
		
	}
	
	
}
