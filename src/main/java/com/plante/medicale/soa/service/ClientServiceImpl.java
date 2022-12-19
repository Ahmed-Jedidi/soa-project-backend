package com.plante.medicale.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plante.medicale.soa.entities.Client;
import com.plante.medicale.soa.entities.Type;
import com.plante.medicale.soa.repos.ClientRepository;
import com.plante.medicale.soa.repos.TypeRepository;

//@Transactional
@Service
public class ClientServiceImpl implements ClientService {
	
	//odonné à sprint Injection une implementation des dependances 
	@Autowired
	//objet pour CRUD
	ClientRepository clientRepository;
	
	@Autowired
	TypeRepository typeRepository;
	/*@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;*/

	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public Client updateClient(Client c) {
		// TODO Auto-generated method stub
		//u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
		/*u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));*/
		return clientRepository.save(c);
	}

	@Override
	public void deleteClient(Client c) {
		// TODO Auto-generated method stub
		clientRepository.delete(c);
	}

	@Override
	public void deleteClientById(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}

	@Override
	public Client getClientById(Long id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	///////////////////////////////////////////////////////////
	@Override
	public List<Client> getAllClientsByTypeNomType(String nom) {
		// TODO Auto-generated method stub
		return clientRepository.findByTypeNomType(nom);
	}

	@Override
	public Client findClientByLogin(String login) {
		// TODO Auto-generated method stub
		return clientRepository.findByLogin(login);
	}

	@Override
	public Client findClientByEmail(String email) {
		// TODO Auto-generated method stub
		return clientRepository.findByEmail(email);
	}

	@Override
	public Type addRole(Type role) {
		// TODO Auto-generated method stub
		return typeRepository.save(role);
	}

	@Override
	public Client addTypeToClient(String email, String typenom) {
		// TODO Auto-generated method stub
		Client cli = clientRepository.findByEmail(email);
		Type t = typeRepository.findByNomType(typenom);
		cli.setType(t);
		return clientRepository.save(cli);
	}



}
