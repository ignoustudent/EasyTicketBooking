/**
 * 
 */
package com.etb.config.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rakesh Singh
 *
 */
@Entity
@Table(name="movie")
public class MovieDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="movie_desc")
	private String movieDesc;
	
	@Column(name="release_date")
	private Date releaseDate;

	@Column(name="leading_actors")
	private String leadingActors;
	
	@Column(name="director")
	private String director;
	
	@Column(name="status")
	private Integer status;
	
	@OneToMany(mappedBy="movieDetails", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<ShowDetails> showDetails;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLeadingActors() {
		return leadingActors;
	}

	public void setLeadingActors(String leadingActors) {
		this.leadingActors = leadingActors;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	

	public List<ShowDetails> getShowDetails() {
		return showDetails;
	}

	public void setShowDetails(List<ShowDetails> showDetails) {
		this.showDetails = showDetails;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}	
	
	
}
