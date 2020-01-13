package com.montparnasse.cinema.domaine;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class SalleFilmId implements Serializable {
	
	@ManyToOne
	@JoinColumn(name = "FilmId")
	private Film film;
	
	@ManyToOne
	@JoinColumn(name = "SalleId")
	private Salle salle;

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	

}
