package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "Salle", //
uniqueConstraints = { //
        @UniqueConstraint(name = "SALLE", columnNames = "Salle_Name") })
public class Salle implements Serializable{

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Salle_Id", nullable = false)
	private Long id;
	@Column(name = "Salle_Name", nullable = false)
	private String name;
	private int nombrePlaces;
	
	@ManyToOne
	private Cinema cinema;
	
	@JsonIgnore
	@OneToMany(mappedBy = "salle",cascade = CascadeType.ALL)
	private List<Place> listPlace;
	
	@JsonIgnore
	@OneToMany(mappedBy = "salle",cascade = CascadeType.ALL)
	private List<ProjectionFilm> listProjectionFilm;

	/*-----------constructeurs-------------------*/
	
	public Salle() {
	}// fin ctor vide


	public Salle(String name, int nombrePlaces) {
		this.name = name;
		this.nombrePlaces = nombrePlaces;
	}// fin ctor chargé


	/*-----------------encapsulation----------------*/
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNombrePlaces() {
		return nombrePlaces;
	}


	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	

	public Cinema getCinema() {
		return cinema;
	}


	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}


	public List<Place> getListPlace() {
		return listPlace;
	}


	public void setListPlace(List<Place> listPlace) {
		this.listPlace = listPlace;
	}

	

	public List<ProjectionFilm> getListProjectionFilm() {
		return listProjectionFilm;
	}


	public void setListProjectionFilm(List<ProjectionFilm> listProjectionFilm) {
		this.listProjectionFilm = listProjectionFilm;
	}


	@Override
	public String toString() {
		return "Salle [id=" + id + ", name=" + name + ", nombrePlaces=" + nombrePlaces + "]";
	}
	

}// fin class
