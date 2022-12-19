package com.plante.medicale.soa.service;

import java.util.List;

import com.plante.medicale.soa.entities.Type;
import com.plante.medicale.soa.entities.Utilisation;

public interface UtilisationService {
	
	
	Utilisation findByTitre(String utilisation);
	
	
	Utilisation saveUtilisation(Utilisation u);
	Utilisation updateUtilisation(Utilisation u);
	void deleteUtilisation(Utilisation u);
	void deleteUtilisationById(Long id);
	Utilisation getUtilisation(Long id);
	List<Utilisation> getAllUtilisations();

}
