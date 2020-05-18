package com.movie.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "theatre")
public class Theatre implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length = 3)
	private int theatre_id;
	@Column(length = 10)
	private String city_name;
	@Column(name = "theatre_name", length = 10)
	private String theatre_name;
	@Column(name = "Movie_Name", length = 10)
	private String moviename;
	

	@OneToMany(targetEntity = Show.class,cascade = CascadeType.ALL)
	@JoinColumn(name="Theatre_Name",referencedColumnName = "theatre_name")
	List<Show> show=new ArrayList<Show>();
	
	
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public List<Show> getShow() {
		return show;
	}
	public void setShow(List<Show> show) {
		this.show = show;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getTheatre_id() {
		return theatre_id;
	}
	public void setTheatre_id(int theatre_id) {
		this.theatre_id = theatre_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getTheatre_name() {
		return theatre_name;
	}
	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}	
}

