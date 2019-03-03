/**
 * 
 */
package com.etb.config.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Rakesh Singh
 *
 */
@Entity
@Table(name="booking_details")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="tkt_owner_name")
	private String ticketOwnerName;
	
	@Column(name="booked_seats")
	private String bookedSeats;
	
	@Column(name="amount_paid")
	private Double amountPaid;
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	@JoinColumn(name="show_id")
	private ShowDetails showDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getTicketOwnerName() {
		return ticketOwnerName;
	}

	public void setTicketOwnerName(String ticketOwnerName) {
		this.ticketOwnerName = ticketOwnerName;
	}

	public String getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(String bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

	public ShowDetails getShowDetails() {
		return showDetails;
	}

	public void setShowDetails(ShowDetails showDetails) {
		this.showDetails = showDetails;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
}
