package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategorieService {
	
	@Autowired
	private CategorieDao dao;
	
	public Categorie add(Categorie e)
	{
		return dao.save(e);
	}
	
	public Categorie update(Categorie e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Categorie get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Categorie> getAll()
	{
		return dao.findAll();
	}
}
