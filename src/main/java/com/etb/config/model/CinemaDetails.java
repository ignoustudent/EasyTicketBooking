/**
 * 
 */
package com.etb.config.model;

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

/**
 * @author Rakesh Singh
 *
 */
@Entity
@Table(name="cinema_details")
public class CinemaDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="about")
	private String about;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="city_id")
	private City city;

	
    @OneToMany(mappedBy="cinemaDetails",cascade=CascadeType.ALL)
    private List<SeatDetails> seatDetails;
    
    @OneToMany(mappedBy="cinemaDetails",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<ShowDetails> showDetails;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<SeatDetails> getSeatDetails() {
		return seatDetails;
	}

	public void setSeatDetails(List<SeatDetails> seatDetails) {
		this.seatDetails = seatDetails;
	}

	public List<ShowDetails> getShowDetails() {
		return showDetails;
	}

	public void setShowDetails(List<ShowDetails> showDetails) {
		this.showDetails = showDetails;
	}
	
}
