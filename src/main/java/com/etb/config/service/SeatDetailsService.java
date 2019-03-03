/**
 * 
 */
package com.etb.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etb.config.model.SeatDetails;
import com.etb.config.repo.SeatDetailsRepo;

/**
 * @author Rakesh Singh
 *
 */
@Service
public class SeatDetailsService {

	@Autowired
	private SeatDetailsRepo seatDetailsRepo;

	
	public Iterable<SeatDetails> getSeatsBySeatCategory(String seatCat) {
		
		return seatDetailsRepo.getSeatDetailsBySeatCategory(seatCat);
	}
}
