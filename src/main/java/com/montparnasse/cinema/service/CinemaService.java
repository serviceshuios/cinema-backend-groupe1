package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.CinemaDAO;
import com.montparnasse.cinema.domaine.Cinema;


@Service
public class CinemaService {
	
	@Autowired
	private CinemaDAO dao;
	
	public Cinema add(Cinema ci)
	{
		return dao.save(ci);
	}
	
	public Cinema update(Cinema ci)
	{
		return dao.save(ci);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Cinema get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Cinema> getAll()
	{
		return dao.findAll();
	}
}
