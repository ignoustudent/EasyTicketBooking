/**
 * 
 */
package com.etb.config.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.etb.config.model.BookingDetails;
import com.etb.config.model.MovieDetails;
import com.etb.config.model.ShowDetails;
import com.etb.config.service.BookingService;
import com.etb.config.service.MovieService;
import com.etb.config.service.ShowService;

/**
 * @author Rakesh Singh
 *
 */
@Controller
@RequestMapping("/show")

public class ShowController {

	@Autowired
	private ShowService showService;
	
	@Autowired
	private BookingService bookingService;
	
	private static final Logger log = LoggerFactory.getLogger(ShowController.class);
	
	@ResponseBody
	@RequestMapping(value="/showDetails")
	public ShowDetails getShowDetails(@RequestParam int showId) {
		log.info("#################### ShowController:getShowDetails Start ##################");
		ShowDetails showDetails = showService.findShowDetailsById(showId);
		List<BookingDetails> bookingDetails = bookingService.getBookingDetailsByShowDetails(showDetails);
		List<String> bookedSeats = new ArrayList<>();
		
		for(BookingDetails bDetails : bookingDetails) {
			
			for(String seat : bDetails.getBookedSeats().split(",")) {
			
				bookedSeats.add(seat);
			}
		}
		
		//model.addAttribute("showDetails",showDetails);
		showDetails.setSeatList(bookedSeats);
		log.info("#################### ShowController:getShowDetails End ##################");
		return showDetails;
		
	}
}
