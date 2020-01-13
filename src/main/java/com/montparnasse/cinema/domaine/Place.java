package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

@Entity
public class Place implements Serializable {
	
	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numero;
	private double longitude;
	private double latitude;
	private double altitude;
	
	@OneToMany(mappedBy = "place",cascade = CascadeType.ALL)
	private List<Ticket> listTicket;
	
	@ManyToOne
	private Salle salle;

	
	/*-----------constructeurs-------------------*/
	public Place() {
		
	}// fin ctor


	public Place(int numero, double longitude, double latitude, double altitude) {
		super();
		this.numero = numero;
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
	}// fin ctor chargé


	/*----------------encapsulation---------------*/
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getAltitude() {
		return altitude;
	}


	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}


	@Override
	public String toString() {
		return "Place [id=" + id + ", numero=" + numero + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", altitude=" + altitude + "]";
	}
	

}// fin class
