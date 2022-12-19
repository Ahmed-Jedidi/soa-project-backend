package com.plante.medicale.soa.service;

import java.util.List;

import com.plante.medicale.soa.entities.Fleur;

public interface FleurService {
	Fleur saveFleur(Fleur s);
	Fleur updateFleur(Fleur s);
	void deleteFleur(Fleur s);
	void deleteFleurById(Long id);
	Fleur getFleur(Long id);
	List<Fleur> getAllFleurs();


}
