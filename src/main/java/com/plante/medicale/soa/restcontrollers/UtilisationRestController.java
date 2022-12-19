package com.plante.medicale.soa.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plante.medicale.soa.entities.Type;
import com.plante.medicale.soa.entities.Utilisation;
import com.plante.medicale.soa.repos.TypeRepository;
import com.plante.medicale.soa.repos.UtilisationRepository;
import com.plante.medicale.soa.service.TypeService;
import com.plante.medicale.soa.service.UtilisationService;

@RestController
@RequestMapping("/utilisation")
@CrossOrigin
public class UtilisationRestController {
	
	@Autowired
	UtilisationService utilisationService;
	
	@Autowired
	UtilisationRepository utilisationRepository;
	
	//http://localhost:8082/soa/utilisation
	@RequestMapping(method = RequestMethod.GET)
	public List<Utilisation> getAllUtilisations()
	{
		return utilisationService.getAllUtilisations();
	}
	
	//http://localhost:8082/soa/utilisation/{id}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Utilisation getUtilisation(@PathVariable("id") Long id)
	{
		return utilisationService.getUtilisation(id);
	}
	
	//http://localhost:8082/soa/utilisation
	@RequestMapping(method = RequestMethod.POST)
	public Utilisation createRole(@RequestBody Utilisation u) {
		return utilisationService.saveUtilisation(u);
	}

}
