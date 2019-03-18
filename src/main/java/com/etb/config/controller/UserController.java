/**
 * 
 */
package com.etb.config.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.etb.config.model.User;
import com.etb.config.service.ETBUserService;

/**
 * @author Rakesh Singh
 *
 */

@Controller
public class UserController {

	@Autowired
	private ETBUserService etbUserService;
	
	private Logger log = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/user/signup")
	private String signUp(ModelMap modelMap) {
		log.info("############# UserController: signUp Rendering SignupPage start ################### ");
		
		modelMap.addAttribute("user",new User());
		
		log.info("############# UserController: signUp Rendering SignupPage start ################### ");
		return "signup";
	}
	
	@PostMapping("/user/signup")
	public String saveUserDetails(@ModelAttribute("user") User user,ModelMap model,RedirectAttributes redirectAttributes) {
		
		log.info("############# UserController: saveUserDetails Start ################### ");
		
		log.info("User Name"+user.getFirstName());
		User savedUser = etbUserService.register(user);
		model.addAttribute("user",user);
		redirectAttributes.addAttribute("regStatus","Hi "+user.getFirstName()+" you have been successfully registered with us");
		redirectAttributes.addAttribute("registeredUserId",savedUser.getId());
		log.info("############# UserController: saveUserDetails End ################### ");
		
		return "redirect:/user/profile";
	}
	
	@GetMapping("/user/profile")
	private String profilePage(@ModelAttribute("regStatus")String regStatus, @ModelAttribute("registeredUserId")Integer registeredUserId ,ModelMap model) {
		
		
		if(null != model.get("registeredUserId"))
			
		if(null != registeredUserId) {
		User user = etbUserService.getUserById(registeredUserId);
		model.addAttribute("user",user);
		model.addAttribute("regStatus",regStatus);
		}
		return "profile";
				
	}
	
	
	
	
}
