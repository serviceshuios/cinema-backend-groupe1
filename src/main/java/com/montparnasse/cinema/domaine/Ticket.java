package com.montparnasse.cinema.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Ticket implements Serializable {

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;;
	private String nomClient;
	private double prix;
	private int codePayement;
	private boolean reservee;
	
	@ManyToOne
	private Place place;
	
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


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", nomClient=" + nomClient + ", prix=" + prix + ", codePayement=" + codePayement
				+ ", reservee=" + reservee + "]";
	}
	
	

	
}// fin class
