/**
 * 
 */
package com.etb.config.controller;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.etb.config.exception.ETBBusinessLogicException;
import com.etb.config.model.User;
import com.etb.config.service.ETBUserService;

/**
 * @author Rakesh Singh
 *
 */

@Controller
@SessionAttributes({"loggedInUser"})
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
		User savedUser = null;
		try {
			savedUser = etbUserService.register(user);
		} catch (ETBBusinessLogicException e) {
			log.error("Exception occurred while creating user");
			
		}
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
	
	
	@RequestMapping(value="/user/uploadimage", method=RequestMethod.POST)
	public String upload(@RequestParam("uploadfile") MultipartFile uploadfile,ModelMap modelMap){
		
		log.info("HomeController.upload() upload start");
		String base64Str = "";
		log.info("uploading file :- {}",uploadfile.getOriginalFilename());
		try{
			String userRole = (String) modelMap.get("userRole");
			User user = (User) modelMap.get("loggedInUser");
			user.setImage(uploadfile.getBytes());
			etbUserService.update(user);
			base64Str =  new String(Base64.getEncoder().encodeToString(user.getImage()));
			user.setBase64Image(base64Str);
			modelMap.addAttribute("loggedInUser",user);
			
		}catch(Exception e){
		
			log.error("Error occurred while uploading file{}",e.getMessage());
		}
		
		return "redirect:/admin/dashboard";
		
	}
	
}
