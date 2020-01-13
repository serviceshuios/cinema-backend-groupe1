package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.SeanceDAO;
import com.montparnasse.cinema.domaine.Seance;


@Service
public class SeanceService {
	
	@Autowired
	private SeanceDAO dao;
	
	public Seance add(Seance e)
	{
		return dao.save(e);
	}
	
	public Seance update(Seance e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Seance get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Seance> getAll()
	{
		return dao.findAll();
	}
}
