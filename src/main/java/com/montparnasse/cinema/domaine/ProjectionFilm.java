package com.montparnasse.cinema.domaine;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

@Entity
public class ProjectionFilm {
	
	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateProjection;
	private double prix;
	
	@OneToMany(mappedBy = "projectionFilm",cascade = CascadeType.ALL)
	private List<Ticket> listTicket;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="SEANCE_ID", referencedColumnName="idSeance")// nom de la colonne de la classe
	private Seance seance;
	
	

	/*--------------constructeurs------------------*/
public ProjectionFilm() {
		
	}// fin ctor


	public ProjectionFilm(Date dateProjection, double prix) {
		super();
		this.dateProjection = dateProjection;
		this.prix = prix;
	}

	/*---------encapsulation-----------------*/
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateProjection() {
		return dateProjection;
	}


	public void setDateProjection(Date dateProjection) {
		this.dateProjection = dateProjection;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "ProjectionFilm [id=" + id + ", dateProjection=" + dateProjection + ", prix=" + prix + "]";
	}


}// fin class
