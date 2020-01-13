package com.montparnasse.cinema.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Place {
	
	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numero;
	private double longitude;
	private double latitude;
	private double altitude;

	
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
