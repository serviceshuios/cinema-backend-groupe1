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

import com.montparnasse.cinema.domaine.Film;
import com.montparnasse.cinema.domaine.Place;
import com.montparnasse.cinema.domaine.Ticket;
import com.montparnasse.cinema.service.FilmService;
import com.montparnasse.cinema.service.PlaceService;

@CrossOrigin("*")
@RestController
public class RestPlaceController {
	
	@Autowired
	private PlaceService service;
	
	@RequestMapping(value = "/places", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Place> getPlaces()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/places/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Place getPlace(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
  @RequestMapping(value = "/places/{id}/tickets", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Ticket> getPlaceTickets(@PathVariable("id") Long id)
	{
		return service.get(id).getListTickets();
	}
	

	@RequestMapping(value = "/places", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Place addPlace(@RequestBody Place pl)
	{
		return service.add(pl);
	}
	
	
	@RequestMapping(value = "/places", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Place updatePlace(@RequestBody Place pl)
	{
		return service.update(pl);
	}
	
	@RequestMapping(value = "/places/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteFilm(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}