package com.plante.medicale.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plante.medicale.soa.entities.Plante;
import com.plante.medicale.soa.repos.PlanteRepository;

@Service
public class PlanteServiceImpl implements PlanteService{
	@Autowired
	PlanteRepository planteRepository;
	
	@Override
	public Plante savePlante(Plante s) {
		// TODO Auto-generated method stub
		return planteRepository.save(s);
	}

	@Override
	public Plante updatePlante(Plante s) {
		// TODO Auto-generated method stub
		return planteRepository.save(s);
	}

	@Override
	public void deletePlante(Plante s) {
		// TODO Auto-generated method stub
		planteRepository.delete(s);
	}

	@Override
	public void deletePlanteById(Long id) {
		// TODO Auto-generated method stub
		planteRepository.deleteById(id);
	}

	@Override
	public Plante getPlante(Long id) {
		// TODO Auto-generated method stub
		return planteRepository.findById(id).get();
	}

	@Override
	public List<Plante> getAllPlantes() {
		// TODO Auto-generated method stub
		return planteRepository.findAll();
	}

}
