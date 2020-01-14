package com.montparnasse.cinema.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Film implements Serializable {

	/*-----attributs-------------*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private double duree;
	private String realisation;
	private String description;
	private String photo;
	private Date dateSortie;
	
	@ManyToOne
	private Categorie categorie;
	
	@JsonIgnore
	@OneToMany(mappedBy="id.film")
	private List<SalleFilm> salleFilm = new ArrayList<SalleFilm>();
	
	/*--------------constructeurs------------------*/
	public Film() {
		
	}// fin ctor vide
	
	public Film(String titre, double duree, String realisation, String description, String photo, Date dateSortie) {
		this.titre = titre;
		this.duree = duree;
		this.realisation = realisation;
		this.description = description;
		this.photo = photo;
		this.dateSortie = dateSortie;
	}// fin ctor chargé

	/*-------------encapsulation-------------*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public String getRealisation() {
		return realisation;
	}

	public void setRealisation(String realisation) {
		this.realisation = realisation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", duree=" + duree + ", realisation=" + realisation
				+ ", description=" + description + ", photo=" + photo + ", dateSortie=" + dateSortie + "]";
	}
	
	
	
	
	
	
}// fin class
