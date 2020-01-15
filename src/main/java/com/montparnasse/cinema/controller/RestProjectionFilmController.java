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

import com.montparnasse.cinema.domaine.ProjectionFilm;
import com.montparnasse.cinema.service.ProjectionFilmService;


@CrossOrigin("*")
@RestController
public class RestProjectionFilmController {
	
	@Autowired
	private ProjectionFilmService service;
	
	@RequestMapping(value = "/projectionfilms", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<ProjectionFilm> getProjectionFilms()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/projectionfilms/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ProjectionFilm getProjectionFilm(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
	
	

	@RequestMapping(value = "/projectionfilms", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ProjectionFilm addProjectionFilm(@RequestBody ProjectionFilm pf)
	{
		return service.add(pf);
	}
	
	
	@RequestMapping(value = "/projectionfilms", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ProjectionFilm updateProjectionFilm(@RequestBody ProjectionFilm pf)
	{
		return service.update(pf);
	}
	
	@RequestMapping(value = "/projectionfilms/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteProjectionFilm(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}