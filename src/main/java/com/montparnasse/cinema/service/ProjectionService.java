package com.montparnasse.cinema.service;

import java.util.List;

import org.hibernate.criterion.Projection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.ProjectionDAO;


@Service
public class ProjectionService {
	
	@Autowired
	private ProjectionDAO dao;
	
	public Projection add(Projection e)
	{
		return dao.save(e);
	}
	
	public Projection update(Projection e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Projection get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Projection> getAll()
	{
		return dao.findAll();
	}
}
