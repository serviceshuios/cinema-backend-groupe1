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

import com.montparnasse.cinema.domaine.Categorie;
import com.montparnasse.cinema.service.CategorieService;


@CrossOrigin("*")
@RestController
public class RestCategorieController {
	
	@Autowired
	private CategorieService service;
	
	@RequestMapping(value = "/categories", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Categorie> getCategories()
	{
		return service.getAll();
	}
	

  
  @RequestMapping(value = "/categories/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Categorie getCategorie(@PathVariable("id") Long id)
	{
		return service.get(id);
	}
	
	
	

	@RequestMapping(value = "/categories", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Categorie addEtudiant(@RequestBody Categorie ca)
	{
		return service.add(ca);
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
	
	
	@RequestMapping(value = "/categories", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Categorie updateCategorie(@RequestBody Categorie ca)
	{
		return service.update(ca);
	}
	
	@RequestMapping(value = "/categories/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteCategorie(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}
