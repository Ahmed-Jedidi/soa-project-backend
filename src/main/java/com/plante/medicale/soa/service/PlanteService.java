package com.plante.medicale.soa.service;

import java.util.List;

import com.plante.medicale.soa.entities.Plante;

public interface PlanteService {
	Plante savePlante(Plante s);
	Plante updatePlante(Plante s);
	void deletePlante(Plante s);
	void deletePlanteById(Long id);
	Plante getPlante(Long id);
	List<Plante> getAllPlantes();

}
