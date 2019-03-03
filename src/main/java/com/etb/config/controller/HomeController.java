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

import com.etb.config.model.MovieDetails;
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
}
