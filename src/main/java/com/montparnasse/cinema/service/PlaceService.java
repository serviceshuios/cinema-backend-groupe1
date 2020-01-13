package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlaceService {
	
	@Autowired
	private PlaceDAO dao;
	
	public Place add(Place e)
	{
		return dao.save(e);
	}
	
	public Place update(Place e)
	{
		return dao.save(e);
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
