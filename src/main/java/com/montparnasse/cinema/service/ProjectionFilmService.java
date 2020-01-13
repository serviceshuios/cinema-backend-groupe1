package com.montparnasse.cinema.service;

import java.util.List;

import org.hibernate.criterion.Projection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.montparnasse.cinema.dao.ProjectionFilmDAO;
import com.montparnasse.cinema.domaine.ProjectionFilm;


@Service
public class ProjectionFilmService {
	
	@Autowired
	private ProjectionFilmDAO dao;
	
	public ProjectionFilm add(ProjectionFilm pf)
	{
		return dao.save(pf);
	}
	
	public ProjectionFilm update(ProjectionFilm pf)
	{
		return dao.save(pf);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public ProjectionFilm get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<ProjectionFilm> getAll()
	{
		return dao.findAll();
	}
}
