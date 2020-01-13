package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.PlaceDAO;
import com.montparnasse.cinema.domaine.Place;


@Service
public class PlaceService {
	
	@Autowired
	private PlaceDAO dao;
	
	public Place add(Place pl)
	{
		return dao.save(pl);
	}
	
	public Place update(Place pl)
	{
		return dao.save(pl);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Place get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Place> getAll()
	{
		return dao.findAll();
	}
}
