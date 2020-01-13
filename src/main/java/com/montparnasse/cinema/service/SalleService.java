package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.SalleDAO;
import com.montparnasse.cinema.domaine.Salle;


@Service
public class SalleService {
	
	@Autowired
	private SalleDAO dao;
	
	public Salle add(Salle s)
	{
		return dao.save(s);
	}
	
	public Salle update(Salle s)
	{
		return dao.save(s);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Salle get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Salle> getAll()
	{
		return dao.findAll();
	}
}
