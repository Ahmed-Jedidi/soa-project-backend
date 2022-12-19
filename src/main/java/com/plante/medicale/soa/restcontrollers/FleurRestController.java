package com.plante.medicale.soa.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plante.medicale.soa.entities.Fleur;
import com.plante.medicale.soa.entities.Plante;
import com.plante.medicale.soa.service.FleurService;
import com.plante.medicale.soa.service.PlanteService;


@RestController
@RequestMapping("/fleur")
@CrossOrigin
//@CrossOrigin(origins = "*")
public class FleurRestController {
	@Autowired
	FleurService fleurService;
	//http://localhost:8082/soa/fleur
	@RequestMapping(method = RequestMethod.GET)
	public List<Fleur> getAllfleurs() {
		return fleurService.getAllFleurs();
	}
	
	//http://localhost:8082/soa/fleur
	@RequestMapping(method = RequestMethod.POST)
	public Fleur createFleur(@RequestBody Fleur fleur) {
		return fleurService.saveFleur(fleur);
	}

}
