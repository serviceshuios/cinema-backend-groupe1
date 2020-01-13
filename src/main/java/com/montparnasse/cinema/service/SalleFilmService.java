package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.SalleDAO;
import com.montparnasse.cinema.dao.SalleFilmDAO;
import com.montparnasse.cinema.domaine.Salle;
import com.montparnasse.cinema.domaine.SalleFilm;
import com.montparnasse.cinema.domaine.SalleFilmId;

@Service
public class SalleFilmService {
	
	@Autowired
	private SalleFilmDAO dao;
	
	public SalleFilm add(SalleFilm sf)
	{
		return dao.save(sf);
	}
	
	public SalleFilm update(SalleFilm sf)
	{
		return dao.save(sf);
	}
	
	public boolean delete(SalleFilmId id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public SalleFilm get(SalleFilmId id)
	{
		return dao.findById(id).get();
	}
	
	public List<SalleFilm> getAll()
	{
		return dao.findAll();
	}
}
