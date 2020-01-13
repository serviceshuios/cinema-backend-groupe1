package com.montparnasse.cinema.domaine;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;


@Entity
public class Salle {

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int nombrePlaces;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="film_assoc_salle",
	joinColumns= @JoinColumn(name="FILM_ID"),
	inverseJoinColumns=@JoinColumn(name="SALLE_ID")
	)
	private List<Film> listeFilms;
	
	@ManyToOne
	private Cinema cinema;
	
	@OneToMany(mappedBy = "salle",cascade = CascadeType.ALL)
	private List<Place> listPlace;

	/*-----------constructeurs-------------------*/
	public Salle() {
		
	}// fin ctor vide


	public Salle(String name, int nombrePlaces) {
		super();
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
