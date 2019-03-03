/**
 * 
 */
package com.etb.config.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etb.config.model.MovieDetails;
import com.etb.config.model.SeatDetails;
import com.etb.config.model.ShowDetails;
import com.etb.config.service.MovieService;
import com.etb.config.service.SeatDetailsService;
import com.etb.config.service.ShowService;

/**
 * @author Rakesh Singh
 *
 */
@Controller
@RequestMapping("/movie")
public class MovieController {

	private static final Logger log = LoggerFactory.getLogger(MovieController.class);
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private ShowService showService;
	
	@Autowired
	private SeatDetailsService seatDetailsService;
	
	@RequestMapping(value="/details/{movieid}")
	public String movieDetails(@PathVariable("movieid") Integer movieId, ModelMap modelMap) {
		log.info("############# MovieController:movieDetails start #############");
		MovieDetails movie = movieService.getMovieDetailsById(movieId);
		Iterable<ShowDetails> showDetails = showService.getShowDetailsByMovie(movie);
		List<ShowDetails> showDetailsList = (List<ShowDetails>) showDetails;
	    List<SeatDetails> silverSeatDetails = (List<SeatDetails>) seatDetailsService.getSeatsBySeatCategory("Silver");
	   Collections.sort(silverSeatDetails,(s1,s2)-> s1.getRowNo().compareTo(s2.getRowNo()));
	   
	   
	List<SeatDetails> clubSeatDetails =  (List<SeatDetails>) seatDetailsService.getSeatsBySeatCategory("Club");
	Collections.sort(clubSeatDetails, (s1,s2)-> s1.getRowNo().compareTo(s2.getRowNo()));
	   
	   
		List<String> chars = Arrays.asList(new String[] {"J","I","H","G","F","E","D","C","B","A"});
		modelMap.addAttribute("movie",movie);
		modelMap.addAttribute("chars",chars);
		modelMap.addAttribute("showDetailsList",showDetailsList);
		modelMap.addAttribute("silverSeatDetails",silverSeatDetails);
		modelMap.addAttribute("clubSeatDetails",clubSeatDetails);
		log.info("############# MovieController:movieDetails End #############");
		return "details";
	}
}
