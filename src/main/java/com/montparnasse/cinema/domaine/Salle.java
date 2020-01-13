package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Salle implements Serializable{

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nombrePlaces;
	
	@OneToMany(mappedBy="id.salle")
	private List<SalleFilm> salleFilm = new ArrayList<SalleFilm>();
	
	@ManyToOne
	private Cinema cinema;
	
	@OneToMany(mappedBy = "salle",cascade = CascadeType.ALL)
	private List<Place> listPlace;

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


	@Override
	public String toString() {
		return "Salle [id=" + id + ", name=" + name + ", nombrePlaces=" + nombrePlaces + "]";
	}
	

}// fin class
