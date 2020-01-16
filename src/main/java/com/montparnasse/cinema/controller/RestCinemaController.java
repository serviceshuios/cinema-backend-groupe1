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


import com.montparnasse.cinema.domaine.Cinema;
import com.montparnasse.cinema.domaine.Salle;
import com.montparnasse.cinema.service.CinemaService;

@CrossOrigin("*")
@RestController
public class RestCinemaController {
	
	@Autowired
	private CinemaService service;
	
	@RequestMapping(value = "/cinemas", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Cinema> getCinemas()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/cinemas/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Cinema getCinema(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
  @RequestMapping(value = "/cinemas/{id}/salles", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Salle> getCinemaSalles(@PathVariable("id") Long id)
	{
		return service.get(id).getListeSalle();
	}
	

	@RequestMapping(value = "/cinemas", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Cinema addCinema(@RequestBody Cinema ci)
	{
		return service.add(ci);
	}
	
	
	@RequestMapping(value = "/cinemas", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Cinema updateCinema(@RequestBody Cinema ci)
	{
		return service.update(ci);
	}
	
	@RequestMapping(value = "/cinemas/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteCinema(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}
