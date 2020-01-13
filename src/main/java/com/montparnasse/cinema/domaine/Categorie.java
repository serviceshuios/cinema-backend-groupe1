package com.montparnasse.cinema.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Categorie {

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	

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
