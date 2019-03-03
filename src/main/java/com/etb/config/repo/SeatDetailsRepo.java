/**
 * 
 */
package com.etb.config.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etb.config.model.SeatDetails;

/**
 * @author Rakesh Singh
 *
 */
public interface SeatDetailsRepo extends JpaRepository<SeatDetails, Integer> {
	
	Iterable<SeatDetails> getSeatDetailsBySeatCategory(String seatCat);
}
