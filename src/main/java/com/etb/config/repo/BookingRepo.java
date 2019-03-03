/**
 * 
 */
package com.etb.config.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etb.config.model.BookingDetails;
import com.etb.config.model.ShowDetails;

/**
 * @author Rakesh Singh
 *
 */
@Repository
public interface BookingRepo extends JpaRepository<BookingDetails, Integer>{

	
	List<BookingDetails> getBookingDetailsByShowDetails(ShowDetails showDetails);

}
