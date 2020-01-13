package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalleService {
	
	@Autowired
	private SalleDAO dao;
	
	public Salle add(Salle e)
	{
		return dao.save(e);
	}
	
	public Salle update(Salle e)
	{
		return dao.save(e);
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
