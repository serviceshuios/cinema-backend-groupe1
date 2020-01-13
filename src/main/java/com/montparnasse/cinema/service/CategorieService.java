package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.CategorieDAO;
import com.montparnasse.cinema.domaine.Categorie;


@Service
public class CategorieService {
	
	@Autowired
	private CategorieDAO dao;
	
	public Categorie add(Categorie ca)
	{
		return dao.save(ca);
	}
	
	public Categorie update(Categorie ca)
	{
		return dao.save(ca);
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
