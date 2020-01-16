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
import com.montparnasse.cinema.domaine.ProjectionFilm;
import com.montparnasse.cinema.service.FilmService;

@CrossOrigin("*")
@RestController
public class RestFilmController {

	@Autowired
	private FilmService service;

	@RequestMapping(value = "/films", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Film> getFilms() {
		return service.getAll();
	}

	@RequestMapping(value = "/films/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Film getFilm(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/films/{id}/projectionfilms", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<ProjectionFilm> getFilmProjectionFilms(@PathVariable("id") Long id) {
		return service.get(id).getListProjectionFilm();
	}

	@RequestMapping(value = "/films", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Film addFilm(@RequestBody Film f) {
		return service.add(f);
	}

	@RequestMapping(value = "/films", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public Film updateFilm(@RequestBody Film f) {
		return service.update(f);
	}

	@RequestMapping(value = "/films/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public boolean deleteFilm(@PathVariable("id") Long id) {
		return service.delete(id);
	}
}