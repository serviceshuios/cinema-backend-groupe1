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

import com.montparnasse.cinema.domaine.Ville;
import com.montparnasse.cinema.service.VilleService;



@CrossOrigin("*")
@RestController
public class RestVilleController {
	
	@Autowired
	private VilleService service;
	
	@RequestMapping(value = "/villes", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Ville> getVilles()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/villes/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Ville getVille(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
	
	

	@RequestMapping(value = "/villes", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Ville addEtudiant(@RequestBody Ville v)
	{
		return service.add(v);
	}
	/*
	@RequestMapping(value = "/inscription/{idVille}/{idCinema}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean updateVille(@PathVariable("idVille") Long idVille,
			@PathVariable("idCinema") Long idCinema)
	{
		return service.ajouterVilleCinema(idVille, idCinema);
	}
	
	*/
	/*
	@RequestMapping(value = "/attribution/{idVille}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean ajoutOrdiEtudiant(@PathVariable("idEtudiant") Long idEtudiant,
			@PathVariable("idOrdi") Long idOrdi)
	{
		return service.ajouterOrdiEtudiant(idEtudiant, idOrdi);
	}
	*/
	
	
	@RequestMapping(value = "/villes", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Ville updateVille(@RequestBody Ville v)
	{
		return service.update(v);
	}
	
	@RequestMapping(value = "/villes/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteVille(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}
