package com.plante.medicale.soa.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plante.medicale.soa.entities.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	Client findByLogin(String login);
	Client findByEmail(String email);

	
	List<Client> findByTypeNomType(String nom);

}
