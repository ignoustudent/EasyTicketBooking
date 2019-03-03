/**
 * 
 */
package com.etb.config.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Rakesh Singh
 *
 */

@Entity
@Table(name="seat_details")
public class SeatDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="row_no")
	private String rowNo;
	
	@Column(name="seat_no")
	private String seatNo;
	
	@Column(name="seat_category")
	private String seatCategory;
	
	@ManyToOne
	@JoinColumn(name="cinema_id")
	private CinemaDetails cinemaDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRowNo() {
		return rowNo;
	}

	public void setRowNo(String rowNo) {
		this.rowNo = rowNo;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getSeatCategory() {
		return seatCategory;
	}

	public void setSeatCategory(String seatCategory) {
		this.seatCategory = seatCategory;
	}

	public CinemaDetails getCinemaDetails() {
		return cinemaDetails;
	}

	public void setCinemaDetails(CinemaDetails cinemaDetails) {
		this.cinemaDetails = cinemaDetails;
	}

	
	
}
