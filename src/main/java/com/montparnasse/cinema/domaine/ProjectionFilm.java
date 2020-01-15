package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ProjectionFilm", //
uniqueConstraints = { //
        @UniqueConstraint(name = "PROJECTION_FILM", columnNames = { "Salle_Id", "Film_Id" }) })
public class ProjectionFilm implements Serializable {
	
	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateProjection;
	private double prix;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Salle_Id", nullable = false)
    private Salle salle;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Film_Id", nullable = false)
    private Film film;
	
	@JsonIgnore
	@OneToMany(mappedBy = "projectionFilm",cascade = CascadeType.ALL)
	private List<Ticket> listTicket;
	
	@OneToOne(cascade=CascadeType.ALL)
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
