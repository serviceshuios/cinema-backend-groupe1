package com.montparnasse.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.cinema.dao.TicketDAO;
import com.montparnasse.cinema.domaine.Ticket;


@Service
public class TicketService {
	
	@Autowired
	private TicketDAO dao;
	
	public Ticket add(Ticket e)
	{
		return dao.save(e);
	}
	
	public Ticket update(Ticket e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Ticket get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Ticket> getAll()
	{
		return dao.findAll();
	}
}
