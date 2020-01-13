package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CinemaService {
	
	@Autowired
	private CinemaDAO dao;
	
	public Cinema add(Cinema e)
	{
		return dao.save(e);
	}
	
	public Cinema update(Cinema e)
	{
		return dao.save(e);
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
