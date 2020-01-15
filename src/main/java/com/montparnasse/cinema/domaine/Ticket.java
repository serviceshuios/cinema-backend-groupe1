package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Ticket implements Serializable {

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomClient;
	private double prix;
	private int codePayement;
	private boolean reservee;
	
	@JsonIgnore
	@OneToMany(mappedBy = "ticket",cascade = CascadeType.ALL)
	private List<Place> listePlaces;
	
	@ManyToOne
	private ProjectionFilm projectionFilm;
	
	
	/*--------------constructeurs------------------*/
public Ticket() {
		
	}// fin ctor vide


	public Ticket(String nomClient, double prix, int codePayement, boolean reservee) {
		super();
		this.nomClient = nomClient;
		this.prix = prix;
		this.codePayement = codePayement;
		this.reservee = reservee;
	}// fin ctor chargé

	/*---------encapsulation-----------------*/
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public int getCodePayement() {
		return codePayement;
	}


	public void setCodePayement(int codePayement) {
		this.codePayement = codePayement;
	}


	public boolean isReservee() {
		return reservee;
	}


	public void setReservee(boolean reservee) {
		this.reservee = reservee;
	}

	

	public List<Place> getListePlaces() {
		return listePlaces;
	}


	public void setListePlaces(List<Place> listePlaces) {
		this.listePlaces = listePlaces;
	}


	public ProjectionFilm getProjectionFilm() {
		return projectionFilm;
	}


	public void setProjectionFilm(ProjectionFilm projectionFilm) {
		this.projectionFilm = projectionFilm;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", nomClient=" + nomClient + ", prix=" + prix + ", codePayement=" + codePayement
				+ ", reservee=" + reservee + "]";
	}
	
	

	
}// fin class
