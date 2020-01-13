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

import com.montparnasse.cinema.domaine.Salle;
import com.montparnasse.cinema.domaine.Seance;
import com.montparnasse.cinema.service.SalleService;
import com.montparnasse.cinema.service.SeanceService;

@CrossOrigin("*")
@RestController
public class RestSeanceController {
	
	@Autowired
	private SeanceService service;
	
	@RequestMapping(value = "/seances", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Seance> getSeances()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/seances/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Seance getSeance(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
	
	

	@RequestMapping(value = "/seances", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Seance addSeance(@RequestBody Seance se)
	{
		return service.add(se);
	}
	
	
	@RequestMapping(value = "/seances", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Seance updateSeance(@RequestBody Seance se)
	{
		return service.update(se);
	}
	
	@RequestMapping(value = "/seances/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteSeance(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}