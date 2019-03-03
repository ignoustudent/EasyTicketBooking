/**
 * 
 */
package com.etb.config.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Rakesh Singh
 *
 */
@Entity
@Table(name = "show_details")
public class ShowDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="show_date")
	private String showDate;
	
	@Column(name="show_day")
	private String showDay;
	
	@Column(name = "show_time")
	private String showTime;

	
	@Column(name = "silver_rate")
	private Integer silverRate;

	@Column(name = "club_rate")
	private Integer clubRate;

	@OneToMany(mappedBy = "showDetails")
	private List<BookingDetails> bookingDetails;

	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cinema_id")
	private CinemaDetails cinemaDetails;
	
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="movie_id")
	private MovieDetails movieDetails;
	
	@Column(name="availability")
	private String availability;
	
	@Transient
	private List<String> seatList = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSilverRate() {
		return silverRate;
	}

	public void setSilverRate(Integer silverRate) {
		this.silverRate = silverRate;
	}

	public Integer getClubRate() {
		return clubRate;
	}

	public void setClubRate(Integer clubRate) {
		this.clubRate = clubRate;
	}

	public CinemaDetails getCinemaDetails() {
		return cinemaDetails;
	}

	public void setCinemaDetails(CinemaDetails cinemaDetails) {
		this.cinemaDetails = cinemaDetails;
	}

	public MovieDetails getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getShowDay() {
		return showDay;
	}

	public void setShowDay(String showDay) {
		this.showDay = showDay;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	
	
	public List<BookingDetails> getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(List<BookingDetails> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public List<String> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<String> seatList) {
		this.seatList = seatList;
	}

	
}
