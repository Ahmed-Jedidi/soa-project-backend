package com.plante.medicale.soa.service;

import java.util.List;

import com.plante.medicale.soa.entities.Client;
import com.plante.medicale.soa.entities.Type;

public interface ClientService {
	Client saveClient(Client c);
	Client updateClient(Client c);
	void deleteClient(Client c);
	void deleteClientById(Long id);//new
	Client getClientById(Long id);
	List<Client> getAllClients();
	
	///////////////////////////////////////////////////////
	//new
	List<Client> getAllClientsByTypeNomType(String nom);
	
	
	
	Client findClientByLogin(String login);
	Client findClientByEmail(String email);
	
	
	Type addRole(Type role);
	Client addTypeToClient(String email, String typenom);

}
