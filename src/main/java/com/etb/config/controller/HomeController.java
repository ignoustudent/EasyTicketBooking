/**
 * 
 */
package com.etb.config.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etb.config.model.MovieDetails;
import com.etb.config.model.User;
import com.etb.config.service.MovieService;

/**
 * @author Rakesh Singh
 *
 */

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private MovieService movieService;
	@RequestMapping("/")
	public String homePage(ModelMap model){
		
	    log.info("########### HomeController:homePage Getting Movie List from DB ##########");
		Iterable<MovieDetails> movies = movieService.getMovies();
		model.addAttribute("movies",movies);
		log.info("###########HomeController:homePage  End ##########");
		return "index";
	}
	
	 @RequestMapping(value="/admin/dashboard",method=RequestMethod.GET)
	 public String loginSuccess(ModelMap modelMap){
		 
		 User user = new User();
		 modelMap.addAttribute("loggedInUser",user);
		 
		 
		 /*User user =  (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 GrantedAuthority grantedAuthority = user.getAuthorities().iterator().next();
		 List<Hospital> hospitals = hospitalService.geAllHospital();
		 List<Doctor> doctors = doctorService.getAllRegisteredDoctor();
		 List<AppointmentDetail> appointmentList = appointmentService.getAllAppointment();
		
		 modelMap.addAttribute("hospitalCount",hospitals.size());
		 modelMap.addAttribute("doctorCount",doctors.size());
		 modelMap.addAttribute("appointmentCount",appointmentList.size());
		 modelMap.addAttribute("userRole",grantedAuthority.getAuthority());
		 if(Role.PATIENT.toString().equals(grantedAuthority.getAuthority())){
			 Patient patient = patientService.getPatientByEmail(user.getUsername());
			 if(patient.getImage() != null){
				 
				 String base64Str = Base64.getEncoder().encodeToString(patient.getImage());
				 patient.setBase64Image(base64Str);
			 }
			 modelMap.addAttribute("loggedInUser",patient);
		 }else if(Role.ADMIN.toString().equals(grantedAuthority.getAuthority())){
			 
			 Staff staff = staffService.getStaffByEmail(user.getUsername());
			 if(staff.getImage() != null){
				 
				 String base64Str = Base64.getEncoder().encodeToString(staff.getImage());
				 staff.setBase64Image(base64Str);
			 }
			 
			 if(staff.getUserCredential() != null)
			 staff.getUserCredential().setRole(Role.ADMIN);
			 modelMap.addAttribute("loggedInUser",staff);*/
			
		// }
		 return "secure_dashboard";
	 }
}
