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
import com.plante.medicale.soa.repos.TypeRepository;
import com.plante.medicale.soa.service.TypeService;

@RestController
@RequestMapping("/type")
@CrossOrigin

public class TypeRestController {
	
	@Autowired
	TypeService typeService;
	
	@Autowired
	TypeRepository typeRepository;
	//http://localhost:8082/soa/type
	@RequestMapping(method = RequestMethod.GET)
	public List<Type> getAllTypes()
	{
		return typeService.getAllTypes();
	}
	//http://localhost:8082/soa/type/{id}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Type getType(@PathVariable("id") Long id)
	{
		return typeService.getType(id);
	}
	
	//http://localhost:8082/soa/type
	@RequestMapping(method = RequestMethod.POST)
	public Type createRole(@RequestBody Type t) {
		return typeRepository.save(t);
	}
	
	
	
}