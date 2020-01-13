package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Seance implements Serializable {
	
	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date heureDebut;
	
	@OneToOne(mappedBy="seance", cascade=CascadeType.ALL)
	private ProjectionFilm projectionFilm;

	
	/*--------------constructeurs------------------*/
	public Seance() {
	}// fin ctor vide
	
	public Seance(Date heureDebut) {
		this.heureDebut = heureDebut;
	}// fin ctor chargé

	
	/*---------encapsulation-----------------*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	@Override
	public String toString() {
		return "Seance [id=" + id + ", heureDebut=" + heureDebut + "]";
	}
	
	
	
	
}// fin class
