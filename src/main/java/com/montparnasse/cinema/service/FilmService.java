package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.FilmDAO;
import com.montparnasse.cinema.domaine.Film;


@Service
public class FilmService {
	
	@Autowired
	private FilmDAO dao;
	
	public Film add(Film e)
	{
		return dao.save(e);
	}
	
	public Film update(Film e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Film get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Film> getAll()
	{
		return dao.findAll();
	}
}
