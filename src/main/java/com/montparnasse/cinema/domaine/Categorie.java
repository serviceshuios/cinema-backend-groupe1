package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorie implements Serializable {

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "categorie",cascade = CascadeType.ALL)
	private List<Film> listFilm;
	

	/*----------constructeurs-----------*/
	
	public Categorie() {
	}// fin ctor vide
	
	public Categorie(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", name=" + name + "]";
	}

	
}// fin class
