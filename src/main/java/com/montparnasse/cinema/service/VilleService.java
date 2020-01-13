package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.VilleDAO;
import com.montparnasse.cinema.domaine.Ville;


@Service
public class VilleService {
	
	@Autowired
	private VilleDAO dao;
	
	public Ville add(Ville e)
	{
		return dao.save(e);
	}
	
	public Ville update(Ville e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Ville get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Ville> getAll()
	{
		return dao.findAll();
	}
}
