package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Seance implements Serializable {
	
	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date heureDebut;
	
	@JsonIgnore
	@OneToOne(mappedBy="seance")
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

	
	
	public ProjectionFilm getProjectionFilm() {
		return projectionFilm;
	}

	public void setProjectionFilm(ProjectionFilm projectionFilm) {
		this.projectionFilm = projectionFilm;
	}

	@Override
	public String toString() {
		return "Seance [id=" + id + ", heureDebut=" + heureDebut + "]";
	}
	
	
	
	
}// fin class
