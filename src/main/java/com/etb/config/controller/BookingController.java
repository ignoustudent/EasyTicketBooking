/**
 * 
 */
package com.etb.config.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.etb.config.model.BookingDetails;
import com.etb.config.model.ShowDetails;
import com.etb.config.service.BookingService;
import com.etb.config.service.ShowService;

/**
 * @author Rakesh Singh
 *
 */
@Controller
@RequestMapping(value="/booking")
public class BookingController {

	
	private static final Logger log = LoggerFactory.getLogger(BookingController.class);

	@Autowired 
	private ShowService showService;
	
	@Autowired
	private BookingService bookingService;
	
	@ResponseBody
	@GetMapping("/process")
	public String initiateBooking(HttpSession session,@RequestParam("showId") Integer showId,@RequestParam("seatIds") String seatIds) {
		
		log.info("##################### BookingController:initiateBooking start ####################");
		log.info(showId+seatIds);
		seatIds = seatIds.substring(0, seatIds.length()-1);
		ShowDetails showDetails = showService.getShowDetailsById(showId);
		if(null != showDetails) {
		List<String> selectedSeatList = Arrays.asList(seatIds.split(","));
		session.setAttribute("selectedSeatList", selectedSeatList);
		session.setAttribute("showDetails", showDetails);
		return "true";
		}
		
		log.info("##################### BookingController:initiateBooking end ####################");
		return "There is a technical problem please try after some time";
	}
	
	@PostMapping("/book")
	public RedirectView bookTicketAndPersist(HttpSession session) {
		
		log.info("##################### BookingController:bookTicketAndPersist Start ####################");
		List<String> seats = (List<String>) session.getAttribute("selectedSeatList");
		String seatStr = "";
		for(String str : seats)
			seatStr += str+",";
		
		seatStr = seatStr.substring(0,seatStr.length()-1);
		ShowDetails details = (ShowDetails) session.getAttribute("showDetails");
		BookingDetails bookingDetails = new BookingDetails();
		bookingDetails.setTicketOwnerName("Test");
		bookingDetails.setBookedSeats(seatStr);
		bookingDetails.setShowDetails(details);
		Integer id = bookingService.persistData(bookingDetails).getId();
		bookingDetails.setAmountPaid(400.00);
		RedirectView view = new RedirectView();
		view.setContextRelative(true);
		view.setUrl("/booking/details/"+id);
		log.info("##################### BookingController:bookTicketAndPersist End ####################");
		return view;
	}
	
	@GetMapping("/details/{id}")
	public String bookedShowDetails(@PathVariable("id") Integer id, ModelMap modelMap) {
		BookingDetails details = bookingService.getBookingDetailsById(id);
		modelMap.addAttribute("bookingDetails",details);
		return "ticketdetails";
	}
}
