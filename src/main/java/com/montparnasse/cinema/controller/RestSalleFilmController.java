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
import com.montparnasse.cinema.domaine.SalleFilm;
import com.montparnasse.cinema.service.SalleFilmService;
import com.montparnasse.cinema.service.SalleService;

@CrossOrigin("*")
@RestController
public class RestSalleFilmController {
	
	@Autowired
	private SalleFilmService service;
	
	@RequestMapping(value = "/salles", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<SalleFilm> getProjectionSalles()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/sallefilms/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public SalleFilm getSalleFilm(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
	
	

	@RequestMapping(value = "/sallefilms", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public SalleFilm addSalleFilm(@RequestBody SalleFilm sf)
	{
		return service.add(sf);
	}
	
	
	@RequestMapping(value = "/sallefilms", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public SalleFilm updateSalleFilm(@RequestBody SalleFilm sf)
	{
		return service.update(sf);
	}
	
	@RequestMapping(value = "/sallefilms/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteSalleFilm(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}