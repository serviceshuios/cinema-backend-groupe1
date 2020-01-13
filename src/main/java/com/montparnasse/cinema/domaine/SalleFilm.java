package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class SalleFilm implements Serializable {
	
	@EmbeddedId
	private SalleFilmId id;

	private Date dateAffiliation;

	public SalleFilmId getId() {
		return id;
	}

	public void setId(SalleFilmId id) {
		this.id = id;
	}

	public Date getDateAffiliation() {
		return dateAffiliation;
	}

	public void setDateAffiliation(Date dateAffiliation) {
		this.dateAffiliation = dateAffiliation;
	}
	
	
}
