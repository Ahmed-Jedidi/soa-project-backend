package com.plante.medicale.soa.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plante.medicale.soa.entities.Client;
import com.plante.medicale.soa.repos.ClientRepository;
import com.plante.medicale.soa.service.ClientService;



@RestController
@RequestMapping("/client")
@CrossOrigin(origins = "*")

public class ClientRestController {
	
//////////////////////////////////////Service	
	
	@Autowired
	ClientService clientService;
	
	//http://localhost:8082/soa/client/all
	@RequestMapping(value ="/all", method = RequestMethod.GET)
	public List<Client> getAllClients() {
		return clientService.getAllClients();
		
	}
	
	//http://localhost:8082/soa/client/{id}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Client getClient(@PathVariable("id") Long id)
	{
		return clientService.getClientById(id);
	}
	
	//http://localhost:8082/soa/client/login/{login}
	@RequestMapping(value ="/login/{login}", method = RequestMethod.GET)
	public Client getUserByLogin(@PathVariable("login") String login) {
		return clientService.findClientByLogin(login);
	}
	
	//http://localhost:8082/soa/client/logino/{email}
	@RequestMapping(value="/email/{email}",method = RequestMethod.GET)
	public Client getClientByEmail1(@PathVariable("email") String email)
	{
		return clientService.findClientByEmail(email);
	}
	
	//http://localhost:8082/soa/client
	@RequestMapping(method = RequestMethod.POST)
	public Client create(@RequestBody Client c) {
		return clientService.saveClient(c);
	}
	
	////http://localhost:8082/soa/client
	@RequestMapping(method = RequestMethod.PUT)
	public Client updateClient(@RequestBody Client c) {
	return clientService.updateClient(c);
	}
	
	//http://localhost:8082/soa/client/{id}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteClient(@PathVariable("id") Long id)
	{
		clientService.deleteClientById(id);
	}
	

///////////////////////////////////////////////////////////////////////////
	
	
	//getAllUsersByRoleNomRole(nom)
	
	//http://localhost:8082/soa/client/type/{t}
	@RequestMapping(value="/type/{t}",method = RequestMethod.GET)
	public List<Client> getAllClientsByType(@PathVariable("t") String t)
	{
		return clientService.getAllClientsByTypeNomType(t);
	}
	

}