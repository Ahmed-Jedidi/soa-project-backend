package com.plante.medicale.soa.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plante.medicale.soa.entities.Plante;
import com.plante.medicale.soa.repos.PlanteRepository;
import com.plante.medicale.soa.service.PlanteService;


@RestController
@RequestMapping("/plante")
@CrossOrigin
//@CrossOrigin(origins = "*")
public class PlanteRestController {
	@Autowired
	PlanteService planteService;
	//http://localhost:8082/soa/plante
	@RequestMapping(method = RequestMethod.GET)
	public List<Plante> getAllPlantes() {
		return planteService.getAllPlantes();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Plante createShopModel(@RequestBody Plante plante) {
		return planteService.savePlante(plante);
	}
	
	
//////////////////////////////////////Repository	
	@Autowired
	PlanteRepository plantetRepository;


	//http://localhost:8082/soa/plante/{id}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Plante getCatalogue(@PathVariable("id") Long id)
	{
		return plantetRepository.findById(id).get();
	}

	//http://localhost:8082/soa/plante
	@RequestMapping(method = RequestMethod.PUT)
		public Plante update(@RequestBody Plante c) {
		return plantetRepository.save(c);
	}

	//http://localhost:8082/soa/plante/{id}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletecatalogue(@PathVariable("id") Long id)
	{
		plantetRepository.deleteById(id);
	}	
	
	
	
	
	

}
