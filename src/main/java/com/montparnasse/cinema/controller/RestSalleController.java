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

import com.montparnasse.cinema.domaine.Place;
import com.montparnasse.cinema.domaine.ProjectionFilm;
import com.montparnasse.cinema.domaine.Salle;
import com.montparnasse.cinema.service.SalleService;

@CrossOrigin("*")
@RestController
public class RestSalleController {

	@Autowired
	private SalleService service;

	@RequestMapping(value = "/salles", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Salle> getProjectionSalles() {
		return service.getAll();
	}

	@RequestMapping(value = "/salles/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Salle getSalle(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/salles/{id}/places", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Place> getSallePlaces(@PathVariable("id") Long id) {
		return service.get(id).getListPlace();
	}

	@RequestMapping(value = "/salles/{id}/projectionfilms", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<ProjectionFilm> getSalleProjectionFilms(@PathVariable("id") Long id) {
		return service.get(id).getListProjectionFilm();
	}

	@RequestMapping(value = "/salles", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Salle addSalle(@RequestBody Salle s) {
		return service.add(s);
	}

	@RequestMapping(value = "/salles", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Salle updateSalle(@RequestBody Salle s) {
		return service.update(s);
	}

	@RequestMapping(value = "/salles/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public boolean deleteSalle(@PathVariable("id") Long id) {
		return service.delete(id);
	}
}