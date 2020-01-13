package com.montparnasse.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.cinema.domaine.Seance;
import com.montparnasse.cinema.domaine.Ticket;
import com.montparnasse.cinema.service.SeanceService;
import com.montparnasse.cinema.service.TicketService;

@CrossOrigin("*")
@RestController
public class RestTicketController {
	
	@Autowired
	private TicketService service;
	
	@RequestMapping(value = "/tickets", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Ticket> getTickets()
	{
		return service.getAll();
	}
}

 