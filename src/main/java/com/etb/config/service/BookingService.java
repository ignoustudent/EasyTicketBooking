/**
 * 
 */
package com.etb.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etb.config.model.BookingDetails;
import com.etb.config.model.ShowDetails;
import com.etb.config.repo.BookingRepo;

/**
 * @author Rakesh Singh
 *
 */
@Service
public class BookingService {

	@Autowired
	private BookingRepo bookingRepo;
	
	public BookingDetails getBookingDetailsById(Integer id) {
		
		return bookingRepo.findById(id).get();
	}

	/**
	 * @param bookingDetails
	 * @return
	 */
	public BookingDetails persistData(BookingDetails bookingDetails) {
		return bookingRepo.save(bookingDetails);
	}

	/**
	 * @param showDetails
	 * @return
	 */
	public List<BookingDetails> getBookingDetailsByShowDetails(ShowDetails showDetails) {
		return bookingRepo.getBookingDetailsByShowDetails(showDetails);
	}
}
